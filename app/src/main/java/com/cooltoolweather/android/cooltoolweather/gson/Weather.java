package com.cooltoolweather.android.cooltoolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by 99544 on 2017/8/14.
 */

public class Weather {

    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
