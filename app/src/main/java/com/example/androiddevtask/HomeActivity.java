package com.example.androiddevtask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    TextView data;
    SharedPreferenceManager sharedPreferenceManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //data = findViewById(R.id.showshareddata);

        sharedPreferenceManager = new SharedPreferenceManager(getApplicationContext());
       /*
        data.setText(sharedPreferenceManager.getUser()._id+"\n"+
                sharedPreferenceManager.getUser().getName()+"\n"+
                sharedPreferenceManager.getPayload().getToken());
*/

    }

    public void onAllUsersActivity(View view) {
        startActivity(new Intent(HomeActivity.this, AllUsersActivity.class));
    }

    public void onAllPostsActivity(View view) {
        startActivity(new Intent(HomeActivity.this, AllPostsActivity.class));
    }

    public void onChangeUserPassword(View view) {
        startActivity(new Intent(HomeActivity.this, ChangeUserPasswordActivity.class));
        finish();
    }

    public void onLogout(View view) {
        sharedPreferenceManager.logout();
        startActivity(new Intent(HomeActivity.this, MainActivity.class));
        finish();
    }
}