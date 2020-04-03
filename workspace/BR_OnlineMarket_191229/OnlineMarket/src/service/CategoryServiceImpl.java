package service;

import java.text.SimpleDateFormat;
import java.util.*;

import data.Database;
import data.Session;
import vo.CartVO;
import vo.CategoryVO;
import vo.UserVO;
import dao.CategoryDao;
import dao.CategoryDaoImpl;
import data.Database;

public class CategoryServiceImpl implements CategoryService {

	private Set set; // ȸ�������� �����ϴ� ����Ÿ�ҽ�	//hh.joo 20191227 add
	
	private static CategoryServiceImpl instance;
	
	private CategoryServiceImpl(){}
	
	public CategoryServiceImpl(Set set)
	{
		this.set = set;
	}
	
	public static CategoryServiceImpl getInstance(){
		if(instance == null){
			instance = new CategoryServiceImpl();
		}
		return instance;
	}
	
//	PhoneBookManager manager = new PhoneBookManager();
	CategoryVO categoryVO = new CategoryVO();
	
	CategoryDao categoryDao = CategoryDaoImpl.getInstance();	//hh.joo 20191225 add
	
	Database database = Database.getInstance();		//hh.joo 20191227 add
	
	//hh.joo 20191225 add
	@Override
	public void addCategory() {			//�Ǹ��ڰ� ��ǰ�� ��� //register product
		
		//hh.joo 20191226 add
		CategoryVO category = new CategoryVO();
		UserVO user = Session.loginUser;			//session
		ArrayList<CategoryVO> categoryList = categoryDao.selectCategoryList();

		if(user == null)
		{
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println("!!!!!!!!!!PLEASE LOG-IN !!!!!!!!!!!!!");
			System.out.println("!!!!!!!!!!�α����� ���� ���ּ���!!!!!!!!!!!");
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			return;
		}

		Scanner s = new Scanner(System.in);

		//to verify UserId before add category
//		UserVO user = new UserVO();
//		
//		System.out.println("input user ID! >>>");
//		String id = s.nextLine();
//		user.setId(id);
//				
//		UserVO userCheck = userDao.selectUser("ID", user.getId());

		String userId;
		userId = user.getId();
		category.setUserId(userId);
		
		int CategoryId = categoryList.size();			//Category Id++
//		System.out.println("(int) ī�װ� ���̵� �Է����ּ���>>>");
//		CategoryId = Integer.parseInt(s.nextLine()); 
		category.setCategoryId(CategoryId);
		
		//need to check pk categoryId ///////////////////////////////

//		database.tb_bigCategory.size();
		
		System.out.println(database.tb_bigCategory.size());
		System.out.println("��������� << ��з� >> ���������");
		for(int i = 0 ; i < database.tb_bigCategory.size(); i++)
		{
			System.out.printf("BigCode.%d  %s\n", i, database.tb_bigCategory.get(i) );
		}
		System.out.println("��������� << ��з� >> ���������");	System.out.println();	System.out.println();
		
		System.out.println("(int) ��з� �ڵ带 �Է����ּ���>>>");
		int iInputBig = Integer.parseInt(s.nextLine());
		category.setBigCode(iInputBig);
		System.out.println();
		System.out.printf("> BigCode: %d�� [%s]��/�� �����ϼ̽��ϴ�.", iInputBig, database.tb_bigCategory.get(iInputBig));
		System.out.println();
		
		int iMidCode;
		System.out.println("��������� << �ߺз� >> ���������");
		switch(iInputBig)
		{
		case 0:
			for(int i = 0 ; i < database.tb_00_midCategory.size(); i++)
			{
				System.out.printf("MidCode.%d  %s\n", i, database.tb_00_midCategory.get(i) );
			}
			System.out.println("��������� << �ߺз� >> ���������");	
			
			System.out.println(); 
			System.out.println("(int) �ߺз� �ڵ带 �Է����ּ���>>>");
			iMidCode = Integer.parseInt(s.nextLine()); 
			category.setMidCode(iMidCode);
			
			System.out.println();
			System.out.println();
			System.out.printf("> MidCode: %d�� [%s]��/�� �����ϼ̽��ϴ�.", iMidCode, database.tb_00_midCategory.get(iMidCode));
			System.out.println();
			break;
			
		case 1:
			for(int i = 0 ; i < database.tb_01_midCategory.size(); i++)
			{
				System.out.printf("MidCode.%d  %s\n", i, database.tb_01_midCategory.get(i) );
			}	
			System.out.println("��������� << �ߺз� >> ���������");

			System.out.println(); 
			System.out.println("(int) �ߺз� �ڵ带 �Է����ּ���>>>");
			iMidCode = Integer.parseInt(s.nextLine()); 
			category.setMidCode(iMidCode);
			
			System.out.println();
			System.out.println();
			System.out.printf("> MidCode: %d�� [%s]��/�� �����ϼ̽��ϴ�.", iMidCode, database.tb_01_midCategory.get(iMidCode));
			System.out.println();
			break;
			
		case 2:
			for(int i = 0 ; i < database.tb_02_midCategory.size(); i++)
			{
				System.out.printf("MidCode.%d  %s\n", i, database.tb_02_midCategory.get(i) );
			}
			System.out.println("��������� << �ߺз� >> ���������");
			
			System.out.println(); 
			System.out.println("(int) �ߺз� �ڵ带 �Է����ּ���>>>");
			iMidCode = Integer.parseInt(s.nextLine()); 
			category.setMidCode(iMidCode);
			
			System.out.println();
			System.out.println();
			System.out.printf("> MidCode: %d�� [%s]��/�� �����ϼ̽��ϴ�.", iMidCode, database.tb_02_midCategory.get(iMidCode));
			System.out.println();
			break;
		case 3:
			for(int i = 0 ; i < database.tb_03_midCategory.size(); i++)
			{
				System.out.printf("MidCode.%d  %s\n", i, database.tb_03_midCategory.get(i) );
			}
			System.out.println("��������� << �ߺз� >> ���������");
			
			System.out.println(); 
			System.out.println("(int) �ߺз� �ڵ带 �Է����ּ���>>>");
			iMidCode = Integer.parseInt(s.nextLine()); 
			category.setMidCode(iMidCode);
			
			System.out.println();
			System.out.println();
			System.out.printf("> MidCode: %d�� [%s]��/�� �����ϼ̽��ϴ�.", iMidCode, database.tb_03_midCategory.get(iMidCode));
			System.out.println();
			break;
		case 4:
			for(int i = 0 ; i < database.tb_04_midCategory.size(); i++)
			{
				System.out.printf("MidCode.%d  %s\n", i, database.tb_04_midCategory.get(i) );
			}
			System.out.println("��������� << �ߺз� >> ���������");

			System.out.println(); 
			System.out.println("(int) �ߺз� �ڵ带 �Է����ּ���>>>");
			iMidCode = Integer.parseInt(s.nextLine()); 
			category.setMidCode(iMidCode);
			
			System.out.println();
			System.out.println();
			System.out.printf("> MidCode: %d�� [%s]��/�� �����ϼ̽��ϴ�.", iMidCode, database.tb_04_midCategory.get(iMidCode));
			System.out.println();
			break;
		case 5:
			for(int i = 0 ; i < database.tb_05_midCategory.size(); i++)
			{
				System.out.printf("MidCode.%d  %s\n", i, database.tb_05_midCategory.get(i) );
			}
			System.out.println("��������� << �ߺз� >> ���������");

			System.out.println(); 
			System.out.println("(int) �ߺз� �ڵ带 �Է����ּ���>>>");
			iMidCode = Integer.parseInt(s.nextLine()); 
			category.setMidCode(iMidCode);
			
			System.out.println();
			System.out.println();
			System.out.printf("> MidCode: %d�� [%s]��/�� �����ϼ̽��ϴ�.", iMidCode, database.tb_05_midCategory.get(iMidCode));
			System.out.println();
			break;
		case 6:
			for(int i = 0 ; i < database.tb_06_midCategory.size(); i++)
			{
				System.out.printf("MidCode.%d  %s\n", i, database.tb_06_midCategory.get(i) );
			}
			System.out.println("��������� << �ߺз� >> ���������");

			System.out.println(); 
			System.out.println("(int) �ߺз� �ڵ带 �Է����ּ���>>>");
			iMidCode = Integer.parseInt(s.nextLine()); 
			category.setMidCode(iMidCode);
			
			System.out.println();
			System.out.println();
			System.out.printf("> MidCode: %d�� [%s]��/�� �����ϼ̽��ϴ�.", iMidCode, database.tb_06_midCategory.get(iMidCode));
			System.out.println();
			break;
		case 7:
			for(int i = 0 ; i < database.tb_07_midCategory.size(); i++)
			{
				System.out.printf("MidCode.%d  %s\n", i, database.tb_07_midCategory.get(i) );
			}
			System.out.println("��������� << �ߺз� >> ���������");

			System.out.println(); 
			System.out.println("(int) �ߺз� �ڵ带 �Է����ּ���>>>");
			iMidCode = Integer.parseInt(s.nextLine()); 
			category.setMidCode(iMidCode);
			
			System.out.println();
			System.out.println();
			System.out.printf("> MidCode: %d�� [%s]��/�� �����ϼ̽��ϴ�.", iMidCode, database.tb_07_midCategory.get(iMidCode));
			System.out.println();
			break;
		case 8:
			for(int i = 0 ; i < database.tb_08_midCategory.size(); i++)
			{
				System.out.printf("MidCode.%d  %s\n", i, database.tb_08_midCategory.get(i) );
			}
			System.out.println("��������� << �ߺз� >> ���������");

			System.out.println(); 
			System.out.println("(int) �ߺз� �ڵ带 �Է����ּ���>>>");
			iMidCode = Integer.parseInt(s.nextLine()); 
			category.setMidCode(iMidCode);
			
			System.out.println();
			System.out.println();
			System.out.printf("> MidCode: %d�� [%s]��/�� �����ϼ̽��ϴ�.", iMidCode, database.tb_08_midCategory.get(iMidCode));
			System.out.println();
			break;
		case 9:
			for(int i = 0 ; i < database.tb_09_midCategory.size(); i++)
			{
				System.out.printf("MidCode.%d  %s\n", i, database.tb_09_midCategory.get(i) );
			}
			System.out.println("��������� << �ߺз� >> ���������");

			System.out.println(); 
			System.out.println("(int) �ߺз� �ڵ带 �Է����ּ���>>>");
			iMidCode = Integer.parseInt(s.nextLine()); 
			category.setMidCode(iMidCode);
			
			System.out.println();
			System.out.println();
			System.out.printf("> MidCode: %d�� [%s]��/�� �����ϼ̽��ϴ�.", iMidCode, database.tb_09_midCategory.get(iMidCode));
			System.out.println();
			break;
		case 10:
			for(int i = 0 ; i < database.tb_10_midCategory.size(); i++)
			{
				System.out.printf("MidCode.%d  %s\n", i, database.tb_10_midCategory.get(i) );
			}
			System.out.println("��������� << �ߺз� >> ���������");

			System.out.println(); 
			System.out.println("(int) �ߺз� �ڵ带 �Է����ּ���>>>");
			iMidCode = Integer.parseInt(s.nextLine()); 
			category.setMidCode(iMidCode);
			
			System.out.println();
			System.out.println();
			System.out.printf("> MidCode: %d�� [%s]��/�� �����ϼ̽��ϴ�.", iMidCode, database.tb_10_midCategory.get(iMidCode));
			System.out.println();
			break;
		case 11:
			for(int i = 0 ; i < database.tb_11_midCategory.size(); i++)
			{
				System.out.printf("MidCode.%d  %s\n", i, database.tb_11_midCategory.get(i) );
			}
			System.out.println("��������� << �ߺз� >> ���������");

			System.out.println(); 
			System.out.println("(int) �ߺз� �ڵ带 �Է����ּ���>>>");
			iMidCode = Integer.parseInt(s.nextLine()); 
			category.setMidCode(iMidCode);
			
			System.out.println();
			System.out.println();
			System.out.printf("> MidCode: %d�� [%s]��/�� �����ϼ̽��ϴ�.", iMidCode, database.tb_11_midCategory.get(iMidCode));
			System.out.println();
			break;
		default:
			break;
		}
		
//		System.out.println(database.tb_bigCategory.size());
//		System.out.println("��������� << �ߺз� >> ���������");
//		for(int i = 0 ; i < database.tb_bigCategory.size(); i++)
//		{
//			System.out.printf("Code.%d  %s\n", i, database.tb_bigCategory.get(i) );
//		}
//		System.out.println("��������� << �ߺз� >> ���������");
		
			
//		remove
//		int CategoryId = categoryList.size();			//Category Id++
//		System.out.println("(int) ī�װ� ���̵� �Է����ּ���>>>");
//		CategoryId = Integer.parseInt(s.nextLine()); 
//		category.setCategoryId(CategoryId);
//		int productId = category.getProductId();
//		System.out.println("(int)��ǰ ���̵� �Է����ּ���>>>");
//		productId = Integer.parseInt(s.nextLine());
//		category.setProductId(productId);
		
		String productName;
		System.out.println("��ǰ���� �Է����ּ���>>>");
		productName = s.nextLine();
		category.setProductName(productName);

		int productPrice;
		System.out.println("(int) ��ǰ ������ �Է����ּ���>>>");
		productPrice = Integer.parseInt(s.nextLine());
		category.setProductPrice(productPrice);
		
		String productExplain;
		System.out.println("��ǰ ������ �Է����ּ���>>>");
		productExplain = s.nextLine();
		category.setProductExplain(productExplain);
		
		String productRegDate;
		System.out.println("��¥�� �Է����ּ���>>>");
		
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date time = new Date();
		productRegDate = format1.format(time);
		category.setProductRegDate(productRegDate);
		
		categoryDao.insertCategory(category);
	}
	
