package dao;

import java.util.ArrayList;
import java.util.HashMap;

import vo.CategoryVO;
import vo.UserVO;

public interface CategoryDao {

	void insertCategory(CategoryVO category);	

	CategoryVO selectCategory(String key, int value);

	CategoryVO selectCategory(HashMap<String, String> param);

	ArrayList<CategoryVO> selectCategoryList(); 
	

}
