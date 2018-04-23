package com.kingj.dagger.teacher;

import com.kingj.dagger.student.Student;

/**
 * Created by Jin on 2018/4/23.
 * Description
 */
public class Teacher {
	
	private String studentName;
	public Teacher(Student student) {
		this.studentName = student.name();
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
}
