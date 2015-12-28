package com.c3.vero.c3_6_06_drag;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.sql.Time;
import java.util.Timer;
import java.util.concurrent.BrokenBarrierException;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener, View.OnClickListener {
    private Button move;
    float beginX=0;
    float beginY=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        move=(Button)findViewById(R.id.move);
        move.setOnTouchListener(this);
        move.setOnClickListener(this);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        DisplayMetrics displayMetrics=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int screenWid=displayMetrics.widthPixels;
        int screenHei=displayMetrics.heightPixels;


        int ea=event.getAction();
        switch (ea){
            case MotionEvent.ACTION_DOWN:
                Log.i("ddddddddddd","dddddddddd");
                beginX=event.getRawX();
                beginY=event.getRawY();

                break;
            case MotionEvent.ACTION_MOVE:
                int dx=(int)(event.getRawX()-beginX);
                int dy=(int)(event.getRawY()-beginY);

                int l=v.getLeft()+dx;
                int t=v.getTop()+dy;
                int r=v.getRight()+dx;
                int b=v.getBottom()+dy;
                //判断边界
                if (l<0){
                    r=r-l;
                    l=0;
                }
                if (r>screenWid){
                    l=l-(r-screenWid);
                    r=screenWid;
                }
                if (t<0){
                    b=b-t;
                    t=0;
                }
                //可能是模拟器BUG，底部有230PX看不见的区域
                if (b>screenHei-230){
//                    t=t-(b-screenHei);
                    b=screenHei-230;
                    t=b-v.getHeight();
                }
                Log.i("hhhhhhhhhhhh",""+screenHei);
                Log.i("bbbbbbbbbbbbbbbbb", "" + b);
                v.layout(l, t, r, b);
                v.invalidate();
                //再重置beiginX/Y
                beginX=event.getRawX();
                beginY=event.getRawY();
//                v.postInvalidate();
                break;
            case MotionEvent.ACTION_UP:
                Log.i("uuuuuuuuuuuuu","uuuuuuuuuuu");
                break;
            default:
                break;

        }
        return false;
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==move.getId()){
            Toast.makeText(MainActivity.this,"我可以移动哦",Toast.LENGTH_SHORT).show();
        }
    }
}
