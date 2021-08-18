package com.example.androiddevtask;

import com.example.Api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static  String BASE_URL = "https://majlis.virtueinfotek.uk/api/";
    private static  RetrofitClient retrofitClient;
    private static Retrofit retrofit;

    private RetrofitClient(){
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static synchronized RetrofitClient getInstance(){
        if(retrofitClient==null){
            retrofitClient=new RetrofitClient();
        }
        return retrofitClient;
    }

    Api getApi(){
        return retrofit.create(Api.class);
    }
}
