package f_oop2;

public class SampleParent extends Object{//오브젝트에 대고 f3 누르면 이동한다.
//아무것도 상속받지 않는 클래스는 Object 클래스를 상속받고있다. 따라서 SampleChild 한테 오브젝트도 물려줌.
	//모든 클래스는 Object 클래스를 상속받는다. Object 는 모든 클래스의 조상클래스. 부모클래스다. 라고 함.

	
//배열, 초기화블럭, 생성자, 메서드 만듬.
//변수와 메서드는 물려주는데, 초기화블럭과 생성자는 물려주지 않는다.
	String var;
	
	{
		var = "초기화 블럭을 물려주지 않는다.";
	}
	
	SampleParent(){
		
		var = "생성자도 물려주지 않는다.";
	}
	
	int method(int a, int b){
		return a+b;
	}
	
	
	
}
