package com.kh.example.practice6.model.vo;

public class Cake {
	private String kind;
	private String name;
	private String flavor;
	private int numOf;
	private int price;

	public Cake() {
		this.kind = "";
		this.name = "";
		this.flavor = "";
		this.numOf = 0;
		this.price = 0;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public int getNumOf() {
		return numOf;
	}

	public void setNumOf(int numOf) {
		this.numOf = numOf;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String information() {
        return "종류: " + kind + "\n" +
               "이름: " + name + "\n" +
               "맛: " + flavor + "\n" +
               "개수: " + numOf + "\n" +
               "가격: " + price;
    }
}