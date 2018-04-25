package com.kingj.dagger2androiddemo;

import android.app.Application;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by Jin on 2017/11/2.
 * Description
 */
@Singleton
@Component(modules = {
		ApplicationModule.class,
		AndroidSupportInjectionModule.class,
		ActivityBindingModule.class,
})
public interface AppComponent extends AndroidInjector<DaggerApplication> {
	
	@Override
	void inject(DaggerApplication instance);
	
	/**
	 * Gives us syntactic sugar. we can then do DaggerAppComponent.builder().application(this).build().inject(this);
	 * never having to instantiate any modules or say which module we are passing the application to.
	 * Application will just be provided into our app graph now.
	 * 构造AppComponent
	 */
	@Component.Builder
	interface Builder {
		
		@BindsInstance
		AppComponent.Builder application(Application application);
		
		AppComponent build();
	}
}
