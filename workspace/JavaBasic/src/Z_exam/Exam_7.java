package Z_exam;

//7-1, 2, 14,18, 19, 21, 22, 23, 25~~~쭉 풀지 않아도 된다.
//객체지향 : 코드를 효율적으로 분리해서 좀더 효율적인 유지보수하기쉬운 프로그램을 만들자!
//단순히 만드는게아니라 좀더 효율적인 프로그램을 만들어보자.
//계속생각을 어떻게나눠야할까. 어떻게 구성해야좋을까 생각하고 고민해야해.
//일단 본인이 부족하다고 느끼는 사람들은 객체지향이 중요한게아니야.
//프로그램을 만들수있어야해. 배열 for문 if 문. 사용해서 자신이 원하는 생각하는 걸 표현할수있으면 돼.
//자꾸 뭘 만드는 연습을 해주세요. 나중되면 다 하게되있음.
		
/*[7-3] 오버라이딩의 정의와 필요성에 대해서 설명하시오.
 답 : 오버라이딩 클래스에서 그 클래스의 부모클래스에게 물려받은 메서드의 내용을 바꾸는 것.
 	리턴타입과 파라미터 등 선언부는 완전히 일치해야한다.
 	*/
/*[7-4] 다음 중 오버라이딩의 조건으로 옳지 않은 것은? (모두 고르시오)
a. 조상의 메서드와 이름이 같아야 한다.
b. 매개변수의 수와 타입이 모두 같아야 한다.
c. 접근 제어자는 조상의 메서드보다 좁은 범위로만 변경할 수 있다.
d. 조상의 메서드보다 더 많은 수의 예외를 선언할 수 있다.
재정의할때 리턴타입, 파라미터같아야해. 메서드명도. 제한되어있는거?? = 예외
답 : ao bo cx(같거나 넓어야함.) dx(같거나 적어야함.)  c,d
*/
/*[7-5] 다음의 코드는 컴파일하면 에러가 발생한다. 그 이유를 설명하고 에러를 수정하기
위해서는 코드를 어떻게 바꾸어야 하는가?*/
/*
class Product {
	int price; // 제품의 가격
	int bonusPoint; // 제품구매 시 제공하는 보너스점수

답 :	Product() {}
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}
}

class Tv extends Product {
	Tv() {
		super(); //product()호출
	}

	public String toString() {
		return "Tv";
	}
}

class Exercise7_5 {
	public static void main(String[] args) {
		Tv t = new Tv();
	}
}*/

/*[7-6] 자손 클래스의 생성자에서 조상 클래스의 생성자를 호출해야하는 이유는 무엇인가?*/

/*답 : 조상클래스에게 물려받은 인스턴스변수들을 초기화시키기 위해서.
 * 
자손클래스의 인스턴스를 생성하면 조상으로부터 상속받은 인스턴스변수들도 생성되는데,
이 상속받은 인스턴스변수들 역시 적절히 초기화되어야 한다.
조상 클래스로부터 상속받은 인스턴스 변수의 초기화는 조상클래스의 생성가자 처리하도록 해야함.
*/

/*[7-7] 다음 코드의 실행했을 때 호출되는 생성자의 순서와 실행결과를 적으시오.*/

class Parent {
	int x = 100;

	Parent() {
		this(200); // Parent(int x)를 호출
	}

	Parent(int x) {
		this.x = x;
	}

	int getX() {
		return x;
	}
}

class Child extends Parent {
	int x = 3000;

	Child() {
		this(1000); // Child(int x)를 호출
	}

	Child(int x) {
		this.x = x;
	}
}

class Exercise7_7 {
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println("x=" + c.getX());
	}
}

/*답 : Child()-> Child(int x) -> Parent() -> Parent(int x)-> Object()
컴파일러는 생성자의 첫 줄에 다른 생성자를 호출하지 않으면
조상의 기본생성자를 호출하는 코드'super();' 를 넣는다.그래서 
Child(int x){this.x = x;} => Child(int x){super(); this.x = x;}
와 같은의미가 됨.
마찬가지로 Parent(int x){this.x = x;} => Parent(int x){super(); this.x=x;}
와 같아지는데, 상속받는 클래스가 따로 없을 때 Object 클래스를 상속받으니
마지막엔 Object 가 실행되는 것. x=200 이 출력된다.*/

