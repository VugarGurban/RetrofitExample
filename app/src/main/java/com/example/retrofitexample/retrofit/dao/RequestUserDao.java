package com.example.retrofitexample.retrofit.dao;

import com.example.retrofitexample.retrofit.model.response.CreateUserResponseModel;
import com.example.retrofitexample.retrofit.model.response.ResponseUserModel;
import com.example.retrofitexample.retrofit.model.request.CreateUserRequestModel;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface RequestUserDao {
        @GET("users/{id}")
        Call<ResponseUserModel> getUser(@Path("id") String id);

        @POST("users/")
        Call<CreateUserResponseModel> postUser(@Body CreateUserRequestModel requestPost);

    }