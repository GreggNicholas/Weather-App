package com.example.weather.Model;

public class WeatherModel {

    private int maxTempF;
    private int minTempF;
    private String dateTimeISO;
    private String icon;

    public WeatherModel(int maxTempF, int minTempF, String dateTimeISO, String icon) {
        this.maxTempF = maxTempF;
        this.minTempF = minTempF;
        this.dateTimeISO = dateTimeISO;
        this.icon = icon;
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


    public String getIcon() {
        return icon;
    }
}
