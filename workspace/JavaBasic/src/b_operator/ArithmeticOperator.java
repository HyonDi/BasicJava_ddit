package b_operator;

public class ArithmeticOperator {

	public static void main(String[] args) {
		
		int a = 10 + 20 - 10 * 5 /10 % 2;
		System.out.println(a);
		//수학과 같이 *, /,% 연산자가 +, - 보다 연산의 우선순위가 높다.
		//우선순위가 동일할 경우 왼쪽부터 연산이 수행된다.
		
		a = (int)(10 + 20.3);
		// 10 앞에 double타입으로의 형변환이 생략되어있는것이다.
		//자동으로 캐스팅 , 형변환 해줌.
		//컴파일에러: 더블타입을 인트타입에 저장하려고 해서이다.
		
		byte b = 10;
		short c = 20;
		
		//short d = c - b;
		//값이 int 타입보다 작을경우int 타입으로 형변환을해서 진행을 한다.
		//프로그램자체가 4byte 이상부터 연산이 가능하도록 되어있다.
		//byte b = 10;
		//short c = 20;
		//short d = (short)(c - b);
		
		long e1 = 100000 * 100000;
		System.out.println(e1); //오버플로우 발생
		long e2 = 100000 * 100000L;//피연산자 하나가 long 이니까.
		System.out.println(e2); 
		
		
		float f1 = 10 / 4;
		System.out.println(f1);
		float f2 = 10 / 4f;
		System.out.println(f2);
		
		int f3 = 10 % 4;
		System.out.println(f3);
		//정수는 0으로 나눌 수 없다.
		
		//int g1 = 10 / 0;
		//System.out.println(g1);
		//실행시 에러가 나는 것 : 런타임에러
		
		float g2 = 10.0f / 0;
		System.out.println(g2);
		
		float g3 = 0 / 0f;
		System.out.println(g3);	
		//NaN : not a number.
		
		char h1 = 'A';
		char h2 = (char)(h1 + 1);
		System.out.println(h2);
		
		int h3 = 'D' - 'A';//
		System.out.println(h3);
		
		int h4 = '5' - '0';
		System.out.println(h4);
		
		//산술 연산자와 대입 연산자를 합해 연산식을 줄여서 표현할 수 있다.
		
		int i = 0;
		i = i + 1;
		i += 1;//복합연산자. ㅅ줄여쓴 이것.연산자가 2개사용됐어.
		//더하는 값이 1인 경우에는 더 줄일 수 있다.
		++i; //전위형 : 변수가 참조되기 전 수행. 먼저 플러스 한 다음에 읽어오겠다.
		i++; //후위형 : 변수가 참조된 후 수행. 먼저 읽은 다음에 플러 1할거야.
		
		i = i + 2;
		i += 2;
		
		
		//예제
		i = 0;
		System.out.println("++i = " + ++i);
		//전위형
		i = 0;
		System.out.println("i++ = " + i++);
		System.out.println(i);
		//후위형
		
		//연산별로 줄임.
		i = i - 1;
		i -= 1;
	
		--i;
		i--;
		
		i = i * 2;
		i *= 2;
		
		i = i /3;
		i /= 3;
		
		i = i % 4;
		i %= 4;
		//전위형, 후위형은 플러스, 마이너스에만 있다.
		
		
		//실수 반올림하고싶어. 소수 첫째자리 반올림 방법?
		//0.5를 더하고 int 로 형변환한다.
		
		double round = 50.6;
		System.out.println((int)(round + 0.5));
		
		
		
		//소숫점 둘째자리 반올림 방법?
		double round1 = 3.14;
		System.out.println((int)(round1 * 10 + 0.5)/10.0);
		//int 여서 소숫점이 안나왓었대ㅠㅠㅠ d 혹은 f 혹은 .0 을 붙인다.
		//데이터 타입을 변화시켜야했음!!
		
		
		//다음을 한줄 씩 계산해서 최종 결과값을 출력해주세요.
		//1. 123456 + 654321
		//2. 1번결과 값 * 123456
		//3. 2번결과 값 / 123456
		//4. 3번결과 값 - 654321
		//5. 4번결과값 % 123456
		
		int a1 = 123456 + 654321;
		System.out.println(a1);
		
		long a2 = (long)a1 * 123456;
		System.out.println(a2);
		
		long a3 = a2 / 123456;
		System.out.println(a3);
		//소숫점 버려도 되나?
		
		long a4 = a3 - 654321;
		System.out.println(a4);
		
		long a5 = a4 % 123456;
		System.out.println(a5);
		
		//위에것 줄임
		double result = 123456 + 654321;
		result = result * 123456;
		result /= 123456;
		result -= 654321;
		result %= 123456;
		System.out.println(result);
		
		
		
		//3개의 int형 변수를 선언 및 초기화 후 합계와 평균을 구해주세요.
		//평균은 소숫점 둘째자리에서 반올림.
		
		int q = 80;
		int w = 55;
		int e = 98;
		System.out.println(q + w + e);
		float r = q + w + e;
		System.out.println((int)(r/3 * 10 + 0.5)/10f);
		//고쳐보자 ->완료
		
		
		int num1 = 80;
		int num2 = 55;
		int num3 = 98;
		
		int sum = num1 + num2 + num3;
		double avg = (int)(sum/3d * 10 + 0.5) / 10.0;
		System.out.println("합계 : " + sum + " / 평균 : " + avg);
		//왜 3에 d?썸 나누기 3에서 썸도 인트, 3도 인트여서 소숫점이 발생하지 않았다.
		//휘유.......
		
		
		
		
		
	
			
				
		
		
		
		
		
		
		
	}

}
















