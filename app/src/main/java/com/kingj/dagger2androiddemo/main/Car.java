package com.kingj.dagger2androiddemo.main;

/**
 * Created by Jin on 2018/4/18.
 * Description 实体类
 */
public class Car {
	
	public Car(String name) {
		this.name = name;
	}
	
	String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
