package com.c3.vero.c3_6_02_skin;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class Orientation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orientation2);

    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        switch (newConfig.orientation){
            case Configuration.ORIENTATION_PORTRAIT:
                Log.i("pppppppppppppp","|||||||||||||||");
                setContentView(R.layout.activity_orientation2);
                break;
            case Configuration.ORIENTATION_LANDSCAPE:
                Log.i("lllllllllllllll","------------------");
                setContentView(R.layout.activity_orientation);
                break;
            default:
                break;
        }
    }
}
