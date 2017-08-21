package com.easyandroid.sectionadapter.holder;

import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;

import com.easyandroid.sectionadapter.R;

/**
 * Created with Android Studio.
 * Time: 14:26  2017/8/18
 * Author:ZhuangYuan
 */
public class HeaderViewHolder extends RecyclerView.ViewHolder {

    public ViewPager viewPager;
    public LinearLayout indicator;

    public HeaderViewHolder(View itemView) {
        super(itemView);
        initView();
    }

    private void initView() {
        viewPager = (ViewPager) itemView.findViewById(R.id.header_viewpager);
        indicator = (LinearLayout) itemView.findViewById(R.id.header_indicator);
    }
}
