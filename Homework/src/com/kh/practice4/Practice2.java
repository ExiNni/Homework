package com.kh.practice4;

import java.util.Scanner;

public class Practice2 {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        int num;
	        boolean isTrue = true;

	        while (isTrue) {
	            System.out.print("숫자 입력: ");
	            num = sc.nextInt();

	            switch (num) {
	                case 0:
	                    System.out.println("1 이상의 숫자를 입력해주세요.");
	                    break;
	                default:
	                    for (int i = 1; i <= num; i++) {
	                        System.out.println(i);
	                    }
	                    isTrue = false;
	                    break;
	            }
	        }
	    }
	}