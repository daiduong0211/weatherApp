package com.example.weather_app.Model;

import java.util.List;

public class CitySearch {

    private int Version;
    public String Key;
    private String Type;
    private int Rank;
    private String LocalizedName;
    private String EnglishName;
    private String PrimaryPostalCode;

    private Region Region;
    private Country Country;
    private AdministrativeArea AdministrativeArea;
    private TimeZone TimeZone;
    private GeoPosition GeoPosition;

    private boolean IsAlias;
    private List<String> DataSets;

    public int getVersion() {
        return Version;
    }

    public void setVersion(int version) {
        Version = version;
    }

    public String getKey() {
        return Key;
    }

    public void setKey(String key) {
        Key = key;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public int getRank() {
        return Rank;
    }

    public void setRank(int rank) {
        Rank = rank;
    }

    public String getLocalizedName() {
        return LocalizedName;
    }

    public void setLocalizedName(String localizedName) {
        LocalizedName = localizedName;
    }

    public String getEnglishName() {
        return EnglishName;
    }

    public void setEnglishName(String englishName) {
        EnglishName = englishName;
    }

    public String getPrimaryPostalCode() {
        return PrimaryPostalCode;
    }

    public void setPrimaryPostalCode(String primaryPostalCode) {
        PrimaryPostalCode = primaryPostalCode;
    }

    public CitySearch.Region getRegion() {
        return Region;
    }

    public void setRegion(CitySearch.Region region) {
        Region = region;
    }

    public CitySearch.Country getCountry() {
        return Country;
    }

    public void setCountry(CitySearch.Country country) {
        Country = country;
    }

    public CitySearch.AdministrativeArea getAdministrativeArea() {
        return AdministrativeArea;
    }

    public void setAdministrativeArea(CitySearch.AdministrativeArea administrativeArea) {
        AdministrativeArea = administrativeArea;
    }

    public CitySearch.TimeZone getTimeZone() {
        return TimeZone;
    }

    public void setTimeZone(CitySearch.TimeZone timeZone) {
        TimeZone = timeZone;
    }

    public CitySearch.GeoPosition getGeoPosition() {
        return GeoPosition;
    }

    public void setGeoPosition(CitySearch.GeoPosition geoPosition) {
        GeoPosition = geoPosition;
    }

    public boolean isAlias() {
        return IsAlias;
    }

    public void setAlias(boolean alias) {
        IsAlias = alias;
    }

    public List<String> getDataSets() {
        return DataSets;
    }

    public void setDataSets(List<String> dataSets) {
        DataSets = dataSets;
    }

    public static class Region {
        private String ID;
        private String LocalizedName;
        private String EnglishName;

        public String getID() {
            return ID;
        }

        public void setID(String ID) {
            this.ID = ID;
        }

        public String getLocalizedName() {
            return LocalizedName;
        }

        public void setLocalizedName(String localizedName) {
            LocalizedName = localizedName;
        }

        public String getEnglishName() {
            return EnglishName;
        }

        public void setEnglishName(String englishName) {
            EnglishName = englishName;
        }
    }

    public static class Country {
        private String ID;
        private String LocalizedName;
        private String EnglishName;

        public String getID() {
            return ID;
        }

        public String getLocalizedName() {
            return LocalizedName;
        }

        public String getEnglishName() {
            return EnglishName;
        }
    }

    public static class AdministrativeArea {
        private String ID;
        private String LocalizedName;
        private String EnglishName;
        private int Level;
        private String LocalizedType;
        private String EnglishType;
        private String CountryID;

        public String getID() {
            return ID;
        }

        public void setID(String ID) {
            this.ID = ID;
        }

        public String getLocalizedName() {
            return LocalizedName;
        }

        public void setLocalizedName(String localizedName) {
            LocalizedName = localizedName;
        }

        public String getEnglishName() {
            return EnglishName;
        }

        public void setEnglishName(String englishName) {
            EnglishName = englishName;
        }

        public int getLevel() {
            return Level;
        }

        public void setLevel(int level) {
            Level = level;
        }

        public String getLocalizedType() {
            return LocalizedType;
        }

        public void setLocalizedType(String localizedType) {
            LocalizedType = localizedType;
        }

        public String getEnglishType() {
            return EnglishType;
        }

        public void setEnglishType(String englishType) {
            EnglishType = englishType;
        }

        public String getCountryID() {
            return CountryID;
        }

        public void setCountryID(String countryID) {
            CountryID = countryID;
        }
    }

    public static class TimeZone {
        private String Code;
        private String Name;
        private double GmtOffset;
        private boolean IsDaylightSaving;
        private Object NextOffsetChange; // It can be null or a specific date type

        public String getCode() {
            return Code;
        }

        public void setCode(String code) {
            Code = code;
        }

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public double getGmtOffset() {
            return GmtOffset;
        }

        public void setGmtOffset(double gmtOffset) {
            GmtOffset = gmtOffset;
        }

        public boolean isDaylightSaving() {
            return IsDaylightSaving;
        }

        public void setDaylightSaving(boolean daylightSaving) {
            IsDaylightSaving = daylightSaving;
        }

        public Object getNextOffsetChange() {
            return NextOffsetChange;
        }

        public void setNextOffsetChange(Object nextOffsetChange) {
            NextOffsetChange = nextOffsetChange;
        }
    }

    public static class GeoPosition {
        private double Latitude;
        private double Longitude;
        private Elevation Elevation;

        public double getLatitude() {
            return Latitude;
        }

        public void setLatitude(double latitude) {
            Latitude = latitude;
        }

        public double getLongitude() {
            return Longitude;
        }

        public void setLongitude(double longitude) {
            Longitude = longitude;
        }

        public CitySearch.Elevation getElevation() {
            return Elevation;
        }

        public void setElevation(CitySearch.Elevation elevation) {
            Elevation = elevation;
        }
    }

    public static class Elevation {
        private Metric Metric;
        private Imperial Imperial;


    }

    public static class Metric {
        private double Value;
        private String Unit;
        private int UnitType;

        public double getValue() {
            return Value;
        }

        public void setValue(double Value) {
            Value = Value;
        }

        public String getUnit() {
            return Unit;
        }

        public void setUnit(String Unit) {
            Unit = Unit;
        }

        public int getUnitType() {
            return UnitType;
        }

        public void setUnitType(int UnitType) {
            UnitType = UnitType;
        }
    }

    public static class Imperial {
        private double Value;
        private String Unit;
        private int UnitType;

        public double getValue() {
            return Value;
        }

        public void setValue(double Value) {
            Value = Value;
        }

        public String getUnit() {
            return Unit;
        }

        public void setUnit(String Unit) {
            Unit = Unit;
        }

        public int getUnitType() {
            return UnitType;
        }

        public void setUnitType(int UnitType) {
            UnitType = UnitType;
        }
    }
}


