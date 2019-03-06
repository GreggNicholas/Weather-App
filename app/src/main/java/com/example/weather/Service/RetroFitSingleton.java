package com.example.weather.Service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroFitSingleton {
    private static Retrofit instance;
    private static final String BASE_URL = "https://api.aerisapi.com/";

    public static Retrofit newInstance() {
        if (instance == null) {
            instance = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return instance;

    }

}
