package com.example.weather_app.FiveDay;
import java.util.Date;

import com.google.gson.annotations.SerializedName;

   
public class Headline {

   @SerializedName("EffectiveDate")
   String EffectiveDate;

   @SerializedName("EffectiveEpochDate")
   double EffectiveEpochDate;

   @SerializedName("Severity")
   double Severity;

   @SerializedName("Text")
   String Text;

   @SerializedName("Category")
   String Category;

   @SerializedName("EndDate")
   Date EndDate;

   @SerializedName("EndEpochDate")
   double EndEpochDate;

   @SerializedName("MobileLink")
   String MobileLink;

   @SerializedName("Link")
   String Link;


    public void setEffectiveDate(String EffectiveDate) {
        this.EffectiveDate = EffectiveDate;
    }
    public String getEffectiveDate() {
        return EffectiveDate;
    }
    
    public void setEffectiveEpochDate(double EffectiveEpochDate) {
        this.EffectiveEpochDate = EffectiveEpochDate;
    }
    public double getEffectiveEpochDate() {
        return EffectiveEpochDate;
    }
    
    public void setSeverity(double Severity) {
        this.Severity = Severity;
    }
    public double getSeverity() {
        return Severity;
    }
    
    public void setText(String Text) {
        this.Text = Text;
    }
    public String getText() {
        return Text;
    }
    
    public void setCategory(String Category) {
        this.Category = Category;
    }
    public String getCategory() {
        return Category;
    }
    
    public void setEndDate(Date EndDate) {
        this.EndDate = EndDate;
    }
    public Date getEndDate() {
        return EndDate;
    }
    
    public void setEndEpochDate(double EndEpochDate) {
        this.EndEpochDate = EndEpochDate;
    }
    public double getEndEpochDate() {
        return EndEpochDate;
    }
    
    public void setMobileLink(String MobileLink) {
        this.MobileLink = MobileLink;
    }
    public String getMobileLink() {
        return MobileLink;
    }
    
    public void setLink(String Link) {
        this.Link = Link;
    }
    public String getLink() {
        return Link;
    }
    
}