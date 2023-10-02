package com.kh.prac1.child.model.vo;

import com.kh.prac1.parent.model.vo.Computer;

public class Smartphone extends Computer{

	private String paymentPlan;
	
	public Smartphone() {
		
	}

	public Smartphone(String paymentPlan) {
		super();
		this.paymentPlan = paymentPlan;
	}

	public String getPaymentPlan() {
		return paymentPlan;
	}

	public void setPaymentPlan(String paymentPlan) {
		this.paymentPlan = paymentPlan;
	}
	
}
