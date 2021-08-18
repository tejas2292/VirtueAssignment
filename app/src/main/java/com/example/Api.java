package com.example;

import com.ModelResponse.LoginResponse;
import com.example.androiddevtask.SharedPreferenceManager;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface Api {

    @FormUrlEncoded
    @POST("auth/admin")
    Call<LoginResponse> login(
            @Field("email") String email,
            @Field("password") String password
    );

    @GET("admin/users")
    Call<FetchUserResponse> getUsers(@Header("Authorization") String authToken);
}
