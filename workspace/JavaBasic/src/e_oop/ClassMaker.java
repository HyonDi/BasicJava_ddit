package e_oop;
//OOP 에서 실행시킬것임.
public class ClassMaker {
	
	//전역변수 하나를 선언 및 초기화 해주세요.	
	String name = "홍길동";
	
	//리턴타입과 파라미터가 없는 메서드 하나를 만들어주세요.
	//메서드 안에서 전역변수를 출력해주세요.	
	void method1() {
		System.out.println(name);
	}
	
	//전역변수와 동일한 타입의 리턴 타입이 있고 파라미터가 없는 메서드 하나를 만들어 주세요.
	//메서드 안에서 전역변수를 리턴해 주세요
	String method2() {
		return name;
	}
	
	//메서드를 만들 때에는 리턴타입과 파라미터 두가지를 고려하면 된다.
	//리턴타입이 없을 때에는 void 를 앞에 붙임.
	
	//리턴타입은 없고 파라미터가 하나 있는 메서드
	//메서드 안에서 파라미터를 출력해주세요.
	void method3(int num) {
		System.out.println(num);
	}
	
	//리턴타입이 있을때에는 return, 없을때는 System.out.println 해야하나보다.
	
	//int 타입의 리턴타입과 int 타입의 파라미터가 두개가 있는 메서드 하나를 만들어 주세요.
	//메서드 안에서 두 파라미터를 곱한 결과를 리턴해주세요.
	int method4(int a, int b){
		return a * b;
	}
	
	//
	
	
	
	
}
