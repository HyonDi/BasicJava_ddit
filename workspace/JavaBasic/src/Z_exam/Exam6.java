package Z_exam;
/*
 class Exam6 {
	 
	public static void main(String[] args) {*/
		
		/*[6-1] 다음과 같은 멤버변수를 갖는 SutdaCard클래스를 정의하시오
		타 입 		변수명 			설 명
		int 		num 		카드의 숫자.(1~10사이의 정수)
		boolean 	isKwang 	광(光)이면 true, 아니면 false
		
		답 :*/ 
		
	/*class SutdaCard {
		int num;
		boolean isKwang;
	}
	*/	
		
	/*[6-2] 문제6-1에서 정의한 StudaCard클래스에 두 개의 생성자와 info()를 추가해서 실행
	결과와 같은 결과를 얻도록 하시오.*/
		
/*		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info()); // 3이 출력된다.
		System.out.println(card2.info()); // 1K가 출력된다.
		}
 }
			
	class SutdaCard {
		int num;
		boolean isKwang;
		
		SutdaCard(int num, boolean isKwang) {
			this.num = num;
			this.isKwang = isKwang;
		}
		
		SutdaCard(){
			this(1, true);
		}
		
		String info(){
			return num + (isKwang ? "k" : "");
			}
		
		
	
*/	
/*	}	*/
//	[6-3] ~ [6-4]
	
/*	class Exam6_4 {
		public static void main(String[] args) {
			Student s = new Student();
			s.name = "홍길동";
			s.ban = 1;
			s.no = 1;
			s.kor = 100;
			s.eng = 60;
			s.math = 76;
			System.out.println("이름:"+s.name);
			System.out.println("총점:"+s.getTotal());
			System.out.println("평균:"+s.getAverage());
		}

	}
//	[6-3] 다음과 같은 멤버변수를 갖는 Student클래스를 정의하시오.
	class Student{
		String name;
		int ban;
		int no;
		int kor;
		int eng;
		int math;
		
		
	[6-4] 문제6-3에서 정의한 Student클래스에 다음과 같이 정의된 두 개의 메서드
	getTotal()과 getAverage()를 추가하시오.
		int getTotal() {
			return kor + eng + math;
		}
		
		float getAverage() {
			return Math.round(getTotal()/3f *10.0)/10.0f;
		}
		
	}

*/		
		
//	[6-5] 다음과 같은 실행결과를 얻도록 Student클래스에 생성자와 info()를 추가하시오	
/*	class pr {
		public static void main(String[] args) {
			Student s = new Student();
			s.name = "홍길동";
			s.ban = 1;
			s.no = 1;
			s.kor = 100;
			s.eng = 60;
			s.math = 76;
			System.out.println("이름:"+s.name);
			System.out.println("총점:"+s.getTotal());
			System.out.println("평균:"+s.getAverage());
			
			Student s = new Student("홍길동",1,1,100,60,76);
			System.out.println(s.info());
			}
		}



	class Student{
		String name;
		int ban;
		int no;
		int kor;
		int eng;
		int math;
		
		int getTotal() {
			return kor + eng + math;
		}
		
		float getAverage() {
			return Math.round(getTotal()/3f *10.0)/10.0f;
		}
		
		Student(String name, int ban, int no, int kor, int eng,
				int math) {
			this.name = name;
			this.ban = ban;
			this.no = no;
			this.kor = kor;
			this.eng = eng;	
			this.math = math;
		}
		
		String info() {
			return name + "," + ban + "," + no + "," + kor
					+ "," + eng + "," + math + "," + getTotal()
					+ "," + getAverage();
		}
	}
	*/	
	
	
	/*[6-6] 두 점의 거리를 계산하는 getDistance()를 완성하시오.
	[Hint] 제곱근 계산은 Math.sqrt(double a)를 사용하면 된다.*/
//	답 : 
	