/*[7-8] 다음 중 접근제어자를 접근범위가 넓은 것에서 좁은 것의 순으로 바르게 나열한
것은?
a. public-protected-(default)-private
b. public-(default)-protected-private
c. (default)-public-protected-private
d. private-protected-(default)-public

답 : public - protected - default - private
	a
*/

/*[7-9] 다음 중 제어자 final을 붙일 수 있는 대상과 붙였을 때 그 의미를 적은 것이다.
옳지 않은 것은? (모두 고르시오)
a. 지역변수 - 값을 변경할 수 없다.
b. 클래스 - 상속을 통해 클래스에 새로운 멤버를 추가할 수 없다.
c. 메서드 - 오버로딩을 할 수 없다. 
d. 멤버변수 - 값을 변경할 수 없다.
답 :  c
final 을 붙였을때
클래스 : 변경될 수 없는 클래스. 확장될 수 없는 클래스. 다른 클래스의 조상이 될 수 없다.
메서드 : 변경될 수 없는 메서드. 오버라이딩을 통해 재정의 될 수 없다.
			오버로딩은 같은이름의 메서드(생성자)가 같은이름인데 파라미터를 다르게해서 읽는거.
멤버변수 : 값을 변경할 수 없는 상수.
*/

/*[7-10] MyTv2클래스의 멤버변수 isPowerOn, channel, volume을 클래스 외부에서 접근할
수 없도록 제어자를 붙이고 대신 이 멤버변수들의 값을 어디서나 읽고 변경할 수 있도록
getter와 setter메서드를 추가하라.*/
/*class MyTv2 {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int prevChannel;// 이전채널을 담아놓을 변수.
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	public boolean isPowerOn() {
		return isPowerOn;
	}
	public void setPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}
	
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		if(channel > MAX_CHANNEL || channel < MIN_CHANNEL){
			return;
		}
		prevChannel = this.channel;// 파라미터로 받은걸 this.channel에 넣기 전에.
		this.channel = channel;
	}
	
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		if(volume > MAX_VOLUME || volume < MIN_VOLUME){
			return;
		}
		this.volume = volume;
	}
	
	public void gotoPrevChannel(){
		setChannel(prevChannel);// 이전채널번호를 setChannel 의 파라미터로 넘김.
	}
	
	
	
}

class Exam_7 {
	public static void main(String args[]) {
		MyTv2 t = new MyTv2();
		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());
		t.setVolume(20);
		System.out.println("VOL:" + t.getVolume());
		
		t.setChannel(10);
		System.out.println("CH:"+t.getChannel());
		t.setChannel(20);
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
	}
}
*/

/*[7-12] 다음 중 접근 제어자에 대한 설명으로 옳지 않은 것은? (모두 고르시오)
a. public은 접근제한이 전혀 없는 접근 제어자이다.
b. (default)가 붙으면, 같은 패키지 내에서만 접근이 가능하다.
c. 지역변수에도 접근 제어자를 사용할 수 있다.
d. protected가 붙으면, 같은 패키지 내에서도 접근이 가능하다.
e. protected가 붙으면, 다른 패키지의 자손 클래스에서 접근이 가능하다.
답 : c

*/

/*[7-13] Math클래스의 생성자는 접근 제어자가 private이다. 그 이유는 무엇인가?*/
/*답 : 다른 사용자들이 Math 클래스를 초기화하지 못하게 하기 위해서.
	Math 클래스의 모든 메서드가 static메서드이고, 인스턴스변수가 존재하지 않기 때문에 
	객체를 생성할 필요가 없기 때문이다. = 객체생성을 하지 않아도 어디서나 쓸 수 있다.
	*/
	
/*[7-15] 클래스가 다음과 같이 정의되어 있을 때, 형변환을 올바르게 하지 않은 것은?
(모두 고르시오.)*/

/*
class Unit {}
class AirUnit extends Unit {}
class GroundUnit extends Unit {}
class Tank extends GroundUnit {}
class AirCraft extends AirUnit {}

Unit u = new GroundUnit();
Tank t = new Tank();
AirCraft ac = new AirCraft();
*/
/*
a. u = (Unit)ac;
b. u = ac;
c. GroundUnit gu = (GroundUnit)u;
d. AirUnit au = ac;
e. t = (Tank)u;
f. GroundUnit gu = t;

답 : e. 조상타입의 인스턴스를 자손타입으로 형변환할 수 없다.
조상타입의 참조변수로 자손타입의 인스턴스를 참조하는 것은 가능.

*/

