package service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import vo.CartVO;
import vo.CategoryVO;
import vo.UserVO;
import data.Session;
import dao.CartDao;
import dao.CartDaoImpl;
import dao.CategoryDao;
import dao.CategoryDaoImpl;
import dao.UserDao;
import dao.UserDaoImpl;


public class CartServiceImpl implements CartService{

	private static CartServiceImpl instance;
	
	private CartServiceImpl(){}
	
	public static CartServiceImpl getInstance(){
		if(instance == null){
			instance = new CartServiceImpl();
		}
		return instance;
	}
	
	UserDao userDao = UserDaoImpl.getInstance();
	CategoryDao categoryDao = CategoryDaoImpl.getInstance();	//hh.joo 20191225 add
	CartDao cartDao = CartDaoImpl.getInstance();				//hh.joo 20191226 add

	
	//hh.joo 20191226 add
	@Override
	public void addToCart() {			//장바구니에 상품 담기 
		CartVO cart = new CartVO();
		UserVO user = Session.loginUser;					//session
		CategoryVO category = new CategoryVO();
		ArrayList<CartVO> cartList = cartDao.selectCartList();

		//remove
		//printCategoryList();	//print selling product list 
		
		if(user == null)
		{
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println("!!!!!!!!!!PLEASE LOG-IN !!!!!!!!!!!!!");
			System.out.println("!!!!!!!!!!로그인을 먼저 해주세요!!!!!!!!!!!");
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			return;
		}

		String userId;
		userId = user.getId();
		cart.setUserId(userId);
		
		Scanner s = new Scanner(System.in);
		
		int productId;	
		System.out.println("상품id를 선택해주세요 > Select Product id >>>");
		productId = Integer.parseInt(s.nextLine());
		cart.setProductId(productId);
		
		//CartVO cartCheck = cartDao.selectCart("ID", cart.getCartId());
		//ProductVO productCheck = productDao.selectProduct("ID", product.getProductId());
		CategoryVO categoryCheck = categoryDao.selectCategory("ID", category.getCategoryId());
				
		if(categoryCheck == null){ 
			System.out.println("Please, Check Product Id\n Cannot match Product Id");
		}
		else{
			int iCartId = cartList.size();		//Cart Id++ //Cart Id 순차적으로 증가시켜 저장  
//			System.out.println("iCartID >>>" + iCartId);
//			iCartId = Integer.parseInt(s.nextLine());
			cart.setCartId(iCartId);
			
			System.out.println("상품 수량을 입력해주세요 > Input Product Quantity >>>");
			int iQuantity;
			iQuantity = Integer.parseInt(s.nextLine());
			cart.setQuantity(iQuantity);
			
			cartDao.insertCart(cart);
			
		}
	}

	//hh.joo 20191226 add
	@Override
	public void printCartList() {
		UserVO user = Session.loginUser;					//session
		if(user == null)
		{
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println("!!!!!!!!!!PLEASE LOG-IN !!!!!!!!!!!!!");
			System.out.println("!!!!!!!!!!로그인을 먼저 해주세요!!!!!!!!!!!");
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			return;
		}
		
		ArrayList<CartVO> cartList = cartDao.selectCartList();

		System.out.println("--------------------------------------------------");
		System.out.println("-------printCartList------------------------------");
		System.out.println("--------------------------------------------------");
		for(int i = cartList.size() - 1; 0 <= i; i--){
			CartVO cart = cartList.get(i);
			System.out.println( /*(i + 1)":"*/ "[Cart id:" + cart.getCartId() + "]" + "\t|" + "prd id:" + cart.getProductId() +
					"[User id:" + cart.getUserId() + "|" + "qty:" + cart.getQuantity() + "]"); 
					 
		}
		System.out.println("--------------------------------------------------");
		System.out.println("--------------------------------------------------");
		System.out.println("--------------------------------------------------");
	}
}
