package com.gogh.marvel.size;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

import com.gogh.marvel.utils.ILog;

/**
 * Copyright (c) 2016 All rights reserved by gaoxiaofeng
 * <p> Description: </p>
 * <p> Created by <b>高晓峰</b> on 11/3/2016. </p>
 * <p> ChangeLog: </p>
 * <li> 高晓峰 on 11/3/2016 do fisrt create. </li>
 */
public class Size {

    private static final String TAG = "Size";

    private float density;
    private int width;
    private int height;

    private int navHeight;
    private int statusHeight;

    private Size() {
    }

    private static  class SingleTone {
        private static final Size SIZE = new Size();
    }
    public static Size getInstance(){
            return SingleTone.SIZE;
    }

    public void init(Context context){
        Resources resources = context.getResources();
        DisplayMetrics dm = resources.getDisplayMetrics();

       density = dm.density;
        width = dm.widthPixels;
        height = dm.heightPixels;

        statusHeight = resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen","android"));

        navHeight = resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height","dimen", "android"));
        ILog.d(TAG, "density = " + density + ", width = " + width + ", height = " + height + ", status = " + statusHeight + ", nav = " + navHeight);
    }

    public float getDensity() {
        return density;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getNavHeight() {
        return navHeight;
    }

    public int getStatusHeight() {
        return statusHeight;
    }

}
