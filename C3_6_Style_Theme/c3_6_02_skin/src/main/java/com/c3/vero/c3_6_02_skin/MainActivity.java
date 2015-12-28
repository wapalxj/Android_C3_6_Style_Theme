package com.c3.vero.c3_6_02_skin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * 动态更换主题Theme
 */
public class MainActivity extends AppCompatActivity{
    private ListView listView;
    private List<String> list;
    private ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.listview);
        list=new ArrayList<>();
        list.add("Skin_theme");
        list.add("Skin_layout");
        list.add("Skin_orientation");
        adapter=new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            Intent i=null;
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        i=new Intent(MainActivity.this,Skin_theme.class);
                        break;
                    case 1:
                        i=new Intent(MainActivity.this,Skin_layout.class);
                        break;
                    case 2:
                        i=new Intent(MainActivity.this,Orientation.class);
                        break;
                    default:
                        break;
                }
                startActivity(i);
            }
        });
    }

}
