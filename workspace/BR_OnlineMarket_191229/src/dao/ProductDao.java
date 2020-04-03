package dao;

import java.util.ArrayList;
import java.util.HashMap;

import vo.ProductVo;

public interface ProductDao {

	ProductVo selectProduct(String key, String value);

	void insertProduct(ProductVo product);

	ProductVo selectProduct(HashMap<String, String> param);

	ArrayList<ProductVo> selectProductList();

	
	
}
