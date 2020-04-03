package service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import vo.CategoryVO;
import vo.PayListVO;
import vo.PayVO;
import vo.UserVO;
import dao.CategoryDao;
import dao.CategoryDaoImpl;
import dao.PayDao;
import dao.PayDaoImpl;
import data.Database;
import data.Session;

public class PayServiceImpl implements PayService {

	private static PayServiceImpl instance;

	private PayServiceImpl() {
	}

	public static PayServiceImpl getInstance() {
		if (instance == null) {
			instance = new PayServiceImpl();
		}
		return instance;
	}

	PayDao PayDao = PayDaoImpl.getInstance();
	Database database = Database.getInstance();
	CategoryDao categoryDao = CategoryDaoImpl.getInstance();	//hh.joo 20191228 add

	@Override
	public void buying() {
		// 참고 PayVO user = database.tb_pay.get(i);
		CategoryVO category = new CategoryVO();		//hh.joo 20191228 add

		UserVO user = Session.loginUser; // session
		ArrayList<PayListVO> buyList = PayDao.selectPayList();
		Scanner s = new Scanner(System.in);
		String paycontinue = null;
		
		ArrayList<CategoryVO> categoryList = categoryDao.selectCategoryList();	//hh.joo 20191228 add


		if (user == null) {
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println("!!!!!!!!!!PLEASE LOG-IN !!!!!!!!!!!!!");
			System.out.println("!!!!!!!!!!로그인을 먼저 해주세요!!!!!!!!!!!");
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			return;
		}

		do {
			// 물품, 고르기

			System.out.println("상품 번호를 입력하세요.");
			System.out.println("상품id를 선택해주세요 > Select Product id >>>");

			int categoryId = Integer.parseInt(s.nextLine());
			//CategoryVO buy = database.tb_category.get(categoryId);
			
			category.setCategoryId(categoryId);
			
//			cat.setProductId(categoryId);
			
			CategoryVO categoryCheck = categoryDao.selectCategory("ID", category.getCategoryId());

			//hh.joo 20191228 change
//			System.out.println(categoryCheck.getProductId() + "번 상품 "
//					+ categoryCheck.getProductName() + "의 가격은 " + categoryCheck.getProductPrice()
//					+ "입니다.");
//			System.out.println("몇 개를 구입하시겠습니까?");
			
			if(categoryCheck == null){ 	//
				System.out.println("Please, Check Product Id\n Cannot match Product Id");
				break;
			}		
			else	//카테고리/상품내역에 상품이 있음
			{
//				System.out.println(categoryCheck.getCategoryId());
				
//				System.out.println("테스트 중 시스템 종료함!");
//				System.exit(0);
				
				System.out.println("구매할 상품 수량를 선택해주세요 > Insert Product quantity >>>");

				int count = Integer.parseInt(s.nextLine()); // 구매 수량 입력
				int totalPrice = count * categoryCheck.getProductPrice();
				
				//hh.joo 20191228 remove
//				System.out.println(buy.getProductId() + "번 상품 "
//						+ buy.getProductName() + "의 가격은 " + buy.getProductPrice()
//						+ "입니다.");
//				System.out.println("몇 개를 구입하시겠습니까?");
	//
//				int count = Integer.parseInt(s.nextLine()); // 구매 수량 입력
//				int totalPrice = count * buy.getProductPrice();
				//hh.joo 20191228 remove end
				
				// 주소 입력
				String address;
				System.out.println("주소를 변경하시겠습니까?  Y/N");
				String answer = s.nextLine();
				System.out.println("주소를 입력해주세요.");

				if (answer.equals("Y") || answer.equals("y")) {

					address = s.nextLine();
					System.out.println("배송 주소가 " + address + "가 맞습니까?  y/n");
					answer = s.nextLine();

					if (answer.equals("n")) {
						address = s.nextLine();
					}
				} else {
					// UserVO address = database.tb_user.getAddress(user);
					// address = user_address.getAddress();
					address = "주소확인불가"; // 주소부분 로그인에서 확인..해야함
				}

				// 요청사항
				System.out.println("요청사항을 작성해주세요. ex) 경비실에 맡겨주세요.");
				String request = s.nextLine();

				// 결제방법 고르기
				System.out.println("결제방법을 골라주세요.");

				System.out.println("1.\t카카오페이 \t\t(Kakao Pay)");
				System.out.println("2.\t계좌이체 \t\t(account transfer)");
				System.out.println("3.\t무통장입금 \t(make a deposit)");
				System.out.println("4.\t페이팔 \t(paypal)");
				System.out.println("Please Select >>");

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

				PayListVO payList = new PayListVO();
				payList.setProductId(categoryCheck.getProductId());
				payList.setProductName(categoryCheck.getProductName());
				payList.setAddress(address);
				payList.setPaytype(paytype);
				payList.setRequest(request);
				payList.setProductQuantity(count);
				payList.setTotalPrice(totalPrice);
				
//				SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
				Date time = new Date();
				String yyyyMMdd = format.format(time);
				
				payList.setPayDate(yyyyMMdd);

				PayDao.insertPay(payList);

				System.out.println(" 주문을 계속하시겠습니까? Y/N");
				paycontinue = s.nextLine();
				
			}
		


		} while (paycontinue.equals("Y") || paycontinue.equals("y"));

	
	}
	
	

	@Override
	// null 12:26,20:58 add // //null 12:27,15:42 Modify
	public void payList() {
		// Scanner s = new Scanner(System.in);
		ArrayList<PayListVO> payList = PayDao.selectPayList(); // 리스트
		int pay = 0;
		UserVO user = Session.loginUser; // session

		if (user == null) {
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println("!!!!!!!!!!PLEASE LOG-IN !!!!!!!!!!!!!");
			System.out.println("!!!!!!!!!!로그인을 먼저 해주세요!!!!!!!!!!!");
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			return;
		}

		// PayVO pay = new PayVO();

		// ----리스트 -----------------------------------------------//
		System.out.println("------------------------------");
		System.out.println("번호\t품명\t주소\t구매방법\t주문날짜\t수량\t금액\t요청사항\t배송상태");
		System.out.println("------------------------------");
		for (int i = payList.size() - 1; 0 < i; i--) {
			PayVO list = payList.get(i);

			System.out.println(i + "\t" + list.getProductName() + "\t"
					+ list.getAddress() + "\t" + list.getPaytype() + "\t"
					+ list.getPayDate() + "\t" + list.getProductQuantity()
					+ "\t" + list.getTotalPrice() + "\t" + list.getRequest()
					+ "\t" + list.getPayState());
		}
		System.out.println("------------------------------");

		// ----총 금액-----------------------------------------------//
		for (int i = payList.size() - 1; 0 <= i; i--) {
			PayVO list = payList.get(i);
			pay = pay + list.getTotalPrice();
		}
		System.out.println("\t" + "\t" + "구매하신 총 금액은" + pay + "\t");
		// -------------------------------------------------------------//
	}

	@Override
	public void insertpay() {
		// TODO Auto-generated method stub

	}

	@Override
	public void selectPay() {
		// TODO Auto-generated method stub

	}

	@Override
	public void selectPayList() {
		// TODO Auto-generated method stub

	}

}
