package com.kh.p1.inherit.child.model.vo;

public class Computer {

	private String cpu;
	private String brand;
	private int price;
	
	public Computer() {
		
	}

	public Computer(String cpu, String brand, int price) {
		super();
		this.cpu = cpu;
		this.brand = brand;
		this.price = price;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String information() {
		return "CPU: " + cpu + ", brand: " + brand + ", price: " + price;
	}
}
