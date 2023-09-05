package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Cake;

public class CakeRun {

	public static void main(String[] args) {
		Cake SnackController = new Cake();
        SnackController.setKind("빵");
        SnackController.setName("케이크");
        SnackController.setFlavor("블루베리");
        SnackController.setNumOf(1);
        SnackController.setPrice(15000);

        System.out.println(SnackController.information());
    }
}