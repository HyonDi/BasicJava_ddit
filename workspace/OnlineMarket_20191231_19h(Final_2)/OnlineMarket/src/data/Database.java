package data;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import vo.BoardVO;
import vo.CartVO;
import vo.CategoryVO;	//hh.joo 20191225 add
import vo.PayListVO;
import vo.PayVO;
import vo.UserVO;

public class Database {
	
private static Database instance;
	
	private Database(){}
	
	public static Database getInstance() {
		
		if(instance == null)
		{
			instance = new Database();
		}
		return instance;
	}

	//hh.joo 20191227 add
	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	Date time = new Date();
	String yyyyMMdd = format.format(time);
	
	public ArrayList<UserVO> tb_user = new ArrayList<>();
	//initial
	{
		UserVO user = new UserVO();
		user.setId("admin");
		user.setPassword("admin");
		user.setName("administrator");
		user.setAddress("Mars");
		tb_user.add(user);
	}


	//hh.joo 20191220 add
	public ArrayList<BoardVO> tb_board = new ArrayList<>();
	{
		BoardVO board = new BoardVO();
		board.setNo(0);
		board.setStar(1);
		board.setContents("test");
		board.setWriter("admin");
		board.setRegDate(yyyyMMdd);
		tb_board.add(board);
	}

	//hh.joo 20191226 remove
//	//ch. yun 20191224 add
//	public ArrayList<ProductVO> tb_product = new ArrayList<>();
//	{
//	}
	

	//null 20191228 add	
	public ArrayList<PayListVO> tb_pay = new ArrayList<>();
	{
		PayListVO pay = new PayListVO();
		tb_pay.add(pay);
	}

	//hh.joo 20191225 add
	public ArrayList<CategoryVO> tb_category = new ArrayList<>();
	{
		CategoryVO category = new CategoryVO();
		category.setBigCode(0);		//0 : brand fashion
		category.setMidCode(0);		//0 : brand female
		category.setSmallCode(0);	//0 : one-piece
		category.setCategoryId(111);
		category.setUserId("admin");
		category.setProductId(111);
		category.setProductName("Long One-piece");
		category.setProductExplain("A One-piece");
		category.setProductRegDate(yyyyMMdd);
		//null 1231
		category.setProductQuantity(3);	
		category.setProductPrice(100);
		
		tb_category.add(category);

		//hh.joo 20191227 add more obj	//test
		CategoryVO category2 = new CategoryVO();
		category2.setBigCode(0);		//0 : brand fashion
		category2.setMidCode(0);		//0 : brand female
		category2.setSmallCode(0);		//0 : one-piece
		category2.setCategoryId(112);
		category2.setUserId("admin");
		category2.setProductId(112);
		category2.setProductName("Pen");
		category2.setProductExplain("ThisIsTest");
		category2.setProductRegDate(yyyyMMdd);
		//null 1231
		category2.setProductQuantity(4);	
		category2.setProductPrice(200);
		
		
		tb_category.add(category2);		

		CategoryVO category3 = new CategoryVO();
		category3.setBigCode(0);		//0 : brand fashion
		category3.setMidCode(0);		//0 : brand female
		category3.setSmallCode(0);	//0 : one-piece
		category3.setCategoryId(113);
		category3.setUserId("admin");
		category3.setProductId(113);
		category3.setProductName("Book");
		category3.setProductExplain("ThisIsTest");
		category3.setProductRegDate(yyyyMMdd);
		//null 1231
		category3.setProductQuantity(5);	
		category3.setProductPrice(300);
		
		
		tb_category.add(category3);		

		
	}
	
