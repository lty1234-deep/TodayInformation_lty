package com.android.todayinformation;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.VideoView;

public class FullScreenVideoView extends VideoView {

    //主要用于直接new出来的对象
    public FullScreenVideoView(Context context) {
        super(context);
    }
    //主要用于xml文件，支持自定义树形
    public FullScreenVideoView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    //也是主要用于xml文件，支持自定义属性，同时支持style样式
    public FullScreenVideoView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        //widthMeasureSpec 包含两个主演要内容 1.测量模式 2.测量大小
        int width = getDefaultSize(0,widthMeasureSpec);
        int height = getDefaultSize(0,heightMeasureSpec);
        //设置长度，宽度
        setMeasuredDimension(width,height);

//        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}
