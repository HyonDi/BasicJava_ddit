package data;

import java.util.ArrayList;

import vo.UserVO;

//모든 데이터에서 접속해야해서 싱글톤으로 만들겁니다.
//userserviceimpl 에서 복사해와서 database 로 바꿨다.
public class Database {
	private static Database instance; 
	
	private Database(){}
	
	public static Database getInstance(){ 
		
		if(instance == null){
			instance = new Database();
		}
		return instance;
	}

	public ArrayList<UserVO> tb_user = new ArrayList<>();
	//뭔가 넣어놓고싶으면 초기화블럭을 생성합니다.
	{
		UserVO user = new UserVO();
		user.setId("admin");
		user.setPassword("admin");
		user.setName("관리자");
		tb_user.add(user);
	}
	
	
	
	
}




