	//hh.joo 20191226 add
	public ArrayList<CartVO> tb_cart = new ArrayList<>();
	{
		CartVO cart = new CartVO();
		cart.setCartId(0);
		cart.setProductId(111);
		cart.setQuantity(1);
		cart.setUserId("admin");
		tb_cart.add(cart);
		
//		CartVO cart2 = new CartVO();
//		cart2.setCartId(1);
//		cart2.setProductId(112);
//		cart2.setQuantity(1);
//		cart2.setUserId("admin");
//		tb_cart.add(cart2);
	}
	
	
	//hj.kang
	public ArrayList<String> tb_bigCategory = new ArrayList<>();
	{
		tb_bigCategory.add("�귣�� �м�");
		tb_bigCategory.add("�Ƿ�/��ȭ");
		tb_bigCategory.add("��Ƽ");
		tb_bigCategory.add("����/�ڵ���");
		tb_bigCategory.add("��ǰ");
		tb_bigCategory.add("���/����");
		tb_bigCategory.add("��Ȱ/�ǰ�");
		tb_bigCategory.add("����/���׸���");
		tb_bigCategory.add("������/����/��ǻ��");
		tb_bigCategory.add("����/���/�ݷ�����");
		tb_bigCategory.add("����/����/e����");
		tb_bigCategory.add("�ؿ� ����");
	}
	
	public ArrayList<String> tb_00_midCategory = new ArrayList<>();
	{
		tb_00_midCategory.add("�귣�� �����Ƿ�");
		tb_00_midCategory.add("�귣�� �����Ź�");
		tb_00_midCategory.add("�귣�� �ð�");
		tb_00_midCategory.add("�����̳� �����Ƿ�");
		tb_00_midCategory.add("�귣�� �����Ƿ�");
		tb_00_midCategory.add("�귣�� �����Ź�");
		tb_00_midCategory.add("�귣�� ���");
		tb_00_midCategory.add("�����̳� �����Ƿ�");
		tb_00_midCategory.add("�귣�� ��������");
		tb_00_midCategory.add("�귣�� ��������");
		tb_00_midCategory.add("�����̳� ��ȭ");
		tb_00_midCategory.add("�귣�� ��ȭ/��ǰ");
		tb_00_midCategory.add("�귣�� ����/��Ʈ");
		tb_00_midCategory.add("�귣�� ���డ��");
		tb_00_midCategory.add("���� ��ǰ");
	}
	
	public ArrayList<String> tb_01_midCategory = new ArrayList<>();
	{
		tb_01_midCategory.add("�����Ƿ�");
		tb_01_midCategory.add("�����Ź�");
		tb_01_midCategory.add("��������");
		tb_01_midCategory.add("���");
		tb_01_midCategory.add("�����Ƿ�");
		tb_01_midCategory.add("�����Ź�");
		tb_01_midCategory.add("��������");
		tb_01_midCategory.add("���డ��/��ǰ");
		tb_01_midCategory.add("�������/���");
		tb_01_midCategory.add("�м���ȭ");
		tb_01_midCategory.add("����/��Ʈ");
		tb_01_midCategory.add("�ð�");
		tb_01_midCategory.add("����/������");
		tb_01_midCategory.add("�Ż����Ƿ�");
		tb_01_midCategory.add("�Ƶ�/�ִϾ��Ƿ�");
		tb_01_midCategory.add("�����Ƿ�");
		tb_01_midCategory.add("���Ƶ��Ź�");
		tb_01_midCategory.add("���Ƶ���ȭ");
		tb_01_midCategory.add("�Ӻκ�/��ǰ");
	}
	
	public ArrayList<String> tb_02_midCategory = new ArrayList<>();
	{
		tb_02_midCategory.add("��Ų�ɾ�");
		tb_02_midCategory.add("����ũ��");
		tb_02_midCategory.add("���ɾ�");
		tb_02_midCategory.add("����ȭ��ǰ");
		tb_02_midCategory.add("Ŭ��¡/�ʸ�");
		tb_02_midCategory.add("���");
		tb_02_midCategory.add("����ɾ�");
		tb_02_midCategory.add("�ٵ��ɾ�");
		tb_02_midCategory.add("�����ɾ�");
		tb_02_midCategory.add("��Ƽ��ǰ");
		
	}
	
