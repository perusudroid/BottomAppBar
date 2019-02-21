package com.perusudroid.bottombar;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.inflater_custom, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bindData(getItemCount());
    }

    @Override
    public int getItemCount() {
        return 100;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tvtxt;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvtxt = itemView.findViewById(R.id.tvtxt);
        }

        public void bindData(int itemCount) {
            tvtxt.setText(String.valueOf("Value "+itemCount));
        }
    }
}
