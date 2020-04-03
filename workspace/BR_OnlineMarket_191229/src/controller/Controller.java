package controller;

import java.util.Scanner;

import service.UserService;
import service.UserServiceImpl;

public class Controller {
	
	UserService userService = UserServiceImpl.getInstance();

	public static void main(String[] args) {
		
		new Controller().begin();
		
	}

	private void begin() {
		Scanner s = new Scanner(System.in);
		
		int menu;
		
		do {
			System.out.println("---------- menu ----------");
			System.out.println("1. Sign up");
			System.out.println("2. Login");
			System.out.println("3. My page");
			System.out.println("0. Log-out");
			System.out.println("-------------------------");
			System.out.println("Please Select >>");
			
			
			
			menu = Integer.parseInt(s.nextLine());
			
			switch (menu) {
			case 1:
				userService.join();
				break;
				
			case 2:
				userService.login();
				break;
			
			case 3:
				userService.userList();
				break;
			
			case 0:
				System.out.println("Have a nice day!");
				break;
				
			default :
				break;

			}
		} while(menu != 0); 
	}	
}
