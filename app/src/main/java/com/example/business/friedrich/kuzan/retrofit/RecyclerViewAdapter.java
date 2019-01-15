package com.example.business.friedrich.kuzan.retrofit;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private ArrayList<Post> mPosts;

    public RecyclerViewAdapter() {
        mPosts = new ArrayList<>();
    }

    public void setPosts(ArrayList<Post> posts)
    {
        mPosts = posts;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.body, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        String ss = "UserID: " + mPosts.get(i).getUserId()
                + "\nID: " + mPosts.get(i).getId()
                + "\nTitle: " + mPosts.get(i).getTitle()
                + "\nText: " + mPosts.get(i).getmText();
        viewHolder.textView.setText(ss);
    }

    @Override
    public int getItemCount() {
        return mPosts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        private TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.all_text);
        }
    }
}
