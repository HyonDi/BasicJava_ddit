package b_operator;

public class ComparisonOperator {

	public static void main(String[] args) {
		/*
		 * 
		 */
		
		boolean b = 10 < 20;
		System.out.println(b);
		b = 10 < 20 - 15;
		System.out.println(b);
		
		b = 10 <= 10.0;
		System.out.println(b);
		//데이터타입이다르지만 자동 형변환 해줌.
		
		b = 65 >= 'B';
		System.out.println(b);
		
		b= 10.0f == 10.0;
		System.out.println(b);
		
		b = 10.1f == 10.1;
		System.out.println(b);
		System.out.printf("%40.39f%n", 10.1f);
		//f 는 포맷. 21 은 21자리로 표현해줘. 그중 소숫점은 20자리.%n은 줄바꿈.
		
		System.out.printf("%40.39f%n", 10.1);
		//실수 는 값을 정확히표현하지 못해? 근삿치를 표현한다.
		//플롯보다는 더블이 좀더 정확하긴 함.
		//float과 double은 정밀도가 달라 float 을 double로 형변환하면
		//소수점을 정확하게 비교할 수 없다.
		//double 을 float으로 형변환해야 정확하게 비교할 수 있다.
		
		b = 10.1f == (float)10.1;
		System.out.println(b);
		
		
		//대소비교는 boolean을 제외한 기본형 타입만 비교할 수 있지만
		//등가비교는 모든 타입을 비교할 수 있다.
		b = 'A' == 65;
		System.out.println(b);
		b= true != false;
		System.out.println(b);
		
		
		b= "abc" == "abc";
		System.out.println(b);
		//문자열이 같은 경우 같은 주소를 가진다.
		//같은 스트링 리터럴은 같은 주소를 가진다
		
		b = "abc" == new String("abc");
		System.out.println(b);
		// 문자열이 같으면 같은 주소를 가지는데,
		//new 은 새로운주소를 만드는거야.
		//참조형 타입은 저장된메모리 주소를 비교하기 때문에,
		//String은 등가비교 연산자로 내용을 비교할 수 없다.
		
		//내용을비교하기위한 매서드가 스트링속에 있따.
		b= "abc".equals(new String("abc"));
		System.out.println(b);
		//equals 를 사용하면 String의 내용을 비교할 수 있다.
		
		b= !"abc".equals("ABC");
		//같지 않다의 결과를 얻기 위해서는 !(NOT)을 앞에 붙여준다.
		
		//오늘배운내용 복습하기. 깃헙올리기해보자!	
	}

}
