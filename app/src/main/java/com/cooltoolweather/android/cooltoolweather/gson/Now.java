package com.cooltoolweather.android.cooltoolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 99544 on 2017/8/14.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;
    }
}
