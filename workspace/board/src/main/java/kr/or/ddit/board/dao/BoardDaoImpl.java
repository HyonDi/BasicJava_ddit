package kr.or.ddit.board.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.utill.mybatis.MybatisUtill;

public class BoardDaoImpl implements BoardDao {

	@Override
	public List<Map<String, String>> selectBoardTest() {
		// mybatis 에 선언된 sql호출 -->sqlSession --> sqlSessionFactory
		SqlSession sqlSession = MybatisUtill.getSqlSession();
		
		//DML 유형에 따라 호출 하는 메소드가 달라진다.
		//SELECT : 1. 단건 - selectOne("네임스페이스명.sqlid"[, 인자])
		//		   2. 복수 - selectList("네임스페이스명.sqlid"[, 인자])
		//insert, update, delete (리턴 : sql에 의해 영향받은 row 건수) 
		//insert : insert("네임스페이스명.sqlid"[, 인자])
		//update : update("네임스페이스명.sqlid"[, 인자])
		//delete : delete("네임스페이스명.sqlid"[, 인자])
		
		List<Map<String, String>> boardList = 
		sqlSession.selectList("board.selectBoardTest");

		//자원 사용한 이후 반납. (자원 = Session)
		sqlSession.close();
		return boardList;
		
		//dao - service - controller(사용자의 입력) - main
	}

}
