package com.ync.connect.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ync.connect.R;

import java.util.List;

public class MainMenuAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context mContext;
    private List<String> data;

    public MainMenuAdapter(Context context, List<String> data) {
        this.mContext = context;
        this.data = data;
    }

    public class MainMenuRowItemView extends RecyclerView.ViewHolder {

        TextView menuTitle;

        public MainMenuRowItemView(@NonNull View itemView) {
            super(itemView);

            menuTitle = itemView.findViewById(R.id.menu_title);
        }

        void bind(int position) {

            // Update UI for each row item

            menuTitle.setText(data.get(position));
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MainMenuRowItemView(LayoutInflater.from(parent.getContext()).inflate(R.layout.row_main_menu, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((MainMenuRowItemView) holder).bind(position);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
