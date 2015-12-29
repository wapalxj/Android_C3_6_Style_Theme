package com.c3.vero.c3_6_07_property_animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView iv;
    Button trans;
    Button rotate;
    Button scale;
    Button alpha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.translate:
                ;
                break;
            case R.id.translate:
            ;
                break;
            case R.id.translate:
            ;
                break;
            case R.id.translate:
            ;
                break;
        }

    }
    public void init() {
        iv=(ImageView)findViewById(R.id.iv);
        trans=(Button)findViewById(R.id.translate);
        rotate=(Button)findViewById(R.id.rotate);
        scale=(Button)findViewById(R.id.translate);
        alpha=(Button)findViewById(R.id.translate);

        trans.setOnClickListener(this);
    }


}
