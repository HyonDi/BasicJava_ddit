package kr.or.ddit.board.dao;

import java.util.List;
import java.util.Map;

public class BoardDaoTest {

	public static void main(String[] args) {
		// boardDaoImpl Ŭ������ selectBoardTest �޼ҵ尡 ���������� �����ϴ��� Ȯ��
		// �ʿ��� �� : boardDaoImpl �� �ν��Ͻ�.
		//			select BoardTest ����  ? -> �غ��ҰԾ���.
		// ����Ÿ�� : List<Map<String, String>>
		// board_test ������ �Ǽ�? 11��. list ����� 11���̾�� �Ѵ�.
		
		
		BoardDao boardDao = new BoardDaoImpl();
		List<Map<String, String>> boardList =  boardDao.selectBoardTest();
		
		if(boardList.size() == 11){
			System.out.println("����");
			System.out.println(boardList);
		}else{
			System.out.println("����");
		}
	}

}
