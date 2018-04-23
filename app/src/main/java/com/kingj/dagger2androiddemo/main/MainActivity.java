package com.kingj.dagger2androiddemo.main;

import android.os.Bundle;
import android.widget.TextView;

import com.kingj.dagger2androiddemo.R;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;

public class MainActivity extends DaggerAppCompatActivity {
	
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
