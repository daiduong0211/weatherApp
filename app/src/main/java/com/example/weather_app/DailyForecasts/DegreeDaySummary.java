package com.example.weather_app.DailyForecasts;

import com.google.gson.annotations.SerializedName;

   
public class DegreeDaySummary {

   @SerializedName("Heating")
   Heating Heating;

   @SerializedName("Cooling")
   Cooling Cooling;


    public void setHeating(Heating Heating) {
        this.Heating = Heating;
    }
    public Heating getHeating() {
        return Heating;
    }
    
    public void setCooling(Cooling Cooling) {
        this.Cooling = Cooling;
    }
    public Cooling getCooling() {
        return Cooling;
    }
    
}