package com.example.weather_app.FiveDay;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;

   
public class DailyForecasts {

   @SerializedName("Date")
   String Date;

   @SerializedName("EpochDate")
   double EpochDate;

   @SerializedName("Temperature")
   Temperature Temperature;

   @SerializedName("Day")
   Day Day;

   @SerializedName("Night")
   Night Night;

   @SerializedName("Sources")
   List<String> Sources;

   @SerializedName("MobileLink")
   String MobileLink;

   @SerializedName("Link")
   String Link;


    public void setDate(String Date) {
        this.Date = Date;
    }
    public String getDate() {
        return Date;
    }
    
    public void setEpochDate(double EpochDate) {
        this.EpochDate = EpochDate;
    }
    public double getEpochDate() {
        return EpochDate;
    }
    
    public void setTemperature(Temperature Temperature) {
        this.Temperature = Temperature;
    }
    public Temperature getTemperature() {
        return Temperature;
    }
    
    public void setDay(Day Day) {
        this.Day = Day;
    }
    public Day getDay() {
        return Day;
    }
    
    public void setNight(Night Night) {
        this.Night = Night;
    }
    public Night getNight() {
        return Night;
    }
    
    public void setSources(List<String> Sources) {
        this.Sources = Sources;
    }
    public List<String> getSources() {
        return Sources;
    }
    
    public void setMobileLink(String MobileLink) {
        this.MobileLink = MobileLink;
    }
    public String getMobileLink() {
        return MobileLink;
    }
    
    public void setLink(String Link) {
        this.Link = Link;
    }
    public String getLink() {
        return Link;
    }
    
}