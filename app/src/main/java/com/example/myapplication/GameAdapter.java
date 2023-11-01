package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class GameAdapter extends RecyclerView.Adapter<GameViewHolder> {

    private ArrayList<String> gameNameList;


    public GameAdapter(ArrayList<String> gameNameList) {

        this.gameNameList = gameNameList;
    }

    @NonNull
    @Override
    public GameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new GameViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_game, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull GameViewHolder holder, int position) {
        holder.onBind(gameNameList.get(position));
    }

    @Override
    public int getItemCount() {

        return gameNameList.size();
    }
}
