package data;

import java.util.ArrayList;

import vo.BoardVO;
import vo.ProductVo;
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
	
	//initial //�ʱ�ȭ..
	{
		UserVO user = new UserVO();
		user.setId("admin");
		user.setPassword("admin");
		user.setName("Manager");
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
	//ch. yun 20191224 add
	public ArrayList<ProductVo> tb_product = new ArrayList<>();{
		
		
	}
	
	
	public ArrayList<UserVO> tb_order = new ArrayList<>(); //br.20191224
	
	{
		UserVO order = new UserVO();
		tb_order.add(order);
	}
	
	
	
}























