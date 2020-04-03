package dao;

import java.util.ArrayList;
import java.util.HashMap;

import vo.BoardVO;

public interface BoardDao {
	
	BoardVO selectBoard();

	ArrayList<BoardVO> selectBoardList();
	
	void insertBoard(BoardVO board);

}
