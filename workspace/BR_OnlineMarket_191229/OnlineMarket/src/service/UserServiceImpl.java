package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import vo.CategoryVO;
import vo.UserVO;
import controller.Controller;
import dao.CategoryDao;
import dao.CategoryDaoImpl;
import dao.UserDao;
import dao.UserDaoImpl;
import data.Session;

public class UserServiceImpl implements UserService {
	
	private static UserServiceImpl instance;
	
	private UserServiceImpl(){}
	
	public static UserServiceImpl getInstance(){
		if(instance == null){
			instance = new UserServiceImpl();
		}
		return instance;
	}
	
	UserDao userDao = UserDaoImpl.getInstance();
	CategoryDao categoryDao = CategoryDaoImpl.getInstance();	//hh.joo 20191225 add
//	CartDao cartDao = CartDaoImpl.getInstance();				//hh.joo 20191226 add

	
	@Override
	public void join() {
		Scanner s = new Scanner(System.in);
		
		UserVO user = new UserVO();
		
		Pattern p;
		Matcher m;
		
		System.out.println("ID : ");
		String id = s.nextLine();
		do{
			String regexId = "(\\w|_*|-*){5,20}";
			p = Pattern.compile(regexId);
			m = p.matcher(id);
			if(m.matches() == true){
				user.setId(id);
			}else{
				System.out.println("Use Only 5-20 English uppercase letters, lowercase letters, numbers, and special symbols (_), (-).");
				System.out.println("ID : ");
				id = s.nextLine();
			}
		}while(m.matches() != true);
		
		
		System.out.println("PASSWORD : ");
		String password = s.nextLine();
		do{
			String regexPass = "^(?=.*\\d)(?=.*[~`!@#$%\\^&*()-])(?=.*[a-z])(?=.*[A-Z]).{8,16}$";
			p = Pattern.compile(regexPass);
			m = p.matcher(password);
			if(m.matches() == true){
				user.setPassword(password);
			}else{
				System.out.println("Use 8 to 16 English uppercase letters, lowercase letters, numbers, and special characters.");
				System.out.println("PASSWORD : ");
				password = s.nextLine();
			}
		}while(m.matches() != true);
		
		
		System.out.println("NAME : ");
		String name = s.nextLine();
		user.setName(name);
		
		
//		System.out.println("EMAIL : ");
//		String email = s.nextLine();
//		do{
//			String regexEmail = "[a-z0-9_-]{5,20}@[a-zA-Z]+\\.(?i)(com|net|org|([a-z]{2}\\.kr))$";
//			p = Pattern.compile(regexEmail);
//			m = p.matcher(email);
//			if(m.matches() == true){
//				user.setEmail(email);
//			}else{
//				System.out.println("This is not a valid email address.");
//				System.out.println("EMAIL : ");
//				email = s.nextLine();
//			}
//		}while(m.matches() != true);
		
		
		System.out.println("PHONE NUMBER : ");
		String phone = s.nextLine();
		do{
			String regexPhone = "^0\\d{1,3}-\\d{3,4}-\\d{4}";
			p = Pattern.compile(regexPhone);
			m = p.matcher(phone);
			if(m.matches() == true){
				user.setPhoneNumber(phone);
			}else{
				System.out.println("The number does not fit.");
				System.out.println("PHONE NUMBER : ");
				phone = s.nextLine();
			}
		}while(m.matches() != true);
		
		
		System.out.println("ADDRESS : ");
		String address = s.nextLine();
		user.setAddress(address);
		
		
		UserVO userCheck = userDao.selectUser("ID", user.getId());
		if(userCheck == null){
			user.setUserGrade(1);
			userDao.insertUser(user);
			System.out.println("Thank you for signing up.");
		}else{
			System.out.println("This ID is already in use or has been withdrawn.");
			System.out.println("ID : ");
			id = s.nextLine();
		}
	}

	@Override
	public void login() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("ID : ");
		String id = s.nextLine();
		System.out.println("PASSWORD : ");
		String password = s.nextLine();
		
		HashMap<String, String> param = new HashMap<String, String>();
		param.put("ID", id);
		param.put("PASSWORD", password);
		
		UserVO user = userDao.selectUser(param);
		
		if(user == null){
			System.out.println("You have entered the wrong ID or password.");
			//Session.isLogin = false;	//hh.joo 20191225 add
		}
		else{
			Session.loginUser = user;
			System.out.println("Login Successful.");
			System.out.println("Hello! > " + user.getName());
			//Session.isLogin = true;		//hh.joo 20191225 add
		}
	}

