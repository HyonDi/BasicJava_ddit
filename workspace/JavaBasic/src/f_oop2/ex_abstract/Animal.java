package f_oop2.ex_abstract;
//도오옹무우울~! 달리기..걷기 메서드를 만들것임. 소리내기?울기 짓기 
public abstract class Animal {

	void run(){
		System.out.println("달려간다~~~");
	}
	
	
	abstract void bark();
	
}

class Dog extends Animal {

	@Override
	void bark() {
		System.out.println("멍멍!!");
	}
	
}

class Cat extends Animal{

	@Override
	void bark() {
		System.out.println("야옹!!");
	}
	
}

class Duck extends Animal{
		
	@Override
	void bark() {
		System.out.println("꽥꽥!!");
	}
}

