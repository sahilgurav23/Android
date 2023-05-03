package com.example.q3;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;


public class BlankFragment extends Fragment {

    ListView lv;
    ArrayAdapter<String> adapter; //allows you to adapt an array of objects to be displayed in a ListView or Spinner view
    String[] data = {"Item1","Item2","Item3","Item4","Item5", "Item6","Item7","Item8","Item9","Item10"};
    public BlankFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        lv = (ListView) view.findViewById(R.id.fraglist);
        adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,data);//this,layout resource id, data
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getActivity(),Itemclick.class);//Explicit Intent
                intent.putExtra("item",data[i]);
                startActivity(intent);
            }
        });
        return view;
    }
}