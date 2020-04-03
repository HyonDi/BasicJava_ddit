package dao;

import java.util.ArrayList;
import java.util.HashMap;

import vo.BoardVO;
import vo.UserVO;

public interface BoardDao {
	
//	BoardVO selectBoard();
	
//	ArrayList<BoardVO> proSelectBoard();

	ArrayList<BoardVO> selectBoardList(); //��ü�ı���
	
	void insertBoard(BoardVO board); //�ı⾲��
	
	void selectBoardAndPrint(String key, String value);// ������ ��
	
	void selectBoardAndPrint(String key, int value); //��ǰ��
	
	void boardListAll();
	
	String printStar(int star);
}
