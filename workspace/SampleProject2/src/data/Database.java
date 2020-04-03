package data;

import java.util.ArrayList;

import vo.BoardVO;
import vo.UserVO;

public class Database {
	
private static Database instance;
	
	private Database(){}
	
	public static Database getInstance() {
		
		if(instance == null)
		{
			instance = new Database();
		}
		return instance;
	}
	
	public ArrayList<UserVO> tb_user = new ArrayList<>();
	
	//initial //초기화..
	{
		UserVO user = new UserVO();
		user.setId("admin");
		user.setPassword("admin");
		user.setName("관리자");
		tb_user.add(user);
	}


	//hh.joo 20191220 add
	public ArrayList<BoardVO> tb_board = new ArrayList<>();
	
	{
		BoardVO board = new BoardVO();
		board.setNo(0);
		board.setTitle("test");
		board.setContents("test");
		board.setWriter("admin");
		board.setRegDate("2019-12-20");
		tb_board.add(board);
	}
	
}























