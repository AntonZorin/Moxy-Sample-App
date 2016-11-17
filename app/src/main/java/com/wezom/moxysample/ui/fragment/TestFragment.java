package com.wezom.moxysample.ui.fragment;

import android.os.Bundle;

import com.arellomobile.mvp.presenter.InjectPresenter;
import com.arellomobile.mvp.presenter.PresenterType;
import com.wezom.moxysample.R;
import com.wezom.moxysample.ui.mvp.presenter.TestFragmentPresenter;
import com.wezom.moxysample.ui.mvp.view.TestFragmentView;

import butterknife.OnClick;

/**
 * Created: Zorin A.
 * Date: 17.11.2016.
 */

public class TestFragment extends BaseFragment implements TestFragmentView {
    private static final String MESSAGE_KEY = "message_key";

    @InjectPresenter(type = PresenterType.WEAK)
    TestFragmentPresenter mPresenter;

    private String mMessage;

    public static TestFragment getInstance(String message) {
        Bundle bundle = new Bundle();
        bundle.putString(MESSAGE_KEY, message);
        TestFragment fragment = new TestFragment();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mMessage = getArguments().getString(MESSAGE_KEY);
    }

    @Override
    protected int getLayoutRes() {
        return R.layout.fragment_test;
    }

    @OnClick(R.id.fragment_home_click_button)
    void onClick() {
        mPresenter.showMessage(mMessage);
    }
}
