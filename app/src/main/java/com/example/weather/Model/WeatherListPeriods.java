package com.example.weather.Model;

import java.util.List;

public class WeatherListPeriods {

    private List<WeatherModel> periods;

    public WeatherListPeriods(List<WeatherModel> periods) {
        this.periods = periods;
    }


    public List<WeatherModel> getWeatherPeriods() {
        return periods;
    }
}
