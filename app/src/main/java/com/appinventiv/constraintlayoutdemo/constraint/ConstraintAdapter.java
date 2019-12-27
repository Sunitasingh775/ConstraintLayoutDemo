package com.appinventiv.constraintlayoutdemo.constraint;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.appinventiv.constraintlayoutdemo.R;

public class ConstraintAdapter extends RecyclerView.Adapter<ConstraintAdapter.MyViewHolder> {

    @NonNull
    @Override
    public ConstraintAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ConstraintAdapter.MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_constraint, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ConstraintAdapter.MyViewHolder holder, int position) {

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
