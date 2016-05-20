package com.c3.vero.c3_6_07_property_animation;

import android.animation.ObjectAnimator;
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
<<<<<<< HEAD
//        switch (v.getId()){
//            case R.id.translate:
//                ;
//                break;
//            case R.id.translate:
//            ;
//                break;
//            case R.id.translate:
//            ;
//                break;
//            case R.id.translate:
//            ;
//                break;
//        }
//
=======
        switch (v.getId()){
            case R.id.translate:
                ObjectAnimator translate=ObjectAnimator.ofFloat(iv, "translationX", 0, 300,0);
                translate.setDuration(1000);
                translate.start();
                break;
            case R.id.rotate:
                ObjectAnimator rotateA=ObjectAnimator.ofFloat(iv, "RotationX", 0,360);
                rotateA.setDuration(1000);
                rotateA.setRepeatCount(5);
                rotateA.start();
                break;
            case R.id.scale:
                ObjectAnimator scaleX=ObjectAnimator.ofFloat(iv,"ScaleX",1,2,1);
                ObjectAnimator scaleY=ObjectAnimator.ofFloat(iv,"ScaleY",1,2,1);
                scaleX.setDuration(1000);
                scaleY.setDuration(1000);
                scaleX.start();
                scaleY.start();
                break;
            case R.id.alpha:
                ObjectAnimator alphaA=ObjectAnimator.ofFloat(iv, "alpha", 1.0F, 0.0F,1.0f);
                alphaA.setDuration(1000);
                alphaA.start();
                break;
        }

>>>>>>> ed2ced139ba5242ff49b07bbd29d36ce926bd8e2
    }
    public void init() {
        iv=(ImageView)findViewById(R.id.iv);
        trans=(Button)findViewById(R.id.translate);
        rotate=(Button)findViewById(R.id.rotate);
        scale=(Button)findViewById(R.id.scale);
        alpha=(Button)findViewById(R.id.alpha);

        trans.setOnClickListener(this);
        rotate.setOnClickListener(this);
        scale.setOnClickListener(this);
        alpha.setOnClickListener(this);
    }


}
