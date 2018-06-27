package com.zhxh.xtextlib;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class XText {
    private static Paint paint = new Paint();

    /**
     * 获取字体宽度
     *
     * @param str      字体
     * @param fontSize 字体sp
     * @return 像素
     */
    public static int getTextWeight(String str, int fontSize) {
        paint.setTextSize(fontSize);
        return (int) paint.measureText(str);
    }

    public static SpannableString getSpanColorReg(String sourceStr, String regularExpression, int color) {
        SpannableString sp = new SpannableString(sourceStr);
        Pattern p = Pattern.compile(regularExpression);
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

    public static SpannableString getSpanSizeReg(String srcStr, String regularExpression, int size) {
        SpannableString resultSpan = new SpannableString(srcStr);
        Pattern p = Pattern.compile(regularExpression);
        Matcher m = p.matcher(srcStr);

        while (m.find() && !regularExpression.equals("")) {
            resultSpan.setSpan(new AbsoluteSizeSpan(size, true), m.start(), m.end(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        }
        return resultSpan;
    }

    public static List<String> getRegexList(String input, String regex) {
        List<String> stringList = new ArrayList<>();
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        while (m.find())
            stringList.add(m.group());

        return stringList;
    }

    public static void showTagsView(Context ctx, List<String> tags, LinearLayout ll_tags_container, int colorType) {

        if (null != tags && !tags.isEmpty()) {

            ll_tags_container.removeAllViews();

            for (int j = 0; j < tags.size(); j++) {

                TextView tagText = new TextView(ctx);
                LinearLayout.LayoutParams paramsLayout = new LinearLayout.
                        LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, 30);

                paramsLayout.setMargins(5, 10, 5, 10);
                tagText.setPadding(8, 0, 8, 0);
                tagText.setSingleLine(true);
                tagText.setEllipsize(TextUtils.TruncateAt.END);
                tagText.setGravity(Gravity.CENTER);
                switch (colorType) {
                    case 0:
                        //tagText.setTextColor(ctx.getResources().getColor(R.color.fund_operate_red));
                        //tagText.setBackgroundResource(R.drawable.shape_button_white_redoutside);
                        break;
                    case 1:
                        //tagText.setTextColor(ctx.getResources().getColor(R.color.fund_operate_blue));
                        //tagText.setBackgroundResource(R.drawable.shape_button_white_blueoutside_transparentinside);
                        break;
                    default:
                        //tagText.setTextColor(ctx.getResources().getColor(R.color.fund_operate_red));
                        //tagText.setBackgroundResource(R.drawable.shape_button_white_redoutside);
                        break;
                }

                tagText.setTextSize(TypedValue.COMPLEX_UNIT_SP, 10);
                tagText.setLayoutParams(paramsLayout);
                tagText.setText(tags.get(j));
                ll_tags_container.addView(tagText);

            }

        }
    }
}
