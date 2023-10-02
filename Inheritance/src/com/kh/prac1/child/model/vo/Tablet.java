package com.kh.prac1.child.model.vo;

import com.kh.prac1.parent.model.vo.Computer;

public class Tablet extends Computer{

	private double screenSize;
	private String pen;
	
	public Tablet() {
		
	}

	public Tablet(double screenSize, String pen) {
		super();
		this.screenSize = screenSize;
		this.pen = pen;
	}

	public double getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}

	public String getPen() {
		return pen;
	}

	public void setPen(String pen) {
		this.pen = pen;
	}
	
	
}
