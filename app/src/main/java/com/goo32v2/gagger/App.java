package com.goo32v2.gagger;

import android.app.Activity;
import android.app.Application;

import com.goo32v2.gagger.di.DaggerApplicationComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

/**
 * @author Alexander Steblin (goo32v2)
 * @date 24.08.2017
 */

public class App extends Application implements HasActivityInjector {

    @Inject
    DispatchingAndroidInjector<Activity> androidInjector;


    @Override
    public void onCreate() {
        super.onCreate();
        DaggerApplicationComponent.builder().app(this).build().inject(this);
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return androidInjector;
    }
}
