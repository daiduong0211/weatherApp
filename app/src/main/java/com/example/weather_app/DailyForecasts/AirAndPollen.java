package com.example.weather_app.DailyForecasts;

import com.google.gson.annotations.SerializedName;

   
public class AirAndPollen {

   @SerializedName("Name")
   String Name;

   @SerializedName("Value")
   int Value;

   @SerializedName("Category")
   String Category;

   @SerializedName("CategoryValue")
   double CategoryValue;

   @SerializedName("Type")
   String Type;


    public void setName(String Name) {
        this.Name = Name;
    }
    public String getName() {
        return Name;
    }
    
    public void setValue(int Value) {
        this.Value = Value;
    }
    public int getValue() {
        return Value;
    }
    
    public void setCategory(String Category) {
        this.Category = Category;
    }
    public String getCategory() {
        return Category;
    }
    
    public void setCategoryValue(double CategoryValue) {
        this.CategoryValue = CategoryValue;
    }
    public double getCategoryValue() {
        return CategoryValue;
    }
    
    public void setType(String Type) {
        this.Type = Type;
    }
    public String getType() {
        return Type;
    }
    
}