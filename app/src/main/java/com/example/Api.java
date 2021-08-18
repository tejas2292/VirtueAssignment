package com.example;

import com.ModelResponse.LoginResponse;
import com.ModelResponse.PasswordResponse;
import com.example.androiddevtask.SharedPreferenceManager;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface Api {

    @FormUrlEncoded
    @POST("auth/admin")
    Call<LoginResponse> login(
            @Field("email") String email,
            @Field("password") String password
    );

    @GET("admin/users")
    Call<FetchUserResponse> getUsers(@Header("Authorization") String authToken);

    @GET("admin/posts")
    Call<FetchPostResponse> getPosts(@Header("Authorization") String authToken);

    @FormUrlEncoded
    @PUT("admin/chnagePassword/{id}")
    Call<PasswordResponse> updatePassword(
            @Header("Authorization") String authToken,
            @Path("id") String id,
            @Field("password") String password
    );
}
