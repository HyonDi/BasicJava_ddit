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

	private Set set; // 회원정보를 보관하는 데이타소스	//hh.joo 20191227 add
	
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
	public void addCategory() {			//판매자가 상품을 등록 //register product
		
		//hh.joo 20191226 add
		CategoryVO category = new CategoryVO();
		UserVO user = Session.loginUser;			//session
		ArrayList<CategoryVO> categoryList = categoryDao.selectCategoryList();

		if(user == null)
		{
			System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			System.out.println("!!!!!!!!!!PLEASE LOG-IN !!!!!!!!!!!!!");
			System.out.println("!!!!!!!!!!로그인을 먼저 해주세요!!!!!!!!!!!");
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
//		System.out.println("(int) 카테고리 아이디를 입력해주세요>>>");
//		CategoryId = Integer.parseInt(s.nextLine()); 
		category.setCategoryId(CategoryId);
		
		//need to check pk categoryId ///////////////////////////////

//		database.tb_bigCategory.size();
		
		System.out.println(database.tb_bigCategory.size());
		System.out.println("□□□□□□□□ << 대분류 >> □□□□□□□□");
		for(int i = 0 ; i < database.tb_bigCategory.size(); i++)
		{
			System.out.printf("BigCode.%d  %s\n", i, database.tb_bigCategory.get(i) );
		}
		System.out.println("□□□□□□□□ << 대분류 >> □□□□□□□□");	System.out.println();	System.out.println();
		
		System.out.println("(int) 대분류 코드를 입력해주세요>>>");
		int iInputBig = Integer.parseInt(s.nextLine());
		category.setBigCode(iInputBig);
		System.out.println();
		System.out.printf("> BigCode: %d번 [%s]을/를 선택하셨습니다.", iInputBig, database.tb_bigCategory.get(iInputBig));
		System.out.println();
		
		int iMidCode;
		System.out.println("□□□□□□□□ << 중분류 >> □□□□□□□□");
		switch(iInputBig)
		{
		case 0:
			for(int i = 0 ; i < database.tb_00_midCategory.size(); i++)
			{
				System.out.printf("MidCode.%d  %s\n", i, database.tb_00_midCategory.get(i) );
			}
			System.out.println("□□□□□□□□ << 중분류 >> □□□□□□□□");	
			
			System.out.println(); 
			System.out.println("(int) 중분류 코드를 입력해주세요>>>");
			iMidCode = Integer.parseInt(s.nextLine()); 
			category.setMidCode(iMidCode);
			
			System.out.println();
			System.out.println();
			System.out.printf("> MidCode: %d번 [%s]을/를 선택하셨습니다.", iMidCode, database.tb_00_midCategory.get(iMidCode));
			System.out.println();
			break;
			
		case 1:
			for(int i = 0 ; i < database.tb_01_midCategory.size(); i++)
			{
				System.out.printf("MidCode.%d  %s\n", i, database.tb_01_midCategory.get(i) );
			}	
			System.out.println("□□□□□□□□ << 중분류 >> □□□□□□□□");

			System.out.println(); 
			System.out.println("(int) 중분류 코드를 입력해주세요>>>");
			iMidCode = Integer.parseInt(s.nextLine()); 
			category.setMidCode(iMidCode);
			
			System.out.println();
			System.out.println();
			System.out.printf("> MidCode: %d번 [%s]을/를 선택하셨습니다.", iMidCode, database.tb_01_midCategory.get(iMidCode));
			System.out.println();
			break;
			
		case 2:
			for(int i = 0 ; i < database.tb_02_midCategory.size(); i++)
			{
				System.out.printf("MidCode.%d  %s\n", i, database.tb_02_midCategory.get(i) );
			}
			System.out.println("□□□□□□□□ << 중분류 >> □□□□□□□□");
			
			System.out.println(); 
			System.out.println("(int) 중분류 코드를 입력해주세요>>>");
			iMidCode = Integer.parseInt(s.nextLine()); 
			category.setMidCode(iMidCode);
			
			System.out.println();
			System.out.println();
			System.out.printf("> MidCode: %d번 [%s]을/를 선택하셨습니다.", iMidCode, database.tb_02_midCategory.get(iMidCode));
			System.out.println();
			break;
		case 3:
			for(int i = 0 ; i < database.tb_03_midCategory.size(); i++)
			{
				System.out.printf("MidCode.%d  %s\n", i, database.tb_03_midCategory.get(i) );
			}
			System.out.println("□□□□□□□□ << 중분류 >> □□□□□□□□");
			
			System.out.println(); 
			System.out.println("(int) 중분류 코드를 입력해주세요>>>");
			iMidCode = Integer.parseInt(s.nextLine()); 
			category.setMidCode(iMidCode);
			
			System.out.println();
			System.out.println();
			System.out.printf("> MidCode: %d번 [%s]을/를 선택하셨습니다.", iMidCode, database.tb_03_midCategory.get(iMidCode));
			System.out.println();
			break;
		case 4:
			for(int i = 0 ; i < database.tb_04_midCategory.size(); i++)
			{
				System.out.printf("MidCode.%d  %s\n", i, database.tb_04_midCategory.get(i) );
			}
			System.out.println("□□□□□□□□ << 중분류 >> □□□□□□□□");

			System.out.println(); 
			System.out.println("(int) 중분류 코드를 입력해주세요>>>");
			iMidCode = Integer.parseInt(s.nextLine()); 
			category.setMidCode(iMidCode);
			
			System.out.println();
			System.out.println();
			System.out.printf("> MidCode: %d번 [%s]을/를 선택하셨습니다.", iMidCode, database.tb_04_midCategory.get(iMidCode));
			System.out.println();
			break;
		case 5:
			for(int i = 0 ; i < database.tb_05_midCategory.size(); i++)
			{
				System.out.printf("MidCode.%d  %s\n", i, database.tb_05_midCategory.get(i) );
			}
			System.out.println("□□□□□□□□ << 중분류 >> □□□□□□□□");

			System.out.println(); 
			System.out.println("(int) 중분류 코드를 입력해주세요>>>");
			iMidCode = Integer.parseInt(s.nextLine()); 
			category.setMidCode(iMidCode);
			
			System.out.println();
			System.out.println();
			System.out.printf("> MidCode: %d번 [%s]을/를 선택하셨습니다.", iMidCode, database.tb_05_midCategory.get(iMidCode));
			System.out.println();
			break;
		case 6:
			for(int i = 0 ; i < database.tb_06_midCategory.size(); i++)
			{
				System.out.printf("MidCode.%d  %s\n", i, database.tb_06_midCategory.get(i) );
			}
			System.out.println("□□□□□□□□ << 중분류 >> □□□□□□□□");

			System.out.println(); 
			System.out.println("(int) 중분류 코드를 입력해주세요>>>");
			iMidCode = Integer.parseInt(s.nextLine()); 
			category.setMidCode(iMidCode);
			
			System.out.println();
			System.out.println();
			System.out.printf("> MidCode: %d번 [%s]을/를 선택하셨습니다.", iMidCode, database.tb_06_midCategory.get(iMidCode));
			System.out.println();
			break;
		case 7:
			for(int i = 0 ; i < database.tb_07_midCategory.size(); i++)
			{
				System.out.printf("MidCode.%d  %s\n", i, database.tb_07_midCategory.get(i) );
			}
			System.out.println("□□□□□□□□ << 중분류 >> □□□□□□□□");

			System.out.println(); 
			System.out.println("(int) 중분류 코드를 입력해주세요>>>");
			iMidCode = Integer.parseInt(s.nextLine()); 
			category.setMidCode(iMidCode);
			
			System.out.println();
			System.out.println();
			System.out.printf("> MidCode: %d번 [%s]을/를 선택하셨습니다.", iMidCode, database.tb_07_midCategory.get(iMidCode));
			System.out.println();
			break;
		case 8:
			for(int i = 0 ; i < database.tb_08_midCategory.size(); i++)
			{
				System.out.printf("MidCode.%d  %s\n", i, database.tb_08_midCategory.get(i) );
			}
			System.out.println("□□□□□□□□ << 중분류 >> □□□□□□□□");

			System.out.println(); 
			System.out.println("(int) 중분류 코드를 입력해주세요>>>");
			iMidCode = Integer.parseInt(s.nextLine()); 
			category.setMidCode(iMidCode);
			
			System.out.println();
			System.out.println();
			System.out.printf("> MidCode: %d번 [%s]을/를 선택하셨습니다.", iMidCode, database.tb_08_midCategory.get(iMidCode));
			System.out.println();
			break;
		case 9:
			for(int i = 0 ; i < database.tb_09_midCategory.size(); i++)
			{
				System.out.printf("MidCode.%d  %s\n", i, database.tb_09_midCategory.get(i) );
			}
			System.out.println("□□□□□□□□ << 중분류 >> □□□□□□□□");

			System.out.println(); 
			System.out.println("(int) 중분류 코드를 입력해주세요>>>");
			iMidCode = Integer.parseInt(s.nextLine()); 
			category.setMidCode(iMidCode);
			
			System.out.println();
			System.out.println();
			System.out.printf("> MidCode: %d번 [%s]을/를 선택하셨습니다.", iMidCode, database.tb_09_midCategory.get(iMidCode));
			System.out.println();
			break;
		case 10:
			for(int i = 0 ; i < database.tb_10_midCategory.size(); i++)
			{
				System.out.printf("MidCode.%d  %s\n", i, database.tb_10_midCategory.get(i) );
			}
			System.out.println("□□□□□□□□ << 중분류 >> □□□□□□□□");

			System.out.println(); 
			System.out.println("(int) 중분류 코드를 입력해주세요>>>");
			iMidCode = Integer.parseInt(s.nextLine()); 
			category.setMidCode(iMidCode);
			
			System.out.println();
			System.out.println();
			System.out.printf("> MidCode: %d번 [%s]을/를 선택하셨습니다.", iMidCode, database.tb_10_midCategory.get(iMidCode));
			System.out.println();
			break;
		case 11:
			for(int i = 0 ; i < database.tb_11_midCategory.size(); i++)
			{
				System.out.printf("MidCode.%d  %s\n", i, database.tb_11_midCategory.get(i) );
			}
			System.out.println("□□□□□□□□ << 중분류 >> □□□□□□□□");

			System.out.println(); 
			System.out.println("(int) 중분류 코드를 입력해주세요>>>");
			iMidCode = Integer.parseInt(s.nextLine()); 
			category.setMidCode(iMidCode);
			
			System.out.println();
			System.out.println();
			System.out.printf("> MidCode: %d번 [%s]을/를 선택하셨습니다.", iMidCode, database.tb_11_midCategory.get(iMidCode));
			System.out.println();
			break;
		default:
			break;
		}
		
//		System.out.println(database.tb_bigCategory.size());
//		System.out.println("□□□□□□□□ << 중분류 >> □□□□□□□□");
//		for(int i = 0 ; i < database.tb_bigCategory.size(); i++)
//		{
//			System.out.printf("Code.%d  %s\n", i, database.tb_bigCategory.get(i) );
//		}
//		System.out.println("□□□□□□□□ << 중분류 >> □□□□□□□□");
		
			
//		remove
//		int CategoryId = categoryList.size();			//Category Id++
//		System.out.println("(int) 카테고리 아이디를 입력해주세요>>>");
//		CategoryId = Integer.parseInt(s.nextLine()); 
//		category.setCategoryId(CategoryId);
//		int productId = category.getProductId();
//		System.out.println("(int)상품 아이디를 입력해주세요>>>");
//		productId = Integer.parseInt(s.nextLine());
//		category.setProductId(productId);
		
		String productName;
		System.out.println("상품명을 입력해주세요>>>");
		productName = s.nextLine();
		category.setProductName(productName);

		int productPrice;
		System.out.println("(int) 상품 가격을 입력해주세요>>>");
		productPrice = Integer.parseInt(s.nextLine());
		category.setProductPrice(productPrice);
		
		String productExplain;
		System.out.println("상품 설명을 입력해주세요>>>");
		productExplain = s.nextLine();
		category.setProductExplain(productExplain);
		
		String productRegDate;
		System.out.println("날짜를 입력해주세요>>>");
		
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
		System.out.println("--printCategoryList || 판매상품 출력--");
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
		System.out.println("--searchCategoryWithKeyword || 판매상품 검색----");
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
			System.out.println("검색할 이름을 입력하세요 >");
			System.out.println("종료하시려면 'exit'를 입력하세요 >");
			Scanner s = new Scanner(System.in);
			
			String strInput = s.nextLine();
			
			if( strInput.equals("exit"))
			{
				System.out.println("종료!");
				break;
			}
		}
		
	}
	
	
	
	
}
