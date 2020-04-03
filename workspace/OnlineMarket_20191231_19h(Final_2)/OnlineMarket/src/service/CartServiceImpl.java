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
	public void addToCart() { // ��ٱ��Ͽ� ��ǰ ���
		CartVO cart = new CartVO();
		UserVO user = Session.loginUser; // session
		CategoryVO category = new CategoryVO();
		ArrayList<CartVO> cartList = cartDao.selectCartList();

		// remove
		// printCategoryList(); //print selling product list

		if (user == null) {
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println("!!!!!!!!!!PLEASE LOG-IN !!!!!!!!!!!!!");
			System.out.println("!!!!!!!!!!�α����� ���� ���ּ���!!!!!!!!!!!");
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			return;
		}

		String userId;
		userId = user.getId();
		cart.setUserId(userId);

		Scanner s = new Scanner(System.in);

		// int productId;
		// System.out.println("��ǰid�� �������ּ��� > Select Product id >>>");
		// productId = Integer.parseInt(s.nextLine());
		// cart.setProductId(productId);
		// CategoryVO categoryCheck = categoryDao.selectCategory("ID",
		// category.getCategoryId());

		// hh.joo 20191229 change
		int categoryId;
		System.out.println("��ǰid�� �������ּ���.");
		categoryId = Integer.parseInt(s.nextLine());
		// cart.setProductId(categoryId);

		// System.out.println("(getCategoryId) Test > " + categoryId);
		CategoryVO categoryCheck = categoryDao.selectCategory("ID", categoryId);
		// hh.joo 20191229 change end

		if (categoryCheck == null) {
			System.out
					.println("�������� �ʴ� id�Դϴ�");
		} else {
			int iCartId = cartList.size(); // Cart Id++ //Cart Id ���������� �������� ����
			// System.out.println("iCartID >>>" + iCartId);
			// iCartId = Integer.parseInt(s.nextLine());
			cart.setCartId(iCartId);

			cart.setProductId(categoryId); // hh.joo 20191229 add product id

			
			//null 1231 ��ٱ��Ͽ� ���� ���� ǰ������� ���غ���
			int count = 0;
			boolean countCheck = false;
			System.out.println("������ �����Ͻ� ��ǰ��" +  categoryCheck.getProductQuantity() + "���� ��� �����ֽ��ϴ�.." );
			do{
					System.out.println("��ٱ��Ͽ� ���� ��ǰ ������ �������ּ���.");	
					count = Integer.parseInt(s.nextLine()); // ���� ���� �Է�
					if(categoryCheck.getProductQuantity() - count < 0){
					System.out.println("��ǰ ������ �����մϴ�.");
					System.out.println("��� �����Ͻðڽ��ϱ�? Y/N");
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
			System.out.println("��ٱ��Ͽ��� ���Ÿ� �����Ͻðڽ��ϱ�?");
			String shopping = s.nextLine();

			if (shopping.equals("Y") || shopping.equals("y")
					|| shopping.equals("��")) {

				shoppingCart();
			} else {
				System.out.println("���� ȭ������ ���ϴ�.");
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
			System.out.println("!!!!!!!!!!�α����� ���� ���ּ���!!!!!!!!!!!");
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			return;
		}

		ArrayList<CartVO> cartList = cartDao.selectCartList();
		
//		CartVO cartVO = cartDao.selectCart(key, value)
	
		System.out.println("--------------------------------------------");
		System.out.println("------------------��ٱ���--------------------");
		System.out.println("--------------------------------------------");
		
		for (int i = cartList.size() - 1; 0 <= i; i--) {
			CartVO cart = cartList.get(i);
			
			System.out.println("��ǰid : " + cart.getProductId());
//			CategoryVO categoryObj = categoryDao.selectCategory("ID", cart.getProductId());
//			String strProductNameTemp = categoryObj.getProductName();
//			System.out.println("��ǰ�̸� : " + strProductNameTemp);
			String strProductName = categoryService.printProductName(cart.getProductId());
			
			System.out.println( /* (i + 1)":" */
					"<" + (i+1) + ">" 
					+ "\n|��ٱ��� ��ȣ : " + cart.getCartId()
					+ "\n|" + "��ǰ id : " + cart.getProductId()
					+ "\n|" + "��ǰ �̸� : " + strProductName 
					+ "\n|" + "���� : " + cart.getQuantity());
		}
		
		
		System.out.println("--------------------------------------------");
		System.out.println("--------------------------------------------");
		System.out.println("--------------------------------------------");
	}
//		// null 1231 ����
//		Scanner s = new Scanner(System.in);
//		System.out.println("��ٱ��Ͽ��� ���Ÿ� �����Ͻðڽ��ϱ�?");
//		String shopping = s.nextLine();
//
//		if (shopping.equals("Y") || shopping.equals("y")
//				|| shopping.equals("��")) {
//
//			shoppingCart();
//		} else {
//			System.out.println("���� ȭ������ ���ϴ�.");
//		}
//	}

	@Override
	// null 1229
	public void shoppingCart() {
		CategoryVO category = new CategoryVO();
		Scanner s = new Scanner(System.in);

		String paycontinue = null;

		System.out.println("---------- menu ----------");
		System.out.println("1.\t���� ����");
		System.out.println("2.\t���� ����");
		System.out.println("�������ּ���.");

		int menu;
		menu = Integer.parseInt(s.nextLine());

		if (menu == 1) {
			ArrayList<CategoryVO> categoryList = categoryDao.selectCategoryList();
			System.out.println("��ٱ��� ��ȣ�� �������ּ���.");
			ArrayList<CartVO> cartList = cartDao.selectCartList();
//			int cartid = Integer.parseInt(s.nextLine()) - 1;
			int cartid = Integer.parseInt(s.nextLine());

			CartVO cart = cartList.get(cartid);

			System.out.println((cart.getCartId() + 1) + "�� ��ǰ�� �����ϼ̽��ϴ�");

			CartVO cartCheck = cartDao.selectCart("ID", cart.getCartId() + 1);

			category.setCategoryId(cartCheck.getProductId());

			// category.setCategoryId(cart.getProductId());
			CategoryVO categoryCheck = categoryDao.selectCategory("ID",	category.getCategoryId());

			if (categoryCheck == null) { //
				System.out.println("�������� �ʴ� ��ǰ�Դϴ�.");
			}
			else { // ī�װ�/��ǰ������ ��ǰ�� ����
				
			}

			// �ּ� �Է�
			String address;
			System.out.println("�ּҸ� �����Ͻðڽ��ϱ�?  Y/N");
			String answer = s.nextLine();

			if (answer.equals("Y") || answer.equals("y")) {
				System.out.println("�ּҸ� �Է����ּ���.");
				address = s.nextLine();
				System.out.println("��� �ּҰ� " + address + "�� �½��ϱ�?  y/n");
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

			// ��û����
			System.out.println("��û������ �ۼ����ּ���. ex) ���ǿ� �ð��ּ���.");
			String request = s.nextLine();

			// ������� ����
			System.out.println("��������� ����ּ���.");
			System.out.println("1. īī������ ");
			System.out.println("2. ������ü ");
			System.out.println("3. �������Ա�");
			System.out.println("4. ������");
			System.out.println("�������ּ���.");

			int type = Integer.parseInt(s.nextLine());
			String paytype = null;

			switch (type) {
			case 1:
				paytype = "īī������";
				break;

			case 2:
				System.out.println("������ ������ �Է����ּ���");
				paytype = s.nextLine();
				break;

			case 3:
				System.out.println("�������� 123-4567-8910-11�� �Ա����ּ���.");
				paytype = "�������Ա�";
				break;

			case 4:
				System.out.println("������ ���̵� �Է����ּ���");
				s.nextLine();
				paytype = " paypal";
				System.out.println("������ ��й�ȣ�� �Է����ּ���.");
				s.nextLine();
				break;

			default:
				break;
			}

			System.out.println("���� �Ϸ� �Ǿ����ϴ�.");
			int count = categoryCheck.getProductQuantity(); // ���� ���� �Է� Null 1231
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

			payList.setPayState("�����");

			PayDao.insertPay(payList);
			
			
			// ������ ��ǰ ��ٱ��Ͽ��� ���ֱ� --20191230 ch YUN
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
			
			
			System.out.println("�ֹ��� ����Ͻðڽ��ϱ�? Y/N");
			paycontinue = s.nextLine();

			if (paycontinue.equals("Y") || paycontinue.equals("y")
					|| paycontinue.equals("��")) {

				printCartList();
			}

			else {
				System.out.println("���� ȭ������ ���ϴ�.");
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
						.println("�������� �ʴ� ��ǰ�Դϴ�.");
			} else { // ī�װ�/��ǰ������ ��ǰ�� ����
			}

			// �ּ� �Է�
			String address;
			System.out.println("�ּҸ� �����Ͻðڽ��ϱ�?  Y/N");
			String answer = s.nextLine();

			if (answer.equals("Y") || answer.equals("y")) {
				System.out.println("�ּҸ� �Է����ּ���.");
				address = s.nextLine();
				System.out.println("��� �ּҰ� " + address + "�� �½��ϱ�?  y/n");
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

			// ��û����
			System.out.println("��û������ �ۼ����ּ���. ex) ���ǿ� �ð��ּ���.");
			String request = s.nextLine();

			// ������� ����
			System.out.println("��������� ����ּ���.");

			System.out.println("1. īī������");
			System.out.println("2. ������ü");
			System.out.println("3. �������Ա�");
			System.out.println("4. ������");
			System.out.println("�������ּ���.");

			int type = Integer.parseInt(s.nextLine());
			String paytype = null;

			switch (type) {
			case 1:
				paytype = "īī������";
				break;

			case 2:
				System.out.println("������ ������ �Է����ּ���");
				paytype = s.nextLine();
				break;

			case 3:
				System.out.println("�������� 123-4567-8910-11�� �Ա����ּ���.");
				paytype = "�������Ա�";
				break;

			case 4:
				System.out.println("������ ���̵� �Է����ּ���");
				s.nextLine();
				paytype = " paypal";
				System.out.println("������ ��й�ȣ�� �Է����ּ���.");
				s.nextLine();
				break;

			default:
				break;
			}

			System.out.println("���� �Ϸ� �Ǿ����ϴ�.");

			int count = cart.getQuantity(); // ���� ���� �Է�
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

			payList.setPayState("�����");

			PayDao.insertPay(payList);

			// ������ ��ǰ ��ٱ��Ͽ��� ���ֱ� --20191230 ch YUN
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
			
			// null ^ ������ ó�� �Է�, �ؿ��� ������ ��� �����ֱ�
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

				payList.setPayState("�����");

				PayDao.insertPay(payList);

				// ������ ��ǰ ��ٱ��Ͽ��� ���ֱ� --20191230 ch YUN

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
