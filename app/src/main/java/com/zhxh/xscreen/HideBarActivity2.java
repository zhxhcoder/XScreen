package com.zhxh.xscreen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.zhxh.xscreenlib.XStatusBar;

public class HideBarActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        ((ImageView) findViewById(R.id.image_view)).setImageResource(R.drawable.bg2);
    }


    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
//            XStatusBar xstatBar = new XStatusBar(this);
//            xstatBar.setHideBar(true);
            XStatusBar.newHideBuilder().applyNav(false).build(this).apply();
        }
    }

}
