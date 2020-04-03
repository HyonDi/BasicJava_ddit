package f_oop2.ex_abstract.ex_interface;

public interface SampleInterface {
	
	/*
	 << 인터페이스 >>
	- 상수와 추상메서드만 멤버로 가질 수 있는 데이터 구조이다. 
		(jdk 1.7 기준. 1.8부터는 추상메서드외에도 디폴드메서드, 스태틱메서드를 사용할 수 있게 되어 있다.(내용이 있는!))
	- interface 인터페이스명{}
	- 모든 멤버변수의 제어자는 public static final 이며, 생략할 수 있다.
	- 모든 메서드의 제어자는 public abstract 이며, 생략할 수 있다.
	*/
	
	/*public static final*/ int NUM1 = 1;
	int NUM2 = 2;
	
	/*public abstract*/ void method1();
	
	void method2();
	
	//JDK1.8부터 static 메서드와 디폴트 메서드를 사용할 수 있게 되었다.
	
}

//인터페이스를 상속받을 메서드 . 인터페이스를 상속받을땨에는 extends 가 아닌 implements 를 써야한다.
//클래스는 딱 하나의 클래스만 상속받을 수 있었지만 인터페이이스는 하나의 클래스에서 여러개의 인터페이스를 상속받을 수 있다.
//2개의 클래스에 동일한 이름의 메서드. 자식클래스가 두개의 클래스를 상속받는다고 해보자. 동일한 이름의 메서드. 그래서  클래스는 다중상속을 막은것이다.
//하지만 인터페이스의 경우, 동일한 이름이 있어도 어차피 내용이 없다. 아무거나 호출해도 된다는 의미.
//인터페이스는 메서드에 내용이 없기때문에 메서드명이 중복되어도 구분할 필요가 없다.
//그러므로 다중상속이 가능하다.

class SampleImplement implements SampleInterface, SampleInterface2{

	@Override
	public void method1() {
		System.out.println(NUM1);
	}

	@Override
	public void method2() {
		System.out.println(SampleImplement.NUM2);	
	}

	@Override
	public void method3() {
		System.out.println();
		
	}
		
}

interface SampleInterface2{
	void method1();
	void method3();
}

