package com.example.weather.Model;

public class WeatherModel {

    private String maxTempF;
    private String minTempF;
    private String dateTimeISO;

    public WeatherModel(String maxTempF, String minTempF, String dateTimeISO) {
        this.maxTempF = maxTempF;
        this.minTempF = minTempF;
        this.dateTimeISO = dateTimeISO;
    }


    public String getMaxTempF() {
        return maxTempF;
    }

    public String getMinTempF() {
        return minTempF;
    }

    public String getDateTimeISO() {
        return dateTimeISO;
    }
}
