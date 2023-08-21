package com.example.weather_app.CurrentWeather;

public class Temperature {
    public Metric Metric;
    public Imperial Imperial;

    public com.example.weather_app.CurrentWeather.Metric getMetric() {
        return Metric;
    }

    public void setMetric(com.example.weather_app.CurrentWeather.Metric metric) {
        Metric = metric;
    }

    public com.example.weather_app.CurrentWeather.Imperial getImperial() {
        return Imperial;
    }

    public void setImperial(com.example.weather_app.CurrentWeather.Imperial imperial) {
        Imperial = imperial;
    }
}
