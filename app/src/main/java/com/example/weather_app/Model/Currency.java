package com.example.weather_app.Model;

public class Currency {
    public boolean success;
    public String terms;
    public String privacy;
    public float timestamp;
    public Quote quotes;

    public Currency(boolean success, String terms, String privacy, float timestamp, Quote quotes) {
        this.success = success;
        this.terms = terms;
        this.privacy = privacy;
        this.timestamp = timestamp;
        this.quotes = quotes;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getTerms() {
        return terms;
    }

    public void setTerms(String terms) {
        this.terms = terms;
    }

    public String getPrivacy() {
        return privacy;
    }

    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    public float getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(float timestamp) {
        this.timestamp = timestamp;
    }

    public Quote getQuotes() {
        return quotes;
    }

    public void setQuotes(Quote quotes) {
        this.quotes = quotes;
    }

    public class Quote {
        public float USDVND;

        public Quote(float USDVND) {
            this.USDVND = USDVND;
        }

        public float getUSDVND() {
            return USDVND;
        }

        public void setUSDVND(float USDVND) {
            this.USDVND = USDVND;
        }
    }
}
