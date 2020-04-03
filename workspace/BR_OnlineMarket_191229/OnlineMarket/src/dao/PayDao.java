package dao;

import java.util.ArrayList;

import vo.BoardVO;
import vo.CartVO;
import vo.PayListVO;
import vo.PayVO;



public interface PayDao {
	
	PayVO selectBoard();
	
	ArrayList<PayListVO> selectPayList();

	
	void insertPay(PayVO pay);
	
	void insertPay(PayListVO pay);

	PayListVO selectCategoryToPay(String key, int value);		//hh.joo 20191227 add
	
//	CartVO selectCart(String key, int value);
}
