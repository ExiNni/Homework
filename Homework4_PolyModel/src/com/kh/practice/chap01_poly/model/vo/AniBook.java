package com.kh.practice.chap01_poly.model.vo;

public class AniBook extends Book {
	private int accessAge;

	public AniBook() {
		super("Default Title", "Default Author", "Default Publisher");
	}

	public AniBook(String title, String author, String publisher, int accessAge) {
		super(title, author, publisher);
		this.accessAge = accessAge;
	}

	public int getAccessAge() {
		return accessAge;
	}

	public void setAccessAge(int accessAge) {
		this.accessAge = accessAge;
	}

	@Override
	public String toString() {
		return super.toString() + "\n나이 제한: " + accessAge + "세";
	}
}
