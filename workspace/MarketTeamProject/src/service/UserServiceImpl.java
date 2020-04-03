package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import vo.UserVO;
import dao.UserDao;
import dao.UserDaoImpl;
import data.Session;

public class UserServiceImpl implements UserService {

	private static UserServiceImpl instance; //인스턴스
	
	private UserServiceImpl(){}//얘가 생성자. 
	
	public static UserServiceImpl getInstance(){ //객체생성 제한할 메서드. = 싱글톤패턴으로 이루어진 메서드.
		if(instance == null){
			instance = new UserServiceImpl();
		}
		return instance;
	}
	
	UserDao userDao = UserDaoImpl.getInstance();
	
	
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
		
		UserVO userCheck = userDao.selectUser("ID", user.getId());
		
		if(userCheck == null){
			userDao.insertUser(user);
			System.out.println("가입해주셔서 감사합니다.");
		}else{
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
		
		//아이디랑 비밀번호 들고 데이타베이스에 일치하는거 있는지 찾아볼거야. 해쉬맵으로 여러파라미터를 동시에 들고갑니다.
		HashMap<String,String> param = new HashMap<String, String>();
		param.put("ID", id);
		param.put("PASSWORD",password);
		
		UserVO user = userDao.selectUser(param);
		
		if(user == null){
			System.out.println("아이디 혹은 비밀번호를 잘못입력하셨습니다.");
		} else{
			//웹에서는 세션이라는곳에 로그인한사람정보를 저장해..
			Session.loginUser = user;
			System.out.println("로그인 성공!!");
			System.out.println(user.getName() + "님 환영합니다.");
		}
		
		
	}

	@Override
	public void userList() {
		//데이타베이스에 접속해서 유저목록을 가져와야해.
		ArrayList<UserVO> userList = userDao.selectUserList();
		
		//출력
		System.out.println("-------------------------------------------");
		System.out.println("번호\t아이디\t\t이름");
		System.out.println("-------------------------------------------");
		for(int i = userList.size() - 1; 0 <= i; i --){
			UserVO user = userList.get(i);
			System.out.println(i + 1 + "\t" + user.getId() + "\t" + user.getName());
		}
		System.out.println("-------------------------------------------");
	}

}
