package com.example.weather_app.DailyForecasts;

import com.google.gson.annotations.SerializedName;

   
public class Direction {

   @SerializedName("Degrees")
   double Degrees;

   @SerializedName("Localized")
   String Localized;

   @SerializedName("English")
   String English;


    public void setDegrees(double Degrees) {
        this.Degrees = Degrees;
    }
    public double getDegrees() {
        return Degrees;
    }
    
    public void setLocalized(String Localized) {
        this.Localized = Localized;
    }
    public String getLocalized() {
        return Localized;
    }
    
    public void setEnglish(String English) {
        this.English = English;
    }
    public String getEnglish() {
        return English;
    }
    
}