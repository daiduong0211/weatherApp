package com.example.weather_app.Model;

public class ThreeDay {
    private int image;
    private String day;
    private String weather;
    private String cloudy;

    public ThreeDay(int image, String day, String weather, String cloudy) {
        this.image = image;
        this.day = day;
        this.weather = weather;
        this.cloudy = cloudy;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getCloudy() {
        return cloudy;
    }

    public void setCloudy(String cloudy) {
        this.cloudy = cloudy;
    }
}
