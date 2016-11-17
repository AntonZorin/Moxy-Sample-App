package com.wezom.moxysample.ui.di.modules;

import org.greenrobot.eventbus.EventBus;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created: Zorin A.
 * Date: 16.11.2016.
 */
@Module
public class BusModule {
    @Provides
    @Singleton
    EventBus provideBus() {
        return new EventBus();
    }
}
