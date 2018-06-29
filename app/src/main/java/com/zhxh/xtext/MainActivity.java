package com.zhxh.xtext;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.zhxh.xtextlib.XString;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv1 = findViewById(R.id.tv1);
        TextView tv2 = findViewById(R.id.tv2);
        TextView tv3 = findViewById(R.id.tv3);

        tv1.setTextColor(Color.parseColor("#0000CD"));
        tv2.setTextColor(Color.parseColor("#550000CD"));
        tv3.setTextColor(Color.parseColor("#FFD700"));

        Log.d("zhxhcolor", "#ff00000CD " + XString.isColorStr("#ff00000CD"));
        Log.d("zhxhcolor", "#ff0000CD " + XString.isColorStr("#ff0000CD"));
        Log.d("zhxhcolor", "#ff000CD " + XString.isColorStr("#ff000CD"));
        Log.d("zhxhcolor", "#0000CD " + XString.isColorStr("#0000CD"));
        Log.d("zhxhcolor", "#000CD " + XString.isColorStr("#000CD"));
        Log.d("zhxhcolor", "#00CD " + XString.isColorStr("#00CD"));
        Log.d("zhxhcolor", "#0CD " + XString.isColorStr("#0CD"));
        Log.d("zhxhcolor", "#0D " + XString.isColorStr("#0D"));
    }
}
