package com.example.weather_app.Activity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.weather_app.Activity.AddCityActivity;
import com.example.weather_app.Activity.AirQualityActivity;
import com.example.weather_app.Activity.FiveDayActivity;
import com.example.weather_app.Adapter.HaiTuGioAdapter;
import com.example.weather_app.Adapter.ThreeDayAdapter;
import com.example.weather_app.Api.ApiService;
import com.example.weather_app.CurrentWeather.CurrentWeather;
import com.example.weather_app.DailyForecasts.AirAndPollen;
import com.example.weather_app.DailyForecasts.DailyForecasts;
import com.example.weather_app.DailyForecasts.OneDayOfDailyForecasts;
import com.example.weather_app.FiveDay.FiveDay;
import com.example.weather_app.Model.CitySearch;
import com.example.weather_app.R;
import com.example.weather_app.TwelfthHour.TwelfthHour;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainFragment extends Fragment {
    String name;

    public MainFragment(String name) {
        this.name = name;
    }

    private RecyclerView rcvFiveDay, rcvHaiTuGio;
    private ImageView add;
    private TextView diachi, nhietdo, cloudy, aqi, aqi1, tocdogio, humidity, sunrise, sunset, realfeel, uv, presure, chanceofrain;
    private LinearLayout linearAri;
    private Button fiveday;
    private String key;
    private String apikey = "ZWKqNpsZBaG1z6dELZXddfD73q57d1sA";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_main, container, false);

        Toolbar toolbar = view.findViewById(R.id.toolbar);
        ((AppCompatActivity) requireActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity) requireActivity()).getSupportActionBar().setTitle(""); // Xóa tiêu đề
        setHasOptionsMenu(true);
        init(view);
        recyclerview5day(view);
        recyclerview24h(view);
        callApiLocal();

        ImageView add = view.findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), AddCityActivity.class);
                startActivity(intent);
            }
        });

        linearAri = view.findViewById(R.id.linearAir);
        linearAri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), AirQualityActivity.class);
                startActivity(intent);
            }
        });

        fiveday = view.findViewById(R.id.fiveday);
        fiveday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), FiveDayActivity.class);
                startActivity(intent);
            }
        });


        return view;
    }

    private void callApiCurrent() {
        ApiService.apiService.searchCurrentWeather(key, apikey, "vi", "true")
                .enqueue(new Callback<List<CurrentWeather>>() {
                    @Override
                    public void onResponse(Call<List<CurrentWeather>> call, Response<List<CurrentWeather>> response) {
                        List<CurrentWeather> list = response.body();
                        if (list != null) {
                            CurrentWeather currentWeather = list.get(0);
                            nhietdo.setText(String.valueOf(currentWeather.getTemperature().getMetric().getValue()) + "°C");
                            tocdogio.setText(String.valueOf(currentWeather.getWind().getSpeed().getMetric().getValue()) + " km/h");
                            humidity.setText("Humidity: " + String.valueOf(currentWeather.getRelativeHumidity()) + "%");
                            realfeel.setText("Real feel: " + String.valueOf(currentWeather.getRealFeelTemperature().getMetric().getValue()) + "°");
                            uv.setText("UV: " + String.valueOf(currentWeather.getUVIndex()));
                            presure.setText("Presure: " + String.valueOf(currentWeather.getPressure().getMetric().getValue()) + "mbar");
                            cloudy.setText("Cloudy: " + String.valueOf(currentWeather.getCloudCover()));
                        }
                    }

                    @Override
                    public void onFailure(Call<List<CurrentWeather>> call, Throwable t) {
                        Toast.makeText(getActivity(), "call api current fail", Toast.LENGTH_LONG).show();
                    }
                });
    }

    private void init(View view) {
        add = (ImageView) view.findViewById(R.id.add);
        diachi = (TextView) view.findViewById(R.id.diachi);
        nhietdo = (TextView) view.findViewById(R.id.nhietdo);
        cloudy = (TextView) view.findViewById(R.id.cloudy);
        aqi = (TextView) view.findViewById(R.id.aqi);
        aqi1 = (TextView) view.findViewById(R.id.aqi1);
        tocdogio = (TextView) view.findViewById(R.id.tocdogio);
        humidity = (TextView) view.findViewById(R.id.humidity);
        sunrise = (TextView) view.findViewById(R.id.sunrise);
        sunset = (TextView) view.findViewById(R.id.sunset);
        realfeel = (TextView) view.findViewById(R.id.realfeel);
        uv = (TextView) view.findViewById(R.id.uv);
        presure = (TextView) view.findViewById(R.id.presure);
        chanceofrain = (TextView) view.findViewById(R.id.chanceofrain);

    }

    private void recyclerview24h(View view) {
        //dữ liệu thời tiết 24h
        rcvHaiTuGio = view.findViewById(R.id.rcvhaitugio);
        //hiển thị recyclerView theo phương ngang.
        LinearLayoutManager layoutManager1 = new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false);
        rcvHaiTuGio.setLayoutManager(layoutManager1);
        rcvHaiTuGio.setHasFixedSize(true);

    }

    private void recyclerview5day(View view) {
        rcvFiveDay = view.findViewById(R.id.rcvFiveDay);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        rcvFiveDay.setLayoutManager(layoutManager);
        rcvFiveDay.setHasFixedSize(true);
    }

    private void callApiLocal() {
        ApiService.apiService.searchCityByText(apikey, name, "vi")
                .enqueue(new Callback<List<CitySearch>>() {
                    @Override
                    public void onResponse(Call<List<CitySearch>> call, Response<List<CitySearch>> response) {
                        List<CitySearch> citySearchList = response.body();
                        if (citySearchList != null) {
                            CitySearch citySearch = citySearchList.get(0);
                            key = citySearch.getKey();
                            diachi.setText(citySearch.getLocalizedName());
                            callApiCurrent();
                            callApiOneDay();
                            callApiFiveDay();
                            calApiTwelfthHour();

                        }
                    }

                    @Override
                    public void onFailure(Call<List<CitySearch>> call, Throwable t) {
                        Toast.makeText(getActivity(), "call api local fail", Toast.LENGTH_LONG).show();
                    }
                });
    }

    private void calApiTwelfthHour() {
        ApiService.apiService.searchTwelfthHour(key, apikey, "vi")
                .enqueue(new Callback<List<TwelfthHour>>() {
                    @Override
                    public void onResponse(Call<List<TwelfthHour>> call, Response<List<TwelfthHour>> response) {
                        List<TwelfthHour> twelfthHourList = response.body();
                        HaiTuGioAdapter haiTuGioAdapter = new HaiTuGioAdapter(twelfthHourList);
                        rcvHaiTuGio.setAdapter(haiTuGioAdapter);
                    }

                    @Override
                    public void onFailure(Call<List<TwelfthHour>> call, Throwable t) {

                    }
                });
    }

    private void callApiFiveDay() {
        ApiService.apiService.searchFiveDay(key, apikey, "vi")
                .enqueue(new Callback<FiveDay>() {
                    @Override
                    public void onResponse(Call<FiveDay> call, Response<FiveDay> response) {
                        FiveDay fiveDay = response.body();
                        List<com.example.weather_app.FiveDay.DailyForecasts> dailyForecastsList = fiveDay.getDailyForecasts();
                        ThreeDayAdapter adapter = new ThreeDayAdapter(dailyForecastsList);
                        rcvFiveDay.setAdapter(adapter);
                    }

                    @Override
                    public void onFailure(Call<com.example.weather_app.FiveDay.FiveDay> call, Throwable t) {
                    }
                });
    }


    private void callApiOneDay() {
        ApiService.apiService.searchOneDay(key, apikey, "vi", "true")
                .enqueue(new Callback<OneDayOfDailyForecasts>() {
                    @Override
                    public void onResponse(Call<OneDayOfDailyForecasts> call, Response<OneDayOfDailyForecasts> response) {
                        OneDayOfDailyForecasts oneDayOfDailyForecasts = response.body();
                        List<DailyForecasts> listDailyForecasts = oneDayOfDailyForecasts.getDailyForecasts();
                        if (oneDayOfDailyForecasts != null) {
                            for (DailyForecasts dailyForecasts : listDailyForecasts) {
                                sunrise.setText(dailyForecasts.getSun().getRise().substring(11, 16) + " Sunrise");
                                sunset.setText(dailyForecasts.getSun().getSet().substring(11, 16) + " Sunset");
                                List<AirAndPollen> airAndPollenList = dailyForecasts.getAirAndPollen();
                                AirAndPollen airAndPollen = airAndPollenList.get(0);
                                aqi.setText("AQI: " + String.valueOf(airAndPollen.getValue()));
                                aqi1.setText("AQI: " + String.valueOf(airAndPollen.getValue()));
                                airAndPollen = airAndPollenList.get(5);
                                uv.setText("UV: " + String.valueOf(airAndPollen.getValue()));
                            }
                        }
                    }

                    @Override
                    public void onFailure(Call<OneDayOfDailyForecasts> call, Throwable t) {
                        Toast.makeText(getActivity(), "call api current fail", Toast.LENGTH_LONG).show();
                    }
                });
    }

    //    @Override
//    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
//        inflater.inflate(R.menu.menu_demo, menu);
//        super.onCreateOptionsMenu(menu, inflater);
//    }
//    @Override
//    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
//        inflater.inflate(R.menu.menu_demo, menu);
//    }
}


