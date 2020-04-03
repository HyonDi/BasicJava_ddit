package e_oop;

public class Static {

	public static void main(String[] args) {
		/*<<Static>>
		- 사용 목적:
		- 1. 객체 생성 없이 변수나 메서드를 사용하기 위해 붙인다. 스태틱이붙으면 메모리에 올라가 있기 때문.
		- 2. 객체들간에 변수의 값을 공유하기 위해 붙인다.
		
		- Static이 붙은 것 : 클래스 멤버(클래스 변수, 클래스 메서드)
		- 클래스 멤버 : 메모리에 클래스가 저장될 때 같이 저장된다.
		- Static이 붙지 않은 것 : 인스턴스 멤버(인스턴스 변수, 인스턴스 메서드)
		- 인스턴스 멤버 : 메모리에 인스턴스가 저장될 때 같이 저장된다. 객체생성을 할 때. 인스턴스화 할때 저장된다. 인스턴스가 저장된다 = 객체생성을 한다.
*/
		
		//static이 붙은 메서드
		Math.random(); // 얘 사용할때 객체생성안했음. static이 붙어있다는 의미. Math라는 클래스에 있는 rando 메서드!
		System.out.println(); //시스템이란 클래스에 아웃이라는 변수 안에 프린트엘엔이라는 메서드가 있는 것.
		 						//얘도 static이 붙었으니 사용할 수 있는거겠지!
		
		//스태틱이 붙은 메서드를 만들어서 사용해보자. (ClassMember)
		
		//으악! 졸령!
		//클레스 변수, 클레스 메서드를 실행했다.
		System.out.println(ClassMember.classVar);
		ClassMember.classMethod();
		
		//인스턴스변수, 인스턴스메서드를 실행해보자.
		
		ClassMember cm1 = new ClassMember();
		//인스턴스들은 객체생성을 해야만 불러올 수 있음 !!!!( = 인스턴스화!)
		
		System.out.println(cm1.instanceVar);
		cm1.instanceMethod();
		
		//
		
		
		System.out.println(cm1.classVar);
		cm1.classMethod();
		//접근을 할 대에는 클래스명. 으로 해주세요!
		//객체를 통해서도 클래스 멤버에 접근할 수 있지만 좋은 방법은 아니다.
		
		//클래스멤버객체를 하나 더 만들어보자.
		ClassMember cm2 = new ClassMember(); //클래스멤버이 cm1, cm2 를 만들었따.
		//변수의 변화
		
		System.out.println("변경 전");
		System.out.println("cm1 : " + cm1.instanceVar);
		System.out.println("cm2 : " + cm2.instanceVar);
		
		cm2.instanceVar = "인스턴스 변수 변경";
		
		System.out.println("변경 후");
		System.out.println("cm1 : " + cm1.instanceVar);
		System.out.println("cm2 : " + cm2.instanceVar);
		//서로 영향을 주지 않는 다는 것을 알 수 있다.
		
		//이번에는 클래스변수의 변경을 해 보자.
		
		System.out.println("변경 전");
		System.out.println("ClassMember : " + ClassMember.classVar);
		System.out.println("cm1 : "   + cm1.classVar);
		System.out.println("cm2 : "   + cm2.classVar);
		
		ClassMember.classVar = "클래스 변수 변경";
		System.out.println("변경 후");
		System.out.println("ClassMember : " + ClassMember.classVar);
		System.out.println("cm1 : " + cm1.classVar);
		System.out.println("cm2 : " + cm2.classVar);
		
		//왜 변수가 공유되는걸까요?
		//하여튼 class변수 (=static 이 붙은 변수) 는 생성자마다의 변경값이 공유되고,
		//인스턴스멤버는 생성자마다 값이 공유되지 않는다.
		
		
	}

}
