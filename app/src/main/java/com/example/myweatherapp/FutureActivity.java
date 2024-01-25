package com.example.myweatherapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.myweatherapp.data.FutureListData;

import java.util.ArrayList;

public class FutureActivity extends AppCompatActivity {
    private ArrayList<FutureListData> arrayList = new ArrayList<>();
    private FutureListAdapter listAdapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_future);
        RecyclerView recyclerView = findViewById(R.id.future_list);
        arrayList.add(new FutureListData("Sat",R.drawable.storm,"storm",25,10));
        arrayList.add(new FutureListData("Sun",R.drawable.cloudy,"cloudy",24,16));
        arrayList.add(new FutureListData("Mon",R.drawable.windy,"windy",29,15));
        arrayList.add(new FutureListData("Tue",R.drawable.cloudy_sunny,"cloudy Sunny",22,13));
        arrayList.add(new FutureListData("Wen",R.drawable.sunny,"sunny",28,11));
        arrayList.add(new FutureListData("Thu",R.drawable.rainy,"Rainy",23,12));
        listAdapter = new FutureListAdapter(arrayList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        recyclerView.setAdapter(listAdapter);

        //返回按钮
        ConstraintLayout bakeImage = findViewById(R.id.backBtn);
        bakeImage.setOnClickListener(view -> startActivity(new Intent(FutureActivity.this,MainActivity.class)));

    }
}