	//hh.joo 20191225 add
	@Override
	public void printCategoryList() {
		ArrayList<CategoryVO> categoryList = categoryDao.selectCategoryList();
		
		System.out.println("----------------------------------");
		System.out.println("--printCategoryList || �ǸŻ�ǰ ���--");
		//System.out.println(">>>\t>>>\t>>>");
		System.out.println("------------------------------");
		for(int i = categoryList.size() - 1; 0 <= i; i--){
			CategoryVO category = categoryList.get(i);
			System.out.println( /*(i + 1)":"*/ "[Category id:" + category.getCategoryId() + "]" + //"\t|" +category.getBigCode() + "|" + category.getMidCode() + "|" + category.getSmallCode() + 
					"|" +  category.getUserId() + "\t|" + 
					"ProductName:" + category.getProductName() + "\t|" + "Price:" + category.getProductPrice() + "\t|"+ "ProductExplain:" + category.getProductExplain() + "\t\t|" + "regDate:" +category.getProductRegDate()); 
		}
		System.out.println("------------------------------");		
	}

	
	//hh.joo 20191227 add
	@Override
	public void searchCategoryWithKeyword(String key) {
		
		ArrayList<CategoryVO> categoryList = categoryDao.selectCategoryList();
		System.out.println("--------------------------------------------");
		System.out.println("--searchCategoryWithKeyword || �ǸŻ�ǰ �˻�----");
		System.out.println("---------------------------------------------");

		Scanner s = new Scanner(System.in);
		String strInput = s.nextLine();

		for(int i = categoryList.size() - 1; 0 <= i; i--){
			CategoryVO category = categoryList.get(i);
			
			String strTemp = category.getProductName();
			
			if(category.getProductName().indexOf(strInput) != -1)
			{
				System.out.println(category);
			}
			
		}

		
		
		
		
//		Set s = new HashSet();
//		
//		for(Iterator it = set.iterator() ; it.hasNext();)
//		{
//			CategoryVO cateVO = (CategoryVO) it.next();
//			
//			if(cateVO.getProductName().equals(key))
//			{
//				s.add(cateVO);
//			}
//		}
//		
//		return s;
	}

	//hh.joo 20191227 add
	@Override
	public int getCategorySize() {
		
		return set.size();
	}

	//hh.joo 20191227 add
	@Override
	public void searchFunction() {
		
		while(true)
		{
			System.out.println("�˻��� �̸��� �Է��ϼ��� >");
			System.out.println("�����Ͻ÷��� 'exit'�� �Է��ϼ��� >");
			Scanner s = new Scanner(System.in);
			
			String strInput = s.nextLine();
			
			if( strInput.equals("exit"))
			{
				System.out.println("����!");
				break;
			}
		}
		
	}
	
	
	
	
}