/*
 [7-16] 다음 중 연산결과가 true가 아닌 것은? (모두 고르시오)
class Car {}
class FireEngine extends Car implements Movable {}
class Ambulance extends Car {}

FireEngine fe = new FireEngine();

a. fe instanceof FireEngine
b. fe instanceof Movable
c. fe instanceof Object
d. fe instanceof Car
e. fe instanceof Ambulance 
 답 : e
 fireEngine 이랑 abvulance 는 모두 car 에게 상속받고있지만 둘은 아무 연관없음.
 
 */

/*[7-17] 아래 세 개의 클래스로부터 공통부분을 뽑아서 Unit이라는 클래스를 만들고, 이
클래스를 상속받도록 코드를 변경하시오*/
/*
abstract class Unit {
	int x, y;
	abstract void move (int x, int y);	//
	void stop() {  현재 위치에 정지 
	}
}

class Marine extends Unit{ // 보병
	int x, y; // 현재 위치

	void move(int x, int y) {  지정된 위치로 이동 
	}

	void stop() {  현재 위치에 정지 
	}

	void stimPack() {  스팀팩을 사용한다. 
	}
}

class Tank extends Unit{ // 탱크
	int x, y; // 현재 위치

	void move(int x, int y) {  지정된 위치로 이동 
	}

	void stop() {  현재 위치에 정지 
	}

	void changeMode() {  공격모드를 변환한다. 
	}
}

class Dropship extends Unit{ // 수송선
	int x, y; // 현재 위치

	void move(int x, int y) {  지정된 위치로 이동 
	}

	void stop() {  현재 위치에 정지 
	}

	void load() {  선택된 대상을 태운다. 
	}

	void unload() {  선택된 대상을 내린다. 
	}
}
//abstract 클래스를 만들어서 move 를 abstract를 붙인 추상클래스로 만들고..
//다른 클래스들에있는 void stop()을 제거하고, Unit을 extends 하게 만든다.
*/


/*[7-18] 다음과 같은 실행결과를 얻도록 코드를 완성하시오.
		[Hint] instanceof연산자를 사용해서 형변환한다.
		
메서드명 : action
기 능 : 주어진 객체의 메서드를 호출한다.
	DanceRobot인 경우, dance()를 호출하고,
	SingRobot인 경우, sing()을 호출하고,
	DrawRobot인 경우, draw()를 호출한다.
반환타입 : 없음
매개변수 : Robot r - Robot인스턴스 또는 Robot의 자손 인스턴스*/

/*class Exam_7 {
	
	static void action(Robot r){
		if (r instanceof DanceRobot){ //Robotd을 DanceRobot 으로 형변환이
				//가능하다는게 파라미터로 받은 r 이 DanceRobot 이라는 뜻인듯.???
			DanceRobot dr = (DanceRobot)r; //이부분 뭐야???다운캐스팅아냐??
			dr.dance();
		}else if( r instanceof SingRobot){
			SingRobot sr = (SingRobot)r;
			sr.sing();
		} else if(r instanceof DrawRobot){
			DrawRobot dr = (DrawRobot)r;
			dr.draw();
		}
		
	}
	public static void main(String[] args) {
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };
		for (int i = 0; i < arr.length; i++)
			action(arr[i]);
	} // main
}




class Robot {
	
}

class DanceRobot extends Robot {
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}

class SingRobot extends Robot {
	void sing() {
		System.out.println("노래를 합니다.");
	}
}

class DrawRobot extends Robot {
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}

*/
/*[7-20] 다음의 코드를 실행한 결과를 적으시오.
[연습문제]/ch7/Exercise7_20.java*/

/*class Exam_7 {
	public static void main(String[] args) {
		Parent p = new Child();
		Child c = new Child();
		
		System.out.println("p.x = " + p.x);
		p.method();
		
		System.out.println("c.x = " + c.x);
		c.method();
	}
}

class Parent {
	int x = 100;

	void method() {
		System.out.println("Parent Method");
	}
}

class Child extends Parent {
	int x = 200;

	void method() {
		System.out.println("Child Method");
	}
}
*/
//답 : 100 Child Method, 200 Child Method.
//조상 클래스에 선언된 멤버변수와 같은 이름의 인스턴스변수를 자손클래스에 중복 정의했다.
//조상타입의 참조변수로 자손 인스턴스를 참조하는 경우 와
//자손타입의 참조변수로 자손 인스턴스를 참조하는 경우는 서로 다른 결과를 얻는다.
//메서드의 경우 조상클래스의 메서드를 자손의 클래스에서 오버라이딩한 경우에도 참조변수의
//타입에 관계없이 항상 실제 인스턴스의 메서드(오버라이딩된 메서드)가 호출되지만,
//멤버변수의 경우 참조변수의 타입에 따라 달라진다.
//따라서 변수 x 는 데이터의 타입에따라 각각 p , c 의 변수들이 호출되 100, 200이 나옴.
//데이터의 타입은 다르지만, 참조변수 p, c 모두 child 인스턴스를 참조하고 있다.

