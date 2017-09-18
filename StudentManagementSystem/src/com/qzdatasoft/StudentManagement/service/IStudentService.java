package com.qzdatasoft.StudentManagement.service;

import java.util.List;

import com.qzdatasoft.StudentManagement.beans.Student;

public interface IStudentService {

	// 增加学生
	public String addStudent(Student s);

	// 删除学生
	public String removeStudent(String sno);

	// 查询单个学生信息
	public Student queryStudentInfo(String sno);

	// 查询多个学生信息
	public List<?> queryStudents();
	

}