//	@Override
//	public void orderList() { ///////////////////add orderList
//		ArrayList<UserVO> orderList = userDao.selectOrderList();
//		
//	}
	

	@Override
	public void insertBoard() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printBoard() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void printMyPage() { //br.20191229 add
		ArrayList<UserVO> userList = userDao.selectUserList();
		UserVO user = Session.loginUser;
	
			if(user.getUserGrade() == 1){
			System.out.println("------------My Page---------");
			System.out.println("Grade : " + user.getUserGrade());
			System.out.println("Id : " + user.getId());
			System.out.println("Name : " + user.getName());
			System.out.println("Phone Number : " + user.getPhoneNumber());
			System.out.println("Address : " + user.getAddress());
			System.out.println("---------------------------");
			
			}
			else{
			 Scanner s = new Scanner(System.in);
			 int menu;

			 do{
				 System.out.println("----------관리자 전용 메뉴 (Manager Menu)---------");
				 System.out.println("1. 카테고리 추가/삭제  (Categorie Add/Delete)");
				 System.out.println("2. 상품 추가/삭제 (Product Delete)");
				 System.out.println("3. 회원 리스트 조회/삭제 (User Check/Delete)");
				 System.out.println("4. 후기 삭제  (Review Delete)");
				 System.out.println("0. 메인 메뉴로 돌아가기 (Main Menu)");
				 System.out.println("-------------------------------------------");
				 System.out.println("Please Select >>");
				 
				 menu = Integer.parseInt(s.nextLine());

				 switch (menu) {
				 case 1:
					 //카테고리 추가/삭제 필요
					break;
					 
				 case 2:
					 //상품 추가/삭제 기능 필요
					CategoryVO delProduct = new CategoryVO();
					ArrayList<CategoryVO> productList = categoryDao.selectCategoryList();
					
					System.out.println("삭제할 상품 ID를 입력해주세요. (Insert product name to delete.)");
					int productId = Integer.parseInt(s.nextLine());
					
					//기존에 저장되어있는건 삭제되는데 새로 추가한건 삭제가 안됨...					
					CategoryVO productCheck = categoryDao.selectCategory("ID", productId);
					if (productCheck == null) {
						System.out.println("존재하지 않는 상품 ID입니다.");
					} else {
						for (int i = 0; i < productList.size()-1; i++) {
							delProduct = productList.get(i);
							if (delProduct.getProductId() == productId) {
								productList.remove(i);
								System.out.println("삭제되었습니다.");
							}
						}
					}
					 break;

				 case 3:
					 printUserList();
					 break;
					 
				 case 4:
					 //후기 삭제 기능 필요
					 break;
					 
				 case 0:
					 new Controller();
					 break;
				 
				 default :
					break;

					}
			 	}while(menu != 0);
			}
	}

	
	@Override
	public void printUserList() { //br.20191229 add
		ArrayList<UserVO> userList = userDao.selectUserList();
		Scanner s = new Scanner(System.in);
		int menu;

		 do{
			 System.out.println("----------관리자 전용 메뉴 (Manager Menu)---------");
			 System.out.println("1. 회원 조회 (UserList Check");
			 System.out.println("2. 회원 삭제 (User Delete)");
			 System.out.println("0. 관리자 메뉴로 (Manager Menu)");
			 System.out.println("--------------------------------------------");
			 System.out.println("Please Select >>");
			 
			 menu = Integer.parseInt(s.nextLine());

			 switch (menu) {
			 case 1:
					System.out.println("-------회원 조회 (UserList Check)-------");
					System.out.println("번호\t아이디\t이름");
					System.out.println("------------------------------------");
					for(int i = userList.size() -1; 0 <= i; i--){
						UserVO user = userList.get(i);
						System.out.println(i + 1 + "\t" + user.getId() + "\t" + user.getName());
					}
					System.out.println("------------------------------------");
				 break;
				 
			 case 2:
				UserVO user = new UserVO();
				System.out.println("삭제할 회원 ID를 입력해주세요.");
				String id = s.nextLine();

				UserVO userCheck = userDao.selectUser("ID", id);
				if(userCheck == null){
					System.out.println("존재하지 않는 회원 ID입니다.");
				}else{
					for(int i = 0; i < userList.size(); i++){
					user = userList.get(i);
					if(user.getId().equals(id)){
					userList.remove(i);
					System.out.println("삭제되었습니다.");
					}
				}
				}
				 break;
				
			 case 0:
				 printMyPage();
				 break;
			 			 
			 default :
				break;

				}
		 	}while(menu != 0);
	}

	@Override
	public void managerMode() { //br.20191229 add
/*		ArrayList<UserVO> userList = userDao.selectUserList();
		Scanner s = new Scanner(System.in);
		
		System.out.println("삭제할 회원 ID를 입력해주세요.");
		String id = s.nextLine();
		userList.remove(id);
		
		System.out.println("삭제되었습니다.");
*/		
		
	}
	
	
	
	