//Parent 클래스와 child 클래스는 서로 같은 멤버들을 정의하고 있다.
//이 때 조상타입의 참조변수 p 로 child인스턴스의 멤버들을 사용하는 것과
//자손타입의 참조변수 c 로 child인스턴스의 멤버들을 사용하는 것의 차이를 알 수 있다.
//method()의 경우 참조변수의 타입에 관계없이 항상 실제 인스턴스의 타입인 child 클래스에
//정의된 메서드가 호출되지만, 인스턴스변수인 x 는 참조변수의 타입에따라서 달라진다.!!!
//변수는 타입을따라가고 메서드는 무조건 오버라이딩 된거를 따라갑니다~!!!

/*[7-24] 다음 중 인터페이스의 장점이 아닌 것은?
a. 표준화를 가능하게 해준다.
b. 서로 관계없는 클래스들에게 관계를 맺어 줄 수 있다.
c. 독립적인 프로그래밍이 가능하다.
d. 다중상속을 가능하게 해준다.
e. 패키지간의 연결을 도와준다.

 답 : e
 인터페이스를 사용하는 이유와 그 장점!!
 1. 개발시간을 단축시킬 수 있다.
 일단 인터페이스가 작성되면, 이를 사용해서 프로그램을 작성하는 것이 가능하다.
 메서드를 호출하는 쪽에서는 메서드의 내용에 관계없이 선언부만 알면 되기 때문이다.
 그리고 동시에 다른 한 쪽에서는 인터페이스를 구현하는 클래스를 작성하도록 하여, 인터페이스를 구현하는
 클래스가 작성될 때 까지 기다리지 않고도 양쪽에서 동시에 개발을 진행할 수 있다.
 
 2. 표준화가 가능하다.
 프로젝트에 사용되는 기본 틀을 인터페이스로 작성한 다음, 개발자들에게 인터페이스를 구현하여 
 프로그램을 작성하도록 함으로써 보다 일관되고 정형화된 프로그램의 개발이 가능하다.
 
 3. 서로 관계없는 클래스들에게 관계를 맺어줄 수 있다.
 서로 상속관계에 있지도 않고, 같은 조상클래스를 가지고 있지 않은 서로 아무런 관계도 없는
 클래스들에게 하나의 인터페이스를 공통적으로 구현하도록 함으로써 관계를 맺어 줄 수 있다.
 
 4. 독립적인 프로그래밍이 가능하다.
 인터페이스를 이용하면 클래스의 선언과 구현을 분리시킬 수 있기때문에 실제구현에 독립적인 프로그램을
 작성하는 것이 가능하다. 클래스와 클래스간의 직접적인 관계를 인터페이스를 이용해서 간접적인 관계로 
 변경하면, 한 클래스의 변경이 관련된 다른 클래스에 영향을 미치지 않는 독립적인 프로그래밍이 가능하다.
*/


//6장 내용 : 크래스와 메서드를 만들고 객체생성해서 불러다쓰는거!!
/*class 이름 {}
//class 는 변수와메서드로 구성됨!!
변수는 클래스 밑에다 선언하면 전역변수.
메서듬속 변수는 지역변수.
메서드는 리턴타입과 파라미터를 고려해서 만들어야함.

-메서드
맨앞에 리턴타입. 리턴할값이 없으면 void.
return 은 리턴타입이없더라도 메서드를 종료시키는 역할을 함.
객체생성해서 객체를 통해서 메서드를 호출했었다. 
보통은 객체생성시 변수에 담는다. 변수에 담는 이유는 여러번 사용하기위해.
변수에 안담으면 객체가 사라져!! 왜????
		
인스턴스변수....
클래스변수는 스태틱 초기화블럭에서 초기화한다.
*/


		
