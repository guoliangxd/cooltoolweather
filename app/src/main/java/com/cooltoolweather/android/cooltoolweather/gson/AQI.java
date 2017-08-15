package com.cooltoolweather.android.cooltoolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 99544 on 2017/8/14.
 */

public class AQI {

    public AQICity city;

    public class AQICity {

        @SerializedName("aqi")
        public String aqi;

        @SerializedName("pm25")
        public String pm25;
    }
}
