package com.zhxh.xscreen;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.zhxh.xscreenlib.XStatusBar;

public class TransparentBarActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
//        XStatusBar xstatBar = new XStatusBar(this);
//        xstatBar.setTransparentBar(Color.GREEN, 100, Color.RED, 100);
        XStatusBar.newTransparentBuilder()
                .statusColor(Color.GREEN)
                .statusAlpha(100)
                .applyNav(true)
                .navColor(Color.RED)
                .navAlpha(100)
                .build(this)
                .apply();

        ((ImageView) findViewById(R.id.image_view))
                .setImageResource(R.drawable.bg3);
    }

/*    @Override
    protected void initBar() {
        setTransparentStatusBar(Color.GREEN, 50);
    }*/
}
