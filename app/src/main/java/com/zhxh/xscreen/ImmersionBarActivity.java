package com.zhxh.xscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.zhxh.xscreenlib.XStatusBar;

public class ImmersionBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

//        XStatusBar xstatBar = new XStatusBar(this);
//        xstatBar.setImmersionBar(true);
        XStatusBar.newImmersionBuilder()
                .applyNav(true)         // 是否应用到导航栏
                .build(this)
                .apply();

        ((ImageView) findViewById(R.id.image_view)).setImageResource(R.drawable.bg1);
    }

/*    @Override
    protected void initBar() {
        setImmersionBar();
    }*/
}
