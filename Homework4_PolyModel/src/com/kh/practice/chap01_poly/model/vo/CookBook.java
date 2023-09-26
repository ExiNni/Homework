package com.kh.practice.chap01_poly.model.vo;

public class CookBook extends Book {
	private boolean coupon;

	public CookBook() {
		super();
		this.coupon = false;
	}

	public CookBook(String title, String author, String publisher, boolean coupon) {
		super(title, author, publisher);
		this.coupon = coupon;
	}  

	public boolean isCoupon() {
		return coupon;
	}

	public void setCoupon(boolean coupon) {
		this.coupon = coupon;
	}
      
	@Override
	public String toString() {
		return super.toString() + "\n쿠폰 유무: " + (coupon ? "있음" : "없음");
	}
}
