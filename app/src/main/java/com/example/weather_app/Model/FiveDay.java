package com.example.weather_app.Model;

public class FiveDay {
    private String homnay;
    private String day;
    private int anh1;
    private String nhietdocao;
    private String nhietdothap;
    private int anh2;
    private String tocdogio;

    public FiveDay(String homnay, String day, int anh1, String nhietdocao, String nhietdothap, int anh2, String tocdogio) {
        this.homnay = homnay;
        this.day = day;
        this.anh1 = anh1;
        this.nhietdocao = nhietdocao;
        this.nhietdothap = nhietdothap;
        this.anh2 = anh2;
        this.tocdogio = tocdogio;
    }

    public String getHomnay() {
        return homnay;
    }

    public void setHomnay(String homnay) {
        this.homnay = homnay;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getAnh1() {
        return anh1;
    }

    public void setAnh1(int anh1) {
        this.anh1 = anh1;
    }

    public String getNhietdocao() {
        return nhietdocao;
    }

    public void setNhietdocao(String nhietdocao) {
        this.nhietdocao = nhietdocao;
    }

    public String getNhietdothap() {
        return nhietdothap;
    }

    public void setNhietdothap(String nhietdothap) {
        this.nhietdothap = nhietdothap;
    }

    public int getAnh2() {
        return anh2;
    }

    public void setAnh2(int anh2) {
        this.anh2 = anh2;
    }

    public String getTocdogio() {
        return tocdogio;
    }

    public void setTocdogio(String tocdogio) {
        this.tocdogio = tocdogio;
    }
}
