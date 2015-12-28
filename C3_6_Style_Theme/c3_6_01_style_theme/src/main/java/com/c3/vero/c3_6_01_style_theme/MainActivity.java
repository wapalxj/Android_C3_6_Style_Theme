package com.c3.vero.c3_6_01_style_theme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<String> list;
    private ListView listView;
    private ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list=new ArrayList<>();
        list.add("普通的Theme");
        list.add("Bubble");
        list.add("blur");

        listView=(ListView)findViewById(R.id.list);
        adapter= new ArrayAdapter<>(MainActivity.this,android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent i=new Intent(MainActivity.this,Putong_Activity.class);
                        startActivity(i);
                        break;
                    case 1:
                        Intent i2=new Intent(MainActivity.this,StyleActivity.class);
                        startActivity(i2);
                        break;
                    case 2:
                        Intent i3=new Intent(MainActivity.this,Blur_activity.class);
                        startActivity(i3);
                        break;
                    default:
                        break;
                }
            }
        });
    }

}
