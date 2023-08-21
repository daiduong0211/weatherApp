package com.example.weather_app.DailyForecasts;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;

   
public class DailyForecasts {

   @SerializedName("Date")
   String Date;

   @SerializedName("EpochDate")
   double EpochDate;

   @SerializedName("Sun")
   Sun Sun;

   @SerializedName("Moon")
   Moon Moon;

   @SerializedName("Temperature")
   Temperature Temperature;

   @SerializedName("RealFeelTemperature")
   RealFeelTemperature RealFeelTemperature;

   @SerializedName("RealFeelTemperatureShade")
   RealFeelTemperatureShade RealFeelTemperatureShade;

   @SerializedName("HoursOfSun")
   double HoursOfSun;

   @SerializedName("DegreeDaySummary")
   DegreeDaySummary DegreeDaySummary;

   @SerializedName("AirAndPollen")
   List<AirAndPollen> AirAndPollen;

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
    
    public void setSun(Sun Sun) {
        this.Sun = Sun;
    }
    public Sun getSun() {
        return Sun;
    }
    
    public void setMoon(Moon Moon) {
        this.Moon = Moon;
    }
    public Moon getMoon() {
        return Moon;
    }
    
    public void setTemperature(Temperature Temperature) {
        this.Temperature = Temperature;
    }
    public Temperature getTemperature() {
        return Temperature;
    }
    
    public void setRealFeelTemperature(RealFeelTemperature RealFeelTemperature) {
        this.RealFeelTemperature = RealFeelTemperature;
    }
    public RealFeelTemperature getRealFeelTemperature() {
        return RealFeelTemperature;
    }
    
    public void setRealFeelTemperatureShade(RealFeelTemperatureShade RealFeelTemperatureShade) {
        this.RealFeelTemperatureShade = RealFeelTemperatureShade;
    }
    public RealFeelTemperatureShade getRealFeelTemperatureShade() {
        return RealFeelTemperatureShade;
    }
    
    public void setHoursOfSun(double HoursOfSun) {
        this.HoursOfSun = HoursOfSun;
    }
    public double getHoursOfSun() {
        return HoursOfSun;
    }
    
    public void setDegreeDaySummary(DegreeDaySummary DegreeDaySummary) {
        this.DegreeDaySummary = DegreeDaySummary;
    }
    public DegreeDaySummary getDegreeDaySummary() {
        return DegreeDaySummary;
    }
    
    public void setAirAndPollen(List<AirAndPollen> AirAndPollen) {
        this.AirAndPollen = AirAndPollen;
    }
    public List<AirAndPollen> getAirAndPollen() {
        return AirAndPollen;
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