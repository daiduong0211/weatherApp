package com.example.weather_app.CurrentWeather;

public class Direction {
    public double Degrees;
    public String Localized;
    public String English;

    public double getDegrees() {
        return Degrees;
    }

    public void setDegrees(double degrees) {
        Degrees = degrees;
    }

    public String getLocalized() {
        return Localized;
    }

    public void setLocalized(String localized) {
        Localized = localized;
    }

    public String getEnglish() {
        return English;
    }

    public void setEnglish(String english) {
        English = english;
    }
}
