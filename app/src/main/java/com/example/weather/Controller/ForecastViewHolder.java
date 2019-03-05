package com.example.weather.Controller;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.weather.Model.WeatherModel;
import com.example.weather.R;

public class ForecastViewHolder extends RecyclerView.ViewHolder {
    private TextView maxTemp;
    private TextView minTemp;
    private TextView dateAndTime;

    public ForecastViewHolder(@NonNull View itemView) {
        super(itemView);
        this.maxTemp = maxTemp;
        this.minTemp = minTemp;
        this.dateAndTime = dateAndTime;
    }

    public void onBind(final WeatherModel weatherModel) {
        dateAndTime = itemView.findViewById(R.id.weather_view);
        maxTemp = itemView.findViewById(R.id.display_maxTemp_fragment);
        minTemp = itemView.findViewById(R.id.display_minTemp_fragment);
    }
}
