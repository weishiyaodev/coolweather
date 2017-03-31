package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * 省份实体类
 * Created by wei.shiyao on 2017/3/31.
 */

public class Province extends DataSupport {

    private int id;
    private  String provinceName; // 省份名字
    private int provinceCode; // 省份代号

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
