package dao;

import java.util.ArrayList;
import java.util.HashMap;

import vo.UserVO;

public interface UserDao {	//Dao : Data Access Object

	void insertUser(UserVO user);
	
	UserVO selectUser(String key, String value); 
	
	UserVO selectUser(HashMap<String, String> param);

	ArrayList<UserVO> selectUserList();
	
	//temp
//	int getUserId();	//hh.joo 20191226 add
}



















