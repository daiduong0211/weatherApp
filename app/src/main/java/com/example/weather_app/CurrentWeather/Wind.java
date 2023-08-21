package com.example.weather_app.CurrentWeather;

public class Wind {
    public Direction Direction;
    public Speed Speed;
    public Imperial Imperial;

    public com.example.weather_app.CurrentWeather.Direction getDirection() {
        return Direction;
    }

    public void setDirection(com.example.weather_app.CurrentWeather.Direction direction) {
        Direction = direction;
    }

    public com.example.weather_app.CurrentWeather.Speed getSpeed() {
        return Speed;
    }

    public void setSpeed(com.example.weather_app.CurrentWeather.Speed speed) {
        Speed = speed;
    }

    public com.example.weather_app.CurrentWeather.Imperial getImperial() {
        return Imperial;
    }

    public void setImperial(com.example.weather_app.CurrentWeather.Imperial imperial) {
        Imperial = imperial;
    }
}
