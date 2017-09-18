package com.qzdatasoft.StudentManagement.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qzdatasoft.StudentManagement.Dao.Dao;
import com.qzdatasoft.StudentManagement.beans.Student;


@Service
public class StudentServiceImpl implements IStudentService {

	@SuppressWarnings("unused")
	@Autowired
	private Dao dao;
	
	@Override
	public String addStudent(Student s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String removeStudent(String sno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student queryStudentInfo(String sno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> queryStudents() {
		// TODO Auto-generated method stub
		return null;
	}

}
