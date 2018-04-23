package com.kingj.dagger.test;

import com.kingj.dagger.school.SchoolModule;
import com.kingj.dagger.teacher.TeacherModule;

import dagger.Component;

/**
 * Created by Jin on 2018/4/23.
 * Description
 */
@Component(modules = {TeacherModule.class, SchoolModule.class})
public interface TestComponent {
	
	void inject(Test test);
}
