package com.kingj.dagger2androiddemo;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

/**
 * Created by Jin on 2018/4/12.
 * Description
 */
public class AppApplication extends DaggerApplication {
	
	@Override
	protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
		return DaggerAppComponent.builder().application(this).build();
	}
}
