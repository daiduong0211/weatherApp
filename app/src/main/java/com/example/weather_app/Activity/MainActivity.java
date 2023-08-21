package com.example.weather_app.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.weather_app.Adapter.FiveDayAdapter;
import com.example.weather_app.Adapter.ThreeDayAdapter;
import com.example.weather_app.Adapter.HaiTuGioAdapter;
import com.example.weather_app.Api.ApiService;
import com.example.weather_app.CurrentWeather.CurrentWeather;
import com.example.weather_app.DailyForecasts.AirAndPollen;
import com.example.weather_app.DailyForecasts.DailyForecasts;
import com.example.weather_app.DailyForecasts.OneDayOfDailyForecasts;
import com.example.weather_app.FiveDay.FiveDay;
import com.example.weather_app.Model.CitySearch;
import com.example.weather_app.Model.ThreeDay;
import com.example.weather_app.Model.HaiTuGio;
import com.example.weather_app.R;
import com.example.weather_app.TwelfthHour.TwelfthHour;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcvFiveDay, rcvHaiTuGio;
    private ImageView add;
    private TextView diachi, nhietdo, cloudy, aqi, aqi1, tocdogio, humidity, sunrise, sunset, realfeel, uv, presure, chanceofrain;
    private LinearLayout linearAri;
    private Button fiveday;
    private String key;
    private String apikey = "ZWKqNpsZBaG1z6dELZXddfD73q57d1sA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        init();
        recyclerview5day();
        recyclerview24h();
        callApiLocal();

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AddCityActivity.class);
                startActivity(intent);
            }
        });
        linearAri = (LinearLayout) findViewById(R.id.linearAir);
        linearAri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AirQualityActivity.class);
                startActivity(intent);
            }
        });
        fiveday = (Button) findViewById(R.id.fiveday);
        fiveday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), FiveDayActivity.class);
                startActivity(intent);
            }
        });
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
                        Toast.makeText(getApplicationContext(), "call api current fail", Toast.LENGTH_LONG).show();
                    }
                });
    }

    private void init() {
        add = (ImageView) findViewById(R.id.add);
        diachi = (TextView) findViewById(R.id.diachi);
        nhietdo = (TextView) findViewById(R.id.nhietdo);
        cloudy = (TextView) findViewById(R.id.cloudy);
        aqi = (TextView) findViewById(R.id.aqi);
        aqi1 = (TextView) findViewById(R.id.aqi1);
        tocdogio = (TextView) findViewById(R.id.tocdogio);
        humidity = (TextView) findViewById(R.id.humidity);
        sunrise = (TextView) findViewById(R.id.sunrise);
        sunset = (TextView) findViewById(R.id.sunset);
        realfeel = (TextView) findViewById(R.id.realfeel);
        uv = (TextView) findViewById(R.id.uv);
        presure = (TextView) findViewById(R.id.presure);
        chanceofrain = (TextView) findViewById(R.id.chanceofrain);

    }

    private void recyclerview24h() {
        //dữ liệu thời tiết 24h
        rcvHaiTuGio = findViewById(R.id.rcvhaitugio);
        //hiển thị recyclerView theo phương ngang.
        LinearLayoutManager layoutManager1 = new LinearLayoutManager(getApplicationContext(), RecyclerView.HORIZONTAL, false);
        rcvHaiTuGio.setLayoutManager(layoutManager1);
        rcvHaiTuGio.setHasFixedSize(true);

    }

    private void recyclerview5day() {
        rcvFiveDay = findViewById(R.id.rcvFiveDay);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        rcvFiveDay.setLayoutManager(layoutManager);
        rcvFiveDay.setHasFixedSize(true);
    }

    private void callApiLocal() {
        ApiService.apiService.searchCityByText(apikey, "Hà Nội", "vi")
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
                        Toast.makeText(getApplicationContext(), "call api local fail", Toast.LENGTH_LONG).show();
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
                        Toast.makeText(getApplicationContext(), "call api current fail", Toast.LENGTH_LONG).show();
                    }
                });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_demo, menu);
        return super.onCreateOptionsMenu(menu);
    }
}