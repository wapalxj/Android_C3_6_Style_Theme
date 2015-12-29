package com.c3.vero.c3_6_04_02_drawableanimation;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView iv=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv=(ImageView)findViewById(R.id.iv);
        AnimationDrawable ad=new AnimationDrawable();
//        ad.addFrame(getDrawable(R.drawable.start_075),200);
        ad.addFrame(getDrawable(R.drawable.start_076),200);
        ad.addFrame(getDrawable(R.drawable.start_077),200);
        ad.addFrame(getDrawable(R.drawable.start_078),200);
        ad.addFrame(getDrawable(R.drawable.start_079),200);
        ad.addFrame(getDrawable(R.drawable.start_080),200);
        iv.setBackground(ad);
        AnimationDrawable anima=(AnimationDrawable)iv.getBackground();
        anima.start();
    }

}
