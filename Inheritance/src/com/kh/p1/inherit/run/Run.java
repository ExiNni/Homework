package com.kh.p1.inherit.run;

import com.kh.p1.inherit.child.model.vo.Computer;
import com.kh.p1.inherit.child.model.vo.Employee;
import com.kh.p1.inherit.child.model.vo.Student;

public class Run {
	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.setName("홍길동");
		emp.setAge(17);
		emp.setSalary(2000);
		emp.setGender('M');
		emp.setAddr("서울시 종로구");
		
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		System.out.println(emp.getSalary());
		System.out.println(emp.information());
		
		Student stu = new Student(3, "컴공");
		//System.out.println(stu.information());
		
		Student stu1 = new Student("홍길동", 21, '남', "서울시 광진구", 3, "컴공");
		//System.out.println(stu1.information());
		
		Computer com = new Computer("i13-13900", "KH", 1800);
		Student stu2 = new Student("이순신", 28, '남', "서울시 강동구", 4, "컴공", com);
		System.out.println(stu2.information());
		
	}
}
