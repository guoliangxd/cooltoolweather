package com.cooltoolweather.android.cooltoolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 99544 on 2017/8/14.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }
}
