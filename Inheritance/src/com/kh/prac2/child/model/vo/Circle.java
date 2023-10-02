package com.kh.prac2.child.model.vo;

import com.kh.prac2.parent.model.vo.Shape;

public class Circle extends Shape{

	private int radius;
	
	public Circle() {
		
	}

	public Circle(int radius) {
		super((int)(radius * radius * Math.PI), (int)(2 * Math.PI * radius));
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public String information() {
		return super.information() + ", 반지름: " + radius;
	}
	
}
