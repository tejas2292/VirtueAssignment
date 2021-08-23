package com.example.androiddevtask;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    TextView tvMain;
    SharedPreferenceManager sharedPreferenceManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tvMain = findViewById(R.id.tvName);

        sharedPreferenceManager = new SharedPreferenceManager(getApplicationContext());

        tvMain.setText(sharedPreferenceManager.getUser().getName());


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

    @Override
    public void onBackPressed() {
        final AlertDialog.Builder builder = new AlertDialog.Builder(HomeActivity.this);
        builder.setMessage("Are you sure want to exit from app?");
        builder.setCancelable(false);
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
        //here exit app alert close............................................
    }

    public void onSearchUsersActivity(View view) {
        startActivity(new Intent(HomeActivity.this, SearchUserActivity.class));
    }
}