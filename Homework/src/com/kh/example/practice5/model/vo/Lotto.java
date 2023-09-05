package com.kh.example.practice5.model.vo;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Lotto {
	private int[] lotto = new int[6];

	public Lotto() {
		Lotto();
	}

	private void Lotto() {
		Set<Integer> num = new HashSet<>();
		Random random = new Random();

		while (num.size() < 6) {
			int randomNumber = random.nextInt(45) + 1;
			num.add(randomNumber);
		}

		int index = 0;
		for (int number : num) {
			lotto[index++] = number;
		}
	}

	public int[] getLotto() {
		return lotto;
	}

	public void information() {
		System.out.print("로또 번호: ");
		for (int number : lotto) {
			System.out.print(number + " ");
		}
		System.out.println();
	}

}
