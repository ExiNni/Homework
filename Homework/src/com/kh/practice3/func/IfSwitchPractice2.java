package com.kh.practice3.func;

import java.util.Scanner;

public class IfSwitchPractice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int korean, math, english;
		int avg, hap;
		
		System.out.print("국어점수 입력: ");
		korean = sc.nextInt();
		System.out.print("수학 점수 입력: ");
		math = sc.nextInt();
		System.out.print("영어 점수 입력: ");
		english = sc.nextInt();
				
		avg = ((korean + math + english)/3);
		hap = (korean + math + english);
		
		if(avg<60) {
			System.out.println("국어: " + korean);
			System.out.println("수학: " + math);
			System.out.println("영어: " + english);
			System.out.println("불합격 입니다.");
		}else if(avg>=60) {
			System.out.println("국어: " + korean);
			System.out.println("수학: " + math);
			System.out.println("영어: " + english);
			System.out.println("합계: " + hap);
			System.out.println("평균: " + avg);
			System.out.println("축하합니다, 합격입니다!");
		}else {
			System.out.println("점수를 다시 입력하세요");
		}
	}

}