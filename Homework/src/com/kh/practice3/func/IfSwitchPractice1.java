package com.kh.practice3.func;

import java.util.Scanner;

public class IfSwitchPractice1 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 int num;
		 
		 System.out.println("숫자를 한 개 입력하세요 : ");
		 num = sc.nextInt();
		 
		 if(num > 0) {
			 if(num % 2 == 0) {
				 System.out.println("짝수다");
			 }else {
				 System.out.println("홀수다");
			 }
		 }else {
			 System.out.println("양수만 입력해주세요");
		 }
	}

}