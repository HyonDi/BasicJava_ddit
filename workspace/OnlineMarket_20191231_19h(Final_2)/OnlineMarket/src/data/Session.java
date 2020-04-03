package data;

import vo.UserVO;
import vo.CategoryVO;


//세션 : 인터넷 창이 열려잇는 동안 유지되는 저장 공간
public class Session {
	//로그인 되어있는 유저의 정보를 저장
	public static UserVO loginUser;
	
	public static boolean isLogin = false;
	
	
	
	public static CategoryVO sessionCategory; 	//hh.joo 20191226 add

	
}
