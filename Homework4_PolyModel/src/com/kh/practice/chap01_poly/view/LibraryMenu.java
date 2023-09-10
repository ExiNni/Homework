package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.CookBook;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryMenu {
	private LibraryController lc;
	private Scanner sc;

	public LibraryMenu() {
		lc = new LibraryController();
		sc = new Scanner(System.in);
	}

	public void mainMenu() {
		int choice;

		do {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			System.out.print("메뉴 번호 : ");
			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				MyPage();
				break;
			case 2:
				Books();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				rentBook();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("잘못된 메뉴 선택입니다. 다시 선택하세요.");
			}
		} while (choice != 9);
	}

	private void MyPage() {
		System.out.print("이름을 입력하세요: ");
		String name = sc.nextLine();
		System.out.print("나이를 입력하세요: ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("성별을 입력하세요 (M/F): ");
		char gender = sc.nextLine().charAt(0);

		Member member = new Member(name, age, gender);
		lc.insertMember(member);
		System.out.println("회원 등록이 완료되었습니다.");

		showMyPage();
	}

	private void showMyPage() {
		Member member = lc.myInfo();
		if (member != null) {
			System.out.println("====== 마이페이지 ======");
			System.out.println(member);
		} else {
			System.out.println("회원 정보가 등록되어 있지 않습니다.");
		}
	}

	private void Books() {
		Book[] books = lc.selectAll();
		if (books != null) {
			System.out.println("====== 도서 전체 목록 ======");
			for (Book book : books) {
				System.out.println(book);
			}
		} else {
			System.out.println("도서 목록이 없습니다.");
		}
	}

	public void searchBook() {
		System.out.print("검색할 제목 키워드 : ");
		String keyword = sc.nextLine();

		Book[] searchList = lc.searchBook(keyword);

		if (searchList != null && searchList.length > 0) {
			System.out.println("====== 도서 검색 결과 ======");
			for (int i = 0; i < searchList.length; i++) {
				Book book = searchList[i];
				System.out.print(
						i + "번 도서 : " + book.getTitle() + " / " + book.getAuthor() + " / " + book.getPublisher());

				if (book instanceof CookBook) {
					CookBook cookBook = (CookBook) book;
					System.out.println(" / " + cookBook.isCoupon());
				} else {
					System.out.println();
				}
			}
		} else {
			System.out.println("검색 결과가 없습니다.");
		}
	}

	public void rentBook() {
		selectAll();

		System.out.print("대여할 도서 번호 선택 : ");
		int index = sc.nextInt();
		sc.nextLine();

		int result = lc.rentBook(index);

		if (result == 0) {
			System.out.println("성공적으로 대여되었습니다.");
		} else if (result == 1) {
			System.out.println("나이 제한으로 대여 불가능입니다.");
		} else if (result == 2) {
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요.");
		} else {
			System.out.println("대여 실패: 알 수 없는 오류 발생");
		}
	}

	public void selectAll() {
		Book[] bList = lc.selectAll();

		if (bList != null && bList.length > 0) {
			System.out.println("====== 도서 전체 목록 ======");
			for (int i = 0; i < bList.length; i++) {
				Book book = bList[i];
				System.out.print(
						i + "번 도서 : " + book.getTitle() + " / " + book.getAuthor() + " / " + book.getPublisher());

				if (book instanceof CookBook) {
					CookBook cookBook = (CookBook) book;
					System.out.println(" / " + cookBook.isCoupon());
				} else {
					System.out.println();
				}
			}
		} else {
			System.out.println("도서 목록이 없습니다.");
		}
	}
}
