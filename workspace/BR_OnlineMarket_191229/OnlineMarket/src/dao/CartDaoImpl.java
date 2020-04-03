package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import vo.CartVO;
import data.Database;

public class CartDaoImpl implements CartDao{
	
	private static CartDaoImpl instance;
	
	private CartDaoImpl(){}
	
	public static CartDaoImpl getInstance() {
		
		if(instance == null)
		{
			instance = new CartDaoImpl();
		}
		
		return instance;
	}
		
	Database database = Database.getInstance();
	
	//hh.joo 20191226 add
	@Override
	public void insertCart(CartVO cart) {
//		database.tb_category.add(cart);
		database.tb_cart.add(cart);
	}

	//hh.joo 20191226 add
	@Override
	public CartVO selectCart(String key, int value) {
		for( int i = 0 ; i < database.tb_cart.size() ; i++)
		{
			CartVO cart = database.tb_cart.get(i);
			
			if(key.equals("ID"))
			{
				if(cart.getCartId() == value )
				{
					return cart;
				}
			}
		}
		
		return null;
	}
	
	//hh.joo 20191226 add
	@Override
	public ArrayList<CartVO> selectCartList() {
		return database.tb_cart;
	}
	
}
