package com.example.weather_app.DailyForecasts;

import com.google.gson.annotations.SerializedName;

   
public class RealFeelTemperatureShade {

   @SerializedName("Minimum")
   Minimum Minimum;

   @SerializedName("Maximum")
   Maximum Maximum;


    public void setMinimum(Minimum Minimum) {
        this.Minimum = Minimum;
    }
    public Minimum getMinimum() {
        return Minimum;
    }
    
    public void setMaximum(Maximum Maximum) {
        this.Maximum = Maximum;
    }
    public Maximum getMaximum() {
        return Maximum;
    }
    
}