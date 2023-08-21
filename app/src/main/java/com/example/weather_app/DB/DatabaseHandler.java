package com.example.weather_app.DB;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.weather_app.Model.AddCity;

import java.util.ArrayList;
import java.util.List;

public class DatabaseHandler extends SQLiteOpenHelper{
    private static final String DATABASE_NAME = "LocalManager";
    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_NAME = "City";

    private static final String KEY_NAME = "tenthanhpho";
    private static final String KEY_WeatherIcon = "WeatherIcon";
    private static final String KEY_nhietdo = "nhietdo";

    public DatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String create_city_table = String.format("CREATE TABLE %s( %s TEXT, %s INTEGER, %s TEXT)", TABLE_NAME, KEY_NAME, KEY_WeatherIcon, KEY_nhietdo);
        db.execSQL(create_city_table);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String drop_city_table = String.format("DROP TABLE IF EXISTS %s", TABLE_NAME);
        db.execSQL(drop_city_table);
        onCreate(db);
    }
    public void AddCityInDB(AddCity addCity) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_NAME, addCity.getTenthanhpho());
        values.put(KEY_WeatherIcon, addCity.getWeatherIcon());
        values.put(KEY_nhietdo, addCity.getNhietdo());
        db.insert(TABLE_NAME, null, values);
        db.close();
    }
    public List<AddCity> getAllCityInDB() {
        List<AddCity>  addCityList = new ArrayList<>();
        String query = " SELECT * FROM " + TABLE_NAME;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(query, null);
        cursor.moveToFirst();
        while(cursor.isAfterLast() == false) {
            AddCity addCity = new AddCity(cursor.getString(0), cursor.getInt(1), cursor.getString(2));
            addCityList.add(addCity);
            cursor.moveToNext();
        }
        return addCityList;
    }
    public void deleteCityInDB(String cityname) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_NAME, KEY_NAME + " = ?", new String[] { String.valueOf(cityname) });
        db.close();
    }
    public void updateCity(AddCity addCity) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_NAME, addCity.getTenthanhpho());
        values.put(KEY_WeatherIcon, addCity.getWeatherIcon());
        values.put(KEY_nhietdo, addCity.getNhietdo());
        db.update(TABLE_NAME, values, KEY_NAME  + " = ?", new String[] { String.valueOf(addCity.getTenthanhpho()) });
        db.close();
    }

}