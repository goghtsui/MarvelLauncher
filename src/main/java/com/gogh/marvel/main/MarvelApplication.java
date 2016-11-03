package com.gogh.marvel.main;

import android.app.Application;

/**
 * Copyright (c) 2016 All rights reserved by gaoxiaofeng
 * <p> Description: </p>
 * <p> Created by <b>高晓峰</b> on 11/3/2016. </p>
 * <p> ChangeLog: </p>
 * <li> 高晓峰 on 11/3/2016 do fisrt create. </li>
 */
public class MarvelApplication extends Application {

    private static MarvelApplication INSTANCE = new MarvelApplication();

    public static MarvelApplication getInstance() {
        return INSTANCE;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

}
