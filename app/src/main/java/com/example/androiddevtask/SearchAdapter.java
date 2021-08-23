package com.example.androiddevtask;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.MorePayload;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class SearchAdapter extends RecyclerView.Adapter<SearchAdapter.ViewHolder> {
    Context context;

    List<SearchPayloads> userList;
    public SearchAdapter(Context context, List<SearchPayloads> userList) {
        this.context = context;
        this.userList = userList;
    }

    @NonNull
    @NotNull
    @Override
    public SearchAdapter.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.user_item, parent, false);
        return new SearchAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull SearchAdapter.ViewHolder holder, int position) {
        holder.general.setText(userList.get(position).getPhone_number()+ " || "
                + userList.get(position).getCountry());
        holder.firstName.setText(userList.get(position).getFirst_name());
        holder.occupation.setText(userList.get(position).getOccupation());
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
