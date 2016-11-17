package com.wezom.moxysample.ui.mvp.presenter;

import android.support.annotation.NonNull;

import com.arellomobile.mvp.MvpPresenter;
import com.arellomobile.mvp.MvpView;
import com.wezom.moxysample.ui.application.MoxySampleApplication;
import com.wezom.moxysample.ui.di.component.ApplicationComponent;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

/**
 * Created: Zorin A.
 * Date: 16.11.2016.
 */

abstract class BasePresenter<View extends MvpView> extends MvpPresenter<View> {


    private CompositeSubscription compositeSubscription = new CompositeSubscription();

    protected void unsubscribeOnDestroy(@NonNull Subscription subscription) {
        compositeSubscription.add(subscription);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        compositeSubscription.clear();
    }

    ApplicationComponent getAppComponent() {
        return MoxySampleApplication.getApplicationComponent();
    }
}
