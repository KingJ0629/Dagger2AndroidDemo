package com.kingj.dagger.student;

import javax.inject.Inject;

/**
 * Created by Jin on 2018/4/23.
 * Description
 */
public class Student {
	
	@Inject
	public Student() {}
	
	public String name() {
		return "James";
	}
}
