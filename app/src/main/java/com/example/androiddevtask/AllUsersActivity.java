package com.example.androiddevtask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.FetchUserResponse;
import com.example.MorePayload;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AllUsersActivity extends AppCompatActivity {
    List<MorePayload> userList;
    UserAdapter adapter;
    RecyclerView recyclerView;
    SharedPreferenceManager sharedPreferenceManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_users);

        recyclerView = findViewById(R.id.recycle);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        sharedPreferenceManager = new SharedPreferenceManager(getApplicationContext());

        Call<FetchUserResponse> call = RetrofitClient.getInstance().getApi().getUsers("Bearer "+sharedPreferenceManager.getPayload().getToken());

        call.enqueue(new Callback<FetchUserResponse>(){
            @Override
            public void onResponse(Call<FetchUserResponse> call, Response<FetchUserResponse> response) {

                userList = response.body().getMorePayloads();
                adapter = new UserAdapter(getApplicationContext(), userList);
                recyclerView.setAdapter(adapter);

            }

            @Override
            public void onFailure(Call<FetchUserResponse> call, Throwable t) {
                Toast.makeText(AllUsersActivity.this, ""+t.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });
    }

}