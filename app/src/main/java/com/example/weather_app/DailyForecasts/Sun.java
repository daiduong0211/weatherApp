package com.example.weather_app.DailyForecasts;

import com.google.gson.annotations.SerializedName;

   
public class Sun {

   @SerializedName("Rise")
   String Rise;

   @SerializedName("EpochRise")
   double EpochRise;

   @SerializedName("Set")
   String Set;

   @SerializedName("EpochSet")
   double EpochSet;


    public void setRise(String Rise) {
        this.Rise = Rise;
    }
    public String getRise() {
        return Rise;
    }
    
    public void setEpochRise(double EpochRise) {
        this.EpochRise = EpochRise;
    }
    public double getEpochRise() {
        return EpochRise;
    }
    
    public void setSet(String Set) {
        this.Set = Set;
    }
    public String getSet() {
        return Set;
    }
    
    public void setEpochSet(double EpochSet) {
        this.EpochSet = EpochSet;
    }
    public double getEpochSet() {
        return EpochSet;
    }
    
}