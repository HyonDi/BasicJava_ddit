package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import data.Database;
import vo.BoardVO;
import vo.UserVO;

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
	
	@Override
	public BoardVO selectBoard() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<BoardVO> selectBoardList() {
		return database.tb_board;
	}

	
	@Override
	public void insertBoard(BoardVO board) {
		database.tb_board.add(board);
	}

	
	
	
}
