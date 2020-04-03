package data;

import vo.UserVO;
//세션 : 인터넷창이 열려있는 동안 유지되는 저장 공간.
public class Session {
//로그인 되어있는 유저의 정보를 저장.
	//로그아웃은 이 변수에 null을 넣으면 된다. 저기에 정보가 있는지 없ㄴㄴ지로 로그인/비로그인 체크.
	public static UserVO loginUser;
}
