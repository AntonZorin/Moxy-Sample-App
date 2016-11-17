package com.wezom.moxysample.ui.di.modules;

import android.app.Application;
import android.content.Context;

import com.wezom.moxysample.ui.application.MoxySampleApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created: Zorin A.
 * Date: 16.11.2016.
 */

@Module
public class ApplicationModule {
    Application mApplication;

    public ApplicationModule(MoxySampleApplication application) {
        mApplication = application;
    }

    @Provides
    @Singleton
    Application provideApplication() {
        return mApplication;
    }

    @Provides
    @Singleton
    Context provideApplicationContext() {
        return mApplication.getApplicationContext();
    }
}

