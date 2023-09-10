package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;
import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonMenu {

	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();

	public void mainMenu() {

		while (true) {
			System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 학생은 " + pc.getStudentCount() + "명입니다.");
			System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 사원은 " + pc.getEmployeeCount() + "명입니다.");
			System.out.println("1. 학생 메뉴");
			System.out.println("2. 사원 메뉴");
			System.out.println("9. 종료");
			System.out.print("원하는 옵션을 선택해주세요: ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				studentMenu();
				break;
			case 2:
				employeeMenu();
				break;
			case 9:
				System.out.println("종료합니다.");
				System.exit(0);
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				break;
			}
		}
	}

	public void studentMenu() {
		while (true) {
			System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 학생은 " + pc.getStudentCount() + "명입니다.");
			System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 사원은 " + pc.getEmployeeCount() + "명입니다.");
			System.out.println("학생 메뉴");
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 보기");
			System.out.println("3. 메인으로 돌아갑니다.");
			System.out.print("옵션을 선택해 주세요: ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				insertStudent();
				break;
			case 2:
				printStudents();
				break;
			case 3:
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				break;
			}
		}
	}

	public void employeeMenu() {
		while (true) {
			System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 학생은 " + pc.getStudentCount() + "명입니다.");
			System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 사원은 " + pc.getEmployeeCount() + "명입니다.");
			System.out.println("사원 메뉴");
			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 보기");
			System.out.println("3. 메인으로 돌아갑니다");
			System.out.print("옵션을 선택해 주세요: ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				insertEmployee();
				break;
			case 2:
				printEmployees();
				break;
			case 3:
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				break;
			}
		}
	}

	public void insertStudent() {
		System.out.print("학생 이름: ");
		String name = sc.next();
		System.out.print("학생 나이: ");
		int age = sc.nextInt();
		System.out.print("학생 키: ");
		double height = sc.nextDouble();
		System.out.print("학생 몸무게: ");
		double weight = sc.nextDouble();
		System.out.print("학생 학년: ");
		int grade = sc.nextInt();
		System.out.print("학생 전공: ");
		String major = sc.next();

		pc.insertStudent(name, age, height, weight, grade, major);
		System.out.println("학생이 추가 되었습니다.");
	}

	public void printStudents() {
		Student[] students = pc.printStudent();
		System.out.println(" 학생 목록:");
		for (int i = 0; i < pc.personCount()[0]; i++) {
			System.out.println(students[i]);
		}
	}

	public void insertEmployee() {
		System.out.print("사원 이름: ");
		String name = sc.next();
		System.out.print("사원 나이: ");
		int age = sc.nextInt();
		System.out.print("사원 키: ");
		double height = sc.nextDouble();
		System.out.print("사원 몸무게: ");
		double weight = sc.nextDouble();
		System.out.print("사원 임금: ");
		int salary = sc.nextInt();
		System.out.print("사원 부서: ");
		String dept = sc.next();

		pc.insertEmployee(name, age, height, weight, salary, dept);
		System.out.println("사원이 추가 되었습니다.");
	}

	public void printEmployees() {
		Employee[] employees = pc.printEmployee();
		System.out.println("사원 목록:");
		for (int i = 0; i < pc.personCount()[1]; i++) {
			System.out.println(employees[i]);
		}
	}
}
