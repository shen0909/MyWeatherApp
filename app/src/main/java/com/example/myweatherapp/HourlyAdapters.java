package com.example.myweatherapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myweatherapp.data.HourData;

import java.util.ArrayList;

// 按小时来展示天气的recycleView适配器
public class HourlyAdapters extends RecyclerView.Adapter<HourlyAdapters.ViewHolder> {

    // 参数
    ArrayList<HourData> list;

    public HourlyAdapters(ArrayList<HourData> list) {
        this.list = list;
    }

    @NonNull
    @Override
    // inflate一个item布局
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycleview_hourly_item,parent,false);
        return new ViewHolder(view);
    }

    // 绑定数据
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tv.setText(list.get(position).getHour());
        holder.wendu.setText(list.get(position).getWenDu()+"");
        holder.hour_Image.setImageResource(list.get(position).getSrc());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView hour_Image;
        TextView tv,wendu;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            hour_Image = itemView.findViewById(R.id.hour_image);
            tv = itemView.findViewById(R.id.hour_tv);
            wendu = itemView.findViewById(R.id.hour_wendu);
        }
    }
}
