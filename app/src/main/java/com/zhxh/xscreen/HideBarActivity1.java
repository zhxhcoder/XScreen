package com.zhxh.xscreen;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.zhxh.xscreenlib.XStatusBar;

public class HideBarActivity1 extends AppCompatActivity {

    private View toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);

        toolbar = findViewById(R.id.include_toolbar);
        toolbar.setVisibility(View.GONE);

    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            XStatusBar.newHideBuilder()
                    .applyNav(true)     // 是否应用到导航栏
                    .build(this)
                    .apply();
        }
    }

}
