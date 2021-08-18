package com.example.androiddevtask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.ModelResponse.PasswordResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ChangeUserPasswordActivity extends AppCompatActivity {
    EditText etNewPass;
    String newPass, id, token;
    SharedPreferenceManager sharedPreferenceManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_user_password);
        etNewPass = findViewById(R.id.et_newpass);
        sharedPreferenceManager = new SharedPreferenceManager(getApplicationContext());

    }

    public void onSubmitPassword(View view) {
        newPass = etNewPass.getText().toString();
        id = sharedPreferenceManager.getUser()._id;
        token = "Bearer "+sharedPreferenceManager.getPayload().getToken();
        if(newPass.equals("")){
            Toast.makeText(this, "Enter pass first", Toast.LENGTH_SHORT).show();
        }
        else {

            Call<PasswordResponse> call = RetrofitClient.getInstance().getApi().updatePassword(
                    token ,id,newPass);

            call.enqueue(new Callback<PasswordResponse>() {
                @Override
                public void onResponse(Call<PasswordResponse> call, Response<PasswordResponse> response) {
                    if(response.isSuccessful()){
                        Toast.makeText(ChangeUserPasswordActivity.this, "Success "+response.body().getStatus().message, Toast.LENGTH_SHORT).show();
                        sharedPreferenceManager.logout();
                        startActivity(new Intent(ChangeUserPasswordActivity.this, MainActivity.class));
                        finish();
                    }
                    else {
                        Toast.makeText(ChangeUserPasswordActivity.this, "error: "+response, Toast.LENGTH_SHORT).show();
                    }
                }

                @Override
                public void onFailure(Call<PasswordResponse> call, Throwable t) {
                    Toast.makeText(ChangeUserPasswordActivity.this, "Wrong Password"+t.getMessage(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(ChangeUserPasswordActivity.this, HomeActivity.class));
        finish();
    }
}