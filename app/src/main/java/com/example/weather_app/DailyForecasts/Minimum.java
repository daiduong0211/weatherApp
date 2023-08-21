package com.example.weather_app.DailyForecasts;

import com.google.gson.annotations.SerializedName;

   
public class Minimum {

   @SerializedName("Value")
   double Value;

   @SerializedName("Unit")
   String Unit;

   @SerializedName("UnitType")
   double UnitType;

   @SerializedName("Phrase")
   String Phrase;


    public void setValue(double Value) {
        this.Value = Value;
    }
    public double getValue() {
        return Value;
    }
    
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }
    public String getUnit() {
        return Unit;
    }
    
    public void setUnitType(double UnitType) {
        this.UnitType = UnitType;
    }
    public double getUnitType() {
        return UnitType;
    }
    
    public void setPhrase(String Phrase) {
        this.Phrase = Phrase;
    }
    public String getPhrase() {
        return Phrase;
    }
    
}