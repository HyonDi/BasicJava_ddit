package f_oop2;

public class InnerClass {

	public static void main(String[] args) {
		/*
		 << 내부 클래스 >>
		- 클래스 내부에서 선언된 클래스이다.
		- 선언된 위치와 형태에 따라 여러가지로 나누어진다.
		
		- 인스턴스 클래스: 멤버변수 선언위치에 선언하며, 인스턴스 멤버들과 관련된 작업에 사용된다.
		- 스태틱 클래스	 : static이 붙고 멤버변수 선언위치에 선언하며, static멤버들과 관련된 작업에 사용된다.
		- 지역 클래스 	 : 메서드나 초기화블럭 안에 선언하며, 선언된 영역 내부에서만 사용될 수 있다.
		- 익명 클래스 	 : 이름이 없고, 선언과 객체 생성을 동시에 한다. (일회용)
		
		*/
		
		//정말 사용할일이 거의거의없다고 하신다. 단한번도 써본적없다고 하신다.
		
		Outer.InstanceInner ii = new Outer().new InstanceInner();
		System.out.println(ii.inner1);
		
		System.out.println(Outer.StaticInner.inner3);
		
		Outer.StaticInner si = new Outer.StaticInner();
		System.out.println(si.inner2);
		
	}

}

class Outer{
	//인스턴스변수
	int instanceVar = 1;
	int var = 10;
	
	//클래스 변수
	static int classVar = 2;
	
	//인스턴스 클래스
	class InstanceInner{
		//인스턴스 클래스에서는 인스턴스 멤버와 클래스멤버 모두 사용 가능.
		int inner1 = instanceVar;
		int inner2 = classVar;
		int var = 20;
		
		void method(){
			int var = 30;
			
			System.out.println(var);//지역변수
			System.out.println(this.var);//내부클래스의 인스턴스변수
			System.out.println(Outer.this.var);//바깥에있는 클래스의 인스턴스변수.
		}
	}
	
	//스태틱 클래스
	static class StaticInner{//클래스변수에대한 작업을 하기위한 클래스.
		//스태틱 클래스에서는 클래스 멤버만 사용 가능
//		int inner1 = instanceVar;
		int inner2 = classVar;
		static int inner3 = classVar;
	}
	
	
	
	
	void method(){
		//지역변수
		int localVar1 = 3;
		final int localVar2 = 4;
		
		//지역클래스
		class LocalInner{
			//지역클래스에서는 인스턴스 멤버와 클래스 멤버 모두 사용 가능하고 final이 붙은 지역변수도 사용 가능.
			int inner1 = instanceVar;
			int inner2 = classVar;
//			int inner3 = localVar1; //final 이 붙지 않은 지역변수는 사용 불가.
			int inner4 = localVar2;
		}
		
		//지역클래스는 메서드 내부에서 인스턴스화를 통해 사용 가능.
		LocalInner li = new LocalInner();
		System.out.println(li.inner1);
		System.out.println(li.inner2);
		System.out.println(li.inner4);
		
		//인스턴스클래스의 인스턴스 멤버에 접근하기 위해서는 인스턴스화를 해야한다.
		InstanceInner ii = new InstanceInner();
		System.out.println(ii.inner1);
		System.out.println(ii.inner2);
		
		//스태틱클래스는 클래스를 통해서 바로 접근할 수 있다.
		System.out.println(StaticInner.inner3);
		//스태틱 클래스의 인스턴스 멤버에 접근하기 위해서는 인스턴스화를 해야한다.
		StaticInner si = new StaticInner();
		System.out.println(si.inner2);
		
		
	}
	
	
	
	
	
}