package com.example.myweatherapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.myweatherapp.data.HourData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private HourlyAdapters adapters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 初始化数
        initRecycleView();
        TextView nextBuntton = findViewById(R.id.nextBtn);
        nextBuntton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FutureActivity.class);
                startActivity(intent);
            }
        });
    }

    private   void initRecycleView(){
        ArrayList<HourData> datas = new ArrayList<>();
        datas.add(new HourData("9 pm",28,R.drawable.cloudy));
        datas.add(new HourData("11 pm",29,R.drawable.sunny));
        datas.add(new HourData("12 pm",30,R.drawable.wind));
        datas.add(new HourData("1 pm",29,R.drawable.rainy));
        datas.add(new HourData("2 pm",27,R.drawable.storm));

        RecyclerView recyclerView = findViewById(R.id.recycleView_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        adapters = new HourlyAdapters(datas);
        recyclerView.setAdapter(adapters);
    }
}