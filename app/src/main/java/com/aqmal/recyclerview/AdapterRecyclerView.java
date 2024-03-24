package com.aqmal.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterRecyclerView extends RecyclerView.Adapter<AdapterRecyclerView.ViewHolder> {

    private ArrayList <itemModel> dataItem;

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textHead;
        TextView textSubhead;
        ImageView imageicon;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textHead = itemView.findViewById(R.id.namaUser);
            textSubhead = itemView.findViewById(R.id.nim);
            imageicon = itemView.findViewById(R.id.profileList);
        }
    }

    AdapterRecyclerView (ArrayList<itemModel> dataItem){
        this.dataItem = dataItem;
    }
    @NonNull
    @Override
    public AdapterRecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterRecyclerView.ViewHolder holder, int position) {
        TextView textHead = holder.textHead;
        TextView textSubhead = holder.textSubhead;
        ImageView imageicon = holder.imageicon;

        textHead.setText(dataItem.get(position).getName());
        textSubhead.setText(dataItem.get(position).getNim());
        imageicon.setImageResource(dataItem.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return dataItem.size();
    }
}
