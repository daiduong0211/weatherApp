package com.example.weather_app.DailyForecasts;

import com.google.gson.annotations.SerializedName;

   
public class WindGust {

   @SerializedName("Speed")
   Speed Speed;

   @SerializedName("Direction")
   Direction Direction;


    public void setSpeed(Speed Speed) {
        this.Speed = Speed;
    }
    public Speed getSpeed() {
        return Speed;
    }
    
    public void setDirection(Direction Direction) {
        this.Direction = Direction;
    }
    public Direction getDirection() {
        return Direction;
    }
    
}