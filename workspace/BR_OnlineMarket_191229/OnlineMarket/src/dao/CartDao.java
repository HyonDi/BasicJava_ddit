package dao;

import vo.CartVO;
import vo.CategoryVO;
import vo.UserVO;

import java.util.ArrayList;
import java.util.HashMap;

public interface CartDao {
	
	void insertCart(CartVO cart);	

	CartVO selectCart(String key, int value);
	
	ArrayList<CartVO> selectCartList(); 

}
