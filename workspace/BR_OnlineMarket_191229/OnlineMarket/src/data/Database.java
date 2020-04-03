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
		tb_user.add(user);
	}


	//hh.joo 20191220 add
	public ArrayList<BoardVO> tb_board = new ArrayList<>();
	{
		BoardVO board = new BoardVO();
		board.setNo(0);
		board.setTitle("test");
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
		
		tb_category.add(category3);		

		
	}
	
	//hh.joo 20191226 add
	public ArrayList<CartVO> tb_cart = new ArrayList<>();
	{
		CartVO cart = new CartVO();
		cart.setCartId(0);
		cart.setUserId("admin");
		cart.setQuantity(1);
		cart.setProductId(0);
		
		tb_cart.add(cart);
	}
	
	
	//hj.kang
	public ArrayList<String> tb_bigCategory = new ArrayList<>();
	{
		tb_bigCategory.add("브랜드 패션");
		tb_bigCategory.add("의류/잡화");
		tb_bigCategory.add("뷰티");
		tb_bigCategory.add("레저/자동차");
		tb_bigCategory.add("식품");
		tb_bigCategory.add("출산/육아");
		tb_bigCategory.add("생활/건강");
		tb_bigCategory.add("가구/인테리어");
		tb_bigCategory.add("디지털/가전/컴퓨터");
		tb_bigCategory.add("도서/취미/반려동물");
		tb_bigCategory.add("여행/공연/e쿠폰");
		tb_bigCategory.add("해외 직구");
	}
	
	public ArrayList<String> tb_00_midCategory = new ArrayList<>();
	{
		tb_00_midCategory.add("브랜드 여성의류");
		tb_00_midCategory.add("브랜드 여성신발");
		tb_00_midCategory.add("브랜드 시계");
		tb_00_midCategory.add("디자이너 여성의류");
		tb_00_midCategory.add("브랜드 남성의류");
		tb_00_midCategory.add("브랜드 남성신발");
		tb_00_midCategory.add("브랜드 쥬얼리");
		tb_00_midCategory.add("디자이너 남성의류");
		tb_00_midCategory.add("브랜드 여성가방");
		tb_00_midCategory.add("브랜드 남성가방");
		tb_00_midCategory.add("디자이너 잡화");
		tb_00_midCategory.add("브랜드 잡화/소품");
		tb_00_midCategory.add("브랜드 지갑/벨트");
		tb_00_midCategory.add("브랜드 여행가방");
		tb_00_midCategory.add("수입 명품");
	}
	
	public ArrayList<String> tb_01_midCategory = new ArrayList<>();
	{
		tb_01_midCategory.add("여성의류");
		tb_01_midCategory.add("여성신발");
		tb_01_midCategory.add("여성가방");
		tb_01_midCategory.add("쥬얼리");
		tb_01_midCategory.add("남성의류");
		tb_01_midCategory.add("남성신발");
		tb_01_midCategory.add("남성가방");
		tb_01_midCategory.add("여행가방/소품");
		tb_01_midCategory.add("언더웨어/잠옷");
		tb_01_midCategory.add("패션잡화");
		tb_01_midCategory.add("지갑/벨트");
		tb_01_midCategory.add("시계");
		tb_01_midCategory.add("순급/돌반지");
		tb_01_midCategory.add("신생아의류");
		tb_01_midCategory.add("아동/주니어의류");
		tb_01_midCategory.add("유아의류");
		tb_01_midCategory.add("유아동신발");
		tb_01_midCategory.add("유아동잡화");
		tb_01_midCategory.add("임부복/소품");
	}
	
	public ArrayList<String> tb_02_midCategory = new ArrayList<>();
	{
		tb_02_midCategory.add("스킨케어");
		tb_02_midCategory.add("메이크업");
		tb_02_midCategory.add("선케어");
		tb_02_midCategory.add("남성화장품");
		tb_02_midCategory.add("클렌징/필링");
		tb_02_midCategory.add("향수");
		tb_02_midCategory.add("헤어케어");
		tb_02_midCategory.add("바디케어");
		tb_02_midCategory.add("네일케어");
		tb_02_midCategory.add("뷰티소품");
		
	}
	
	public ArrayList<String> tb_03_midCategory = new ArrayList<>();
	{
		tb_03_midCategory.add("스포츠의류");
		tb_03_midCategory.add("등산/아웃도어");
		tb_03_midCategory.add("캠핑");
		tb_03_midCategory.add("자동차용품");
		tb_03_midCategory.add("스포츠잡화");
		tb_03_midCategory.add("자전거");
		tb_03_midCategory.add("골프");
		tb_03_midCategory.add("공구");
		tb_03_midCategory.add("스포츠신발");
		tb_03_midCategory.add("스키/보드");
		tb_03_midCategory.add("낚시");
		tb_03_midCategory.add("자동차기기");
		tb_03_midCategory.add("헬스");
		tb_03_midCategory.add("요가/필라테스");
		tb_03_midCategory.add("전동레저/인라인/킥보드");
		tb_03_midCategory.add("전기/산업자재");
		tb_03_midCategory.add("검도/권투/격투");
		tb_03_midCategory.add("구기스포츠");
		tb_03_midCategory.add("라켓스포츠");
		tb_03_midCategory.add("안전/보안용품");
		tb_03_midCategory.add("오토바이/스쿠터");
		tb_03_midCategory.add("수영");
		tb_03_midCategory.add("스킨스쿠버/수상레저");
		tb_03_midCategory.add("기타스포츠");
	}
	
	public ArrayList<String> tb_04_midCategory = new ArrayList<>();
	{
		tb_04_midCategory.add("농산");
		tb_04_midCategory.add("수산");
		tb_04_midCategory.add("축산");
		tb_04_midCategory.add("반찬/간편가정식");
		tb_04_midCategory.add("김치");
		tb_04_midCategory.add("가공식품");
		tb_04_midCategory.add("커피/생수/음료");
		tb_04_midCategory.add("과자/간식");
		tb_04_midCategory.add("즉석식품");
		tb_04_midCategory.add("건강식품");
		tb_04_midCategory.add("다이어트식품");
	}
	
	public ArrayList<String> tb_05_midCategory = new ArrayList<>();
	{
		tb_05_midCategory.add("기저귀");
		tb_05_midCategory.add("출산/돌기념품");
		tb_05_midCategory.add("유아목욕/스킨케어");
		tb_05_midCategory.add("장난감");
		tb_05_midCategory.add("분유");
		tb_05_midCategory.add("이유용품");
		tb_05_midCategory.add("유아세제/위생용품");
		tb_05_midCategory.add("아동/주니어의류");
		tb_05_midCategory.add("물티슈");
		tb_05_midCategory.add("수유용품");
		tb_05_midCategory.add("유아안전/실내용품");
		tb_05_midCategory.add("유아동신발");
		tb_05_midCategory.add("유아동식/영양제");
		tb_05_midCategory.add("외출용품");
		tb_05_midCategory.add("유아의류");
		tb_05_midCategory.add("유아동잡화");
		tb_05_midCategory.add("유아가구/침구");
		tb_05_midCategory.add("임부복/소품");
		tb_05_midCategory.add("신생아의류");
	}
	
	public ArrayList<String> tb_06_midCategory = new ArrayList<>();
	{
		tb_06_midCategory.add("주방용품");
		tb_06_midCategory.add("수납정리용품");
		tb_06_midCategory.add("욕실용품");
		tb_06_midCategory.add("청소용품");
		tb_06_midCategory.add("세탁용품");
		tb_06_midCategory.add("세제/방향/살충");
		tb_06_midCategory.add("화장지");
		tb_06_midCategory.add("생리대/성인기저귀");
		tb_06_midCategory.add("구강/세안/면도");
		tb_06_midCategory.add("생활잡화");
		tb_06_midCategory.add("주방잡화");
		tb_06_midCategory.add("안마용품");
		tb_06_midCategory.add("온열/찜질용품");
		tb_06_midCategory.add("저주파/적외선용품");
		tb_06_midCategory.add("건강관리용품");
		tb_06_midCategory.add("당뇨관리용품");
		tb_06_midCategory.add("건강측정용품");
		tb_06_midCategory.add("몸매관리용품");
		tb_06_midCategory.add("눈건강용품");
		tb_06_midCategory.add("손발건강용품");
		tb_06_midCategory.add("실버용품");
		tb_06_midCategory.add("재활운동용품");
		tb_06_midCategory.add("가정의료용품");
		tb_06_midCategory.add("병원/의료용품");
	}
	
	public ArrayList<String> tb_07_midCategory = new ArrayList<>();
	{
		tb_07_midCategory.add("침실가구");
		tb_07_midCategory.add("거실가구");
		tb_07_midCategory.add("서재/사무용가구");
		tb_07_midCategory.add("유아동가구");
		tb_07_midCategory.add("리모델링가구");
		tb_07_midCategory.add("수납가구");
		tb_07_midCategory.add("주방가구");
		tb_07_midCategory.add("커튼/블라인드");
		tb_07_midCategory.add("침구");
		tb_07_midCategory.add("인테리어소품");
		tb_07_midCategory.add("카페트/러그");
		tb_07_midCategory.add("조명");
		tb_07_midCategory.add("홈패트릭/수예");
		tb_07_midCategory.add("DIY자재/용품");
		tb_07_midCategory.add("아웃도어가구");
	}
	
	public ArrayList<String> tb_08_midCategory = new ArrayList<>();
	{
		tb_08_midCategory.add("Tv");
		tb_08_midCategory.add("계절가전");
		tb_08_midCategory.add("노트북");
		tb_08_midCategory.add("스마트기기");
		tb_08_midCategory.add("냉장고");
		tb_08_midCategory.add("카메라/주변기기");
		tb_08_midCategory.add("모니터");
		tb_08_midCategory.add("휴대폰");
		tb_08_midCategory.add("세탁기/건조기");
		tb_08_midCategory.add("영상가전");
		tb_08_midCategory.add("데스크탑");
		tb_08_midCategory.add("태블릿");
		tb_08_midCategory.add("주방가전");
		tb_08_midCategory.add("음향가전");
		tb_08_midCategory.add("프린터/복합기");
		tb_08_midCategory.add("게임");
		tb_08_midCategory.add("이미용가전");
		tb_08_midCategory.add("저장장치");
		tb_08_midCategory.add("PC부품");
		tb_08_midCategory.add("컴퓨터 주변기기");
		tb_08_midCategory.add("생활가전");
		tb_08_midCategory.add("가전렌탈");
	}
	
	public ArrayList<String> tb_09_midCategory = new ArrayList<>();
	{
		tb_09_midCategory.add("도서/음반");
		tb_09_midCategory.add("문구/사무용품");
		tb_09_midCategory.add("화방용품");
		tb_09_midCategory.add("꽃배달");
		tb_09_midCategory.add("악기");
		tb_09_midCategory.add("취미");
		tb_09_midCategory.add("꽃/원예");
		tb_09_midCategory.add("강아지용품");
		tb_09_midCategory.add("고양이용품");
		tb_09_midCategory.add("관상어/수족관");
		tb_09_midCategory.add("조류용품");
		tb_09_midCategory.add("소동물용품");
		
	}
	
	public ArrayList<String> tb_10_midCategory = new ArrayList<>();
	{
		tb_10_midCategory.add("여행/숙박/항공");
		tb_10_midCategory.add("티켓/공연");
		tb_10_midCategory.add("e쿠폰/상품권");
		tb_10_midCategory.add("홈&카서비스");
	
	}
	
	public ArrayList<String> tb_11_midCategory = new ArrayList<>();
	{
		tb_11_midCategory.add("해외직구 홈");
		tb_11_midCategory.add("의류/언더웨어");
		tb_11_midCategory.add("패션잡화");
		tb_11_midCategory.add("뷰티");
		tb_11_midCategory.add("식품/영양제");
		tb_11_midCategory.add("스포츠/레저");
		tb_11_midCategory.add("리빙/생활");
	}
}























