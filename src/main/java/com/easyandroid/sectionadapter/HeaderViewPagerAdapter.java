package com.easyandroid.sectionadapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

/**
 * Created with Android Studio.
 * Time: 11:00  2017/8/21
 * Author:ZhuangYuan
 */
public class HeaderViewPagerAdapter extends PagerAdapter {
    private Context mContext;
    private List<Integer> url;

    public HeaderViewPagerAdapter(Context context, List<Integer> imgs) {
        this.mContext = context;
        this.url = imgs;
    }

    @Override
    public int getCount() {
        return url == null ? 0 : url.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView img = new ImageView(mContext);
        img.setScaleType(ImageView.ScaleType.FIT_CENTER);
        int s = url.get(position);
        img.setImageResource(s);
        container.addView(img);
        return img;
    }

}
