package com.example.weather_app.Activity;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.weather_app.Adapter.AddCityAdapter;
import com.example.weather_app.Api.ApiService;
import com.example.weather_app.CurrentWeather.CurrentWeather;
import com.example.weather_app.DB.DatabaseHandler;
import com.example.weather_app.Model.AddCity;
import com.example.weather_app.Model.CitySearch;
import com.example.weather_app.R;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AddCityActivity extends AppCompatActivity {
    private RecyclerView rcvAddCity;
    private String apikey = "ZWKqNpsZBaG1z6dELZXddfD73q57d1sA";
    List<AddCity> cityList = new ArrayList<>();
    String key="";
    String name="";
    Button them,update;
    EditText citytext;
    DatabaseHandler databaseHandler;
    AddCityAdapter addCityAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_city);
        rcvAddCity = findViewById(R.id.rcvAddCity);
        them = findViewById(R.id.them);
        update = findViewById(R.id.update);
        citytext = findViewById(R.id.citytext);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        rcvAddCity.setLayoutManager(linearLayoutManager);
        rcvAddCity.setHasFixedSize(true);
        databaseHandler = new DatabaseHandler(getApplicationContext());
        cityList = databaseHandler.getAllCityInDB();
        addCityAdapter = new AddCityAdapter(cityList);
        rcvAddCity.setAdapter(addCityAdapter);
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new ItemTouchHelper.SimpleCallback(0,ItemTouchHelper.LEFT|ItemTouchHelper.RIGHT) {
            @Override
            public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {
                return false;
            }

            @Override
            public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {
                int position = viewHolder.getAdapterPosition();
                if (position != RecyclerView.NO_POSITION) {
                    AddCity addCity = cityList.get(position);
                    databaseHandler.deleteCityInDB(addCity.getTenthanhpho());
                    cityList.remove(position);
                }
                addCityAdapter.notifyDataSetChanged();
            }
        });
        itemTouchHelper.attachToRecyclerView(rcvAddCity);
        them.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = citytext.getText().toString().trim();
                callApiaddCity();
            }
        });
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                update();
            }
        });


    }

    private void callApiaddCity() {
        ApiService.apiService.searchCityByText(apikey,name,"vi")
                .enqueue(new Callback<List<CitySearch>>() {
                    @Override
                    public void onResponse(Call<List<CitySearch>> call, Response<List<CitySearch>> response) {
                        List<CitySearch> list = response.body();
                        if (list!=null){
                            CitySearch citySearch = list.get(0);
                            key = citySearch.getKey();
                            callApiCurrent();
                        }
                    }
                    @Override
                    public void onFailure(Call<List<CitySearch>> call, Throwable t) {
                        Toast.makeText(getApplicationContext(), "Thêm địa điểm bị lỗi vui lòng nhập lại tên", Toast.LENGTH_LONG).show();
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
                            AddCity newCity = new AddCity(name,(int) currentWeather.getWeatherIcon(),String.valueOf(currentWeather.getTemperature().getMetric().getValue()));
                            databaseHandler = new DatabaseHandler(getApplicationContext());
                            databaseHandler.AddCityInDB(newCity);
                            databaseHandler.getAllCityInDB();
                            cityList = databaseHandler.getAllCityInDB();
                            addCityAdapter = new AddCityAdapter(cityList);
                            rcvAddCity.setAdapter(addCityAdapter);
                        }
                    }

                    @Override
                    public void onFailure(Call<List<CurrentWeather>> call, Throwable t) {
                        Toast.makeText(getApplicationContext(), "call api current fail", Toast.LENGTH_LONG).show();
                    }
                });
    }
    private void update(){
        for (AddCity addCity : cityList){
            ApiService.apiService.searchCityByText(apikey,addCity.getTenthanhpho(),"vi")
                    .enqueue(new Callback<List<CitySearch>>() {
                        @Override
                        public void onResponse(Call<List<CitySearch>> call, Response<List<CitySearch>> response) {
                            List<CitySearch> list = response.body();
                            if (list!=null){
                                CitySearch citySearch = list.get(0);
                                key = citySearch.getKey();
                                ApiService.apiService.searchCurrentWeather(key, apikey, "vi", "true")
                                        .enqueue(new Callback<List<CurrentWeather>>() {
                                            @Override
                                            public void onResponse(Call<List<CurrentWeather>> call, Response<List<CurrentWeather>> response) {
                                                List<CurrentWeather> list = response.body();
                                                if (list != null) {
                                                    CurrentWeather currentWeather = list.get(0);
                                                    AddCity newCity = new AddCity(addCity.getTenthanhpho(),(int) currentWeather.getWeatherIcon(),String.valueOf(currentWeather.getTemperature().getMetric().getValue()));
                                                    databaseHandler.updateCity(newCity);
                                                    cityList = databaseHandler.getAllCityInDB();
                                                    addCityAdapter = new AddCityAdapter(cityList);
                                                    rcvAddCity.setAdapter(addCityAdapter);
                                                }
                                            }

                                            @Override
                                            public void onFailure(Call<List<CurrentWeather>> call, Throwable t) {
                                                Toast.makeText(getApplicationContext(), "call api current fail", Toast.LENGTH_LONG).show();
                                            }
                                        });
                            }
                        }
                        @Override
                        public void onFailure(Call<List<CitySearch>> call, Throwable t) {
                            Toast.makeText(getApplicationContext(), "Thêm địa điểm bị lỗi vui lòng nhập lại tên", Toast.LENGTH_LONG).show();
                        }
                    });
        }

    }

}