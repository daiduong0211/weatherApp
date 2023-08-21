package com.example.weather_app.CurrentWeather;

public class CurrentWeather {
    public  String LocalObservationDateTime;
    public double EpochTime;
    public  String WeatherText;
    public double WeatherIcon;
    public boolean HasPrecipitation;
    public  String PrecipitationType;
    public boolean IsDayTime;
    public Temperature Temperature;
    public RealFeelTemperature RealFeelTemperature;
    public RealFeelTemperatureShade RealFeelTemperatureShade;
    public double RelativeHumidity;
    public double IndoorRelativeHumidity;
    public DewPoint DewPoint;
    public Wind Wind;
    public WindGust WindGust;
    public double UVIndex;
    public String UVIndexText;
    public Visibility Visibility;
    public String ObstructionsToVisibility;
    public double CloudCover;
    public Ceiling Ceiling;
    public Pressure Pressure;
    //=================================================================================\\

    public String getLocalObservationDateTime() {
        return LocalObservationDateTime;
    }

    public void setLocalObservationDateTime(String localObservationDateTime) {
        LocalObservationDateTime = localObservationDateTime;
    }

    public double getEpochTime() {
        return EpochTime;
    }

    public void setEpochTime(double epochTime) {
        EpochTime = epochTime;
    }

    public String getWeatherText() {
        return WeatherText;
    }

    public void setWeatherText(String weatherText) {
        WeatherText = weatherText;
    }

    public double getWeatherIcon() {
        return WeatherIcon;
    }

    public void setWeatherIcon(double weatherIcon) {
        WeatherIcon = weatherIcon;
    }

    public boolean isHasPrecipitation() {
        return HasPrecipitation;
    }

    public void setHasPrecipitation(boolean hasPrecipitation) {
        HasPrecipitation = hasPrecipitation;
    }

    public String getPrecipitationType() {
        return PrecipitationType;
    }

    public void setPrecipitationType(String precipitationType) {
        PrecipitationType = precipitationType;
    }

    public boolean isDayTime() {
        return IsDayTime;
    }

    public void setDayTime(boolean dayTime) {
        IsDayTime = dayTime;
    }

    public com.example.weather_app.CurrentWeather.Temperature getTemperature() {
        return Temperature;
    }

    public void setTemperature(com.example.weather_app.CurrentWeather.Temperature temperature) {
        Temperature = temperature;
    }

    public RealFeelTemperature getRealFeelTemperature() {
        return RealFeelTemperature;
    }

    public void setRealFeelTemperature(RealFeelTemperature realFeelTemperature) {
        RealFeelTemperature = realFeelTemperature;
    }

    public RealFeelTemperatureShade getRealFeelTemperatureShade() {
        return RealFeelTemperatureShade;
    }

    public void setRealFeelTemperatureShade(RealFeelTemperatureShade realFeelTemperatureShade) {
        RealFeelTemperatureShade = realFeelTemperatureShade;
    }

    public double getRelativeHumidity() {
        return RelativeHumidity;
    }

    public void setRelativeHumidity(double relativeHumidity) {
        RelativeHumidity = relativeHumidity;
    }

    public double getIndoorRelativeHumidity() {
        return IndoorRelativeHumidity;
    }

    public void setIndoorRelativeHumidity(double indoorRelativeHumidity) {
        IndoorRelativeHumidity = indoorRelativeHumidity;
    }

    public DewPoint getDewPoint() {
        return DewPoint;
    }

    public void setDewPoint(DewPoint dewPoint) {
        DewPoint = dewPoint;
    }

    public Wind getWind() {
        return Wind;
    }

    public void setWind(Wind wind) {
        Wind = wind;
    }

    public WindGust getWindGust() {
        return WindGust;
    }

    public void setWindGust(WindGust windGust) {
        WindGust = windGust;
    }

    public double getUVIndex() {
        return UVIndex;
    }

    public void setUVIndex(double UVIndex) {
        this.UVIndex = UVIndex;
    }

    public String getUVIndexText() {
        return UVIndexText;
    }

    public void setUVIndexText(String UVIndexText) {
        this.UVIndexText = UVIndexText;
    }

    public Visibility getVisibility() {
        return Visibility;
    }

    public void setVisibility(Visibility visibility) {
        Visibility = visibility;
    }

    public String getObstructionsToVisibility() {
        return ObstructionsToVisibility;
    }

    public void setObstructionsToVisibility(String obstructionsToVisibility) {
        ObstructionsToVisibility = obstructionsToVisibility;
    }

    public double getCloudCover() {
        return CloudCover;
    }

    public void setCloudCover(double cloudCover) {
        CloudCover = cloudCover;
    }

    public Ceiling getCeiling() {
        return Ceiling;
    }

    public void setCeiling(Ceiling ceiling) {
        Ceiling = ceiling;
    }

    public Pressure getPressure() {
        return Pressure;
    }

    public void setPressure(Pressure pressure) {
        Pressure = pressure;
    }
}
