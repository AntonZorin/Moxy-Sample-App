package com.wezom.moxysample.ui.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.Toast;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.wezom.moxysample.R;
import com.wezom.moxysample.ui.fragment.BaseFragment;

import butterknife.ButterKnife;

/**
 * Created: Zorin A.
 * Date: 16.11.2016.
 */

public abstract class BaseActivity extends MvpAppCompatActivity {
    FragmentManager mFragmentManager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initViews();
    }

    private void initViews() {
        setContentView(getLayoutRes());
        ButterKnife.bind(this);
    }

    public abstract int getLayoutRes();

    protected void switchFragment(BaseFragment fragment) {
        if (mFragmentManager == null) {
            mFragmentManager = getSupportFragmentManager();
        }
        FragmentTransaction transaction = mFragmentManager.beginTransaction();
        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        transaction.replace(R.id.activity_home_fragment_conteiner, fragment);
        transaction.commit();
    }

    protected void removeFragment(BaseFragment fragment) {

        if (mFragmentManager == null) {
            return;
        }
        FragmentTransaction transaction = mFragmentManager.beginTransaction();
        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);
        transaction.remove(fragment);
        transaction.commit();
    }


    public void showMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
