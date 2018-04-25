package com.kingj.dagger.test;

import com.kingj.dagger.student.Student;
import com.kingj.dagger.teacher.Teacher;

import javax.inject.Inject;

/**
 * Created by Jin on 2018/4/23.
 * Description  消费依赖
 */
public class Test {
	
	@Inject
	Student student;
	
	@Inject
	Teacher teacher;
	
	Teacher teacher2;
	
	public void test() {
		
		teacher2 = new Teacher(new Student());
		
		TestComponent testComponent = DaggerTestComponent.builder().build();
		testComponent.inject(this);
		
		System.out.println(student.name() + "___" + teacher.getStudentName());
	}
}
