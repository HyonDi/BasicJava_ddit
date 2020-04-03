package f_oop2;

//SampleParent 를 상속받을것이다.
public class SampleChild extends SampleParent {
	
	void childMethod(){
		//상속받은 변수와 메서드를 사용할 수 있다.
		System.out.println(var);
		int result = method(7,13);
		System.out.println(result);
		
	}
	public static void main(String[] args) {
		SampleChild sc = new SampleChild();
		System.out.println(sc.var);
		int result = sc.method(7,13);
		System.out.println(result);
		
		//아래서만든걸 사용하자.
		sc.test(10);
//															업캐스팅. 샹락가능함. 기본형은 표현범위가 작은거에서 표현범위가 큰거로갈때 묵시적형변환이 일어났지만,
//															멤버가 더 많은것은 자식. 자식에서 부모타입으로 갈때 생략이 가능하다.
		SampleParent sp = /*(SampleParent)*/new SampleChild();
		//모지 타입을 SampleParent 로 했다.
		//객체는 자식거고 변수는 부모거 타입이야.
		//이렇게 사용하면 부모타입이 가지고있는 멤버만 사용할 수 있다.
		System.out.println("sp.var : " + sp.var);
		System.out.println("sc.var : " + sc.var);
		System.out.println("sp.method() : " + sp.method(5,10));
		System.out.println("sc.method() : " + sc.method(5,10));
//		sp.childMethod(); , sp.test(); 이 두개는 부모한테없어서 사용할 수 없다.
		//변수는 다른값이나오는데 메서드는 같은값이 나와. 왜야? 변수는 타입을 따라가는데, sp.var 는 부모클래스에있는 변수 
		//sc.var 는 자식클래스에있는 변수.  근데 메서드는 조금 다르다. 메서드는 이름이 같다는건 오버라이딩을 했다는 것.
		//오버라이딩을하면 무조건 자식메서드. 오버라이딩된 메서드를 호출한다.
		//기존의 부모클래스에서받앗던 메서드는 무시함. 타입에 상관없이.
		
		
		
	}
	
	//어려워집디다
	/*오버라이딩: 상속받은 메서드의 내용을 재정의 하는 것. 상속받은것이 나랑 안맞을떄.*/
	@Override //어노테이션. 골뱅이로 시작하는걸 어노테이션이라고 함. 고급자바시간에 자세히 배울것이다. 
	//붙여도되고 안붙여도되는데 붙이는게 도움이 된다. 무슨도움? 
	//어노테이션이 없으면 1. 아래가 오버라이딩된 메서드인지 아닌지 한눈에 알 수가 없다.
	//2. 오타있을시. 메서드이름에 오타가났을때 오버라이드쓰면 알려주는데 안쓰면 오버라이드아니고 그냥 새변수 만든것.
	//안써도 새로만든건지, 컴파일러가 리턴타입, 메서드명, 파라미터를보고 알긴함.	
	int method(int a, int b){//리턴타입 메서드명 파라미터 모두 같아야 한다. 선언부가 똑같아야한다. 내용만바꾸는거야.
	return a * b;
	}
	
	int var;
	
	void test(double var){
		System.out.println(var); //지역변수
		System.out.println(this.var); //인스턴스변수
		System.out.println(super.var); //부모클래스의 인스턴스 변수.
		//super : 부모클래스의 멤버와 자식클래스의 멤버가 이름이 중복될 때 둘을 구분하기 위해 사용한다.
		System.out.println(this.method(10, 20));//오버라이딩시킨것. 그럼 오버라이딩 안시켯을때도 이게 실행될까?
		System.out.println(super.method(10, 20));
		
		
	}
	
	SampleChild(){
		super();//자식클래스안에 반드시 들어가있어야해. 부모클래스에 생성시킴.
		//super()를 사용해 부모 클래스의 객체도 생성한다.
		//super() 가 없으면 컴파일러가 자동으로 super()를 넣어준다.몬소리지
		//왜부모클래스객체도 생성해줘야해? 가져다쓰려고.
		
	}
	
	
	
	
	
	
	
	
	
}