package kr.or.ddit.board.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.utill.mybatis.MybatisUtill;

public class BoardDaoImpl implements BoardDao {

	@Override
	public List<Map<String, String>> selectBoardTest() {
		// mybatis �� ����� sqlȣ�� -->sqlSession --> sqlSessionFactory
		SqlSession sqlSession = MybatisUtill.getSqlSession();
		
		//DML ������ ���� ȣ�� �ϴ� �޼ҵ尡 �޶�����.
		//SELECT : 1. �ܰ� - selectOne("���ӽ����̽���.sqlid"[, ����])
		//		   2. ���� - selectList("���ӽ����̽���.sqlid"[, ����])
		//insert, update, delete (���� : sql�� ���� ������� row �Ǽ�) 
		//insert : insert("���ӽ����̽���.sqlid"[, ����])
		//update : update("���ӽ����̽���.sqlid"[, ����])
		//delete : delete("���ӽ����̽���.sqlid"[, ����])
		
		List<Map<String, String>> boardList = 
		sqlSession.selectList("board.selectBoardTest");

		//�ڿ� ����� ���� �ݳ�. (�ڿ� = Session)
		sqlSession.close();
		return boardList;
		
		//dao - service - controller(������� �Է�) - main
	}

}
