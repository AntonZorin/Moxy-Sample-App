package com.wezom.moxysample.ui.di.modules;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created: Zorin A.
 * Date: 16.11.2016.
 */
@Module
public class ContextModule {
	private Context mContext;

	public ContextModule(Context context) {
		mContext = context;
	}

	@Provides
	@Singleton
	public Context provideContext() {
		return mContext;
	}
}
