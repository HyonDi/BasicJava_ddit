package service;

import java.util.*;

public interface CategoryService {

	void addCategory();
		
	void printCategoryList();
	
	void searchCategoryWithKeyword(String key);
	
	int getCategorySize();	//hh.joo 20191227 add
	
	void searchFunction();	//hh.joo 20191227 test
	
	String printProductName(int productId);
}
