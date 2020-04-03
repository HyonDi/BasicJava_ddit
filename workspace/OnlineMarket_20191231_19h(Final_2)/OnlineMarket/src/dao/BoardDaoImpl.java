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
//	public BoardVO selectBoard() { //���� �� �ı� ��� / �̰� ������ �ǳ�?
//		
//		for(int i = 0; i < database.tb_board.size(); i ++){
//			BoardVO board = database.tb_board.get(i);
//			UserVO writer = Session.loginUser; 
//			
//			if(writer.getName() == board.getWriter()){// ���γ���
//				return board;
//			}
//		}
//
//		return null;
//	}

//	@Override
//	public ArrayList<BoardVO> selectBoardList() { //���� �� �ı��� ���⼱��??
//		
//		for(int i = 0; i < database.tb_board.size(); i ++){
//			BoardVO board = database.tb_board.get(i);
//			UserVO writer = Session.loginUser; 
//			
//			if(writer.getName() == board.getWriter()){// ���γ���
//				return database.tb_board;
//			}
//		}
//		
//		return null;
//	}

	@Override
	public ArrayList<BoardVO> selectBoardList() { //��ü�ı���
		return database.tb_board;
	}
	
	@Override
	public void insertBoard(BoardVO board) {
		database.tb_board.add(board);
	}

	@Override
	public void selectBoardAndPrint(String key, String value) {//���� �� ��
		int cnt = 1;
		
		for (int i = 0 ; i < database.tb_board.size() ; i++){
			BoardVO board = database.tb_board.get(i);
			//������ �ı���ȸ
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
					System.out.println(" ��ǰ��ȣ : " + board.getProductId());
					System.out.println(" ���� : " + printStar(board.getStar()));
					System.out.println(" ���� : " + board.getContents());
					System.out.println(" �ۼ��� : " + board.getWriter());
					System.out.println(" ��¥ : " + board.getRegDate());
					System.out.println("-----------------------------------");
					cnt++;
					
/*					System.out.println(i + 1 + " ��ǰ��ȣ : " + board.getProductId() + "\t"
					+ "�Խ��� ��ȣ : " + board.getNo() + " ���� : " + board.getStar() + "\t"
					+ board.getContents() + "\t" + "�ۼ��� : "+ "\t"
					+ board.getWriter() + "��¥ : " + board.getRegDate() );
*/				}
			}
		}
		
//		return null;
	}
	
	@Override
	public void selectBoardAndPrint(String key, int value) {//��ǰ��
		for (int i = 0 ; i < database.tb_board.size() ; i++)
		{
			BoardVO board = database.tb_board.get(i);
			//��ǰ����ȸ
			if(key.equals("PROID"))
			{
				if(board.getProductId() == value)
				{
					System.out.println(i + 1 + " ��ǰ��ȣ : " + board.getProductId() + "\t"
						+ "�Խ��� ��ȣ : " + board.getNo() + " ���� : " + board.getStar() + "\t"
						+ board.getContents() + "\t" + "�ۼ��� : "+ "\t"
						+ board.getWriter() + "��¥ : " + board.getRegDate());
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
			System.out.println(" ��ǰ��ȣ : " + board.getProductId());
			System.out.println(" ���� : " + printStar(board.getStar()));
//			System.out.println(" ���� : " + board.getStar());
			System.out.println(" ���� : " + board.getContents());
			System.out.println(" �ۼ��� : " + board.getWriter());
			System.out.println(" ��¥ : " + board.getRegDate());
			System.out.println("-----------------------------------");
			
		}
		
	}
	
	public String printStar(int star){
		if(star == 1)
			return "��";
		else if(star == 2)
			return "�ڡ�";
		else if(star == 3)
			return "�ڡڡ�";
		else if(star == 4)
			return "�ڡڡڡ�";
		else if(star == 5)
			return "�ڡڡڡڡ�";
		else
			return "";
	}
	
/*	@Override
	public ArrayList<BoardVO> proSelectBoard() { 
		
		BoardService boardservice = BoardServiceImpl.getInstance();
		
		for(int i = 0; i < database.tb_board.size(); i ++){
			
			BoardVO board = database.tb_board.get(i);
			
			if(board.getNo() == boardservice.proBoardList.productId){// ���� �Է��� ���� = ��ǰ���̵�
				return database.tb_board;
			}
		}
		
		return null;
	}
*/
	
	
	
}
