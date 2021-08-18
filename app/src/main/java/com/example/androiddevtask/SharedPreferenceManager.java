package com.example.androiddevtask;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferenceManager {

    private static String SHARED_PREF_NAME="sharedpref";
    private SharedPreferences sharedPreferences;
    Context context;
    private SharedPreferences.Editor editor;

    public SharedPreferenceManager(Context context) {
        this.context = context;
    }

    void saveUser(Payload payload){
        sharedPreferences=context.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.putString("id",payload.getUser().get_id());
        editor.putString("name",payload.getUser().getName());
        editor.putString("email",payload.getUser().getEmail());
        editor.putString("createdAt", payload.getUser().getCreatedAt());
        editor.putString("token",payload.getToken());
        editor.putBoolean("logged", true);
        editor.apply();
    }

    public boolean isLoggedIn(){
        sharedPreferences=context.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        return sharedPreferences.getBoolean("logged", false);
    }

    public User getUser(){
        sharedPreferences=context.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        return new User(
                sharedPreferences.getString("id", null),
                sharedPreferences.getString("name", null),
                sharedPreferences.getString("email", null),
                sharedPreferences.getString("createdAt", null));
    }

    public Payload getPayload(){
        sharedPreferences=context.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        return new Payload(getUser(),
                sharedPreferences.getString("token", null));
    }

    public void logout(){
        sharedPreferences=context.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        editor.clear();
        editor.apply();
    }
}
