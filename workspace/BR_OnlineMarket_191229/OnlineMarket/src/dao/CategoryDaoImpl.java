package dao;

import vo.CategoryVO;
import vo.UserVO;

import java.util.ArrayList;
import java.util.HashMap;

import data.Database;

//hh.joo 20191225 add
public class CategoryDaoImpl implements CategoryDao{
	//reference : 11st.co.kr : main display
	/*
	 * |bigCode				|midCode		|smallCode		|productName
	 * |0:brand fashion		|0:brand female |0:one-piece	|
	 * |0:brand fashion		|0:brand female |1:blouse		|
	 * |0:brand fashion		|0:brand female |2:t-shirt		|
	 * |1:clothes			|				|		|
	 * |2:beauty			|				|		|
	 * |3:leisure/car		|				|		|
	 * |4:food				|				|		|
	 * |5:baby				|				|		|
	 * |6:life/health		|				|		|
	 * |7:furniture			|				|		|
	 * |8:digital			|				|		|
	 * |9:book/pet			|				|		|
	 * |10:trip				|				|		|
	 */
	
	private static CategoryDaoImpl instance;
	
	private CategoryDaoImpl(){}
	
	public static CategoryDaoImpl getInstance() {
		
		if(instance == null)
		{
			instance = new CategoryDaoImpl();
		}
		
		return instance;
	}
		
	Database database = Database.getInstance();

	//hh.joo 20191225 add
	@Override
	public void insertCategory(CategoryVO category) {
		database.tb_category.add(category);
	}

	//hh.joo 20191225 add
	@Override
	public ArrayList<CategoryVO> selectCategoryList() {
		return database.tb_category;
	}

	@Override
	public CategoryVO selectCategory(String key, int value) {
		
		for(int i = 0 ; i < database.tb_category.size(); i++)
		{
			CategoryVO category = database.tb_category.get(i);
			
			if(key.equals("ID"))
			{
				if(category.getCategoryId() == value)
				{
					return category;
				}
			}
		}
		
		return null;
	}

	@Override
	public CategoryVO selectCategory(HashMap<String, String> param) {
		// TODO Auto-generated method stub
		return null;
	} 
	
	
//	//hh.joo 20191225 add
//	@Override
//	public CategoryVO selectCategory(String key, String value) {
//		for (int i = 0 ; i < database.tb_category.size() ; i++)
//		{
//			CategoryVO category = database.tb_category.get(i);
//			
//			if(key.equals("categoryId"))
//			{
//				if(category.getCategoryId().equals(value))
//				{
//					return category;
//				}
//			}
//
//		}
//			
//		return null;
//	}
	
	
}
