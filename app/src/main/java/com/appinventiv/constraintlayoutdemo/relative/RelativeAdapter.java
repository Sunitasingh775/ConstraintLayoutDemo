package com.appinventiv.constraintlayoutdemo.relative;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.appinventiv.constraintlayoutdemo.R;

public class RelativeAdapter extends RecyclerView.Adapter<RelativeAdapter.MyViewHolder> {

    @NonNull
    @Override
    public RelativeAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new RelativeAdapter.MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_relative, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RelativeAdapter.MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 100;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
