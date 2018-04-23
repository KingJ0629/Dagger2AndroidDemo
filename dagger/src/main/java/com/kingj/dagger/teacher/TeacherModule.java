package com.kingj.dagger.teacher;

import com.kingj.dagger.student.Student;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Jin on 2018/4/23.
 * Description 提供依赖
 */
@Module
public class TeacherModule {
	
	@Provides
	Teacher provideTeacher(Student student) {
		return new Teacher(student);
	}
}
