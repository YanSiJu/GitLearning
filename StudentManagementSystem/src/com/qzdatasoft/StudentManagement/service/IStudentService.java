package com.qzdatasoft.StudentManagement.service;

import java.util.List;

import com.qzdatasoft.StudentManagement.beans.Student;

public interface IStudentService {

	// ����ѧ��
	public String addStudent(Student s);

	// ɾ��ѧ��
	public String removeStudent(String sno);

	// ��ѯ����ѧ����Ϣ
	public Student queryStudentInfo(String sno);

	// ��ѯ���ѧ����Ϣ
	public List<?> queryStudents();
	

}
