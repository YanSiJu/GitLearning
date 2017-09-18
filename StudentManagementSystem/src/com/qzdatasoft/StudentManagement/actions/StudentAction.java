package com.qzdatasoft.StudentManagement.actions;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.qzdatasoft.StudentManagement.service.StudentServiceImpl;


@Component
public class StudentAction {

	@SuppressWarnings("unused")
	@Autowired
	private StudentServiceImpl service;
}
