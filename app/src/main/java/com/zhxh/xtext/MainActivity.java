package com.zhxh.xtext;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv1 = findViewById(R.id.tv1);
        TextView tv2 = findViewById(R.id.tv2);
        TextView tv3 = findViewById(R.id.tv3);

        tv1.setTextColor(Color.parseColor("#0000CD"));
        tv2.setTextColor(Color.parseColor("#ff0000CD"));
        tv3.setTextColor(Color.parseColor("#FFD700"));
    }
}
