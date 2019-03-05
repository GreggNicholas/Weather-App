package com.example.weather.Controller;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.weather.Model.WeatherModel;
import com.example.weather.R;

public class ForecastViewHolder extends RecyclerView.ViewHolder {
    private ForecastAdapter adapter;
    private TextView maxTemp;
    private TextView minTemp;
    private TextView dateAndTime;

    public ForecastViewHolder(@NonNull View itemView) {
        super(itemView);
    }


    public void onBind(final WeatherModel weatherModel) {
       dateAndTime = itemView.findViewById(R.id.weather_view);
    }
}
