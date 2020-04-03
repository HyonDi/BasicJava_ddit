package Z_exam;

public class Exam2 {

	public static void main(String[] args) {
/*
		[ 연습문제 ]
		
				[2-1] 다음 표의 빈 칸에 8개의 기본형(primitive type)을 알맞은 자리에 넣으시오.
				
				
			      종류/크기       1 byte 	 2 byte    4 byte     8 byte
				논리형	 boolean	 	-		  -			-
				문자형   	   	-		   char		  -			-
				정수형	   byte		   short     int        long
				실수형	    -  			-		float		double
				
				[2-2] 주민등록번호를 숫자로 저장하고자 한다. 이 값을 저장하기 위해서는 어떤 자료형
				(data type)을 선택해야 할까? regNo라는 이름의 변수를 선언하고 자신의 주민등록번호로
				초기화 하는 한 줄의 코드를 적으시오.
				*/
				long regNo = 9601192111111L;
				double afw = 9601192111111.0;
				
				
				/*
				[2-3] 다음의 문장에서 리터럴, 변수, 상수, 키워드를 적으시오.
				int i = 100;
				long l =100L;
				final float PI = 3.14f;
				
				- 리터럴 : 100, 100L, 3.14f
				- 변수 : i, l, (PI 는 상수라서 아님)
				- 키워드 : int, long, final ,float
				- 상수 : PI
				   
				   
				[2-4] 다음 중 기본형(primitive type)이 아닌 것은?
				a. int
				b. Byte
				c. double
				d. boolean
				설마 b가 대문자로 시작하니가 정답이 b인가? oo
				앞글자 대문자면 클래스명이야
				
				
				[2-5] 다음 문장들의 출력결과를 적으세요. 오류가 있는 문장의 경우, 괄호 안에 ‘오
				류’라고 적으시오.
				System.out.println(“1” + “2”) → ( 12 )
				System.out.println(true + “”) → ( true )
				//"" 이거는 문자열로 인정되니까 넘어감
				System.out.println(‘A' + 'B') → ( 어..131나오는데 ..오류인가?)
				System.out.println('1' + 2) → ( 51나옴. 오류 )
				System.out.println('1' + '2') → ( 99. 오류 )
				System.out.println('J' + “ava”) → ( Java )
				//문자열과 만나는 모든타입은 문자열로 바뀐다.
				 * 맨마지막거 "ava" 라는 문자열이랑 만나서 유니코드말고 문자열이 출력.
				
				//문자 더하기 문자열 가능
				System.out.println(true + null) → ( 오류  )
				//아스키코드 맞나 암튼 그거때문이래. 유니코드인가?
				 * 아무튼 문자 0~9까지가 다 코드번호가 따로있음.후..
				//그니까 큰따옴표사이에 넣은건 문자로 인식되고 
				//작은따옴표사이에 넣은건 그 코드번호로 인식돼.
				 * 숫자랑 붙었을때만 그래.4번째지문의 경우 문자1의 코드:49, 2의코드: 50
				 * 이어서 더해서 99임.
				 
				 
				 
				 
				[2-6] 다음 중 키워드가 아닌 것은?(모두 고르시오)
				a. if
				b. True
				c. NULL
				d. Class
				e. System
				답 : true,NULL(값),system은 뭐지
						if만 키워드임.
			
				[2-7] 다음 중 변수의 이름으로 사용할 수 있는 것은? (모두 고르시오)
				a. $ystem //가능
				b. channel#5 //#은 안돼.
				c. 7eleven //숫자로시작 안돼
				d. If //키워드는 if 임.
				e. 자바 //가능
				f. new //키워드라 안돼
				g. $MAX_NUM //가능
				h. hello@com //@안돼
				답 : a, d, e, g
				//특수문자는 $ 와 _ 만 사용 가능.
				 * 
				
				[2-8] 참조형 변수(reference type)와 같은 크기의 기본형(primitive type)은? (모두 고
				르시오)
				a. int
				b. long
				c. short
				d. float
				e. double
				//4byte 를 구해라. 
				답 : a, d
				
				[2-9] 다음 중 형변환을 생략할 수 있는 것은? (모두 고르시오)
				byte b = 10;
				char ch = 'A';
				int i = 100;
				long l = 1000L;
				
				a. b = (byte)i; X
				b. ch = (char)b; X
				c. short s = (short)ch; X
				d. float f = (float)l;  O
				e. i = (int)ch; O
				//생략 가능한건 표현범위가 작은범위를 큰범위에 넣을때.
				 * ..//값이 뭐든 상관없이 데이터타입이 작으면 되는거야??
				 그리고 int 는 정수고 char 는 문자인데!
				 *
				답 : d, e
				
				[2-10] char타입의 변수에 저장될 수 있는 정수 값의 범위는? (10진수로 적으시오)
				답 : 0~9
				2바이트 = 16비트 = 답 : 65535
				
				
				[2-11] 다음중 변수를 잘못 초기화 한 것은? (모두 고르시오)
				a. byte b = 256; //범위 넘음
				b. char c = '';  //공백 없음
				c. char answer = 'no'; //두글자임
				d. float f = 3.14 //f 가 안붙음 = 더블값임.
				e. double d = 1.4e3f; //f가 붙음. d를 붙이거나 생략해야함.
				// float 랑 double 이 그럼 뭐 어디까지된다는거야
				 * 된대....e....왜??
				
				
				[2-12] 다음 중 main메서드의 선언부로 알맞은 것은? (모두 고르시오)
				a. public static void main(String[] args)
				b. public static void main(String args[])
				c. public static void main(String[] arv)
				d. public void static main(String[] args)
				e. static public void main(String[] args)
				답 : d 빼고 모두 됨. 왜야! b,c 라고??
				
				
				[2-13] 다음 중 타입과 기본값이 잘못 연결된 것은? (모두 고르시오)
				a. boolean - false
				b. char - '\u0000'
				c. float - 0.0 //0f
				d. int - 0
				e. long - 0 //0L
				f. String - "" //Null
				답 : c,e,f
		
*/
				
				
	}

}
