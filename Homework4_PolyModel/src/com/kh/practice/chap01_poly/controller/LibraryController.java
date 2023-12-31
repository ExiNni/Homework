package com.kh.practice.chap01_poly.controller;

import com.kh.practice.chap01_poly.model.vo.AniBook;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.CookBook;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryController {
	private Member member;
	private Book[] bList;

	public LibraryController() {
		member = null;
		bList = new Book[5];
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);

	}

	public void insertMember(Member member) {
		this.member = member;
	}

	public Member myInfo() {
		return member;
	}

	public Book[] selectAll() {
		return bList;
	}

	public Book[] searchBook(String keyword) {
		int count = 0;
		for (Book book : bList) {
			if (book != null && book.getTitle().contains(keyword)) {
				count++;
			}
		}

		if (count == 0) {
			return null;
		}

		Book[] searchResult = new Book[count];
		int index = 0;
		for (Book book : bList) {
			if (book != null && book.getTitle().contains(keyword)) {
				searchResult[index] = book;
				index++;
			}
		}

		return searchResult;
	}

	public int rentBook(int index) {
		Book selectedBook = bList[index];

		if (selectedBook instanceof AniBook) {
			AniBook aniBook = (AniBook) selectedBook;
			if (member.getAge() < aniBook.getAccessAge()) {
				return 1;
			}
		} else if (selectedBook instanceof CookBook) {
			CookBook cookBook = (CookBook) selectedBook;
			if (cookBook.isCoupon()) {
				member.incrementCouponCount();
				return 2;
			}
		}

		return 0;
	}

}
