package com.example.weather.Model;

import java.util.List;

public class WeatherListResponse {

    private List<WeatherListPeriods> response;

    public WeatherListResponse(List<WeatherListPeriods> response) {
        this.response = response;
    }

    public List<WeatherListPeriods> getWeatherListResponse() {
        return response;
    }
}