	public ArrayList<String> tb_03_midCategory = new ArrayList<>();
	{
		tb_03_midCategory.add("�������Ƿ�");
		tb_03_midCategory.add("���/�ƿ�����");
		tb_03_midCategory.add("ķ��");
		tb_03_midCategory.add("�ڵ�����ǰ");
		tb_03_midCategory.add("��������ȭ");
		tb_03_midCategory.add("������");
		tb_03_midCategory.add("����");
		tb_03_midCategory.add("����");
		tb_03_midCategory.add("�������Ź�");
		tb_03_midCategory.add("��Ű/����");
		tb_03_midCategory.add("����");
		tb_03_midCategory.add("�ڵ������");
		tb_03_midCategory.add("�ｺ");
		tb_03_midCategory.add("�䰡/�ʶ��׽�");
		tb_03_midCategory.add("��������/�ζ���/ű����");
		tb_03_midCategory.add("����/�������");
		tb_03_midCategory.add("�˵�/����/����");
		tb_03_midCategory.add("���⽺����");
		tb_03_midCategory.add("���Ͻ�����");
		tb_03_midCategory.add("����/���ȿ�ǰ");
		tb_03_midCategory.add("�������/������");
		tb_03_midCategory.add("����");
		tb_03_midCategory.add("��Ų������/������");
		tb_03_midCategory.add("��Ÿ������");
	}
	
	public ArrayList<String> tb_04_midCategory = new ArrayList<>();
	{
		tb_04_midCategory.add("���");
		tb_04_midCategory.add("����");
		tb_04_midCategory.add("���");
		tb_04_midCategory.add("����/����������");
		tb_04_midCategory.add("��ġ");
		tb_04_midCategory.add("������ǰ");
		tb_04_midCategory.add("Ŀ��/����/����");
		tb_04_midCategory.add("����/����");
		tb_04_midCategory.add("�Ｎ��ǰ");
		tb_04_midCategory.add("�ǰ���ǰ");
		tb_04_midCategory.add("���̾�Ʈ��ǰ");
	}
	
	public ArrayList<String> tb_05_midCategory = new ArrayList<>();
	{
		tb_05_midCategory.add("������");
		tb_05_midCategory.add("���/�����ǰ");
		tb_05_midCategory.add("���Ƹ��/��Ų�ɾ�");
		tb_05_midCategory.add("�峭��");
		tb_05_midCategory.add("����");
		tb_05_midCategory.add("������ǰ");
		tb_05_midCategory.add("���Ƽ���/������ǰ");
		tb_05_midCategory.add("�Ƶ�/�ִϾ��Ƿ�");
		tb_05_midCategory.add("��Ƽ��");
		tb_05_midCategory.add("������ǰ");
		tb_05_midCategory.add("���ƾ���/�ǳ���ǰ");
		tb_05_midCategory.add("���Ƶ��Ź�");
		tb_05_midCategory.add("���Ƶ���/������");
		tb_05_midCategory.add("�����ǰ");
		tb_05_midCategory.add("�����Ƿ�");
		tb_05_midCategory.add("���Ƶ���ȭ");
		tb_05_midCategory.add("���ư���/ħ��");
		tb_05_midCategory.add("�Ӻκ�/��ǰ");
		tb_05_midCategory.add("�Ż����Ƿ�");
	}
	
	public ArrayList<String> tb_06_midCategory = new ArrayList<>();
	{
		tb_06_midCategory.add("�ֹ��ǰ");
		tb_06_midCategory.add("����������ǰ");
		tb_06_midCategory.add("��ǿ�ǰ");
		tb_06_midCategory.add("û�ҿ�ǰ");
		tb_06_midCategory.add("��Ź��ǰ");
		tb_06_midCategory.add("����/����/����");
		tb_06_midCategory.add("ȭ����");
		tb_06_midCategory.add("������/���α�����");
		tb_06_midCategory.add("����/����/�鵵");
		tb_06_midCategory.add("��Ȱ��ȭ");
		tb_06_midCategory.add("�ֹ���ȭ");
		tb_06_midCategory.add("�ȸ���ǰ");
		tb_06_midCategory.add("�¿�/������ǰ");
		tb_06_midCategory.add("������/���ܼ���ǰ");
		tb_06_midCategory.add("�ǰ�������ǰ");
		tb_06_midCategory.add("�索������ǰ");
		tb_06_midCategory.add("�ǰ�������ǰ");
		tb_06_midCategory.add("���Ű�����ǰ");
		tb_06_midCategory.add("���ǰ���ǰ");
		tb_06_midCategory.add("�չ߰ǰ���ǰ");
		tb_06_midCategory.add("�ǹ���ǰ");
		tb_06_midCategory.add("��Ȱ���ǰ");
		tb_06_midCategory.add("�����Ƿ��ǰ");
		tb_06_midCategory.add("����/�Ƿ��ǰ");
	}
	
