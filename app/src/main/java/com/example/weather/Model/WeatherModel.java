package com.example.weather.Model;

public class WeatherModel {

    private int maxTempF;
    private int minTempF;
    private String dateTimeISO;

    public WeatherModel(int maxTempF, int minTempF, String dateTimeISO) {
        this.maxTempF = maxTempF;
        this.minTempF = minTempF;
        this.dateTimeISO = dateTimeISO;
    }


    public int getMaxTempF() {
        return maxTempF;
    }

    public int getMinTempF() {
        return minTempF;
    }

    public String getDateTimeISO() {
        return dateTimeISO;
    }
}
