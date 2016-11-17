package com.wezom.moxysample.ui.application;

import android.app.Application;

import com.wezom.moxysample.ui.di.component.ApplicationComponent;
import com.wezom.moxysample.ui.di.component.DaggerApplicationComponent;
import com.wezom.moxysample.ui.di.modules.ApplicationModule;
import com.wezom.moxysample.ui.di.modules.BusModule;
import com.wezom.moxysample.ui.di.modules.ContextModule;

/**
 * Created: Zorin A.
 * Date: 16.11.2016.
 */

public class MoxySampleApplication extends Application {
    private static ApplicationComponent mApplicationComponent;

    public static ApplicationComponent getApplicationComponent() {
        return mApplicationComponent;
    }

    @Override
    public void onCreate() {
        createApplicationComponent();
        super.onCreate();
    }

    private void createApplicationComponent() {
        mApplicationComponent = DaggerApplicationComponent.builder()
                .contextModule(new ContextModule(this))
                .busModule(new BusModule())
                .build();
    }
}
