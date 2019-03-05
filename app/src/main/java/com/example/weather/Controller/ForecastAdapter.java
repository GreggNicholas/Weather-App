package com.example.weather.Controller;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.weather.Model.WeatherModel;
import com.example.weather.R;

import java.util.List;

public class ForecastAdapter extends RecyclerView.Adapter<ForecastViewHolder> {
private final  List<WeatherModel> getWeatherList;

    public ForecastAdapter(List<WeatherModel> getWeatherList) {
        this.getWeatherList = getWeatherList;
    }

    @NonNull
    @Override
    public ForecastViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
       View childView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.forecast_item_view, viewGroup,false);
       return new ForecastViewHolder(childView);
    }

    @Override
    public void onBindViewHolder(@NonNull ForecastViewHolder forecastViewHolder, int position) {
forecastViewHolder.onBind(getWeatherList.get(position));
    }

    @Override
    public int getItemCount() {
        return getWeatherList.size();
    }
}
