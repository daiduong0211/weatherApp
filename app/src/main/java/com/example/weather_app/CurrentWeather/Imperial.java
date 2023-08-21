package com.example.weather_app.CurrentWeather;

public class Imperial {
    public double Value;
    public String Unit;
    public double UnitType;
    public String Phrase;

    public double getValue() {
        return Value;
    }

    public void setValue(double value) {
        Value = value;
    }

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String unit) {
        Unit = unit;
    }

    public double getUnitType() {
        return UnitType;
    }

    public void setUnitType(double unitType) {
        UnitType = unitType;
    }

    public String getPhrase() {
        return Phrase;
    }

    public void setPhrase(String phrase) {
        Phrase = phrase;
    }
}
