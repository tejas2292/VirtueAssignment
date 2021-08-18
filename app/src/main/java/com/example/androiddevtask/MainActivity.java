package com.example.androiddevtask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.ModelResponse.LoginResponse;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    EditText etUsername, etPassword;
    Button loginBtn;
    String username, password;
    SharedPreferenceManager sharedPreferenceManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        OkHttpClient client = new OkHttpClient();

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        loginBtn = findViewById(R.id.loginBtn);

        sharedPreferenceManager = new SharedPreferenceManager(getApplicationContext());


        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 userLogin();
            }
        });

    }

    private void userLogin() {
        username = etUsername.getText().toString().trim();
        password = etPassword.getText().toString().trim();

        if(username.equals("") || password.equals("")){
            Toast.makeText(this, "Enter details first", Toast.LENGTH_SHORT).show();
        }
        else {
            Call<LoginResponse> call = RetrofitClient.getInstance().getApi().login(username, password);

            call.enqueue(new Callback<LoginResponse>() {
                @Override
                public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {

                    LoginResponse loginResponse = response.body();

                    if(response.isSuccessful()){
                        if(response.code() == 200){
                            sharedPreferenceManager.saveUser(loginResponse.getPayload());
                            startActivity(new Intent(MainActivity.this, HomeActivity.class));
                            finish();
                            Toast.makeText(MainActivity.this, "Login Success: "+loginResponse.getStatus().message, Toast.LENGTH_SHORT).show();

                        }
                         else {
                            Toast.makeText(MainActivity.this, "Wrong pass", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else {
                        Toast.makeText(MainActivity.this, "Not logged in: ", Toast.LENGTH_SHORT).show();
                    }
                }

                @Override
                public void onFailure(Call<LoginResponse> call, Throwable t) {
                    Toast.makeText(MainActivity.this, "Wrong Credentials", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }


    @Override
    protected void onStart() {
        super.onStart();

        if(sharedPreferenceManager.isLoggedIn()){
            startActivity(new Intent(MainActivity.this, HomeActivity.class));
            finish();
        }
    }
}