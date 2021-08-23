package com.example;

import com.ModelResponse.DeletePostResponse;
import com.ModelResponse.LoginResponse;
import com.ModelResponse.PasswordResponse;
import com.ModelResponse.SearchUserResponse;

import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
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

    @GET("admin/search/{name}")
    Call<SearchUserResponse> searchUserApi(
            @Header("Authorization") String authToken,
            @Path("name") String name
    );

    @DELETE("admin/posts/delete/{id}")
    Call<DeletePostResponse> deletePostApi(
            @Header("Authorization") String authToken,
            @Path("id") String id);
}
