package com.c3.vero.c3_6_02_skin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * 动态更换主题Theme
 */
public class Skin_theme extends AppCompatActivity implements View.OnClickListener {
    private Button theme1;
    private Button theme2;
    private int theme=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent i=getIntent();
        if (i!=null){
            theme=i.getIntExtra("theme",0);
            if (theme!=0){
                setTheme(theme);
            }
        }
        setContentView(R.layout.activity_theme);
        theme1=(Button)findViewById(R.id.Theme1);
        theme2=(Button)findViewById(R.id.Theme2);
        theme1.setOnClickListener(this);
        theme2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Theme1:
                setOnThemeChanged(R.style.AppTheme);
                break;
            case R.id.Theme2:
                setOnThemeChanged(R.style.AppTheme2);
                break;
            default:
                break;
        }
    }

    private void setOnThemeChanged(int theme) {
        Intent i=new Intent(Skin_theme.this,Skin_theme.class);
        i.putExtra("theme",theme);
        startActivity(i);
        finish();
    }
}
