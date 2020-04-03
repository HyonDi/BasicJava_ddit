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
		//회원가입
		Scanner s = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String id = s.nextLine();
		System.out.print("비밀번호 : ");
		String password = s.nextLine();
		System.out.print("이름 : ");
		String name = s.nextLine();

		UserVO user = new UserVO();
		
		user.setId(id);
		user.setPassword(password);
		user.setName(name);
		
		//ID만 체크
		UserVO userCheck = userDao.selectUser("ID", user.getId());
		
		if(userCheck == null)
		{
			userDao.insertUser(user);
			System.out.println("가입해주셔서 감사합니다");
		}
		else
		{
			System.out.println("아이디 중복");
		}
	}

	@Override
	public void login() {
		//로그인
		Scanner s = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String id = s.nextLine();
		System.out.print("비밀번호 : ");
		String password = s.nextLine();
		System.out.print("이름 : ");
		String name = s.nextLine();
		
		HashMap<String, String> param = new HashMap<String, String>();
		param.put("ID", id);
		param.put("PASSWORD", password);

		UserVO user = userDao.selectUser(param);
		
		if(user == null)
		{
			System.out.println("아이디 혹은 비밀번호를 잘못 입력하셨습니다.");
		}
		else
		{
			//세션에 로그인 정보를 저장
			Session.loginUser = user;
			System.out.println("로그인 성공!!");
			System.out.println(user.getName() + "님 환영합니다.");
		}
		
	}

	@Override
	public void userList() {
		ArrayList<UserVO> userList = userDao.selectUserList();
		
		System.out.println("---------------------------------");
		System.out.println("번호\t아이디\t이름");
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
		
		System.out.print("제목을 입력하세요 > ");
		String title = s.nextLine();
		System.out.print("내용을 입력하세요  > ");
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

		System.out.println("-------------게시판출력-------------");
		
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
