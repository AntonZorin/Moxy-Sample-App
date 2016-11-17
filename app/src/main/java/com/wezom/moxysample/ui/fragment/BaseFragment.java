package com.wezom.moxysample.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.arellomobile.mvp.MvpAppCompatFragment;
import com.wezom.moxysample.ui.activity.BaseActivity;

import butterknife.ButterKnife;

/**
 * Created: Zorin A.
 * Date: 17.11.2016.
 */

public abstract class BaseFragment extends MvpAppCompatFragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(getLayoutRes(), container, false);
        injectViews(view);
        return view;
    }

    private void injectViews(View view) {
        ButterKnife.bind(this, view);
    }

    protected abstract int getLayoutRes();

    public void showMessage(String message) {
        ((BaseActivity) getActivity()).showMessage(message);
    }
}
