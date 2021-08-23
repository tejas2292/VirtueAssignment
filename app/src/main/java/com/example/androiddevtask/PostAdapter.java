package com.example.androiddevtask;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ModelResponse.DeletePostResponse;
import com.example.FetchPostResponse;
import com.example.MorePayload;
import com.example.PostPayloads;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.ViewHolder> {
    Context context;
    String id;
    String auth;

    List<PostPayloads> userList;
    public PostAdapter(Context context, List<PostPayloads> userList, String auth) {
        this.context = context;
        this.userList = userList;
        this.auth = auth;
    }

    @NonNull
    @NotNull
    @Override
    public PostAdapter.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.post_item, parent, false);
        return new PostAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull PostAdapter.ViewHolder holder, int position) {
                holder.firstName.setText(userList.get(position).getUser().getFirst_name()+" "+
                        userList.get(position).getUser().getLast_name());
        holder.occupation.setText("Hello my name is "+userList.get(position).getUser().getFirst_name()+" this is post content");

        holder.deletePost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Call<DeletePostResponse> call = RetrofitClient.getInstance().getApi().deletePostApi(auth, userList
                .get(position).get_id());

                call.enqueue(new Callback<DeletePostResponse>(){
                    @Override
                    public void onResponse(Call<DeletePostResponse> call, Response<DeletePostResponse> response) {

                      DeletePostResponse deletePostResponse = response.body();
                      Toast.makeText(context, ""+deletePostResponse.getStatus().message, Toast.LENGTH_SHORT).show();
                      context.startActivity(new Intent(context, HomeActivity.class));

                    }

                    @Override
                    public void onFailure(Call<DeletePostResponse> call, Throwable t) {
                        Toast.makeText(context, ""+t.getMessage(), Toast.LENGTH_SHORT).show();

                    }
                });

            }
        });
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView general, firstName, occupation;
        ImageButton deletePost;
        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);

            general = itemView.findViewById(R.id.general);
            firstName = itemView.findViewById(R.id.first_name);
            occupation = itemView.findViewById(R.id.occupation);
            deletePost = itemView.findViewById(R.id.delete_post);


        }
    }
}
