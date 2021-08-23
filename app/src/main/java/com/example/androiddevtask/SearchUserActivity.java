package com.example.androiddevtask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.ModelResponse.SearchUserResponse;
import com.example.FetchUserResponse;
import com.example.MorePayload;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SearchUserActivity extends AppCompatActivity {
    List<SearchPayloads> userList;
    SearchAdapter adapter;
    EditText etSearchUser;
    String userSearched;
    RecyclerView recyclerView;
    SharedPreferenceManager sharedPreferenceManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_user);
        sharedPreferenceManager = new SharedPreferenceManager(getApplicationContext());
        recyclerView = findViewById(R.id.recycle);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        etSearchUser = findViewById(R.id.etSearchUser);
    }

    public void onSearchUser(View view) {
        userSearched = etSearchUser.getText().toString().trim();

        if(userSearched.equals("")){
            Toast.makeText(this, "Search Field is empty", Toast.LENGTH_SHORT).show();
        }
        else {
            Call<SearchUserResponse> call = RetrofitClient.getInstance().getApi().searchUserApi("Bearer "+sharedPreferenceManager.getPayload().getToken(),
                    userSearched);

            call.enqueue(new Callback<SearchUserResponse>(){
                @Override
                public void onResponse(Call<SearchUserResponse> call, Response<SearchUserResponse> response) {

                    SearchUserResponse searchUserResponse = response.body();
                    userList = searchUserResponse.getMorePayloads();
                    adapter = new SearchAdapter(getApplicationContext(), userList);
                    Toast.makeText(SearchUserActivity.this, ""+searchUserResponse.getStatus().message, Toast.LENGTH_SHORT).show();
                    recyclerView.setAdapter(adapter);

                }

                @Override
                public void onFailure(Call<SearchUserResponse> call, Throwable t) {
                    Toast.makeText(SearchUserActivity.this, ""+t.getMessage(), Toast.LENGTH_SHORT).show();

                }
            });

        }

    }
}