package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {

	private Student[] students = new Student[3];
	private Employee[] employees = new Employee[10];
	private int studentCount = 0;
	private int employeeCount = 0;

	public int[] personCount() {
		return new int[] { studentCount, employeeCount };
	}

	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		if (studentCount < students.length) {
			students[studentCount++] = new Student(name, age, height, weight, grade, major);
		} else {
			System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 메뉴로 돌아갑니다");
		}
	}

	public Student[] printStudent() {
		return students;
	}

	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		if (employeeCount < employees.length) {
			employees[employeeCount++] = new Employee(name, age, height, weight, salary, dept);
		} else {
			System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 메뉴로 돌아갑니다.");
		}
	}

	public Employee[] printEmployee() {
		return employees;
	}

	public int getStudentCount() {
		return studentCount;
	}

	public int getEmployeeCount() {
		return employeeCount;
	}
}
