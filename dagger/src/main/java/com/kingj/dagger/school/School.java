package com.kingj.dagger.school;

import com.kingj.dagger.teacher.Teacher;

/**
 * Created by Jin on 2018/4/23.
 * Description
 */
public class School {
	
	private Teacher teacher;
	public School(Teacher teacher) {
		this.teacher = teacher;
	}
	
	public Teacher getTeacher() {
		return teacher;
	}
	
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
}
