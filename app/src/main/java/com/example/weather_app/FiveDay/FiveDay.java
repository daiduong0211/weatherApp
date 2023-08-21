package com.example.weather_app.FiveDay;
import java.util.List;

import com.google.gson.annotations.SerializedName;

   
public class FiveDay {

   @SerializedName("Headline")
   Headline Headline;

   @SerializedName("DailyForecasts")
   List<DailyForecasts> DailyForecasts;


    public void setHeadline(Headline Headline) {
        this.Headline = Headline;
    }
    public Headline getHeadline() {
        return Headline;
    }
    
    public void setDailyForecasts(List<DailyForecasts> DailyForecasts) {
        this.DailyForecasts = DailyForecasts;
    }
    public List<DailyForecasts> getDailyForecasts() {
        return DailyForecasts;
    }
    
}