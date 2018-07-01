package com.example.android.listviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String [] foodILike ={"pasta","chicken","spanch","chocolate","seaFood"};
       // ListAdapter lovedFood= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,foodILike);
        ListAdapter lovedFood=new CustomAdapter(this,foodILike);
        ListView foodlist=(ListView) findViewById(R.id.foodList);
        foodlist.setAdapter(lovedFood);

        foodlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String food=String.valueOf(parent.getItemAtPosition(position));
                Toast.makeText(MainActivity.this,food,Toast.LENGTH_LONG).show();
            }
        });

    }
}
