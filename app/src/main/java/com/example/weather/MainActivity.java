package com.example.weather;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.weather.Controller.ForecastAdapter;
import com.example.weather.Fragment.DisplayForecastFragment;
import com.example.weather.Model.WeatherListResponse;
import com.example.weather.Model.WeatherModel;
import com.example.weather.Service.RetroFitSingleton;
import com.example.weather.Service.WeatherService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RecyclerView recyclerView = findViewById(R.id.forecast_recyclerview);
        final Retrofit retrofit = RetroFitSingleton.newInstance();
        WeatherService service = retrofit.create(WeatherService.class);
        Call<WeatherListResponse> weatherListResponseCall = service.getWeatherUpdates("dYNLXJfHo7ygPXu8cOhAA", "u42nGUhdZLwh1KQALowBVj5n34qFzRW1hY6DQ8jr");
        weatherListResponseCall.enqueue(new Callback<WeatherListResponse>() {
            @Override
            public void onResponse(Call<WeatherListResponse> call, Response<WeatherListResponse> response) {
                Log.d(TAG, "onResponse: " + response.body().getWeatherListResponse().get(0).getWeatherPeriods().get(0));
                List<WeatherModel> weatherModelList = response.body().getWeatherListResponse().get(0).getWeatherPeriods().subList(0, 2);

                recyclerView.setAdapter(new ForecastAdapter(weatherModelList));
                recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
            }

            @Override
            public void onFailure(Call<WeatherListResponse> call, Throwable t) {
                Log.e(TAG, "onFailure: " + t.getMessage());
            }
        });


    }
}
