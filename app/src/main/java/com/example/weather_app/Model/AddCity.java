package com.example.weather_app.Model;

public class AddCity {
        private String tenthanhpho;
        public int WeatherIcon;
        private String nhietdo;

    public AddCity(String tenthanhpho, int  weatherIcon, String nhietdo) {
        this.tenthanhpho = tenthanhpho;
        WeatherIcon = weatherIcon;
        this.nhietdo = nhietdo;
    }

    public String getTenthanhpho() {
        return tenthanhpho;
    }

    public void setTenthanhpho(String tenthanhpho) {
        this.tenthanhpho = tenthanhpho;
    }

    public int getWeatherIcon() {
        return WeatherIcon;
    }

    public void setWeatherIcon(int weatherIcon) {
        WeatherIcon = weatherIcon;
    }

    public String getNhietdo() {
        return nhietdo;
    }

    public void setNhietdo(String nhietdo) {
        this.nhietdo = nhietdo;
    }
}
