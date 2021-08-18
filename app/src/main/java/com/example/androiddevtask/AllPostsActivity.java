package com.example.androiddevtask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.FetchPostResponse;
import com.example.FetchUserResponse;
import com.example.MorePayload;
import com.example.PostPayloads;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AllPostsActivity extends AppCompatActivity {
    List<PostPayloads> userList;
    PostAdapter adapter;
    RecyclerView recyclerView;
    SharedPreferenceManager sharedPreferenceManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_posts);

        recyclerView = findViewById(R.id.recycle);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        sharedPreferenceManager = new SharedPreferenceManager(getApplicationContext());

        Call<FetchPostResponse> call = RetrofitClient.getInstance().getApi().getPosts("Bearer "+sharedPreferenceManager.getPayload().getToken());

        call.enqueue(new Callback<FetchPostResponse>(){
            @Override
            public void onResponse(Call<FetchPostResponse> call, Response<FetchPostResponse> response) {

                userList = response.body().getPostPayloads();
                adapter = new PostAdapter(getApplicationContext(), userList);
                recyclerView.setAdapter(adapter);

            }

            @Override
            public void onFailure(Call<FetchPostResponse> call, Throwable t) {
                Toast.makeText(AllPostsActivity.this, ""+t.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });
    }

}