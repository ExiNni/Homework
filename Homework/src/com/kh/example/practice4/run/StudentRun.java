package com.kh.example.practice4.run;

import com.kh.example.practice4.model.vo.Student;

public class StudentRun {

	public static void main(String[] args) {
        Student student = new Student();
        student.setGrade(3);
        student.setClassroom(2);
        student.setName("홍길동");
        student.setHeight(175.5);
        student.setGender('남');

        student.information();
    }
}