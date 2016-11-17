package com.wezom.moxysample.ui.di.component;

import com.wezom.moxysample.ui.di.modules.BusModule;
import com.wezom.moxysample.ui.di.modules.ContextModule;
import com.wezom.moxysample.ui.mvp.presenter.HomeActivityPresenter;
import com.wezom.moxysample.ui.mvp.presenter.TestFragmentPresenter;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created: Zorin A.
 * Date: 16.11.2016.
 */

@Singleton
@Component(modules = {ContextModule.class, BusModule.class})
public interface ApplicationComponent {

    void inject(HomeActivityPresenter homeActivityPresenter);

    void inject(TestFragmentPresenter testFragmentPresenter);
}
