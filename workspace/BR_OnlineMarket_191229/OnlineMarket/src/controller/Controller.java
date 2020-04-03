package controller;

import java.util.Scanner;

import service.PayService;
import service.PayServiceImpl;
import service.UserService;
import service.UserServiceImpl;
import service.CartService;
import service.CartServiceImpl;
import service.CategoryService;
import service.CategoryServiceImpl;

import data.Session;

public class Controller {
	
	UserService userService = UserServiceImpl.getInstance();
	CartService cartService = CartServiceImpl.getInstance();
	CategoryService categoryService = CategoryServiceImpl.getInstance();
	PayService payService =  PayServiceImpl.getInstance();

	
	public static void main(String[] args) {
		
		new Controller().begin();
		
	}

	private void begin() {
		Scanner s = new Scanner(System.in);
		
		int menu;
		
		do {
			if(Session.loginUser == null)
			{
				System.out.println("---------- menu ----------");
				System.out.println("1.\tȸ������ \t\t(Sign up)");
				System.out.println("2.\t�α��� \t\t(Login)");
//				System.out.println("3.\tȸ�� ��� ��� \t(User List)");		//admin permission
//				System.out.println("11.\t�Ǹ� ��ǰ ��� \t(register to sell)");
				System.out.println("12.\t�Ǹ� ��ǰ ��� \t(print selling product list)");
//				System.out.println("22.\t��ٱ��� ��� \t(add to cart)");
//				System.out.println("23.\t��ٱ��� ��� \t(print cart list)");
				System.out.println("31.\t���� ����"); //null 12.28
//				System.out.println("32.\t���� ��� ���"); //null 12.28
				System.out.println("99.\tī�װ� �˻� ��� \t(searchCategoryWithKeyword)");
//				System.out.println("0.\t�α׾ƿ�  \t\t(Log-out)");
				System.out.println("-------------------------");
				System.out.println("Please Select >>");
			}
			else
			{
				loginMain();
			}
			
			menu = Integer.parseInt(s.nextLine());
			
			switch (menu) {
			case 1:
				userService.join();
				break;
				
			case 2:
				userService.login();
				break;
			
//			case 3:
//				userService.userList();
//				break;
				
//			case 11:
//				categoryService.addCategory();
//				break;
				
			case 12:
				categoryService.printCategoryList();
				break;

//			case 22:
//				cartService.addToCart();
//				break;
//				
//			case 23:
//				cartService.printCartList();
//				break;

			case 31:
				payService.buying();
				break;
				
//			case 32:
//				payService.payList();
//				break;

			case 99:
				categoryService.searchCategoryWithKeyword("");
				break;
				
			case 0:
				System.out.println("Log-Out : Have a nice day!");
				break;
				
			default :
				break;

			}
		} while(menu != 0); 
		
		if(menu == 0)		//log-out -> begin()
			begin();
	}	
	
	private void loginMain(){ //br 20191226 add
		Scanner s = new Scanner(System.in);
		
		 int menu;
		 
		 do{
			System.out.println("---------- menu ----------");
//			System.out.println("1.\tȸ������ \t\t(Sign up)");
//			System.out.println("2.\t�α��� \t\t(Login)");
//			System.out.println("3.\tȸ�� ��� ��� \t(User List)");
			System.out.println("4. 내 정보 (My Page)"); //br.20191229
			System.out.println("11.\t�Ǹ� ��ǰ ��� \t(register to sell)");
			System.out.println("12.\t�Ǹ� ��ǰ ��� \t(print selling product list)");
			System.out.println("22.\t��ٱ��� ��� \t(add to cart)");
			System.out.println("23.\t��ٱ��� ��� \t(print cart list)");
			System.out.println("31.\t���� ����"); //null 12.28
			System.out.println("32.\t���� ��� ���"); //null 12.28
			System.out.println("99.\tī�װ� �˻� ��� \t(searchCategoryWithKeyword)");
			System.out.println("0.\t�α׾ƿ�  \t\t(Log-out)");
			System.out.println("-------------------------");
			System.out.println("Please Select >>");
			
//			 System.out.println("----------menu---------");
//			 System.out.println("1. Shopping");
//			 System.out.println("2. Cart");
//			 System.out.println("3. My page");
//			 System.out.println("4. To sell");
//			 System.out.println("0. Log-out");
//			 System.out.println("-----------------------");
//			 System.out.println("Please Select >>");
			 
			 menu = Integer.parseInt(s.nextLine());
			 
			 switch (menu) {
//				case 1:
//					userService.join();
//					break;
//					
//				case 2:
//					userService.login();
//					break;
//				
//				case 3:
//					userService.userList();
//					break;
				
			 	case 4: //br.20191229 add
			 		userService.printMyPage();
			 		break;
			 		
				case 11:
					categoryService.addCategory();
					break;
					
				case 12:
					categoryService.printCategoryList();
					break;

				case 22:
					cartService.addToCart();
					break;
					
				case 23:
					cartService.printCartList();
					break;

				case 31:
					payService.buying();
					break;
					
				case 32:
					payService.payList();
					break;

				case 99:
					categoryService.searchCategoryWithKeyword("");
					break;
					
				case 0:
					System.out.println("Log-Out : Have a nice day!");
					Session.loginUser = null;
					break;
					
				default :
					break;

				}
			 
//			 if( menu == 3)
//			 {
//				 userService.printMyPage(); //br 20191226 add
//				 loginMain();
//				 break;
//			 }
//			 else if( menu == 0)
//			 {
//				 System.out.println("Have a nice day!");
//				 begin();
//				 break;
//			 }
			 
		 }while(menu != 0);
		 
		if(menu == 0)		//log-out -> begin()
			begin();
	}
}
