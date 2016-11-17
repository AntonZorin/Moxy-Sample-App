package com.wezom.moxysample.ui.mvp.presenter;

import android.content.Context;

import com.arellomobile.mvp.InjectViewState;
import com.wezom.moxysample.ui.mvp.view.HomeActivityView;

import org.greenrobot.eventbus.EventBus;

import javax.inject.Inject;

/**
 * Created: Zorin A.
 * Date: 16.11.2016.
 */

@InjectViewState
public class HomeActivityPresenter extends BasePresenter<HomeActivityView> {

    @Inject
    Context mContext;

    @Inject
    EventBus mEventBus;

    HomeActivityPresenter() {
        getAppComponent().inject(this);
    }

    public void showMessage(String message) {
        getViewState().showMessage(message);
    }
}
