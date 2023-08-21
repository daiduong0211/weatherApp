package com.example.weather_app.TwelfthHour;

public class TwelfthHour {
    private String DateTime;
    private double EpochDateTime;
    private int WeatherIcon;
    private String IconPhrase;
    private boolean HasPrecipitation;
    private String PrecipitationType;
    private String PrecipitationIntensity;
    private boolean IsDaylight;
    private Temperature Temperature;
    private int PrecipitationProbability;
    private String MobileLink;
    private String Link;

    public String getDateTime() {
        return DateTime;
    }

    public void setDateTime(String dateTime) {
        DateTime = dateTime;
    }

    public double getEpochDateTime() {
        return EpochDateTime;
    }

    public void setEpochDateTime(double epochDateTime) {
        EpochDateTime = epochDateTime;
    }

    public int getWeatherIcon() {
        return WeatherIcon;
    }

    public void setWeatherIcon(int weatherIcon) {
        WeatherIcon = weatherIcon;
    }

    public String getIconPhrase() {
        return IconPhrase;
    }

    public void setIconPhrase(String iconPhrase) {
        IconPhrase = iconPhrase;
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

    public String getPrecipitationIntensity() {
        return PrecipitationIntensity;
    }

    public void setPrecipitationIntensity(String precipitationIntensity) {
        PrecipitationIntensity = precipitationIntensity;
    }

    public boolean isDaylight() {
        return IsDaylight;
    }

    public void setDaylight(boolean daylight) {
        IsDaylight = daylight;
    }

    public com.example.weather_app.TwelfthHour.Temperature getTemperature() {
        return Temperature;
    }

    public void setTemperature(com.example.weather_app.TwelfthHour.Temperature temperature) {
        Temperature = temperature;
    }

    public int getPrecipitationProbability() {
        return PrecipitationProbability;
    }

    public void setPrecipitationProbability(int precipitationProbability) {
        PrecipitationProbability = precipitationProbability;
    }

    public String getMobileLink() {
        return MobileLink;
    }

    public void setMobileLink(String mobileLink) {
        MobileLink = mobileLink;
    }

    public String getLink() {
        return Link;
    }

    public void setLink(String link) {
        Link = link;
    }
}
