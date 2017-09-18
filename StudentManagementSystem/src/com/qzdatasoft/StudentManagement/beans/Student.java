package com.qzdatasoft.StudentManagement.beans;

import org.springframework.stereotype.Component;

@Component
public class Student {

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Student(String name, String grade, String major, int age, String sno, String sex, String tel) {
		super();
		this.name = name;
		this.grade = grade;
		this.major = major;
		this.age = age;
		this.sno = sno;
		this.sex = sex;
		this.tel = tel;
	}

	public Student() {

	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + ", major=" + major + ", age=" + age + ", sno=" + sno
				+ ", sex=" + sex + ", tel=" + tel + "]";
	}

	private String name;
	private String grade;
	private String major;
	private int age;
	private String sno;
	private String sex;
	private String tel;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

}
