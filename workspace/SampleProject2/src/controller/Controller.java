package controller;

import java.util.Scanner;

import service.UserService;
import service.UserServiceImpl;

public class Controller {
	
	UserService userService = UserServiceImpl.getInstance();

	public static void main(String[] args) {
		
		/*
		 *  Controller		: �޴� ����
		 *  Service			: �޴� ��� ����
		 *  Dao				: ������ ���̽� ����
		 *  Vo				: �����͸� ��� Ŭ����
		 */
		
		//ȸ������ , ���
		
		new Controller().begin();
		
	}

	private void begin() {
		Scanner s = new Scanner(System.in);
		
		int menu;
		
		do {
			System.out.println("---------- �޴� ----------");
			System.out.println("1. ȸ������");
			System.out.println("2. �α���");
			System.out.println("3. ȸ�����");
			System.out.println("4. �Խ��� �Է�");
			System.out.println("5. �Խ��� ���");
			System.out.println("0. ���α׷� ����");
			System.out.println("-------------------------");
			System.out.println("�ش� �޴� �Է� >>");
			
			menu = Integer.parseInt(s.nextLine());
			
			switch (menu) {
			case 1:	//ȸ������
				userService.join();
				break;
			case 2:	//�α���
				userService.login();
				break;
			
			case 3:	//ȸ�����
				userService.userList();
				break;

			case 4:	//�Խ��� �Է�
				userService.insertBoard();
				break;
				
			case 5:	//�Խ��� ���
				userService.printBoard();
				break;
			
			case 0:	//���α׷� ����
				System.out.println("���α׷� ����");
				break;
				
			default :
				break;

			}
		} while(menu != 0); 
	}	
}
