package dao;

import java.util.ArrayList;
import java.util.HashMap;

import vo.UserVO;

public interface UserDao {
	//id 중복체크
	//dao = data access Object 래
	UserVO selectUser(String key, String value);

	void insertUser(UserVO user);

	UserVO selectUser(HashMap<String, String> param);

	ArrayList<UserVO> selectUserList();
	
	
	
	
	
	
	
	
	
	
}
