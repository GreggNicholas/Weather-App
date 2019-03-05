package com.example.weather.Controller;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.weather.Model.WeatherModel;

public class ForecastViewHolder extends RecyclerView.ViewHolder {
    public ForecastViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    public void onBind(WeatherModel weatherModel) {
    }
}