//	//hh.joo 20191225 add
//	@Override
//	public void addCategory() {
//		
//		//hh.joo 20191226 add
//		CategoryVO category = new CategoryVO();
//		UserVO user = Session.loginUser;			//session
//
//		if(user == null)
//		{
//			System.out.println("로그인을 먼저 해주세요!");
//			return;
//		}
//
//		Scanner s = new Scanner(System.in);
//
//		//to verify UserId before add category
////		UserVO user = new UserVO();
////		
////		System.out.println("input user ID! >>>");
////		String id = s.nextLine();
////		user.setId(id);
////				
////		UserVO userCheck = userDao.selectUser("ID", user.getId());
//
//		String userId;
//		userId = user.getId();
//		category.setUserId(userId);
//		
//		int CategoryId;	
//		System.out.println("(int) 카테고리 아이디를 입력해주세요>>>");
//		CategoryId = Integer.parseInt(s.nextLine()); 
//		category.setCategoryId(CategoryId);
//		
//		//need to check pk categoryId ///////////////////////////////
//
//		int iBigCode;
//		System.out.println("(int) 대분류 코드를 입력해주세요>>>");
//		iBigCode = Integer.parseInt(s.nextLine()); 
//		category.setBigCode(iBigCode);
//		
//		int iMidCode;
//		System.out.println("(int) 중분류 코드를 입력해주세요>>>");
//		iMidCode = Integer.parseInt(s.nextLine()); 
//		category.setMidCode(iMidCode);
//		
////		int iSmallCode;
////		iSmallCode = Integer.parseInt(s.nextLine()); 
////		category.setSmallCode(iBigCode);
//		
//		int productId;
//		System.out.println("(int)상품 아이디를 입력해주세요>>>");
//		productId = Integer.parseInt(s.nextLine());
//		category.setProductId(productId);
//		
//		String productName;
//		System.out.println("상품명을 입력해주세요>>>");
//		productName = s.nextLine();
//		category.setProductName(productName);
//		
//		String productExplain;
//		System.out.println("상품 설명을 입력해주세요>>>");
//		productExplain = s.nextLine();
//		category.setProductExplain(productExplain);
//		
//		String productRegDate;
//		System.out.println("날짜를 입력해주세요>>>");
//		
//		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
//		Date time = new Date();
//		productRegDate = format1.format(time);
//		category.setProductRegDate(productRegDate);
//		
//		categoryDao.insertCategory(category);
//	}

	
//	//hh.joo 20191225 add
//	@Override
//	public void printCategoryList() {
//		ArrayList<CategoryVO> categoryList = categoryDao.selectCategoryList();
//		
//		System.out.println("------------------------------");
//		System.out.println("-------printCategoryList------");
//		System.out.println(">>>\t>>>\t>>>");
//		System.out.println("------------------------------");
//		for(int i = categoryList.size() - 1; 0 <= i; i--){
//			CategoryVO category = categoryList.get(i);
//			System.out.println( /*(i + 1)":"*/ "[id:" + category.getCategoryId() + "]" + "\t|" +category.getBigCode() + "|" + category.getMidCode() + "|" + category.getSmallCode() + 
//					"|" +  category.getUserId() + "|" + category.getProductId() + "|" + 
//					category.getProductName() + "|" + category.getProductExplain() + "|" + category.getProductRegDate()); 
//		}
//		System.out.println("------------------------------");		
//	}

//	//hh.joo 20191226 add
//	@Override
//	public void addToCart() {
//		CartVO cart = new CartVO();
//		UserVO user = Session.loginUser;					//session
//		CategoryVO category = new CategoryVO();
//		
//		printCategoryList();	//print selling product list 
//		
//		if(user == null)
//		{
//			System.out.println("로그인을 먼저 해주세요!");
//			return;
//		}
//
//		String userId;
//		userId = user.getId();
//		cart.setUserId(userId);
//		
//		Scanner s = new Scanner(System.in);
//		
//		int productId;	
//		System.out.println("상품id를 선택해주세요 > Select Product id >>>");
//		productId = Integer.parseInt(s.nextLine()); 
//		cart.setProductId(productId);
//		
//		//CartVO cartCheck = cartDao.selectCart("ID", cart.getCartId());
//		//ProductVO productCheck = productDao.selectProduct("ID", product.getProductId());
//		CategoryVO categoryCheck = categoryDao.selectCategory("ID", category.getCategoryId());
//				
//		if(categoryCheck == null){ 
//			System.out.println("Please, Check Product Id\n Cannot match Product Id");
//		}
//		else{
//			System.out.println("(int) 장바구니 Id를 입력해주세요 > Please Input Cart Id >>>");
//			int iCartId;
//			iCartId = Integer.parseInt(s.nextLine());
//			cart.setCartId(iCartId);
//			
//			System.out.println("수량을 입력해주세요 > Input Product Quantity >>>");
//			int iQuantity;
//			iQuantity = Integer.parseInt(s.nextLine());
//			cart.setQuantity(iQuantity);
//			
//			cartDao.insertCart(cart);
//			
//		}
//	}

//	//hh.joo 20191226 add
//	@Override
//	public void printCartList() {
//		ArrayList<CartVO> cartList = cartDao.selectCartList();
//
//		System.out.println("------------------------------");
//		System.out.println("-------printCartList------");
//		System.out.println(">>>\t>>>\t>>>");
//		System.out.println("------------------------------");
//		for(int i = cartList.size() - 1; 0 <= i; i--){
//			CartVO cart = cartList.get(i);
//			System.out.println( /*(i + 1)":"*/ "[id:" + cart.getCartId() + "]" + 
//			"\t|" +cart.getUserId() + "|" + cart.getQuantity() + "|" + cart.getProductId() ); 
//					 
//		}
//		System.out.println("------------------------------");		
//	}

}











