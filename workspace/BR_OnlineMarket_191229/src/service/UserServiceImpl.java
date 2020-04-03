package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import dao.UserDao;
import dao.UserDaoImpl;
import data.Session;
import vo.UserVO;

public class UserServiceImpl implements UserService{
	
	private static UserServiceImpl instance;
	
	private UserServiceImpl(){}
	
	public static UserServiceImpl getInstance(){
		if(instance == null){
			instance = new UserServiceImpl();
		}
		return instance;
	}
	
	UserDao userDao = UserDaoImpl.getInstance();
	
	@Override
	public void join() {
		Scanner s = new Scanner(System.in);
		
		UserVO user = new UserVO();
		
		Pattern p;
		Matcher m;
		
		System.out.println("ID : ");
		String id = s.nextLine();
		do{
			String regexId = "(\\w|_*|-*){5,20}";
			p = Pattern.compile(regexId);
			m = p.matcher(id);
			if(m.matches() == true){
				user.setId(id);
			}else{
				System.out.println("Use Only 5-20 English uppercase letters, lowercase letters, numbers, and special symbols (_), (-).");
				System.out.println("ID : ");
				id = s.nextLine();
			}
		}while(m.matches() != true);
		
		
		System.out.println("PASSWORD : ");
		String password = s.nextLine();
		do{
			String regexPass = "^(?=.*\\d)(?=.*[~`!@#$%\\^&*()-])(?=.*[a-z])(?=.*[A-Z]).{8,16}$";
			p = Pattern.compile(regexPass);
			m = p.matcher(password);
			if(m.matches() == true){
				user.setPassword(password);
			}else{
				System.out.println("Use 8 to 16 English uppercase letters, lowercase letters, numbers, and special characters.");
				System.out.println("PASSWORD : ");
				password = s.nextLine();
			}
		}while(m.matches() != true);
		
		
		System.out.println("NAME : ");
		String name = s.nextLine();
		
		
		System.out.println("PHONE NUMBER : ");
		String phone = s.nextLine();
		do{
			String regexPhone = "^0\\d{1,3}-\\d{3,4}-\\d{4}";
			p = Pattern.compile(regexPhone);
			m = p.matcher(phone);
			if(m.matches() == true){
				//user.setPhone(phone);
				user.setPhoneNumber(phone);
			}else{
				System.out.println("The number does not fit.");
				System.out.println("PHONE NUMBER : ");
				phone = s.nextLine();
			}
		}while(m.matches() != true);
		
		
		System.out.println("ADDRESS : ");
		String address = s.nextLine();
		
		
		UserVO userCheck = userDao.selectUser("ID", user.getId());
		if(userCheck == null){ 
			userDao.insertUser(user);
			System.out.println("Thank you for signing up.");
		}else{
			System.out.println("This ID is already in use or has been withdrawn.");
			System.out.println("ID : ");
			id = s.nextLine();
		}

	}

	
	
	
	@Override
	public void login() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("ID : ");
		String id = s.nextLine();
		System.out.println("PASSWORD : ");
		String password = s.nextLine();
		
		HashMap<String, String> param = new HashMap<String, String>();
		param.put("ID", id);
		param.put("PASSWORD", password);
		
		UserVO user = userDao.selectUser(param);
		
		if(user == null){
			System.out.println("You have entered the wrong ID or password.");
		}else{
			Session.LoginUser = user;
			System.out.println("Login Successful.");
			System.out.println(user.getName() + "Welcome");
		}
	}


//	@Override
//	public void orderList() { ///////////////////add orderList
//		ArrayList<UserVO> orderList = userDao.selectOrderList();
//		
//	}

	
	
	@Override
	public void userList() { //////////////////modify to need
		ArrayList<UserVO> userList = userDao.selectUserList();
		
		System.out.println("------------------------------");
		System.out.println("번호\t상품명\t상품내용");
		System.out.println("------------------------------");
		for(int i = userList.size() -1; 0 <= i; i--){
			UserVO user = userList.get(i);
			System.out.println(i + 1 + "\t" + user.getId() + "\t" + user.getName());
		}
		System.out.println("------------------------------");
		
	}

	@Override
	public void insertBoard() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printBoard() {
		// TODO Auto-generated method stub
		
	}


}
