package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> gameNameList = new ArrayList<>();
    private RecyclerView rvGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        loadData();
    }

    private void loadData(){
        gameNameList.add("League of legends");
        gameNameList.add("Call of Duty: Mobile");
        gameNameList.add("PUBG Mobile");
        gameNameList.add("Mobile Legends BB");
        gameNameList.add("Genshin Impact");
        gameNameList.add("World of Tanks");
        gameNameList.add("Warface");
        gameNameList.add("Call of Duty: Warzone");
        gameNameList.add("Call of Duty: Black Ops");
        gameNameList.add("Party Animal");
        gameNameList.add("CS 2");
        gameNameList.add("Teardown");
        gameNameList.add("Minecraft");
        gameNameList.add("GTA 5");
        gameNameList.add("Spider-Man 2");
        initAdapter();
    }

    private void initAdapter(){
        GameAdapter adapter = new GameAdapter(gameNameList);
        rvGame.setAdapter(adapter);
    }

    private void initView(){
        rvGame = findViewById(R.id.rw_game);
    }
}