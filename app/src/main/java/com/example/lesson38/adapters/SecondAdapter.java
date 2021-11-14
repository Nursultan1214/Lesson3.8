package com.example.lesson38.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lesson38.R;

import java.util.ArrayList;

public class SecondAdapter extends RecyclerView.Adapter<SecondAdapter.ViewHolder>{

    private ArrayList<String> list = new ArrayList<>();

    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
       return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_second,parent,false));
    }

    @Override
    public void onBindViewHolder( ViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void setList(ArrayList<String> list) {
        this.list = new ArrayList<>();
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView second;

        public ViewHolder( View itemView) {
            super(itemView);
            second = itemView.findViewById(R.id.tv_item2);
        }

        public void onBind(String s) {
            second.setText(s.toString());
        }
    }
}