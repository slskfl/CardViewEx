package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.ViewHolder> {
    ArrayList<ItemData> itemData=new ArrayList<>();
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View itemView=inflater.inflate(R.layout.item, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ItemData data=itemData.get(position);
        holder.setItem(data);
    }

    @Override
    public int getItemCount() {
        return itemData.size();
    }

    public void addItem(ItemData data){
        itemData.add(data);
    }

    public ItemData getItem(int position){
        return itemData.get(position);
    }

    public void setItemData(ArrayList<ItemData> itemData){
        this.itemData=itemData;
    }

    public void setData(int position, ItemData data){
        itemData.set(position, data);
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView itemPoster;
        TextView itemTitle, itemContent;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemPoster=itemView.findViewById(R.id.itemPoster);
            itemTitle=itemView.findViewById(R.id.itemTitle);
            itemContent=itemView.findViewById(R.id.itemContent);
        }
        public void setItem(ItemData data){
            itemPoster.setImageResource(data.imgID);
            itemTitle.setText(data.title);
            itemContent.setText(data.content);
        }
    }
}
