package com.kingj.dagger2androiddemo.main;

import com.kingj.dagger2androiddemo.ActivityScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Jin on 2018/4/12.
 * Description
 */
@Module
public class MainActivityModule {
	
	@ActivityScope
	@Provides
	Car provideCar() {
		return new Car("Benz");
	}
}
