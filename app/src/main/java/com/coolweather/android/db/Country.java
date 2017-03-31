package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by wei.shiyao on 2017/3/31.
 */

public class Country extends DataSupport {

    private int id;
    private String countryName; // 县的名字
    private String weatherId; // 记录县对应的天气 id
    private int cityId; // 县所属的市的 id

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }
}
