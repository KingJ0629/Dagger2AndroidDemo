package com.kingj.dagger2androiddemo.main;

import com.kingj.dagger2androiddemo.ActivityScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Jin on 2018/4/12.
 * Description 提供依赖
 */
@Module
public class MainActivityModule {
	
	/**
	 * @ActivityScope 范围内单例
	 * @Provides 提供依赖
	 * @return Car
	 */
	@ActivityScope
	@Provides
	Car provideCar() {
		return new Car("Benz");
	}
}
