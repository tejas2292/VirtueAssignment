package com.example.androiddevtask;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.MorePayload;
import com.example.PostPayloads;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.ViewHolder> {
    Context context;

    List<PostPayloads> userList;
    public PostAdapter(Context context, List<PostPayloads> userList) {
        this.context = context;
        this.userList = userList;
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
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView general, firstName, occupation;
        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);

            general = itemView.findViewById(R.id.general);
            firstName = itemView.findViewById(R.id.first_name);
            occupation = itemView.findViewById(R.id.occupation);
        }
    }
}
