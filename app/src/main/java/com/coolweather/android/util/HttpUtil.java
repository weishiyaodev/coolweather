package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * 与指定服务器交互：获取省市县数据
 * Created by wei.shiyao on 2017/3/31.
 */

public class HttpUtil {

    /*
    发送 OkHttp 请求
    address：请求地址
     */
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
