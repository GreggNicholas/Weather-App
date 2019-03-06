package com.example.weather.Model;

import java.util.ArrayList;
import java.util.List;

import okhttp3.Response;

public class WeatherListResponse {
    private List<WeatherListPeriods> response;
    private boolean success;

    public WeatherListResponse(List<WeatherListPeriods> response, boolean success) {
        this.response = response;
        this.success = success;
    }

    public List<WeatherListPeriods> getResponse() {
        return response;
    }

    public boolean isSuccess() {
        return success;
    }
}
