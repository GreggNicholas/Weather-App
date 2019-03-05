package com.example.weather.Service;


import com.example.weather.Model.WeatherListResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherService {


    String ENDPOINT = "forecasts/11101";

    @GET(ENDPOINT)
    Call<WeatherListResponse> getWeatherUpdates(@Query("client_id") String client_id, @Query("client_secret") String client_secret);


}
