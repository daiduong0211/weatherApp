package com.example.weather_app.FiveDay;

import com.google.gson.annotations.SerializedName;

   
public class Day {

   @SerializedName("Icon")
   int Icon;

   @SerializedName("IconPhrase")
   String IconPhrase;

   @SerializedName("HasPrecipitation")
   boolean HasPrecipitation;

   @SerializedName("PrecipitationType")
   String PrecipitationType;

   @SerializedName("PrecipitationIntensity")
   String PrecipitationIntensity;


    public void setIcon(int Icon) {
        this.Icon = Icon;
    }
    public int getIcon() {
        return Icon;
    }
    
    public void setIconPhrase(String IconPhrase) {
        this.IconPhrase = IconPhrase;
    }
    public String getIconPhrase() {
        return IconPhrase;
    }
    
    public void setHasPrecipitation(boolean HasPrecipitation) {
        this.HasPrecipitation = HasPrecipitation;
    }
    public boolean getHasPrecipitation() {
        return HasPrecipitation;
    }
    
    public void setPrecipitationType(String PrecipitationType) {
        this.PrecipitationType = PrecipitationType;
    }
    public String getPrecipitationType() {
        return PrecipitationType;
    }
    
    public void setPrecipitationIntensity(String PrecipitationIntensity) {
        this.PrecipitationIntensity = PrecipitationIntensity;
    }
    public String getPrecipitationIntensity() {
        return PrecipitationIntensity;
    }
    
}