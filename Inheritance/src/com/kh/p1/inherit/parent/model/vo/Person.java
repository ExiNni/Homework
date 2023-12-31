package com.kh.p1.inherit.parent.model.vo;

public class Person {

	protected String name;
	protected int age;
	protected char gender;
	protected String addr;

	public Person() {
	}

	public Person(String name, int age, char gender, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.addr = addr;
	}

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

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public String information() {
		return "이름: " + name + ", 나이: " + age + ", 성별: " + gender + ", 주소: " + addr;
	}

}
