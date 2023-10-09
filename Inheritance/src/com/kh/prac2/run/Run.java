package com.kh.prac2.run;

import com.kh.prac2.child.model.vo.Circle;
import com.kh.prac2.child.model.vo.Rectangle;

public class Run {

	public static void main(String[] args) {
		Circle cr = new Circle(3);
		System.out.println(cr.information());
		
		Rectangle rec = new Rectangle(3,4);
		System.out.println(rec.information());
	}
}
   