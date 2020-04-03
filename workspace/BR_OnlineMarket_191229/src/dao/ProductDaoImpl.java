package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import vo.ProductVo;

public class ProductDaoImpl implements ProductDao {
private static ProductDaoImpl instance;
	
	private ProductDaoImpl(){}
	
	public static ProductDaoImpl getInstance(){
		if(instance == null){
			instance = new ProductDaoImpl();
		}
		return instance;
	}
	
	ProductDatabase database = ProductDatabase.getInstance();
	
	
	@Override
	public ProductVo selectProduct(String key, String value) {	
		return null;
	}

	@Override
	public void insertProduct(ProductVo product) {
		database.tb_product.add(product);
	}

	@Override
	public ProductVo selectProduct(HashMap<String, String> param) {
		ProductVo rtnProduct = null;
		for(int i = 0; i < database.tb_product.size(); i++){
			ProductVo product = database.tb_product.get(i);
			boolean flag = true;
			Set<String> keys = param.keySet();
			for(String key : keys){
				String value = param.get(key);
				if(key.equals("ID")){
					if(!product.getProductid().equals(value)) flag = false;
				}else if(key.equals("PASSWORD")){
					if(!product.getName().equals(value)) flag = false;
				}
			}
			if(flag) rtnProduct = product;
		}
		return rtnProduct;
	}

	@Override
	public ArrayList<ProductVo> selectProductList() {
		
		return database.tb_product;
	}
}
	
	

