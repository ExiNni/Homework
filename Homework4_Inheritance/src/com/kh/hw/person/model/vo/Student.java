package com.kh.hw.person.model.vo;

public class Student extends Person {

	private String name;
	private int age;
	private double height;
	private double weight;
	private int grade;
	private String major;

	public Student() {
	}

	public Student(String name, int age, double height, double weight, int grade, String major) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.grade = grade;
		this.major = major;
	}

	@Override
	public String toString() {
		return "Name: " + name + ", Age: " + age + ", Height: " + height + ", Weight: " + weight + ", Grade: " + grade
				+ ", Major: " + major;
	}
}
