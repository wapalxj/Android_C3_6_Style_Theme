package com.c3.vero.c3_6_04_tweenanimation;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageView imageView;
    private Button alpha,rotate,scale,translate,set;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.alpha:
//                Animation alpha=new AlphaAnimation(1.0f,0.0f);
//                alpha.setDuration(500);
//                alpha.setRepeatMode(Animation.REVERSE);
//                alpha.setRepeatCount(3);
                //XML
                Animation alpha=AnimationUtils.loadAnimation(MainActivity.this, R.anim.alpha);

                imageView.startAnimation(alpha);

                break;
            case R.id.rotate:
//                Animation rotate=new RotateAnimation(0f,360f,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
//                rotate.setDuration(500);
//                rotate.setRepeatCount(3);
//                rotate.setRepeatMode(Animation.REVERSE);
                //XML
                Animation rotate=AnimationUtils.loadAnimation(MainActivity.this,R.anim.rotate);

                imageView.startAnimation(rotate);
                break;
            case R.id.scale:
//                Animation scale=new ScaleAnimation(1.0f,0.5f,1.0f,0.5f,Animation.RELATIVE_TO_SELF,0.5F,Animation.RELATIVE_TO_SELF,0.5f);
//                scale.setDuration(500);
//                scale.setRepeatMode(Animation.REVERSE);
//                scale.setRepeatCount(3);
                //XML
                Animation scale=AnimationUtils.loadAnimation(MainActivity.this,R.anim.scale);

                imageView.startAnimation(scale);
                break;
            case R.id.translate:
//                Animation translate=new TranslateAnimation(Animation.RELATIVE_TO_SELF,0.0f,Animation.RELATIVE_TO_SELF,3.0f, Animation.RELATIVE_TO_SELF,0.0F,Animation.RELATIVE_TO_SELF,3.0f);
//                translate.setDuration(500);
//                translate.setRepeatMode(Animation.REVERSE);
//                translate.setRepeatCount(3);
               //XML
                Animation translate=AnimationUtils.loadAnimation(MainActivity.this,R.anim.translate);

                imageView.startAnimation(translate);
                break;
            case R.id.set:
//                AnimationSet sets=new AnimationSet(false);
//                Animation alphaSet=new AlphaAnimation(1.0f,0.0f);
//                alphaSet.setRepeatMode(Animation.REVERSE);
//                alphaSet.setRepeatCount(3);
//
//                Animation rotateSet=new RotateAnimation(0f,360f,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
//                rotateSet.setRepeatCount(3);
//
//                Animation scaleSet=new ScaleAnimation(1.0f,0.5f,1.0f,0.5f,Animation.RELATIVE_TO_SELF,0.5F,Animation.RELATIVE_TO_SELF,0.5f);
//                scaleSet.setRepeatMode(Animation.REVERSE);
//                scaleSet.setRepeatCount(3);
//
//                Animation translateSet=new TranslateAnimation(Animation.RELATIVE_TO_SELF,0.0f,Animation.RELATIVE_TO_SELF,3.0f,
//                        Animation.RELATIVE_TO_SELF,0.0F,Animation.RELATIVE_TO_SELF,3.0f);
//                translateSet.setRepeatMode(Animation.REVERSE);
//                translateSet.setRepeatCount(3);
//                sets.addAnimation(alphaSet);
//                sets.addAnimation(rotateSet);
//                sets.addAnimation(scaleSet);
//                sets.addAnimation(translateSet);
//                sets.setDuration(1000);
                //XML
                AnimationSet sets= (AnimationSet) AnimationUtils.loadAnimation(MainActivity.this,R.anim.sets);

                imageView.startAnimation(sets);
                break;
            default:
                break;
        }
    }

    public void initView(){
        imageView=(ImageView)findViewById(R.id.view);
        alpha=(Button)findViewById(R.id.alpha);
        rotate=(Button)findViewById(R.id.rotate);
        scale=(Button)findViewById(R.id.scale);
        translate=(Button)findViewById(R.id.translate);
        set=(Button)findViewById(R.id.set);

        alpha.setOnClickListener(this);
        rotate.setOnClickListener(this);
        scale.setOnClickListener(this);
        translate.setOnClickListener(this);
        set.setOnClickListener(this);

    }
}
