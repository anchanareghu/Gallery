package com.example.gallery02;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;


public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {
    private final ArrayList<DataFromJson> imageList;

    public RecyclerAdapter(ArrayList<DataFromJson> images) {
        this.imageList = images;
    }


    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_image, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
//        "https://via.placeholder.com/600/24f355)"
        Picasso.get()
                .load(imageList.get(position).getImage())
                .into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return imageList.size();
    }
}
