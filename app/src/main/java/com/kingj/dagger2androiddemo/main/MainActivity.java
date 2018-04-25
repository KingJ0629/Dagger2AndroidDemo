package com.kingj.dagger2androiddemo.main;

import android.os.Bundle;
import android.widget.TextView;

import com.kingj.dagger2androiddemo.R;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;

/**
 * 消费依赖
 * 继承DaggerAppCompatActivity，在Activity生命周期中自动实现注入逻辑
 */
public class MainActivity extends DaggerAppCompatActivity {
	
	/**
	 * 注入Car对象
	 * 对象来自{@link MainActivityModule#provideCar()}
	 */
	@Inject
	Car car;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		TextView tv = findViewById(R.id.tv);
		tv.setText(car.getName());
	}
}
