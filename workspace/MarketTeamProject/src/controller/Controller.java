package controller;

import java.util.Scanner;

import service.UserService;
import service.UserServiceImpl;

public class Controller {

	UserService userService = UserServiceImpl.getInstance(); //전역변수 유저서비스타입 선언. 싱글톤패턴
	
	public static void main(String[] args) {
/*		Controller 	: 메뉴 선택. 프로그램이 시작하는곳. 메인화면정도. 메뉴. 메인메서드.
		Service		: 메뉴 기능 수행. 컨트롤러의 기능들을 서비스로 하나하나의 기능들을 구현한다.
		Dao			: 데이터 베이스 접속. 서비스의 기능수행중 데이터베에스에 접속해야하면 dao클래스 메서드를 호출. 데이터를 저장하는곳이 dao. 
		Vo			: 데이터를 담는 클래스. 데이터베이스에 값을 저장하거나 가져올때 vo클래스에 담아서 저장을하고 담아서 가져온다.
*/
		//회원가입, 가입한 목록을 출력해보자~!!!~!~!~!~!!!와!~!!!~~~~~~
		new Controller().begin();	
	}

	private void begin() {
		Scanner s = new Scanner(System.in);
		
		int menu;
		do{
			System.out.println("--------------메뉴---------------");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원 목록");
			System.out.println("0. 프로그램 종료");
			System.out.println("---------------------------------");
			System.out.println("메뉴에 해당하는 번호 입력>");
			
			menu = Integer.parseInt(s.nextLine());
			
			switch (menu){
			case 1: //회원가입
				userService.join();
				break;
			case 2: //로그인
				userService.login();
				break;
			case 3: //회원목록
				userService.userList();
				break;
			case 0: //프로그램 종료
				System.out.println("프로그램 종료");
				break;
			}
		} while(menu != 0);
		
	}
	

}
