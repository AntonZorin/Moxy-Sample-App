package com.wezom.moxysample.ui.mvp.presenter;

import android.content.Context;

import com.arellomobile.mvp.InjectViewState;
import com.wezom.moxysample.ui.mvp.view.TestFragmentView;

import org.greenrobot.eventbus.EventBus;

import javax.inject.Inject;

/**
 * Created: Zorin A.
 * Date: 17.11.2016.
 */
@InjectViewState
public class TestFragmentPresenter extends BasePresenter<TestFragmentView> {
    @Inject
    Context mContext;
    @Inject
    EventBus mBus;

    public TestFragmentPresenter() {
        getAppComponent().inject(this);
    }

    public void onClick() {
        getViewState().showMessage("Test Fragment clicked!");
    }

    public void showMessage(String message) {
        getViewState().showMessage(message);
    }
}
