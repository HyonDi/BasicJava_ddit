package e_oop;

public class ClassMaker2 {
	public static void main(String[] args) {
		ClassMaker2 cm = new ClassMaker2();
		System.out.println(cm.g);
	}

//	전역변수 하나를 선언하고 명시적으로 초기화 해주세요.
	
	int g = 10;
	
//	위에서 선언한 전역변수를 초기화 블럭을 사용해 초기화 해주세요.
	
	{
		g = 4;
	}
	
//	위에서 선언한 전역변수를 생성자의 파라미터를 사용해 초기화 해주세요.
	
	ClassMaker2(int g){
		this.g = g ;
	}
	
//	위에서 선언한 전역변수를 생성자를 하나 더 만들어서 초기화 해주세요.
	
	ClassMaker2(){
		this(3);
	}
	
//	초기화 블럭과 명시적초기화 사이에서는 위에있는게 먼저 실행된다.
//	생성자는 가장 마지막에 실행이 된다.
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
