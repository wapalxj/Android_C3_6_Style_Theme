package com.c3.vero.c3_6_03_viewstub;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ViewStub viewStub_p;
    private ViewStub viewStub_l;
    private View port;
    private View landsc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewStub_p=(ViewStub)findViewById(R.id.stub_p);
        viewStub_l=(ViewStub)findViewById(R.id.stub_l);
        if (this.getResources().getConfiguration().orientation==Configuration.ORIENTATION_PORTRAIT){
            port=viewStub_p.inflate();
        }
        if (this.getResources().getConfiguration().orientation==Configuration.ORIENTATION_LANDSCAPE){
            landsc=viewStub_l.inflate();
        }

    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        switch (newConfig.orientation){
            case Configuration.ORIENTATION_PORTRAIT:
                if (port==null){
                    port=viewStub_p.inflate();
                }
                if (landsc!=null){
                    landsc.setVisibility(View.GONE);
                }
                    port.setVisibility(View.VISIBLE);
                break;
            case Configuration.ORIENTATION_LANDSCAPE:
                if (landsc==null){
                    landsc=viewStub_l.inflate();
                }
                if (port!=null){
                    port.setVisibility(View.GONE);
                }
                landsc.setVisibility(View.VISIBLE);

                break;
            default:
                break;
        }

    }
}
