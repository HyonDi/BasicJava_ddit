package g_exception;

import java.io.IOException;

public class ThrowsException {

	public static void main(String[] args) /*throws IOException{method();}*//*이렇게하고 아래 메서드 지우면 예외그냥 발생 하는것임.*/{
		
/*		<< 메서드에서 예외 선언하기 >>
		- 메서드 호출시 발생할 수 있는 예외를 선언해 줄 수 있다.
		- void method() throws IOException {}
		- 메서드의 구현부 끝에 throws 키워드와 예외클래스명으로 예외를 선언할 수 있다.
		- 예외를 선언하면 예외처리를 하지 않고 자신을 호출한 메서드로 예외처리를 넘겨준다.
		
		이렇게하면 나말고, 날 호출한 메서드에서 예외처리를 해줘야해.
*/		
		
		try {
			method();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

	private static void method() throws IOException {
		throw new IOException();
		
	}

}
