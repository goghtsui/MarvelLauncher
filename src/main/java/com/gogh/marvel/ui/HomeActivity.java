package com.gogh.marvel.ui;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

import com.gogh.marvel.R;
import com.gogh.marvel.size.Size;

/**
 * Copyright (c) 2016 All rights reserved by gaoxiaofeng
 * <p> Description: </p>
 * <p> Created by <b>高晓峰</b> on 11/3/2016. </p>
 * <p> ChangeLog: </p>
 * <li> 高晓峰 on 11/3/2016 do fisrt create. </li>
 */
public class HomeActivity extends AppCompatActivity {

    private Size mSize;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupNoTitle();
        setContentView(R.layout.home_layout);
        init();
    }

    /**
     * set up the color of status bar and navigation bar is transparent
     *
     * @author gaoxiaofeng
     * @date 2016/11/03
     * ChangeLog:
     * <li> gaoxiaofeng on 2016/11/03 </li>
     */
    private void setupNoTitle(){
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS
                    | WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
            window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.TRANSPARENT);
            window.setNavigationBarColor(Color.TRANSPARENT);
        }
    }

    private void init(){
        mSize = Size.getInstance();
        mSize.init(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        resetContentHeight();
    }

    private void resetContentHeight(){
        int mNavHeight =mSize.getWidth() / 5;

        LinearLayout appContainer = (LinearLayout) findViewById(R.id.home_layout_content_allapps);
        LinearLayout.LayoutParams appParam = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT
                , mSize.getHeight() - mSize.getStatusHeight()  - mNavHeight);
        appContainer.setLayoutParams(appParam);

        LinearLayout navContainer = (LinearLayout) findViewById(R.id.home_layout_content_navigation);
        LinearLayout.LayoutParams navParam = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, mNavHeight );
        navContainer.setLayoutParams(navParam);
    }



    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

}
