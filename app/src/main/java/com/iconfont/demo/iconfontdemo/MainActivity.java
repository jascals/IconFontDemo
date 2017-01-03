package com.iconfont.demo.iconfontdemo;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface iconfont = Typeface.createFromAsset(getAssets(), "fonts/iconfont.ttf");
        TextView textview = (TextView)findViewById(R.id.text);
        textview.setTypeface(iconfont);
    }
}
