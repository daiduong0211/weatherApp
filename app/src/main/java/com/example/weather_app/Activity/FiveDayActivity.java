package com.example.weather_app.Activity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.widget.Toast;
import com.example.weather_app.Adapter.FiveDayAdapter;
import com.example.weather_app.Api.ApiService;
import com.example.weather_app.FiveDay.DailyForecasts;
import com.example.weather_app.FiveDay.FiveDay;
import com.example.weather_app.R;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FiveDayActivity extends AppCompatActivity {
    RecyclerView rcvfiveday;
    private String key= "353412";
    private String apikey = "ZWKqNpsZBaG1z6dELZXddfD73q57d1sA";
    List<DailyForecasts> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five_day);
        callApiFiveDay();
        rcvfiveday = findViewById(R.id.rcvfiveday);
        //hiển thị recyclerView theo phương ngang.
        LinearLayoutManager layoutManager1 = new LinearLayoutManager(this, RecyclerView.HORIZONTAL,false);
        rcvfiveday.setLayoutManager(layoutManager1);
        rcvfiveday.setHasFixedSize(true);

    }
    private void callApiFiveDay() {
        ApiService.apiService.searchFiveDay(key,apikey,"vi")
                .enqueue(new Callback<FiveDay>() {
                    @Override
                    public void onResponse(Call<FiveDay> call, Response<FiveDay> response) {
                        FiveDay fiveDay = response.body();
                        List<DailyForecasts> dailyForecastsList = fiveDay.getDailyForecasts();
                        FiveDayAdapter adapter = new FiveDayAdapter(dailyForecastsList);
                        rcvfiveday.setAdapter(adapter);
                    }
                    @Override
                    public void onFailure(Call<com.example.weather_app.FiveDay.FiveDay> call, Throwable t) {

                    }
                });
    }

    private List<DailyForecasts> getFiveDay() {
        return list;
    }

}