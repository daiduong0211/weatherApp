package com.example.weather_app.DailyForecasts;

import com.google.gson.annotations.SerializedName;

   
public class Day {

   @SerializedName("Icon")
   double Icon;

   @SerializedName("IconPhrase")
   String IconPhrase;

   @SerializedName("HasPrecipitation")
   boolean HasPrecipitation;

   @SerializedName("ShortPhrase")
   String ShortPhrase;

   @SerializedName("LongPhrase")
   String LongPhrase;

   @SerializedName("PrecipitationProbability")
   double PrecipitationProbability;

   @SerializedName("ThunderstormProbability")
   double ThunderstormProbability;

   @SerializedName("RainProbability")
   double RainProbability;

   @SerializedName("SnowProbability")
   double SnowProbability;

   @SerializedName("IceProbability")
   double IceProbability;

   @SerializedName("Wind")
   Wind Wind;

   @SerializedName("WindGust")
   WindGust WindGust;

   @SerializedName("TotalLiquid")
   TotalLiquid TotalLiquid;

   @SerializedName("Rain")
   Rain Rain;

   @SerializedName("Snow")
   Snow Snow;

   @SerializedName("Ice")
   Ice Ice;

   @SerializedName("HoursOfPrecipitation")
   double HoursOfPrecipitation;

   @SerializedName("HoursOfRain")
   double HoursOfRain;

   @SerializedName("HoursOfSnow")
   double HoursOfSnow;

   @SerializedName("HoursOfIce")
   double HoursOfIce;

   @SerializedName("CloudCover")
   double CloudCover;

   @SerializedName("Evapotranspiration")
   Evapotranspiration Evapotranspiration;

   @SerializedName("SolarIrradiance")
   SolarIrradiance SolarIrradiance;


    public void setIcon(double Icon) {
        this.Icon = Icon;
    }
    public double getIcon() {
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
    
    public void setShortPhrase(String ShortPhrase) {
        this.ShortPhrase = ShortPhrase;
    }
    public String getShortPhrase() {
        return ShortPhrase;
    }
    
    public void setLongPhrase(String LongPhrase) {
        this.LongPhrase = LongPhrase;
    }
    public String getLongPhrase() {
        return LongPhrase;
    }
    
    public void setPrecipitationProbability(double PrecipitationProbability) {
        this.PrecipitationProbability = PrecipitationProbability;
    }
    public double getPrecipitationProbability() {
        return PrecipitationProbability;
    }
    
    public void setThunderstormProbability(double ThunderstormProbability) {
        this.ThunderstormProbability = ThunderstormProbability;
    }
    public double getThunderstormProbability() {
        return ThunderstormProbability;
    }
    
    public void setRainProbability(double RainProbability) {
        this.RainProbability = RainProbability;
    }
    public double getRainProbability() {
        return RainProbability;
    }
    
    public void setSnowProbability(double SnowProbability) {
        this.SnowProbability = SnowProbability;
    }
    public double getSnowProbability() {
        return SnowProbability;
    }
    
    public void setIceProbability(double IceProbability) {
        this.IceProbability = IceProbability;
    }
    public double getIceProbability() {
        return IceProbability;
    }
    
    public void setWind(Wind Wind) {
        this.Wind = Wind;
    }
    public Wind getWind() {
        return Wind;
    }
    
    public void setWindGust(WindGust WindGust) {
        this.WindGust = WindGust;
    }
    public WindGust getWindGust() {
        return WindGust;
    }
    
    public void setTotalLiquid(TotalLiquid TotalLiquid) {
        this.TotalLiquid = TotalLiquid;
    }
    public TotalLiquid getTotalLiquid() {
        return TotalLiquid;
    }
    
    public void setRain(Rain Rain) {
        this.Rain = Rain;
    }
    public Rain getRain() {
        return Rain;
    }
    
    public void setSnow(Snow Snow) {
        this.Snow = Snow;
    }
    public Snow getSnow() {
        return Snow;
    }
    
    public void setIce(Ice Ice) {
        this.Ice = Ice;
    }
    public Ice getIce() {
        return Ice;
    }
    
    public void setHoursOfPrecipitation(double HoursOfPrecipitation) {
        this.HoursOfPrecipitation = HoursOfPrecipitation;
    }
    public double getHoursOfPrecipitation() {
        return HoursOfPrecipitation;
    }
    
    public void setHoursOfRain(double HoursOfRain) {
        this.HoursOfRain = HoursOfRain;
    }
    public double getHoursOfRain() {
        return HoursOfRain;
    }
    
    public void setHoursOfSnow(double HoursOfSnow) {
        this.HoursOfSnow = HoursOfSnow;
    }
    public double getHoursOfSnow() {
        return HoursOfSnow;
    }
    
    public void setHoursOfIce(double HoursOfIce) {
        this.HoursOfIce = HoursOfIce;
    }
    public double getHoursOfIce() {
        return HoursOfIce;
    }
    
    public void setCloudCover(double CloudCover) {
        this.CloudCover = CloudCover;
    }
    public double getCloudCover() {
        return CloudCover;
    }
    
    public void setEvapotranspiration(Evapotranspiration Evapotranspiration) {
        this.Evapotranspiration = Evapotranspiration;
    }
    public Evapotranspiration getEvapotranspiration() {
        return Evapotranspiration;
    }
    
    public void setSolarIrradiance(SolarIrradiance SolarIrradiance) {
        this.SolarIrradiance = SolarIrradiance;
    }
    public SolarIrradiance getSolarIrradiance() {
        return SolarIrradiance;
    }
    
}