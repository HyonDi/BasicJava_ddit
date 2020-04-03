package dao;

import java.util.ArrayList;

import vo.CartVO;
import vo.PayListVO;
import vo.PayVO;
import vo.UserVO;
import data.Database;

public class PayDaoImpl implements PayDao{

	private static PayDaoImpl instance;
	
	private PayDaoImpl(){}
	
	public static PayDaoImpl getInstance(){
		if(instance == null){
			instance = new PayDaoImpl();
		}
		return instance;
	}


	Database database = Database.getInstance();
	
	@Override
	public void insertPay(PayListVO pay) {
		database.tb_pay.add(pay);
	}

	@Override
	public ArrayList<PayListVO> selectPayList() {
		return database.tb_pay;
	}


	@Override
	public void insertPay(PayVO pay) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PayVO selectBoard() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PayListVO selectCategoryToPay(String key, int value) {
		for( int i = 0 ; i < database.tb_pay.size() ; i++)
		{
			PayListVO payList = database.tb_pay.get(i);
			
			if(key.equals("ID"))
			{
				if(payList.getProductId() == value )
				{
					return payList;
				}
			}
		}
		
		return null;
	}
	
	
	
//	private static PayDaoImpl instance;
//	
//	private PayDaoImpl(){}
//	
//	public static PayDaoImpl getInstance(){
//		if(instance == null){
//			instance = new PayDaoImpl();
//		}
//		return instance;
//	}
//
//
//	Database database = Database.getInstance();
//	
//	@Override
//	public void insertPay(PayVO pay) {
//		database.tb_pay.add(pay);
//	}
//
//	@Override
//	public ArrayList<PayVO> selectPayList() {
//		return database.tb_pay;
//	}
//
//	@Override
//	public PayVO selectBoard() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	
}