/*	class pr {
		// 두 점 (x,y)와 (x1,y1)간의 거리를 구한다.
		static double getDistance(int x, int y, int x1, int y1) {
			return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1));	
		}
		public static void main(String args[]) {
		System.out.println(getDistance(1,1,2,2));
		}
	}
*/
		
		
	/*[6-7] 문제6-6에서 작성한 클래스메서드 getDistance()를 MyPoint클래스의 인스턴스메서
	드로 정의하시오.*/

	/*[6-8] 다음의 코드에 정의된 변수들을 종류별로 구분해서 적으시오.
	 * class PlayingCard {
			int kind;
			int num;
			
			static int width;
			static int height;
			
			PlayingCard(int k, int n) {
				kind = k;
				num = n;
			}
			
			
			public static void main(String args[]) {
				PlayingCard	card = new PlayingCard(1,1);
			}
		}
		
		답 : 
		- 클래스변수(static변수) : width, height
		- 인스턴스변수 :kind, num
		- 지역변수 : k, n, card

 */
	/*[6-9] 다음은 컴퓨터 게임의 병사(marine)를 클래스로 정의한 것이다. 이 클래스의 멤버
	중에 static을 붙여야 하는 것은 어떤 것들이고 그 이유는 무엇인가?
	(단, 모든 병사의 공격력과 방어력은 같아야 한다.)
	
class Marine {
		int x=0, y=0; // Marine의 위치좌표(x,y)
		int hp = 60; // 현재 체력
		int weapon = 6; // 공격력
		int armor = 0; // 방어력
	void weaponUp() {
		weapon++;
	}
	void armorUp() {
		armor++;
	}
	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
	답 : 
	weapon, armor : Marine 들이 모두 같은 값을 가져야 하기 때문.
	weponUp(), armorUp() :  클래스변수에대한 동작을 하기 때문.
	*/
	
		/*	[6-10] 다음 중 생성자에 대한 설명으로 옳지 않은 것은? (모두 고르시오)
			a. 모든 생성자의 이름은 클래스의 이름과 동일해야한다.
			b. 생성자는 객체를 생성하기 위한 것이다.
			c. 클래스에는 생성자가 반드시 하나 이상 있어야 한다.
			d. 생성자가 없는 클래스는 컴파일러가 기본 생성자를 추가한다.
			e. 생성자는 오버로딩 할 수 없다.
				답 : b(객체를 생성하는 것은 new 연산자.
					생성자는 객체를 초기화할 목적으로 사용되는 것이다.), 
					e(오버로딩 할 수 있기때문에 하나의 클래스에 여러개의 생성자를 
					 정의할 수 있다.)
			
			
			[6-11] 다음 중 this에 대한 설명으로 맞지 않은 것은? (모두 고르시오)
			a. 객체 자신을 가리키는 참조변수이다.
			b. 클래스 내에서라면 어디서든 사용할 수 있다.
			c. 지역변수와 인스턴스변수를 구별할 때 사용한다.
			d. 클래스 메서드 내에서는 사용할 수 없다.
				답 : b (인스턴세 메서드에서만 사용가능하다.)
			
			
			[6-12] 다음 중 오버로딩이 성립하기 위한 조건이 아닌 것은? (모두 고르시오)
			a. 메서드의 이름이 같아야 한다.
			b. 매개변수의 개수나 타입이 달라야 한다.
			c. 리턴타입이 달라야 한다.
			d. 매개변수의 이름이 달라야 한다.
				답 : c, d
			
			
			[6-13] 다음 중 아래의 add메서드를 올바르게 오버로딩 한 것은? (모두 고르시오)
			long add(int a, int b) { return a+b;}
			a. long add(int x, int y) { return x+y;}
			b. long add(long a, long b) { return a+b;}
			c. int add(byte a, byte b) { return a+b;}
			d. int add(long a, int b) { return (int)(a+b);}
				답 : b,c,d
			
			
			[6-14] 다음 중 초기화에 대한 설명으로 옳지 않은 것은? (모두 고르시오)
			a.멤버변수는 자동 초기화되므로 초기화하지 않고도 값을 참조할 수 있다.
			b.지역변수는 사용하기 전에 반드시 초기화해야 한다.
			c.초기화 블럭보다 생성자가 먼저 수행된다.
			d.명시적 초기화를 제일 우선적으로 고려해야 한다.
			e.클래스변수보다 인스턴스변수가 먼저 초기화된다.
				답 : c, e
				클래스변수는 클래스가 처음 메모리에 로딩될 때, 자동 초기화되므로
				인스턴스 변수보다 먼저 초기화 된다.그리고 생성자는 초기화 블럭이 수행된 
				다음에 수행된다.
			
			
			
			[6-15] 다음중 인스턴스변수의 초기화 순서가 올바른 것은?
			a. 기본값-명시적초기화-초기화블럭-생성자
			b. 기본값-명시적초기화-생성자-초기화블럭
			c. 기본값-초기화블럭-명시적초기화-생성자
			d. 기본값-초기화블럭-생성자-명시적초기화
			
				답 : a 기본값 명시적 초기화 초기화블럭 생성자
			*변수의초기화 순서
			클래스 변수의 초기화 시점 : 클래스가 처음 로딩될 때 단 한번 초기화됨.
			인스턴스변수의 초기화 시점 : 인스턴스가 생성될 때 마다 각 인스턴스별로 초기화.
			클래스변수 초기화 순서 : 기본값> 명시적초기화 > 클래스초기화 블럭
			인스턴스 변수의 초기화 순서 : 기본값 > 명시적초기화 > 인스턴스초기화블럭 > 생성자.
			
			
			[6-16] 다음 중 지역변수에 대한 설명으로 옳지 않은 것은? (모두 고르시오)
			a. 자동 초기화되므로 별도의 초기화가 필요없다.
			b. 지역변수가 선언된 메서드가 종료되면 지역변수도 함께 소멸된다.
			c. 매서드의 매개변수로 선언된 변수도 지역변수이다.
			d. 클래스변수나 인스턴스변수보다 메모리 부담이 적다.
			e. 힙(heap)영역에 생성되며 가비지 컬렉터에 의해 소멸된다.
			답 : a, e / 지역변수는 콜스택에 생성됨. 힙영역에는 인스턴스변수가 생성된다.
			
			
			
			[6-17] 호출스택이 다음과 같은 상황일 때 옳지 않은 설명은? (모두 고르시오)
			println
			method1
			method2
			main
			a. 제일 먼저 호출스택에 저장된 것은 main메서드이다.
			b. println메서드를 제외한 나머지 메서드들은 모두 종료된 상태이다.
			c. method2메서드를 호출한 것은 main메서드이다.
			d. println메서드가 종료되면 method1메서드가 수행을 재개한다.
			e. main-method2-method1-println의 순서로 호출되었다.
			f. 현재 실행중인 메서드는 println 뿐이다.
			답 :    a : o, b : x, c:o, d : o, e : o, f : o
			   b
*/

	/*[6-18] 다음의 코드를 컴파일하면 에러가 발생한다. 컴파일 에러가 발생하는 라인과 그
	이유를 설명하시오.*/
	
