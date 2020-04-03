package f_oop2;

public class AccessModifier {

	//접근제어자 4가지를 가지고 변수와 메서드를 만들어 봅니다.
	
	public String 	 publicVar 	  = "public		  : 접근 제한이 없음. ";
	protected String protectedVar = "protectedVar : 같은 패키지 + 상속받은 클래스에서 접근 가능.";
	String			 defaultVar	  = "default Var  : 같은 패키지에서만 접근 가능.";
	private String	 privateVar   = "private 	  : 클래스 내에서만 접근 가능. ";
	
	public void publicMethod(){
		System.out.println(publicVar);
	}
	
	protected void protectedMethod(){
		System.out.println(protectedVar);
	}

	void defaultMethod(){
		System.out.println(defaultVar);
	}
	
	private void privateMethod(){
		System.out.println(privateVar);
	}
	
	
	
	}
	

