package com.example.weather.Fragment;


import android.content.Context;
import android.nfc.Tag;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.weather.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DisplayForecastFragment extends Fragment {
    private static final String WEATHER_KEY = "Params1";
    private static final String TAG = "DisplayForecastFragment";
    private String getForecast;
    public DisplayForecastFragment() {
    }

    public static DisplayForecastFragment getInstance(String weather) {
        DisplayForecastFragment displayForecastFragment = new DisplayForecastFragment();
        Bundle args = new Bundle();
        args.getString(WEATHER_KEY, weather);
        displayForecastFragment.setArguments(args);
        return displayForecastFragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (getArguments() != null){
            getForecast = getArguments().getString(WEATHER_KEY);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_display_forecast, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);




    }
}
