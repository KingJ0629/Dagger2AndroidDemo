package com.kingj.dagger.school;

import com.kingj.dagger.teacher.Teacher;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Jin on 2018/4/23.
 * Description
 */
@Module
public class SchoolModule {

	@Provides
	School provideSchool(Teacher teacher) {
		return new School(teacher);
	}
}
