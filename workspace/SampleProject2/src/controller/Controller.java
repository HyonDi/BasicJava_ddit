package controller;

import java.util.Scanner;

import service.UserService;
import service.UserServiceImpl;

public class Controller {
	
	UserService userService = UserServiceImpl.getInstance();

	public static void main(String[] args) {
		
		/*
		 *  Controller		: 메뉴 선택
		 *  Service			: 메뉴 기능 수행
		 *  Dao				: 데이터 베이스 접속
		 *  Vo				: 데이터를 담는 클래스
		 */
		
		//회원가입 , 목록
		
		new Controller().begin();
		
	}

	private void begin() {
		Scanner s = new Scanner(System.in);
		
		int menu;
		
		do {
			System.out.println("---------- 메뉴 ----------");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원목록");
			System.out.println("4. 게시판 입력");
			System.out.println("5. 게시판 출력");
			System.out.println("0. 프로그램 종료");
			System.out.println("-------------------------");
			System.out.println("해당 메뉴 입력 >>");
			
			menu = Integer.parseInt(s.nextLine());
			
			switch (menu) {
			case 1:	//회원가입
				userService.join();
				break;
			case 2:	//로그인
				userService.login();
				break;
			
			case 3:	//회원목록
				userService.userList();
				break;

			case 4:	//게시판 입력
				userService.insertBoard();
				break;
				
			case 5:	//게시판 출력
				userService.printBoard();
				break;
			
			case 0:	//프로그램 종료
				System.out.println("프로그램 종료");
				break;
				
			default :
				break;

			}
		} while(menu != 0); 
	}	
}
