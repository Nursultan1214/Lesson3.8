package com.example.lesson38.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lesson38.R;
import com.example.lesson38.adapters.SecondAdapter;

import java.util.ArrayList;


public class SecondFragment extends Fragment {

    private SecondAdapter adapter;
    private ArrayList<String> list = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_second, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        createList();
        initRecycler(view);
    }
    private void createList() {
        list = new ArrayList<>();
        list.add("Nursultan");
        list.add("Nursultan");
        list.add("Nursultan");
        list.add("Nursultan");
        list.add("Nursultan");
        list.add("Nursultan");
        list.add("Nursultan");

    }

    private void initRecycler(View view) {
        recyclerView = view.findViewById(R.id.rv_second);
        adapter = new SecondAdapter();
        adapter.setList(list);
        recyclerView.setAdapter(adapter);
    }
}
