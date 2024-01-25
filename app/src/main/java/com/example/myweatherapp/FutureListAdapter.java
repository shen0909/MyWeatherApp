package com.example.myweatherapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.myweatherapp.data.FutureListData;
import java.util.ArrayList;

public class FutureListAdapter extends RecyclerView.Adapter<FutureListAdapter.ViewHolder> {

    ArrayList<FutureListData> arrayList;

    public FutureListAdapter(ArrayList<FutureListData> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public FutureListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycleview_future_list_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FutureListAdapter.ViewHolder holder, int position) {
        holder.dayTxt.setText(arrayList.get(position).getDay());
        holder.statusTxt.setText(arrayList.get(position).getStatus());
        holder.highTxt.setText(arrayList.get(position).getHighTemp() +"°");
        holder.lowTxt.setText(arrayList.get(position).getLowTemp()+"");
        holder.pic.setImageResource(arrayList.get(position).getPicPath());
        final int pos = position;
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("点击了第"+pos+"个");
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView dayTxt,statusTxt,lowTxt,highTxt;
        ImageView pic;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            dayTxt = itemView.findViewById(R.id.dayTxt);
            statusTxt = itemView.findViewById(R.id.statusTxt);
            lowTxt = itemView.findViewById(R.id.lowTxt);
            highTxt = itemView.findViewById(R.id.highTxt);
            pic = itemView.findViewById(R.id.pic);
        }
    }
}
