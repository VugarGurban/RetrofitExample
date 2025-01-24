package com.example.retrofitexample.activity;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.retrofitexample.R;
import com.example.retrofitexample.retrofit.builder.ApiUtils;
import com.example.retrofitexample.retrofit.builder.RetrofitClient;
import com.example.retrofitexample.retrofit.dao.RequestUserDao;
import com.example.retrofitexample.retrofit.model.response.CreateUserResponseModel;
import com.example.retrofitexample.retrofit.model.response.ResponseUserModel;
import com.example.retrofitexample.retrofit.model.request.CreateUserRequestModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    TextView tvname, tvdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvname = findViewById(R.id.tvname);
        tvdata = findViewById(R.id.tvdata);


        RequestUserDao requestUser = ApiUtils.getRequestUserDao();
        Call<CreateUserResponseModel> callPost = requestUser.postUser(new CreateUserRequestModel("pawan", "programmer"));

        callPost.enqueue(new Callback<CreateUserResponseModel>() {
            @Override
            public void onResponse(Call<CreateUserResponseModel> call, Response<CreateUserResponseModel> response) {
                tvname.setText(response.body().getName());
            }

            @Override
            public void onFailure(Call<CreateUserResponseModel> call, Throwable throwable) {
                tvdata.setText(throwable.getMessage());
            }
        });

        Call<ResponseUserModel> call = requestUser.getUser("3");

        call.enqueue(new Callback<ResponseUserModel>() {
            @Override
            public void onResponse(@NonNull Call<ResponseUserModel> call, @NonNull Response<ResponseUserModel> response) {
//                tvname.setText("First_name");
                tvdata.setText(response.body().getData().getFirstName());

            }

            @Override
            public void onFailure(Call<ResponseUserModel> call, Throwable throwable) {

            }
        });
    }
}