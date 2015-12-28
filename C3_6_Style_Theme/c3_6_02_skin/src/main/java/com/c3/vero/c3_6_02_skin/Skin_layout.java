package com.c3.vero.c3_6_02_skin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Skin_layout extends AppCompatActivity implements View.OnClickListener {
    private Button layout_1;
    private Button layout_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skin_layout);
        bindView();
    }
    public void bindView(){
        layout_1=(Button)findViewById(R.id.layout_1);
        layout_2=(Button)findViewById(R.id.layout_2);
        layout_1.setOnClickListener(this);
        layout_2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.layout_1:
                setContentView(R.layout.activity_skin_layout);
                bindView();
                break;
            case R.id.layout_2:
                setContentView(R.layout.activity_skin_layout2);
                bindView();
                break;
            default:
                break;
        }
    }
}
