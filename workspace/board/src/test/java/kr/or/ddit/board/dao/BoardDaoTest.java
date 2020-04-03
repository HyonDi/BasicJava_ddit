package kr.or.ddit.board.dao;

import java.util.List;
import java.util.Map;

public class BoardDaoTest {

	public static void main(String[] args) {
		// boardDaoImpl 클래스의 selectBoardTest 메소드가 정상적으로 동작하는지 확인
		// 필요한 것 : boardDaoImpl 의 인스턴스.
		//			select BoardTest 인자  ? -> 준비할게없다.
		// 리턴타입 : List<Map<String, String>>
		// board_test 데이터 건수? 11건. list 사이즈가 11건이어야 한다.
		
		
		BoardDao boardDao = new BoardDaoImpl();
		List<Map<String, String>> boardList =  boardDao.selectBoardTest();
		
		if(boardList.size() == 11){
			System.out.println("성공");
			System.out.println(boardList);
		}else{
			System.out.println("실패");
		}
	}

}
