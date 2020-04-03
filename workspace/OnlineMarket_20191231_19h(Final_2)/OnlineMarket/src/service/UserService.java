package service;

public interface UserService {
	void join();		
	
	void login(); 		
	
	// void userList();	null 1230 delete
	
	void insertBoard();	//hh.joo 20191224 add

	void printBoard();	//hh.joo 20191224 add
	
	
	void printUserList(); //br.20191230 modify userList -> printUserList	
	
	void printMyPage(); //br.20191230 add
	
	void managerMode(); //br.20191229 add
	
	
	
	
	
	
//	void addCategory();	//hh.joo 20191226 add 
//		
//	void printCategoryList();	//hh.joo 20191226 add
//	
//	void addToCart();	//hh.joo 20191226 add
//	
//	void printCartList();	//hh.joo 20191226 add
	
}
