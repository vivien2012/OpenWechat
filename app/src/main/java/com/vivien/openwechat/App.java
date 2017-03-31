package com.vivien.openwechat;

import android.app.Application;

/**
 * Created by vivien on 17/3/30.
 */
public class App extends Application {

    private static App mInstance = null;

    public static App getInstance() {
        return mInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
    }
}
