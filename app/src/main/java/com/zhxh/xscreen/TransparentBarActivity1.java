package com.zhxh.xscreen;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.zhxh.xscreenlib.XStatusBar;

public class TransparentBarActivity1 extends AppCompatActivity {

    private View toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);
//        XStatusBar xstatBar = new XStatusBar(this);
//        xstatBar.setTransparentBar(Color.BLUE, 100, Color.GREEN, 100);
        XStatusBar.newTransparentBuilder()
                .statusColor(Color.BLUE)        // 状态栏颜色
                .statusAlpha(100)               // 状态栏透明度
                .applyNav(true)                 // 是否应用到导航栏
                .navColor(Color.GREEN)          // 导航栏颜色
                .navAlpha(100)                  // 导航栏透明度
                .build(this)
                .apply();

        toolbar = findViewById(R.id.include_toolbar);
        toolbar.setVisibility(View.GONE);
    }

}
