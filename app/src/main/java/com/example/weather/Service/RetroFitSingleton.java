package com.example.weather.Service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroFitSingleton {
    private static Retrofit instance;
    private static final String BASE_URL = "http://api.aerisapi.com/";

    public static Retrofit newInstance() {
        if (instance == null) {
            instance = new Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return instance;

    }

}
