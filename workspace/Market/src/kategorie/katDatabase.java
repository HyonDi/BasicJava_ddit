package kategorie;

import java.util.ArrayList;

public class katDatabase {

	private static katDatabase instance;

	private katDatabase(){}
	
	public static katDatabase getInstance() {
		
		if(instance == null)
		{
			instance = new katDatabase();
		}
		return instance;
	}
	
	
	 ArrayList<String> tb_bigKat = new ArrayList<>();
	{
		tb_bigKat.add("브랜드 패션");
		tb_bigKat.add("의류/잡화");
		tb_bigKat.add("뷰티");
		tb_bigKat.add("레저/자동차");
		tb_bigKat.add("식품");
		tb_bigKat.add("출산/육아");
		tb_bigKat.add("생활/건강");
		tb_bigKat.add("가구/인테리어");
		tb_bigKat.add("디지털/가전/컴퓨터");
		tb_bigKat.add("도서/취미/반려동물");
		tb_bigKat.add("여행/공연/e쿠폰");
		tb_bigKat.add("해외 직구");
	}
	
	 ArrayList<String> tb_00_midKat = new ArrayList<>();
	{
		tb_00_midKat.add("브랜드 여성의류");
		tb_00_midKat.add("브랜드 여성신발");
		tb_00_midKat.add("브랜드 시계");
		tb_00_midKat.add("디자이너 여성의류");
		tb_00_midKat.add("브랜드 남성의류");
		tb_00_midKat.add("브랜드 남성신발");
		tb_00_midKat.add("브랜드 쥬얼리");
		tb_00_midKat.add("디자이너 남성의류");
		tb_00_midKat.add("브랜드 여성가방");
		tb_00_midKat.add("브랜드 남성가방");
		tb_00_midKat.add("디자이너 잡화");
		tb_00_midKat.add("브랜드 잡화/소품");
		tb_00_midKat.add("브랜드 지갑/벨트");
		tb_00_midKat.add("브랜드 여행가방");
		tb_00_midKat.add("수입 명품");
	}
	
	 ArrayList<String> tb_01_midKat = new ArrayList<>();
	{
		tb_01_midKat.add("여성의류");
		tb_01_midKat.add("여성신발");
		tb_01_midKat.add("여성가방");
		tb_01_midKat.add("쥬얼리");
		tb_01_midKat.add("남성의류");
		tb_01_midKat.add("남성신발");
		tb_01_midKat.add("남성가방");
		tb_01_midKat.add("여행가방/소품");
		tb_01_midKat.add("언더웨어/잠옷");
		tb_01_midKat.add("패션잡화");
		tb_01_midKat.add("지갑/벨트");
		tb_01_midKat.add("시계");
		tb_01_midKat.add("순급/돌반지");
		tb_01_midKat.add("신생아의류");
		tb_01_midKat.add("아동/주니어의류");
		tb_01_midKat.add("유아의류");
		tb_01_midKat.add("유아동신발");
		tb_01_midKat.add("유아동잡화");
		tb_01_midKat.add("임부복/소품");
	}
	
	 ArrayList<String> tb_02_midKat = new ArrayList<>();
	{
		tb_02_midKat.add("스킨케어");
		tb_02_midKat.add("메이크업");
		tb_02_midKat.add("선케어");
		tb_02_midKat.add("남성화장품");
		tb_02_midKat.add("클렌징/필링");
		tb_02_midKat.add("향수");
		tb_02_midKat.add("헤어케어");
		tb_02_midKat.add("바디케어");
		tb_02_midKat.add("네일케어");
		tb_02_midKat.add("뷰티소품");
		
	}
	
	 ArrayList<String> tb_03_midKat = new ArrayList<>();
	{
		tb_03_midKat.add("스포츠의류");
		tb_03_midKat.add("등산/아웃도어");
		tb_03_midKat.add("캠핑");
		tb_03_midKat.add("자동차용품");
		tb_03_midKat.add("스포츠잡화");
		tb_03_midKat.add("자전거");
		tb_03_midKat.add("골프");
		tb_03_midKat.add("공구");
		tb_03_midKat.add("스포츠신발");
		tb_03_midKat.add("스키/보드");
		tb_03_midKat.add("낚시");
		tb_03_midKat.add("자동차기기");
		tb_03_midKat.add("헬스");
		tb_03_midKat.add("요가/필라테스");
		tb_03_midKat.add("전동레저/인라인/킥보드");
		tb_03_midKat.add("전기/산업자재");
		tb_03_midKat.add("검도/권투/격투");
		tb_03_midKat.add("구기스포츠");
		tb_03_midKat.add("라켓스포츠");
		tb_03_midKat.add("안전/보안용품");
		tb_03_midKat.add("오토바이/스쿠터");
		tb_03_midKat.add("수영");
		tb_03_midKat.add("스킨스쿠버/수상레저");
		tb_03_midKat.add("기타스포츠");
	}
	
	 ArrayList<String> tb_04_midKat = new ArrayList<>();
	{
		tb_04_midKat.add("농산");
		tb_04_midKat.add("수산");
		tb_04_midKat.add("축산");
		tb_04_midKat.add("반찬/간편가정식");
		tb_04_midKat.add("김치");
		tb_04_midKat.add("가공식품");
		tb_04_midKat.add("커피/생수/음료");
		tb_04_midKat.add("과자/간식");
		tb_04_midKat.add("즉석식품");
		tb_04_midKat.add("건강식품");
		tb_04_midKat.add("다이어트식품");
	}
	
