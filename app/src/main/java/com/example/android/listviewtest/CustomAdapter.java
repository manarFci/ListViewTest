package com.example.android.listviewtest;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by macbook on 6/22/18.
 */

class CustomAdapter extends ArrayAdapter<String> {


    public CustomAdapter(@NonNull Context context, String [] foods) {
        super(context, R.layout.custom_list,foods);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //here we say i want to convert java array code to layout
        LayoutInflater buckyInflater=LayoutInflater.from(getContext());
        //here we choose which layout we will use
        View customView=buckyInflater.inflate(R.layout.custom_list, parent,false);
        //we need to get each item from list
        String foodItem=getItem(position);
        TextView listText=(TextView) customView.findViewById(R.id.list_words);
        listText.setText(foodItem);
        ImageView developerImg=(ImageView) customView.findViewById(R.id.developer);
        developerImg.setImageResource(R.drawable.developer);
        return customView;

    }
}
