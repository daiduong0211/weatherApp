package com.example.weather_app.DailyForecasts;
import java.util.Date;

import com.google.gson.annotations.SerializedName;

   
public class Moon {

   @SerializedName("Rise")
   Date Rise;

   @SerializedName("EpochRise")
   double EpochRise;

   @SerializedName("Set")
   Date Set;

   @SerializedName("EpochSet")
   double EpochSet;

   @SerializedName("Phase")
   String Phase;

   @SerializedName("Age")
   double Age;


    public void setRise(Date Rise) {
        this.Rise = Rise;
    }
    public Date getRise() {
        return Rise;
    }
    
    public void setEpochRise(double EpochRise) {
        this.EpochRise = EpochRise;
    }
    public double getEpochRise() {
        return EpochRise;
    }
    
    public void setSet(Date Set) {
        this.Set = Set;
    }
    public Date getSet() {
        return Set;
    }
    
    public void setEpochSet(double EpochSet) {
        this.EpochSet = EpochSet;
    }
    public double getEpochSet() {
        return EpochSet;
    }
    
    public void setPhase(String Phase) {
        this.Phase = Phase;
    }
    public String getPhase() {
        return Phase;
    }
    
    public void setAge(double Age) {
        this.Age = Age;
    }
    public double getAge() {
        return Age;
    }
    
}