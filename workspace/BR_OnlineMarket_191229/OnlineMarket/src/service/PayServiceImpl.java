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
		// ���� PayVO user = database.tb_pay.get(i);
		CategoryVO category = new CategoryVO();		//hh.joo 20191228 add

		UserVO user = Session.loginUser; // session
		ArrayList<PayListVO> buyList = PayDao.selectPayList();
		Scanner s = new Scanner(System.in);
		String paycontinue = null;
		
		ArrayList<CategoryVO> categoryList = categoryDao.selectCategoryList();	//hh.joo 20191228 add


		if (user == null) {
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println("!!!!!!!!!!PLEASE LOG-IN !!!!!!!!!!!!!");
			System.out.println("!!!!!!!!!!�α����� ���� ���ּ���!!!!!!!!!!!");
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			return;
		}

		do {
			// ��ǰ, ����

			System.out.println("��ǰ ��ȣ�� �Է��ϼ���.");
			System.out.println("��ǰid�� �������ּ��� > Select Product id >>>");

			int categoryId = Integer.parseInt(s.nextLine());
			//CategoryVO buy = database.tb_category.get(categoryId);
			
			category.setCategoryId(categoryId);
			
//			cat.setProductId(categoryId);
			
			CategoryVO categoryCheck = categoryDao.selectCategory("ID", category.getCategoryId());

			//hh.joo 20191228 change
//			System.out.println(categoryCheck.getProductId() + "�� ��ǰ "
//					+ categoryCheck.getProductName() + "�� ������ " + categoryCheck.getProductPrice()
//					+ "�Դϴ�.");
//			System.out.println("�� ���� �����Ͻðڽ��ϱ�?");
			
			if(categoryCheck == null){ 	//
				System.out.println("Please, Check Product Id\n Cannot match Product Id");
				break;
			}		
			else	//ī�װ�/��ǰ������ ��ǰ�� ����
			{
//				System.out.println(categoryCheck.getCategoryId());
				
//				System.out.println("�׽�Ʈ �� �ý��� ������!");
//				System.exit(0);
				
				System.out.println("������ ��ǰ ������ �������ּ��� > Insert Product quantity >>>");

				int count = Integer.parseInt(s.nextLine()); // ���� ���� �Է�
				int totalPrice = count * categoryCheck.getProductPrice();
				
				//hh.joo 20191228 remove
//				System.out.println(buy.getProductId() + "�� ��ǰ "
//						+ buy.getProductName() + "�� ������ " + buy.getProductPrice()
//						+ "�Դϴ�.");
//				System.out.println("�� ���� �����Ͻðڽ��ϱ�?");
	//
//				int count = Integer.parseInt(s.nextLine()); // ���� ���� �Է�
//				int totalPrice = count * buy.getProductPrice();
				//hh.joo 20191228 remove end
				
				// �ּ� �Է�
				String address;
				System.out.println("�ּҸ� �����Ͻðڽ��ϱ�?  Y/N");
				String answer = s.nextLine();
				System.out.println("�ּҸ� �Է����ּ���.");

				if (answer.equals("Y") || answer.equals("y")) {

					address = s.nextLine();
					System.out.println("��� �ּҰ� " + address + "�� �½��ϱ�?  y/n");
					answer = s.nextLine();

					if (answer.equals("n")) {
						address = s.nextLine();
					}
				} else {
					// UserVO address = database.tb_user.getAddress(user);
					// address = user_address.getAddress();
					address = "�ּ�Ȯ�κҰ�"; // �ּҺκ� �α��ο��� Ȯ��..�ؾ���
				}

				// ��û����
				System.out.println("��û������ �ۼ����ּ���. ex) ���ǿ� �ð��ּ���.");
				String request = s.nextLine();

				// ������� ����
				System.out.println("��������� ����ּ���.");

				System.out.println("1.\tīī������ \t\t(Kakao Pay)");
				System.out.println("2.\t������ü \t\t(account transfer)");
				System.out.println("3.\t�������Ա� \t(make a deposit)");
				System.out.println("4.\t������ \t(paypal)");
				System.out.println("Please Select >>");

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

				System.out.println(" �ֹ��� ����Ͻðڽ��ϱ�? Y/N");
				paycontinue = s.nextLine();
				
			}
		


		} while (paycontinue.equals("Y") || paycontinue.equals("y"));

	
	}
	
	

	@Override
	// null 12:26,20:58 add // //null 12:27,15:42 Modify
	public void payList() {
		// Scanner s = new Scanner(System.in);
		ArrayList<PayListVO> payList = PayDao.selectPayList(); // ����Ʈ
		int pay = 0;
		UserVO user = Session.loginUser; // session

		if (user == null) {
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println("!!!!!!!!!!PLEASE LOG-IN !!!!!!!!!!!!!");
			System.out.println("!!!!!!!!!!�α����� ���� ���ּ���!!!!!!!!!!!");
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			return;
		}

		// PayVO pay = new PayVO();

		// ----����Ʈ -----------------------------------------------//
		System.out.println("------------------------------");
		System.out.println("��ȣ\tǰ��\t�ּ�\t���Ź��\t�ֹ���¥\t����\t�ݾ�\t��û����\t��ۻ���");
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

		// ----�� �ݾ�-----------------------------------------------//
		for (int i = payList.size() - 1; 0 <= i; i--) {
			PayVO list = payList.get(i);
			pay = pay + list.getTotalPrice();
		}
		System.out.println("\t" + "\t" + "�����Ͻ� �� �ݾ���" + pay + "\t");
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
