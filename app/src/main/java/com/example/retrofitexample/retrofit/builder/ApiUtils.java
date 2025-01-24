package com.example.retrofitexample.retrofit.builder;

import com.example.retrofitexample.retrofit.dao.RequestUserDao;

public class ApiUtils {
    private static final String BASE_URL = "https://reqres.in/";
    private static final String URL = BASE_URL + "api/";
    public static RequestUserDao getRequestUserDao() {
        return RetrofitClient.getInstance(URL).create(RequestUserDao.class);
    }



}
