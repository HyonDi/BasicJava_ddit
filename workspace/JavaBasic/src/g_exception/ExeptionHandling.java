package g_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExeptionHandling {

	public static void main(String[] args) {
/*		<< 에러 >>
		- 컴파일 에러 : 컴파일 시에 발생되는 에러 (빨간줄) / 문법적인 오류로 컴파일 할 수 없다.
		- 논리적 에러 : 실행은 되지만, 의도와 다르게 동작하는 것 (버그) 
		- 런타임 에러 : 실행시에 발생되는 에러 (우리가 처리할 에러)
		
		<< 런타임 에러 >>
		- 런타임 에러 발생시 발생한 위치에서 프로그램이 비정상적으로 종료된다.
		- 에러 : 프로그램 코드에 의해서 수습될 수 없는 심각한 오류 (처리 불가)
		- 예외 : 프로그램 코드에 의해서 수습될 수 있는 다소 미약한 오류 (처리 가능)
		
		<< 예외 >>
		- 모든 예외는 Exception 클래스의 자식 클래스이다.
		- RuntimeException  클래스와 그 자식들은 예외처리가 강제되지 않는다. ( unchecked 예외 )
		- [RuntimeException 클래스와 그 자식들을 제외한] Exception 클래스의 자식들은 예외처리가 강제된다. (checked 예외)
		
		<< 예외처리 (try-catch) >>
		- 예외처리를 통해 프로그램이 비정상적으로 종료되는 것을 방지할 수 있다.
		- try {/실행시키고자하는 내용/} catch(Exception e/예외 객체를 파라미터로 받는다./){}
		- try 블럭 안의 내용을 실행 중 예외가 발생하면 catch 로 넘어간다.
		- catch 의 () 안에는 처리할 수 있도록 catch 는 하나 이상 올 수 있다.
		- 발생한 예외와 일치하는 catch 블럭안의 내용이 수행된 후 try-catch 를 빠져나간다.
		- 발생한 예외와 일치하는 catch 가 없을 경우 예외는 처리되지 않는다.
*/
		
		
		try{
		int result = 10 / 0; //예외가 발생한 위치에서 프로그램이 비정상적으로 종료된다.
		System.out.println(result);//예외발생 시 실행되지 않는다.
		} catch(ArithmeticException | IndexOutOfBoundsException e){
			//예외 발생시 발생한 예외와 일치하는  catch블럭이 수행되고, 일치하는 catch가 없는 경우 예외는 처리되지 않는다.
			e.printStackTrace(); //에러메세지를 그대로 출력하기위한 메서드.
		} catch(NullPointerException e){
			//여러종류의 예욀ㄹ 처리하기위해 catch를 하나 이상 사용할 수 있다.
		} catch(Exception e){ //모든 예외 class가 Exception 의 자식이니 이렇게해줄 수 있다.
			//예상치 못한 예외를 처리할 수 있다.
			//모든 예외를 한번에 처리할 수 ㅣ있다.
		}
		/*Exception in thread "main" java.lang.ArithmeticException: / by zero
	at g_exception.ExeptionHandling.main(ExeptionHandling.java:29)
*/            //java.lang.ArithmeticException : 생성된 예외객체. 
		
		
		
	test1();
		
		
		
		
		
	}

	private static void test1() {
		test2();
		
	}

	private static void test2() {
//		System.out.println(10 / 0);
		//위의 경우는 찾기쉬움. 아래는 어렵다.
		//처음 나온 에러가 내가 만든게 아니야.
		try { //예외처리가 강제되는 경우.try catch로 꼭 감싸줘야 한다.
			new FileInputStream("");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} 
		
		//일단 catch로 들어오기만 하면 강제종료되지는 않음 실행은 다 됨.
		
		
		
		
		
	}

}
