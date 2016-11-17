package com.wezom.moxysample.ui.activity;

import android.os.Bundle;
import android.widget.TextView;

import com.arellomobile.mvp.presenter.InjectPresenter;
import com.wezom.moxysample.R;
import com.wezom.moxysample.ui.fragment.TestFragment;
import com.wezom.moxysample.ui.mvp.presenter.HomeActivityPresenter;
import com.wezom.moxysample.ui.mvp.view.HomeActivityView;

import butterknife.BindView;
import butterknife.OnClick;

public class HomeActivity extends BaseActivity implements HomeActivityView {

    @BindView(R.id.activity_home_status_label)
    TextView mStatusTextView;

    @InjectPresenter
    HomeActivityPresenter mPresenter;

    private TestFragment mFragment;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public int getLayoutRes() {
        return R.layout.activity_home;
    }


    @OnClick(R.id.activity_home_button_add)
    void onAddClick() {
        if (mFragment == null) {
            mFragment = TestFragment.getInstance("Test Message");
        }
        mPresenter.showMessage("Added");
        switchFragment(mFragment);
    }

    @OnClick(R.id.activity_home_button_del)
    void onRemClick() {
        if (mFragment != null) {
            removeFragment(mFragment);
            mPresenter.showMessage("Removed");
        }
    }
}
