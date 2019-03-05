package com.example.weather;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.weather.Service.WeatherService;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView weatherView = findViewById(R.id.text_show_forecast_main);
        final Button weatherButton = findViewById(R.id.button);


        weatherButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String getForecastResponse = weatherButton.getText().toString();


                WeatherService weatherService =




            }
        });


    }
}
