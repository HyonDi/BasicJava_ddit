package b_operator;

public class LogicalOperator {

	public static void main(String[] args) {
		
		
		/*
			19.11.21. 이전시간 복습		
		//다음의 문장들을 코드로 작성 후 연산 결과를 출력해주세요
		//문제 :  1보다 2가 큰가?
		b = 1 < 2;
		System.out.println(b);
		
		//문제 :  0은 100보다 작거나 작은가?
		b = 0 <= 100;
		System.out.println(b);
		
		//3.14f 와 3.14 는 다른가?
		b = 3.14f != 3.14;
		System.out.println(b);
		
		//문제 : "남자" 와 "여자"	 는 다른가?
		b = "남자" != "여자";
		System.out.println(b);
		//이건 참조형 타입의 주소를 비교한것. 
		
		b= !"남자".equals("여자");
		System.out.println(b);
		//equals 를 사용하면 String의 내용을 비교할 수 있다.
		 */
		
		
		
		
		/*
		 * <<논리 연산자>>
		 * - &&(AND) : 피연산자 둘다 true 이면 true를 결과로 얻는다. 앤퍼샌드&
		 * - ||(OR) : 피연산자 중 하나라도 true 이면 true를 결과로 얻는다.
		 * - ! (NOT) : 피연산자가 true 이면 false 를, false 이면 true 를 결과로 얻는다.
		 * - 피연산자로 boolean 만 혀용한다.
		 * 
		 * */
		
		boolean b;
		int a = 6;
		// a가 0초과이고 10이하인가?
		b = 0 < a && a <= 10;
		System.out.println(b);
		//System.out.println -> sysout + ctrl + space
		
		//a가 2의 배수이거나, 3의 배수인가?
		b = a % 2 == 0 || a % 3 == 0;
		System.out.println(b);//O
		
		//a가 2의 배수이거나 3의 배수이고, 10이하인가?
		b = (a % 2 == 0 || a % 3 == 0) && a <= 10;
		System.out.println(b); //O
		//&&가 우선순위가 높다!! 우선순위를 바꾸려면 괄호를 사용해야 한다.
		
		
		//변수 c 는 숫자인가?
		char c = 'l';
		b = '0' <= c && c <= '9';
		System.out.println(b);
		//답 : false. 숫자 아니다. 뭐지이거
		
		//c는 소문자 인가?
		b= 'a' <= c && c <= 'z';
		System.out.println(b);
		//답 : true.
		
		//c는 영문자인가?
		b =  ('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z');
		System.out.println(b);
		// 논리연산자는 효율적인 연산을 한다.
		//왼쪽의 피연산자에서 결과가 정해지면 오른쪽은 수행하지 않는다.
		b = true && true;
		b =  true && false;
		b = false && true;
		b = false && false; 
		
		b = true || true;
		b = true || false;
		b = false || true;
		b = false || false;

		int d = 10;
		b = d < 10 && 0 < d++;
		System.out.println(d);
		//이미 && 왼쪽에서 b 값이 false 로 
		//정해져서 뒷쪽 d 를 1 증가시키는 부분이 실행되지 않았다.
		
		
		
		//논리연산자 NOT 을 실행해보자
		b = !b;
		System.out.println(b);
		//뭐야이건 비가 펄스엿는데 트루로 바뀌었대
		
	//	b = !10 < 20;
		//이건 10 에 낫을 붙인거. 실행되지 않음.
		b = !(10 < 20);
		//이건 전체에 낫을 붙인거
		System.out.println(b);
		
		
		int x = 1, y = 2;
		b = x + 3 * y > y - 2 || x < 3 && y >= 5;
		//산술 연산 > 비교 연산 > 논리 연산 순으로 진행된다.
		// 이 순으로 우선순위가 높다.
		
		
		//문제 : 다음 문장들을 코드로 작성 후 결과를 출력해주세요.
		//x 가 2의 배수이고 10보다 작은가?
		b = x % 2 == 0 && x < 10;
		System.out.println(b); //false
		
		//x가 2의 배수이거나 3의 배수이거나 5의 배수인가?
		b = x % 2 == 0 || x % 3 == 0 || x % 5 == 0;
		System.out.println(b); //false. x는 1이니까

		//끝
		

		
		
		
	}

}