/*	class MemberCall {
		int iv = 10;
		static int cv = 20;
		
		int iv2 = cv;
		static int cv2 = iv; // 라인 A
		
		static void staticMethod1() {
			System.out.println(cv);
			System.out.println(iv); // 라인 B
		}
		
		void instanceMethod1() {
			System.out.println(cv);
			System.out.println(iv); // 라인 C
		}
		
		static void staticMethod2() {
			staticMethod1();
			instanceMethod1(); // 라인 D
		}
		
		void instanceMethod2() {
			staticMethod1(); // 라인 E
			instanceMethod1();
		}
	}
	
	답 : a, b, d 스태틱메서드 안에서는 인스턴스변수, 인스턴스메서드를 사용할 수 없음.
	*/
	
	
//	[6-19] 다음 코드의 실행 결과를 예측하여 적으시오.
	
/*	class Exercise6_19
	{
		public static void change(String str) {
		str += "456";
		}

		public static void main(String[] args)
		{
			String str = "ABC123";
			System.out.println(str);
			change(str);
			System.out.println("After change:"+str);
		}
	}

	답 : ABC123, After change ABC123
	메인메서드에서 출력하고있는 str 이 지역내에서 먼저 찾기때문인듯함.
	
	*/
	
	/*[6-20] 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
	[주의] 실행결과와 다를 수 있음.
	메서드명 : shuffle
	기 능 : 주어진 배열에 담긴 값의 위치를 바꾸는 작업을 반복하여 뒤섞이게 한다.
	처리한 배열을 반환한다.
	반환타입 : int[]
	매개변수 : int[] arr - 정수값이 담긴 배열
	
	class Exercise6_20
	{
	
	(1) shuffle메서드를 작성하시오.
	
	public static void main(String[] args)
	{
	int[] original = {1,2,3,4,5,6,7,8,9};
	System.out.println(java.util.Arrays.toString(original));
	int[] result = shuffle(original);
	System.out.println(java.util.Arrays.toString(result));
	}
	}
	
	답 : 
	*/
	/*class pr
	{
		static int[] shuffle(int[] arr){
			
					for(int i = 0 ; i < arr.length*2; i ++){
						int random = (int)(Math.random()*arr.length);
						int random1 = (int)(Math.random()*arr.length);
						int temp = arr[random1];
						arr[random1] = arr[random];
						arr[random] = temp;			
					}
					return arr;
					
		}
		
		public static void main(String[] args){
			
			int[] original = {1,2,3,4,5,6,7,8,9};
			System.out.println(java.util.Arrays.toString(original));
			
			int[] result = shuffle(original);
			System.out.println(java.util.Arrays.toString(result));
		}
	}*/
	
	
	/*[6-21] Tv클래스를 주어진 로직대로 완성하시오. 완성한 후에 실행해서 주어진 실행결과
	와 일치하는지 확인하라.
	[참고] 코드를 단순히 하기 위해서 유효성검사는 로직에서 제외했다.
	
	*답 : 
	*class MyTv {
	
	boolean isPowerOn;
	int channel;
	int volume;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	void turnOnOff() {
		isPowerOn = !isPowerOn;
	}

	void volumeUp() {
		if (volume < MAX_VOLUME){
			volume++;
		}
	}
	
	void volumeDown() {
		if( volume > MIN_VOLUME){
			volume --;
		}
	}
	
	void channelUp() {
		if(++channel == MAX_CHANNEL){
			channel = MIN_CHANNEL;
		} else{
			channel++;
		}
	}
	
	void channelDown() {
		if(--channel == MIN_CHANNEL){
			channel = MAX_CHANNEL;
		} else {
			channel--;
		}
	}
	} // class MyTv

class pr {
public static void main(String args[]) {
MyTv t = new MyTv();
t.channel = 100;
t.volume = 0;
System.out.println("CH:"+t.channel+", VOL:"+ t.volume);
t.channelDown();
t.volumeDown();
System.out.println("CH:"+t.channel+", VOL:"+ t.volume);
t.volume = 100;
t.channelUp();
t.volumeUp();
System.out.println("CH:"+t.channel+", VOL:"+ t.volume);
}
}
/*[실행결과]
CH:100, VOL:0
CH:99, VOL:0
CH:100, VOL:100*/
	
	
/*[6-22] 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
메서드명 : isNumber
기 능 : 주어진 문자열이 모두 숫자로만 이루어져있는지 확인한다.
모두 숫자로만 이루어져 있으면 true를 반환하고,
그렇지 않으면 false를 반환한다.
만일 주어진 문자열이 null이거나 빈문자열“”이라면 false를 반환한다.
반환타입 : boolean
매개변수 : String str - 검사할 문자열
[Hint] String클래스의 charAt(int i)메서드를 사용하면 
문자열의 i번째 위치한 문자를 얻을 수 있다.
*/	
	/*class Exercise6_22 {
		
		(1) isNumber메서드를 작성하시오.
		
		public static void main(String[] args) {
		String str = "123";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));
		str = "1234o";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));
		}
		}
	답 : 
	*/
