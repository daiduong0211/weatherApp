package com.example.weather_app.FiveDay;

import com.google.gson.annotations.SerializedName;

   
public class Temperature {

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