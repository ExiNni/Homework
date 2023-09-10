package com.kh.hw.person.model.vo;

public class Employee extends Person {

	private String name;
	private int age;
	private double height;
	private double weight;
	private int salary;
	private String department;

	public Employee() {
	}

	public Employee(String name, int age, double height, double weight, int salary, String department) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.salary = salary;
		this.department = department;
	}


	@Override
	public String toString() {
		return "Name: " + name + ", Age: " + age + ", Height: " + height + ", Weight: " + weight + ", Salary: " + salary
				+ ", Department: " + department;
	}
}
