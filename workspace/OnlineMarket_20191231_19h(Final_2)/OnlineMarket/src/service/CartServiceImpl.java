package service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.sun.jndi.url.corbaname.corbanameURLContextFactory;

import vo.BoardVO;
import vo.CartVO;
import vo.CategoryVO;
import vo.PayListVO;
import vo.UserVO;
import data.Session;
import dao.CartDao;
import dao.CartDaoImpl;
import dao.CategoryDao;
import dao.CategoryDaoImpl;
import dao.PayDao;
import dao.PayDaoImpl;
import dao.UserDao;
import dao.UserDaoImpl;

public class CartServiceImpl implements CartService {

	private static CartServiceImpl instance;

	private CartServiceImpl() {
	}

	public static CartServiceImpl getInstance() {
		if (instance == null) {
			instance = new CartServiceImpl();
		}
		return instance;
	}

	UserDao userDao = UserDaoImpl.getInstance();
	CategoryDao categoryDao = CategoryDaoImpl.getInstance(); // hh.joo 20191225
																// add
	CartDao cartDao = CartDaoImpl.getInstance(); // hh.joo 20191226 add
	PayDao PayDao = PayDaoImpl.getInstance(); // null 1229

	CategoryService categoryService = CategoryServiceImpl.getInstance();
		
