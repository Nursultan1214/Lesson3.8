package com.example.lesson38.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lesson38.Model.User;
import com.example.lesson38.R;

import java.util.ArrayList;

class MainAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private final int TYPE_WITH_IMAGE = 0;
    private final int TYPE_WITHOUT_IMAGE = 1;
    private ArrayList<User> list = new ArrayList<>();

    public void setList(ArrayList<User> list){
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    @Override
    public int getItemViewType(int position) {
        int i = 0;
        if(list.get(position).getType() == "image"){
            i = TYPE_WITH_IMAGE;
        }else {
            i = TYPE_WITHOUT_IMAGE;
        }
        return i;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if(viewType == TYPE_WITH_IMAGE){
            View imageView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_first, parent, false);
            return new ViewHolderImg(imageView);
        } else {
            View withoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_first2, parent, false);
            return new ViewHolder(withoutView);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if(getItemViewType(position) == TYPE_WITH_IMAGE){
            ((ViewHolderImg) holder).onBindImg(list.get(position));
        }else {
            ((ViewHolder)holder).onBind(list.get(position));
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView nameS;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nameS = itemView.findViewById(R.id.tv_item);
        }
        public void onBind(User user) {
            nameS.setText(user.getFirst());
        }
    }

    private class ViewHolderImg extends RecyclerView.ViewHolder {

        private TextView name;

        public ViewHolderImg(View imageView) {
            super(imageView);
            name = imageView.findViewById(R.id.tv_item2);
        }
        public void onBindImg(User user) {
            name.setText(user.getFirst2());
        }
    }
}