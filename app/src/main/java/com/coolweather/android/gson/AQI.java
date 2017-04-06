package com.coolweather.android.gson;

/**
 * Created by wei.shiyao on 2017/4/5.
 */

public class AQI {

    public AQICity city;

    public class AQICity {

        public String aqi;
        public String pm25;
    }
}