	public ArrayList<String> tb_07_midCategory = new ArrayList<>();
	{
		tb_07_midCategory.add("ħ�ǰ���");
		tb_07_midCategory.add("�Žǰ���");
		tb_07_midCategory.add("����/�繫�밡��");
		tb_07_midCategory.add("���Ƶ�����");
		tb_07_midCategory.add("���𵨸�����");
		tb_07_midCategory.add("��������");
		tb_07_midCategory.add("�ֹ氡��");
		tb_07_midCategory.add("Ŀư/�����ε�");
		tb_07_midCategory.add("ħ��");
		tb_07_midCategory.add("���׸����ǰ");
		tb_07_midCategory.add("ī��Ʈ/����");
		tb_07_midCategory.add("����");
		tb_07_midCategory.add("Ȩ��Ʈ��/����");
		tb_07_midCategory.add("DIY����/��ǰ");
		tb_07_midCategory.add("�ƿ������");
	}
	
	public ArrayList<String> tb_08_midCategory = new ArrayList<>();
	{
		tb_08_midCategory.add("Tv");
		tb_08_midCategory.add("��������");
		tb_08_midCategory.add("��Ʈ��");
		tb_08_midCategory.add("����Ʈ���");
		tb_08_midCategory.add("�����");
		tb_08_midCategory.add("ī�޶�/�ֺ����");
		tb_08_midCategory.add("�����");
		tb_08_midCategory.add("�޴���");
		tb_08_midCategory.add("��Ź��/������");
		tb_08_midCategory.add("������");
		tb_08_midCategory.add("����ũž");
		tb_08_midCategory.add("�º���");
		tb_08_midCategory.add("�ֹ氡��");
		tb_08_midCategory.add("���Ⱑ��");
		tb_08_midCategory.add("������/���ձ�");
		tb_08_midCategory.add("����");
		tb_08_midCategory.add("�̹̿밡��");
		tb_08_midCategory.add("������ġ");
		tb_08_midCategory.add("PC��ǰ");
		tb_08_midCategory.add("��ǻ�� �ֺ����");
		tb_08_midCategory.add("��Ȱ����");
		tb_08_midCategory.add("������Ż");
	}
	
	public ArrayList<String> tb_09_midCategory = new ArrayList<>();
	{
		tb_09_midCategory.add("����/����");
		tb_09_midCategory.add("����/�繫��ǰ");
		tb_09_midCategory.add("ȭ���ǰ");
		tb_09_midCategory.add("�ɹ��");
		tb_09_midCategory.add("�Ǳ�");
		tb_09_midCategory.add("���");
		tb_09_midCategory.add("��/����");
		tb_09_midCategory.add("��������ǰ");
		tb_09_midCategory.add("�����̿�ǰ");
		tb_09_midCategory.add("�����/������");
		tb_09_midCategory.add("������ǰ");
		tb_09_midCategory.add("�ҵ�����ǰ");
		
	}
	
	public ArrayList<String> tb_10_midCategory = new ArrayList<>();
	{
		tb_10_midCategory.add("����/����/�װ�");
		tb_10_midCategory.add("Ƽ��/����");
		tb_10_midCategory.add("e����/��ǰ��");
		tb_10_midCategory.add("Ȩ&ī����");
	
	}
	
	public ArrayList<String> tb_11_midCategory = new ArrayList<>();
	{
		tb_11_midCategory.add("�ؿ����� Ȩ");
		tb_11_midCategory.add("�Ƿ�/�������");
		tb_11_midCategory.add("�м���ȭ");
		tb_11_midCategory.add("��Ƽ");
		tb_11_midCategory.add("��ǰ/������");
		tb_11_midCategory.add("������/����");
		tb_11_midCategory.add("����/��Ȱ");
	}
}





















