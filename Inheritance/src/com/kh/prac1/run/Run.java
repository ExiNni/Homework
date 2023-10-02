package com.kh.prac1.run;

import com.kh.prac1.child.model.vo.Smartphone;
import com.kh.prac1.child.model.vo.Tablet;

public class Run {
	
	public static void main(String[] args) {
		Smartphone phone = new Smartphone("무제한 요금제");
		phone.setCpu("i7-1234");
		phone.setBrand("KH");
		phone.setPrice(1500);
		System.out.println("=====SmartPhone=====");
		System.out.println(phone.getCpu());
		System.out.println(phone.getBrand());
		System.out.println(phone.getPrice());
		System.out.println(phone.getPaymentPlan());
		
		Tablet tab = new Tablet(10.5, "Banana Pencil");
		tab.setCpu("i5-1234");
		tab.setBrand("Banana");
		tab.setPrice(2000);
		System.out.println("=====Tablet=====");
		System.out.println(tab.getCpu());
		System.out.println(tab.getBrand());
		System.out.println(tab.getPrice());
		System.out.println(tab.getScreenSize());
		System.out.println(tab.getPen());
	}
}
