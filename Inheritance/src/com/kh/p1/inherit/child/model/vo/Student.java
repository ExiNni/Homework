package com.kh.p1.inherit.child.model.vo;

import com.kh.p1.inherit.parent.model.vo.Person;

public class Student extends Person{

	private int grade;
	private String major;
	
	private Computer com;

	public Student() {
	}

	public Student(int grade, String major) {
		this.grade = grade;
		this.major = major;
	}
	
	public Student(String name, int age, char gender, String addr, int grade, String major) {
		super(name, age, gender, addr);
		this.grade = grade;
		this.major = major;
	}
	
	public Student(String name, int age, char gender, String addr, int grade, String major, Computer com) {
		super(name, age, gender, addr);
		this.grade = grade;
		this.major = major;
		this.com = com;
	}


	public void setGrade(int grade) {
		this.grade = grade;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getGrade() {
		return grade;
	}

	public String getMajor() {
		return major;
	}
	
	public String information() {
		//return "이름: " + name + ", 나이: " + age + ", 성별: " + gender + ", 주소: " + addr + ", 학년: " + grade + ", 전공: " + major;
		return super.information() + ", 학년: " + grade + ", 전공: " + major + ", " + com.information();
	}
}
