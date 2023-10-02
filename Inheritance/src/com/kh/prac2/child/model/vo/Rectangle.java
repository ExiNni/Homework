package com.kh.prac2.child.model.vo;

import com.kh.prac2.parent.model.vo.Shape;

public class Rectangle extends Shape{

	private int width;
	private int height;
	
	public Rectangle() {
		
	}

	public Rectangle(int width, int height) {
		super((width * height), (width + width + height + height));
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
}