/*	class pr {
		static boolean isNumber(String str){
			if (str == null || str.equals(""))
				return false;
				
			for(int i = 0; i<str.length();i++){
				
				if ('0' > str.charAt(i) || str.charAt(i) > '9'){
					return false;
				}
			}
			return true;
			
			
		}
		
		public static void main(String[] args) {
			String str = "123";
			System.out.println(str+"는 숫자입니까? "+isNumber(str));
			str = "1234o";
			System.out.println(str+"는 숫자입니까? "+isNumber(str));
		}
	}
*/

	/*[6-23] 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
	메서드명 : max
	기 능 : 주어진 int형 배열의 값 중에서 제일 큰 값을 반환한다.
	만일 주어진 배열이 null이거나 크기가 0인 경우, -999999를 반환한다.
	반환타입 : int
	매개변수 : int[] arr - 최대값을 구할 배열
	답 : 
	*/
/*	class pr{

		static int max(int[] arr){
			if(arr==null || arr.length == 0){
				return -999999;
			}
				
			
			int max = arr[0];
			for(int i =1; i < arr.length; i++) {
				if(arr[i] > max){
					max = arr[i];
				}
			}
			return max;
		}
		
		
		
		
		
		public static void main(String[] args)
		{
		int[] data = {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값:"+max(data));
		System.out.println("최대값:"+max(null));
		System.out.println("최대값:"+max(new int[]{})); // 크기가 0인 배열
		}
		}
*/
	/*[6-24] 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
	메서드명 : abs
	기 능 : 주어진 값의 절대값을 반환한다.
	반환타입 : int
	매개변수 : int value
	답 : 
	*/
/*	class pr
	{
		static int abs(int value){
		return value >=0? value : -value;
		}
		
		
	public static void main(String[] args)
	{
	int value = 5;
	System.out.println(value+"의 절대값:"+abs(value));
	value = -10;
	System.out.println(value+"의 절대값:"+abs(value));
	}
	}
*/
//제일 처음에 해야할거 ㅜㅡㅜㅡㅜㅡㅜㅡㅜㅡㅜㅡㅜㅡㅡㅜㅜㅡㅜㅡㅜㅡㅜㅡㅜㅡ