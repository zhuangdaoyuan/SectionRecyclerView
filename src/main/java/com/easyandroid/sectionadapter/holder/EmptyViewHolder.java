package com.easyandroid.sectionadapter.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RelativeLayout;

import com.easyandroid.sectionadapter.R;

/**
 * package: com.easyandroid.sectionadapter.holder.EmptyViewHolder
 * author: gyc
 * description:空布局
 * time: create at 2017/7/11 20:40
 */

public class EmptyViewHolder extends RecyclerView.ViewHolder {
    public RelativeLayout llRoot;

    public EmptyViewHolder(View itemView) {
        super(itemView);
        initView();
    }

    private void initView() {
        llRoot = (RelativeLayout) itemView.findViewById(R.id.empty_root);
    }
}
