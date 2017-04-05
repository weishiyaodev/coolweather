package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by wei.shiyao on 2017/3/31.
 */

public class County extends DataSupport {

    private int id;
    private String countyName; // 县的名字
    private String weatherId; // 记录县对应的天气 id
    private int cityId; // 县所属的市的 id

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
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
