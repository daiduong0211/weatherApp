package com.example.weather_app.Api;

import com.example.weather_app.CurrentWeather.CurrentWeather;
import com.example.weather_app.DailyForecasts.OneDayOfDailyForecasts;
import com.example.weather_app.FiveDay.FiveDay;
import com.example.weather_app.Model.CitySearch;
import com.example.weather_app.Model.Currency;
import com.example.weather_app.TwelfthHour.TwelfthHour;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {


    ApiService apiService = new Retrofit.Builder()
            .baseUrl("http://dataservice.accuweather.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService.class);


    @GET("locations/v1/cities/search")
    Call<List<CitySearch>> searchCityByText(
            @Query("apikey") String apikey,
            @Query("q") String q,
            @Query("language") String language
    );
    @GET("currentconditions/v1/{id}")
    Call<List<CurrentWeather>> searchCurrentWeather(
            @Path("id") String id,
            @Query("apikey") String apikey,
            @Query("language") String vi,
            @Query("details") String details
    );
    @GET("forecasts/v1/daily/1day/{id}")
    Call<OneDayOfDailyForecasts> searchOneDay(
            @Path("id") String id,
            @Query("apikey") String apikey,
            @Query("language") String vi,
            @Query("details") String details
    );
    @GET("forecasts/v1/daily/5day/{id}")
    Call<FiveDay> searchFiveDay(
            @Path("id") String id,
            @Query("apikey") String apikey,
            @Query("language") String vi
    );
    //http://dataservice.accuweather.com/
    // forecasts/v1/hourly/12hour/353412?apikey=ZVsFuAs7GtHgH8vqYDkG32h720eFjhoP&language=vi
    @GET("forecasts/v1/hourly/12hour/{id}")
    Call<List<TwelfthHour>> searchTwelfthHour(
            @Path("id") String id,
            @Query("apikey") String apikey,
            @Query("language") String vi
    );
}
