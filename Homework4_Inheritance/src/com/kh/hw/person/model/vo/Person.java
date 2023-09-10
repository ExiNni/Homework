package com.kh.hw.person.model.vo;

public class Person {

	private String name;
	private int age;
	private double height;
	private double weight;

	public Person() {
	}

	public Person(String name, int age, double height, double weight) {
	    this.name = name;
	    this.age = age;
	    this.height = height;
	    this.weight = weight;
	}

	@Override
	public String toString() {
		return "Name: " + name + ", Age: " + age + ", Height: " + height + ", Weight: " + weight;
	}

}