	// hh.joo 20191226 add
	@Override
	public void addToCart() { // 장바구니에 상품 담기
		CartVO cart = new CartVO();
		UserVO user = Session.loginUser; // session
		CategoryVO category = new CategoryVO();
		ArrayList<CartVO> cartList = cartDao.selectCartList();

		// remove
		// printCategoryList(); //print selling product list

		if (user == null) {
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

		// int productId;
		// System.out.println("상품id를 선택해주세요 > Select Product id >>>");
		// productId = Integer.parseInt(s.nextLine());
		// cart.setProductId(productId);
		// CategoryVO categoryCheck = categoryDao.selectCategory("ID",
		// category.getCategoryId());

		// hh.joo 20191229 change
		int categoryId;
		System.out.println("상품id를 선택해주세요.");
		categoryId = Integer.parseInt(s.nextLine());
		// cart.setProductId(categoryId);

		// System.out.println("(getCategoryId) Test > " + categoryId);
		CategoryVO categoryCheck = categoryDao.selectCategory("ID", categoryId);
		// hh.joo 20191229 change end

		if (categoryCheck == null) {
			System.out
					.println("존재하지 않는 id입니다");
		} else {
			int iCartId = cartList.size(); // Cart Id++ //Cart Id 순차적으로 증가시켜 저장
			// System.out.println("iCartID >>>" + iCartId);
			// iCartId = Integer.parseInt(s.nextLine());
			cart.setCartId(iCartId);

			cart.setProductId(categoryId); // hh.joo 20191229 add product id

			
			//null 1231 장바구니에 넣을 수량 품목란에서 비교해보기
			int count = 0;
			boolean countCheck = false;
			System.out.println("고객님이 선택하신 상품은" +  categoryCheck.getProductQuantity() + "개의 재고가 남아있습니다.." );
			do{
					System.out.println("장바구니에 넣을 상품 수량를 선택해주세요.");	
					count = Integer.parseInt(s.nextLine()); // 구매 수량 입력
					if(categoryCheck.getProductQuantity() - count < 0){
					System.out.println("상품 수량이 부족합니다.");
					System.out.println("모두 구매하시겠습니까? Y/N");
					String answer = s.nextLine();
							if (answer.equals("Y") || answer.equals("y")) {
							count = categoryCheck.getProductQuantity();
							//categoryCheck.setProductQuantity(0);
								break;
							}
							else if(answer.equals("n")){
								countCheck = true;
							}
					}
					else if(categoryCheck.getProductQuantity() - count >= 0){
								break;
					}
				}while(countCheck == true);
			
			cart.setQuantity(count);

			cartDao.insertCart(cart);
			
	
			// null 1229
			System.out.println("장바구니에서 구매를 진행하시겠습니까?");
			String shopping = s.nextLine();

			if (shopping.equals("Y") || shopping.equals("y")
					|| shopping.equals("네")) {

				shoppingCart();
			} else {
				System.out.println("메인 화면으로 갑니다.");
				System.out.println();
			}

		}
	}
	


	// hh.joo 20191226 add
	@Override
	public void printCartList() {
		UserVO user = Session.loginUser; // session
		if (user == null) {
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println("!!!!!!!!!!PLEASE LOG-IN !!!!!!!!!!!!!");
			System.out.println("!!!!!!!!!!로그인을 먼저 해주세요!!!!!!!!!!!");
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			return;
		}

		ArrayList<CartVO> cartList = cartDao.selectCartList();
		
//		CartVO cartVO = cartDao.selectCart(key, value)
	
		System.out.println("--------------------------------------------");
		System.out.println("------------------장바구니--------------------");
		System.out.println("--------------------------------------------");
		
		for (int i = cartList.size() - 1; 0 <= i; i--) {
			CartVO cart = cartList.get(i);
			
			System.out.println("상품id : " + cart.getProductId());
//			CategoryVO categoryObj = categoryDao.selectCategory("ID", cart.getProductId());
//			String strProductNameTemp = categoryObj.getProductName();
//			System.out.println("상품이름 : " + strProductNameTemp);
			String strProductName = categoryService.printProductName(cart.getProductId());
			
			System.out.println( /* (i + 1)":" */
					"<" + (i+1) + ">" 
					+ "\n|장바구니 번호 : " + cart.getCartId()
					+ "\n|" + "상품 id : " + cart.getProductId()
					+ "\n|" + "상품 이름 : " + strProductName 
					+ "\n|" + "수량 : " + cart.getQuantity());
		}
		
		
		System.out.println("--------------------------------------------");
		System.out.println("--------------------------------------------");
		System.out.println("--------------------------------------------");
	}
//		// null 1231 제거
//		Scanner s = new Scanner(System.in);
//		System.out.println("장바구니에서 구매를 진행하시겠습니까?");
//		String shopping = s.nextLine();
//
//		if (shopping.equals("Y") || shopping.equals("y")
//				|| shopping.equals("네")) {
//
//			shoppingCart();
//		} else {
//			System.out.println("메인 화면으로 갑니다.");
//		}
//	}

	@Override
	// null 1229
	public void shoppingCart() {
		CategoryVO category = new CategoryVO();
		Scanner s = new Scanner(System.in);

		String paycontinue = null;

		System.out.println("---------- menu ----------");
		System.out.println("1.\t개별 구매");
		System.out.println("2.\t통합 구매");
		System.out.println("선택해주세요.");

		int menu;
		menu = Integer.parseInt(s.nextLine());

		if (menu == 1) {
			ArrayList<CategoryVO> categoryList = categoryDao.selectCategoryList();
			System.out.println("장바구니 번호를 선택해주세요.");
			ArrayList<CartVO> cartList = cartDao.selectCartList();
//			int cartid = Integer.parseInt(s.nextLine()) - 1;
			int cartid = Integer.parseInt(s.nextLine());

			CartVO cart = cartList.get(cartid);

			System.out.println((cart.getCartId() + 1) + "번 상품을 선택하셨습니다");

			CartVO cartCheck = cartDao.selectCart("ID", cart.getCartId() + 1);

			category.setCategoryId(cartCheck.getProductId());

			// category.setCategoryId(cart.getProductId());
			CategoryVO categoryCheck = categoryDao.selectCategory("ID",	category.getCategoryId());

			if (categoryCheck == null) { //
				System.out.println("존재하지 않는 상품입니다.");
			}
			else { // 카테고리/상품내역에 상품이 있음
				
			}

			// 주소 입력
			String address;
			System.out.println("주소를 변경하시겠습니까?  Y/N");
			String answer = s.nextLine();

			if (answer.equals("Y") || answer.equals("y")) {
				System.out.println("주소를 입력해주세요.");
				address = s.nextLine();
				System.out.println("배송 주소가 " + address + "가 맞습니까?  y/n");
				answer = s.nextLine();

				if (answer.equals("n")) {
					address = s.nextLine();
				}
			} else {
				// UserVO address = database.tb_user.getAddress(user);
				// address = user_address.getAddress();
				// null 1230
				UserVO addressCheck = Session.loginUser;
				address = addressCheck.getAddress();
			}

			// 요청사항
			System.out.println("요청사항을 작성해주세요. ex) 경비실에 맡겨주세요.");
			String request = s.nextLine();

			// 결제방법 고르기
			System.out.println("결제방법을 골라주세요.");
			System.out.println("1. 카카오페이 ");
			System.out.println("2. 계좌이체 ");
			System.out.println("3. 무통장입금");
			System.out.println("4. 페이팔");
			System.out.println("선택해주세요.");

			int type = Integer.parseInt(s.nextLine());
			String paytype = null;

			switch (type) {
			case 1:
				paytype = "카카오페이";
				break;

			case 2:
				System.out.println("결제할 은행을 입력해주세요");
				paytype = s.nextLine();
				break;

			case 3:
				System.out.println("농협은행 123-4567-8910-11로 입금해주세요.");
				paytype = "무통장입금";
				break;

			case 4:
				System.out.println("페이팔 아이디를 입력해주세요");
				s.nextLine();
				paytype = " paypal";
				System.out.println("페이팔 비밀번호를 입력해주세요.");
				s.nextLine();
				break;

			default:
				break;
			}

			System.out.println("결제 완료 되었습니다.");
			int count = categoryCheck.getProductQuantity(); // 구매 수량 입력 Null 1231
			int totalPrice = count * categoryCheck.getProductPrice();

			PayListVO payList = new PayListVO();
			payList.setProductId(categoryCheck.getProductId());
			payList.setProductName(categoryCheck.getProductName());
			payList.setAddress(address);
			payList.setPaytype(paytype);
			payList.setRequest(request);
			payList.setProductQuantity(count);
			payList.setTotalPrice(totalPrice);

			// SimpleDateFormat format = new
			// SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			Date time = new Date();
			String yyyyMMdd = format.format(time);

			payList.setPayDate(yyyyMMdd);

			payList.setPayState("배송중");

			PayDao.insertPay(payList);
			
			
			// 구매한 상품 장바구니에서 없애기 --20191230 ch YUN
			CartVO delCart = new CartVO();
			ArrayList<CartVO> cartlist = cartDao.selectCartList();
			for (int i = 0; i < cartlist.size(); i++) {
				delCart = cartlist.get(i);
				if (delCart.getProductId() == payList.getProductId()) {
					cartlist.remove(i);
				}
			}
			
			//purchased it and deleted it from the product list-  null 1231
			ArrayList<CategoryVO> categorylist = categoryDao.selectCategoryList();
			for(int j = 0; j<categorylist.size(); j++){
				category = categorylist.get(j);
				if(category.getProductId() == payList.getProductId()){
					categoryCheck.setProductQuantity(categoryCheck.getProductQuantity()-count);
					categorylist.set(j, categoryCheck);
											
					if(categoryCheck.getProductQuantity()== 0)
						for(int k = 0; k<categorylist.size(); k++){
							category = categorylist.get(k);
							if(category.getProductId() == payList.getProductId()){
								categorylist.remove(k);
							}
						}						
					}
				}
			
			
			System.out.println("주문을 계속하시겠습니까? Y/N");
			paycontinue = s.nextLine();

			if (paycontinue.equals("Y") || paycontinue.equals("y")
					|| paycontinue.equals("네")) {

				printCartList();
			}

			else {
				System.out.println("메인 화면으로 갑니다.");
			}
		}

		else if (menu == 2) {

			ArrayList<CategoryVO> categoryList = categoryDao
					.selectCategoryList();
			ArrayList<CartVO> cartList = cartDao.selectCartList();
			int cartid = 0;

			CartVO cart = cartList.get(cartid);
			CartVO cartCheck = cartDao.selectCart("ID", cart.getCartId() + 1);

			category.setCategoryId(cartCheck.getProductId());

			// category.setCategoryId(cart.getProductId());
			CategoryVO categoryCheck = categoryDao.selectCategory("ID",
					category.getCategoryId());

			if (categoryCheck == null) { //
				System.out
						.println("존재하지 않는 상품입니다.");
			} else { // 카테고리/상품내역에 상품이 있음
			}

			// 주소 입력
			String address;
			System.out.println("주소를 변경하시겠습니까?  Y/N");
			String answer = s.nextLine();

			if (answer.equals("Y") || answer.equals("y")) {
				System.out.println("주소를 입력해주세요.");
				address = s.nextLine();
				System.out.println("배송 주소가 " + address + "가 맞습니까?  y/n");
				answer = s.nextLine();

				if (answer.equals("n")) {
					address = s.nextLine();
				}
			} else {
				// UserVO address = database.tb_user.getAddress(user);
				// address = user_address.getAddress();
				// null 1230
				UserVO addressCheck = Session.loginUser;
				address = addressCheck.getAddress();
			}

			// 요청사항
			System.out.println("요청사항을 작성해주세요. ex) 경비실에 맡겨주세요.");
			String request = s.nextLine();

			// 결제방법 고르기
			System.out.println("결제방법을 골라주세요.");

			System.out.println("1. 카카오페이");
			System.out.println("2. 계좌이체");
			System.out.println("3. 무통장입금");
			System.out.println("4. 페이팔");
			System.out.println("선택해주세요.");

			int type = Integer.parseInt(s.nextLine());
			String paytype = null;

			switch (type) {
			case 1:
				paytype = "카카오페이";
				break;

			case 2:
				System.out.println("결제할 은행을 입력해주세요");
				paytype = s.nextLine();
				break;

			case 3:
				System.out.println("농협은행 123-4567-8910-11로 입금해주세요.");
				paytype = "무통장입금";
				break;

			case 4:
				System.out.println("페이팔 아이디를 입력해주세요");
				s.nextLine();
				paytype = " paypal";
				System.out.println("페이팔 비밀번호를 입력해주세요.");
				s.nextLine();
				break;

			default:
				break;
			}

			System.out.println("결제 완료 되었습니다.");

			int count = cart.getQuantity(); // 구매 수량 입력
			int totalPrice = count * categoryCheck.getProductPrice();

			PayListVO payList = new PayListVO();
			payList.setProductId(categoryCheck.getProductId());
			payList.setProductName(categoryCheck.getProductName());
			payList.setAddress(address);
			payList.setPaytype(paytype);
			payList.setRequest(request);
			payList.setProductQuantity(count);
			payList.setTotalPrice(totalPrice);

			// SimpleDateFormat format = new
			// SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			Date time = new Date();
			String yyyyMMdd = format.format(time);

			payList.setPayDate(yyyyMMdd);

			payList.setPayState("배송중");

			PayDao.insertPay(payList);

			// 구매한 상품 장바구니에서 없애기 --20191230 ch YUN
			CartVO delCart = new CartVO();
			ArrayList<CartVO> cartlist = cartDao.selectCartList();
			for (int i = 0; i < cartlist.size(); i++) {
				delCart = cartlist.get(i);
				if (delCart.getProductId() == payList.getProductId()) {
					cartlist.remove(i);
				}
			}
			
			//purchased it and deleted it from the product list-  null 1231
			ArrayList<CategoryVO> categorylist = categoryDao.selectCategoryList();
			for(int j = 0; j<categorylist.size(); j++){
				category = categorylist.get(j);
				if(category.getProductId() == payList.getProductId()){
					categoryCheck.setProductQuantity(categoryCheck.getProductQuantity()-count);
					categorylist.set(j, categoryCheck);
											
					if(categoryCheck.getProductQuantity()== 0)
						for(int k = 0; k<categorylist.size(); k++){
							category = categorylist.get(k);
							if(category.getProductId() == payList.getProductId()){
								categorylist.remove(k);
							}
						}						
					}
				}
			
			// null ^ 위에껀 처음 입력, 밑에는 나머지 계산 돌려주기
			for (int i = 1; i < cartList.size(); i++) {

				cartid = i;

				cartList = cartDao.selectCartList();
				cart = cartList.get(cartid);
				cartCheck = cartDao.selectCart("ID", cart.getCartId() + 1);

				category.setCategoryId(cart.getProductId());

				// category.setCategoryId(cart.getProductId());
				categoryCheck = categoryDao.selectCategory("ID",
						category.getCategoryId());

				payList = new PayListVO();

				payList.setProductId(categoryCheck.getProductId());
				payList.setProductName(categoryCheck.getProductName());
				payList.setAddress(address);
				payList.setPaytype(paytype);
				payList.setRequest(request);
				payList.setProductQuantity(count);
				payList.setTotalPrice(totalPrice);

				format = new SimpleDateFormat("yyyy-MM-dd");
				time = new Date();
				yyyyMMdd = format.format(time);

				payList.setPayDate(yyyyMMdd);

				payList.setPayState("배송중");

				PayDao.insertPay(payList);

				// 구매한 상품 장바구니에서 없애기 --20191230 ch YUN

				for (int j = 0; j < cartlist.size(); j++) {
					delCart = cartlist.get(j);
					if (delCart.getProductId() == payList.getProductId()) {
						cartlist.remove(j);
					}
				}
				
				//purchased it and deleted it from the product list-  null 1231
				categorylist = categoryDao.selectCategoryList();
				for(int j = 0; j<categorylist.size(); j++){
					category = categorylist.get(j);
					if(category.getProductId() == payList.getProductId()){
						categoryCheck.setProductQuantity(categoryCheck.getProductQuantity()-count);
						categorylist.set(j, categoryCheck);
												
						if(categoryCheck.getProductQuantity()== 0)
							for(int k = 0; k<categorylist.size(); k++){
								category = categorylist.get(k);
								if(category.getProductId() == payList.getProductId()){
									categorylist.remove(k);
								}
							}
					}
				}

			}

		}

	}
}
