package com.easyandroid.sectionadapter.util;

import android.app.Activity;
import android.graphics.Rect;
import android.util.Log;

import com.easytools.tools.DisplayUtil;

/**
 * Created with Android Studio.
 * Time: 11:56  2017/8/12
 * Author:ZhuangYuan
 */
public class DisplayUtilLocal extends DisplayUtil {
    /**
     * 获取标题栏高度
     */
    public static int getTitleHeight(Activity context) {
        Rect outRect1 = new Rect();
        context.getWindow().getDecorView().getWindowVisibleDisplayFrame(outRect1);
        Log.e("应用区顶部", "" + outRect1.top);
        return outRect1.top;
    }

    /**
     * 获取应用区高度
     */
    public static int getViewRecHeight(Activity context) {
        //应用区域
        Rect outRect1 = new Rect();
        context.getWindow().getDecorView().getWindowVisibleDisplayFrame(outRect1);
        Log.e("应用区高", "" + outRect1.height());
        return outRect1.height();
    }


    /**
     * 获取应用区(绘制区)高度
     */
    public static int getUserViewRecHeight(Activity context) {
        return getViewRecHeight(context) - getTitleHeight(context);
    }
}