	 ArrayList<String> tb_05_midKat = new ArrayList<>();
	{
		tb_05_midKat.add("기저귀");
		tb_05_midKat.add("출산/돌기념품");
		tb_05_midKat.add("유아목욕/스킨케어");
		tb_05_midKat.add("장난감");
		tb_05_midKat.add("분유");
		tb_05_midKat.add("이유용품");
		tb_05_midKat.add("유아세제/위생용품");
		tb_05_midKat.add("아동/주니어의류");
		tb_05_midKat.add("물티슈");
		tb_05_midKat.add("수유용품");
		tb_05_midKat.add("유아안전/실내용품");
		tb_05_midKat.add("유아동신발");
		tb_05_midKat.add("유아동식/영양제");
		tb_05_midKat.add("외출용품");
		tb_05_midKat.add("유아의류");
		tb_05_midKat.add("유아동잡화");
		tb_05_midKat.add("유아가구/침구");
		tb_05_midKat.add("임부복/소품");
		tb_05_midKat.add("신생아의류");
	}
	
	 ArrayList<String> tb_06_midKat = new ArrayList<>();
	{
		tb_06_midKat.add("주방용품");
		tb_06_midKat.add("수납정리용품");
		tb_06_midKat.add("욕실용품");
		tb_06_midKat.add("청소용품");
		tb_06_midKat.add("세탁용품");
		tb_06_midKat.add("세제/방향/살충");
		tb_06_midKat.add("화장지");
		tb_06_midKat.add("생리대/성인기저귀");
		tb_06_midKat.add("구강/세안/면도");
		tb_06_midKat.add("생활잡화");
		tb_06_midKat.add("주방잡화");
		tb_06_midKat.add("안마용품");
		tb_06_midKat.add("온열/찜질용품");
		tb_06_midKat.add("저주파/적외선용품");
		tb_06_midKat.add("건강관리용품");
		tb_06_midKat.add("당뇨관리용품");
		tb_06_midKat.add("건강측정용품");
		tb_06_midKat.add("몸매관리용품");
		tb_06_midKat.add("눈건강용품");
		tb_06_midKat.add("손발건강용품");
		tb_06_midKat.add("실버용품");
		tb_06_midKat.add("재활운동용품");
		tb_06_midKat.add("가정의료용품");
		tb_06_midKat.add("병원/의료용품");
	}
	
	 ArrayList<String> tb_07_midKat = new ArrayList<>();
	{
		tb_07_midKat.add("침실가구");
		tb_07_midKat.add("거실가구");
		tb_07_midKat.add("서재/사무용가구");
		tb_07_midKat.add("유아동가구");
		tb_07_midKat.add("리모델링가구");
		tb_07_midKat.add("수납가구");
		tb_07_midKat.add("주방가구");
		tb_07_midKat.add("커튼/블라인드");
		tb_07_midKat.add("침구");
		tb_07_midKat.add("인테리어소품");
		tb_07_midKat.add("카페트/러그");
		tb_07_midKat.add("조명");
		tb_07_midKat.add("홈패트릭/수예");
		tb_07_midKat.add("DIY자재/용품");
		tb_07_midKat.add("아웃도어가구");
	}
	
	 ArrayList<String> tb_08_midKat = new ArrayList<>();
	{
		tb_08_midKat.add("Tv");
		tb_08_midKat.add("계절가전");
		tb_08_midKat.add("노트북");
		tb_08_midKat.add("스마트기기");
		tb_08_midKat.add("냉장고");
		tb_08_midKat.add("카메라/주변기기");
		tb_08_midKat.add("모니터");
		tb_08_midKat.add("휴대폰");
		tb_08_midKat.add("세탁기/건조기");
		tb_08_midKat.add("영상가전");
		tb_08_midKat.add("데스크탑");
		tb_08_midKat.add("태블릿");
		tb_08_midKat.add("주방가전");
		tb_08_midKat.add("음향가전");
		tb_08_midKat.add("프린터/복합기");
		tb_08_midKat.add("게임");
		tb_08_midKat.add("이미용가전");
		tb_08_midKat.add("저장장치");
		tb_08_midKat.add("PC부품");
		tb_08_midKat.add("컴퓨터 주변기기");
		tb_08_midKat.add("생활가전");
		tb_08_midKat.add("가전렌탈");
	}
	
	 ArrayList<String> tb_09_midKat = new ArrayList<>();
	{
		tb_09_midKat.add("도서/음반");
		tb_09_midKat.add("문구/사무용품");
		tb_09_midKat.add("화방용품");
		tb_09_midKat.add("꽃배달");
		tb_09_midKat.add("악기");
		tb_09_midKat.add("취미");
		tb_09_midKat.add("꽃/원예");
		tb_09_midKat.add("강아지용품");
		tb_09_midKat.add("고양이용품");
		tb_09_midKat.add("관상어/수족관");
		tb_09_midKat.add("조류용품");
		tb_09_midKat.add("소동물용품");
		
	}
	
	 ArrayList<String> tb_10_midKat = new ArrayList<>();
	{
		tb_09_midKat.add("여행/숙박/항공");
		tb_09_midKat.add("티켓/공연");
		tb_09_midKat.add("e쿠폰/상품권");
		tb_09_midKat.add("홈&카서비스");
	
	}
	
	 ArrayList<String> tb_11_midKat = new ArrayList<>();
	{
		tb_09_midKat.add("해외직구 홈");
		tb_09_midKat.add("의류/언더웨어");
		tb_09_midKat.add("패션잡화");
		tb_09_midKat.add("뷰티");
		tb_09_midKat.add("식품/영양제");
		tb_09_midKat.add("스포츠/레저");
		tb_09_midKat.add("리빙/생활");
	}
	
	
	

	
}




















