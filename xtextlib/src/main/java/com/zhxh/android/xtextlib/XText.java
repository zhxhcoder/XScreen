package com.zhxh.android.xtextlib;

import android.graphics.Paint;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class XText {
    private static Paint paint = new Paint();

    /**
     * 获取字体宽度
     * @param str      字体
     * @param fontSize 字体sp
     * @return 像素
     */
    public static int getTextWeight(String str, int fontSize) {
        paint.setTextSize(fontSize);
        return (int) paint.measureText(str);
    }

    public static SpannableString getSpanColor(String sourceStr, String regStr, int color) {
        SpannableString sp = new SpannableString(sourceStr);
        Pattern p = Pattern.compile(regStr);
        Matcher m = p.matcher(sp);
        while (m.find()) {
            int start = m.start();
            int end = m.end();
            // 设置高亮样式
            sp.setSpan(new ForegroundColorSpan(color), start, end,
                    Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        }
        return sp;
    }

    public static List<String> getRegexList(String input, String regex) {
        List<String> stringList = new ArrayList<>();
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        while (m.find())
            stringList.add(m.group());

        return stringList;
    }
}
