package g_exception;

import java.io.IOException;

public class ThrowExeption {

	public static void main(String[] args) {
		
/*		<< 예외 발생시키기>>
		- throw new Exception();
		- throw 키워드와 예외 클래스의 객체로 예외를 고의로 발생시킬 수 있다.
*/
		//예외가발생하면 예외클래스에 객체가 생깁니다. 예외클래스객체를 생성해서 강제로 예외를 만들 수도 있습니다.
		
		IOException ioe = new IOException();
		
		try {//Exception 클래스의 자식.
			throw ioe;//여기서 한 번 예외 발생.
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//RuntimeException 클래스의 자식.
		throw new NullPointerException();//여기서 예외 두번째 발생.
		//ioeException 은 트라이캐치로 강제로 감싸야했지만 throw 는 트라이캐치로 감싸지 않아도 된다.
		//ioeException 은 Exception 클래스의 자식. throw 는 RuntimeException 클래스의 자식임.
		//언제 강제로 예외를 발생시키나요?테스트시. 에러가 발생할 상황을 테스트하기위해서. 코드로예외발생시키기 어려우니까

	}

}
