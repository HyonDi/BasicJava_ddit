package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import vo.BoardVO;
import vo.UserVO;

import dao.BoardDao;
import dao.BoardDaoImpl;
import dao.UserDao;
import dao.UserDaoImpl;
import data.Session;

public class UserServiceImpl implements UserService {

	private static UserServiceImpl instance;
	
	private UserServiceImpl(){}
	
	public static UserServiceImpl getInstance() {
		if(instance == null)
		{
			instance = new UserServiceImpl();
		}
		return instance;
	}

	UserDao userDao = UserDaoImpl.getInstance();
	BoardDao boardDao = BoardDaoImpl.getInstance();	//hh.joo 20191220 add
	
	@Override
	public void join() {
		//ȸ������
		Scanner s = new Scanner(System.in);
		
		System.out.print("���̵� : ");
		String id = s.nextLine();
		System.out.print("��й�ȣ : ");
		String password = s.nextLine();
		System.out.print("�̸� : ");
		String name = s.nextLine();

		UserVO user = new UserVO();
		
		user.setId(id);
		user.setPassword(password);
		user.setName(name);
		
		//ID�� üũ
		UserVO userCheck = userDao.selectUser("ID", user.getId());
		
		if(userCheck == null)
		{
			userDao.insertUser(user);
			System.out.println("�������ּż� �����մϴ�");
		}
		else
		{
			System.out.println("���̵� �ߺ�");
		}
	}

	@Override
	public void login() {
		//�α���
		Scanner s = new Scanner(System.in);
		
		System.out.print("���̵� : ");
		String id = s.nextLine();
		System.out.print("��й�ȣ : ");
		String password = s.nextLine();
		System.out.print("�̸� : ");
		String name = s.nextLine();
		
		HashMap<String, String> param = new HashMap<String, String>();
		param.put("ID", id);
		param.put("PASSWORD", password);

		UserVO user = userDao.selectUser(param);
		
		if(user == null)
		{
			System.out.println("���̵� Ȥ�� ��й�ȣ�� �߸� �Է��ϼ̽��ϴ�.");
		}
		else
		{
			//���ǿ� �α��� ������ ����
			Session.loginUser = user;
			System.out.println("�α��� ����!!");
			System.out.println(user.getName() + "�� ȯ���մϴ�.");
		}
		
	}

	@Override
	public void userList() {
		ArrayList<UserVO> userList = userDao.selectUserList();
		
		System.out.println("---------------------------------");
		System.out.println("��ȣ\t���̵�\t�̸�");
		System.out.println("---------------------------------");
//		for(int i = userList.size() - 1 ; 0 <= i ; i--)
		for(int i = 0 ; i <= userList.size() - 1 ; i++)
		{
			UserVO user = userList.get(i);
			System.out.println(i + 1 + "\t" + user.getId() + "\t" + user.getName());
		}
		System.out.println("---------------------------------");
	}

	@Override
	public void insertBoard() {
//		ArrayList<BoardVO> boardList = boardDao.selectBoardList();
		Scanner s = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� > ");
		String title = s.nextLine();
		System.out.print("������ �Է��ϼ���  > ");
		String contents = s.nextLine();
		
//		HashMap<String, String> param = new HashMap<String, String>();
//		param.put("TITLE", title);
//		param.put("CONTENTS", contents);

		BoardVO board = new BoardVO();
		board.setTitle(title);
		board.setContents(contents);
		
		boardDao.insertBoard(board);

	
	}

	@Override
	public void printBoard() {
		ArrayList<BoardVO> boardList = boardDao.selectBoardList();

		System.out.println("-------------�Խ������-------------");
		
//		for(int i = 0 ; i < boardList.size() ; i++)
		for(int i = boardList.size() - 1 ; 0 <= i ; i--)
		{
			BoardVO board = boardList.get(i);
			System.out.println(i + 1 + "\t" + board.getTitle() + "\t" + board.getContents());
		}
		System.out.println("---------------------------------");
		System.out.println(); 		System.out.println();

		
	}

}
