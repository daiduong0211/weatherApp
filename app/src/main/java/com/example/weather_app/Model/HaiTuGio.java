package com.example.weather_app.Model;

public class HaiTuGio {
    private String gio;
    private String nhietdo;
    private int anhthoitiet;

    public HaiTuGio(String gio, String nhietdo, int anhthoitiet) {
        this.gio = gio;
        this.nhietdo = nhietdo;
        this.anhthoitiet = anhthoitiet;
    }

    public String getGio() {
        return gio;
    }

    public void setGio(String gio) {
        this.gio = gio;
    }

    public String getNhietdo() {
        return nhietdo;
    }

    public void setNhietdo(String nhietdo) {
        this.nhietdo = nhietdo;
    }

    public int getAnhthoitiet() {
        return anhthoitiet;
    }

    public void setAnhthoitiet(int anhthoitiet) {
        this.anhthoitiet = anhthoitiet;
    }
}
