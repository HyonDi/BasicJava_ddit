package dao;

import java.util.ArrayList;

import service.BoardService;
import service.BoardServiceImpl;
import vo.BoardVO;
import vo.UserVO;
import data.Database;
import data.Session;

public class BoardDaoImpl implements BoardDao {
	
	private static BoardDaoImpl instance; 
	
	private BoardDaoImpl(){}
	
	public static BoardDaoImpl getInstance() {
		if(instance == null)
		{
			instance = new BoardDaoImpl();
		}
		return instance;
	}

	Database database = Database.getInstance();
	
	
	/*	public UserVO selectUser(String key, String value) {
		for (int i = 0 ; i < database.tb_user.size() ; i++)
		{
			UserVO user = database.tb_user.get(i);
			
			if(key.equals("ID"))
			{
				if(user.getId().equals(value))
				{
					return user;
				}
			}
			else if(key.equals("NAME"))
			{
				if(user.getName().equals(value))
				{
					return user;
				}
			}
		}

		return null;
	}*/
	
	
//	@Override
//	public BoardVO selectBoard() { //내가 쓴 후기 목록 / 이건 지워도 되나?
//		
//		for(int i = 0; i < database.tb_board.size(); i ++){
//			BoardVO board = database.tb_board.get(i);
//			UserVO writer = Session.loginUser; 
//			
//			if(writer.getName() == board.getWriter()){// 전부나옴
//				return board;
//			}
//		}
//
//		return null;
//	}

//	@Override
//	public ArrayList<BoardVO> selectBoardList() { //내가 쓴 후기목록 여기선가??
//		
//		for(int i = 0; i < database.tb_board.size(); i ++){
//			BoardVO board = database.tb_board.get(i);
//			UserVO writer = Session.loginUser; 
//			
//			if(writer.getName() == board.getWriter()){// 전부나옴
//				return database.tb_board;
//			}
//		}
//		
//		return null;
//	}

	@Override
	public ArrayList<BoardVO> selectBoardList() { //전체후기목록
		return database.tb_board;
	}
	
	@Override
	public void insertBoard(BoardVO board) {
		database.tb_board.add(board);
	}

	@Override
	public void selectBoardAndPrint(String key, String value) {//내가 쓴 글
		int cnt = 1;
		
		for (int i = 0 ; i < database.tb_board.size() ; i++){
			BoardVO board = database.tb_board.get(i);
			//내가쓴 후기조회
			if(key.equals("WRITER"))
			{
//				//test
//				System.out.println("selectBoardAndPrint>>>" + board.getWriter().equals(value));
//				System.out.println("getWriter : " + board.getWriter());
//				System.out.println("value : " + value);
				

				if(board.getWriter().equals(value))
				{
//					return board;
					System.out.println("-----------------------------------");
//					System.out.println("<" + (i+1) + ">");
					System.out.printf("<%d>\n", cnt);
					System.out.println(" 상품번호 : " + board.getProductId());
					System.out.println(" 별점 : " + printStar(board.getStar()));
					System.out.println(" 내용 : " + board.getContents());
					System.out.println(" 작성자 : " + board.getWriter());
					System.out.println(" 날짜 : " + board.getRegDate());
					System.out.println("-----------------------------------");
					cnt++;
					
/*					System.out.println(i + 1 + " 상품번호 : " + board.getProductId() + "\t"
					+ "게시판 번호 : " + board.getNo() + " 별점 : " + board.getStar() + "\t"
					+ board.getContents() + "\t" + "작성자 : "+ "\t"
					+ board.getWriter() + "날짜 : " + board.getRegDate() );
*/				}
			}
		}
		
//		return null;
	}
	
	@Override
	public void selectBoardAndPrint(String key, int value) {//상품별
		for (int i = 0 ; i < database.tb_board.size() ; i++)
		{
			BoardVO board = database.tb_board.get(i);
			//상품별조회
			if(key.equals("PROID"))
			{
				if(board.getProductId() == value)
				{
					System.out.println(i + 1 + " 상품번호 : " + board.getProductId() + "\t"
						+ "게시판 번호 : " + board.getNo() + " 별점 : " + board.getStar() + "\t"
						+ board.getContents() + "\t" + "작성자 : "+ "\t"
						+ board.getWriter() + "날짜 : " + board.getRegDate());
				}
			}
		}
//		return null;
	}

	@Override
	public void boardListAll() {
		for (int i = 0 ; i < database.tb_board.size() ; i++)
		{
			BoardVO board = database.tb_board.get(i);
			System.out.println("-----------------------------------");
			System.out.println("<" + (i+1) + ">");
			System.out.println(" 상품번호 : " + board.getProductId());
			System.out.println(" 별점 : " + printStar(board.getStar()));
//			System.out.println(" 별점 : " + board.getStar());
			System.out.println(" 내용 : " + board.getContents());
			System.out.println(" 작성자 : " + board.getWriter());
			System.out.println(" 날짜 : " + board.getRegDate());
			System.out.println("-----------------------------------");
			
		}
		
	}
	
	public String printStar(int star){
		if(star == 1)
			return "★";
		else if(star == 2)
			return "★★";
		else if(star == 3)
			return "★★★";
		else if(star == 4)
			return "★★★★";
		else if(star == 5)
			return "★★★★★";
		else
			return "";
	}
	
/*	@Override
	public ArrayList<BoardVO> proSelectBoard() { 
		
		BoardService boardservice = BoardServiceImpl.getInstance();
		
		for(int i = 0; i < database.tb_board.size(); i ++){
			
			BoardVO board = database.tb_board.get(i);
			
			if(board.getNo() == boardservice.proBoardList.productId){// 내가 입력한 숫자 = 상품아이디
				return database.tb_board;
			}
		}
		
		return null;
	}
*/
	
	
	
}
