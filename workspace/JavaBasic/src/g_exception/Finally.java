package g_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Finally {

	public static void main(String[] args) {
		
/*		<< finally >>
		- 필요에따라 try-chatch 뒤에 finally 를 추가할 수 있다.
		- finally 는 예외의 발생여부와 상관ㅇ벗이 가장 마지막에 수행된다.
		
		<< 자동 자원 반환 (try-with-resources) >>
		- try(변수 선언; 변수 선언){} catch(Exception e){}
		- 사용 후 반환이 필요한 객체를 try 의 () 안에서 선언하면 try 블럭 종료시 자동으로 반환된다.
*/ 
//		코드 작성시 반드시 실행하고싶은 내용이 있을 때 finally 를 추가합니다.
		
	/*	FileInputStream fis = null; //파일 일기
		
		try {
			fis = new FileInputStream("file.txt"); // 사용 후 닫아줘야하는 객체. 예외처리가 강제되는 상황. try catch로 감싸야해.
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			//예외 발생과 상관없이 반드시 처리해야 하는 내용을 넣어준다.
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}*/
		
		//예외가 발생하게되면 try -> catch -> finally
		//예외 미 발생시 : try -> finally
		
		//위의 과정이 귀찮다. close도 트라이캐치로 감싸야하구...(JDK1.7 이후부터가능한 작업)
	try(FileOutputStream fos = new FileOutputStream("d:/file.txt")){//파일쓰는것.(=FileOutputStream)
	//try() 안에서 객체를 생성하면 try 종료시 자동 반환된다.
		String str = "아무내용이나 써보자";
		byte[] bytes = str.getBytes();
		for(int i=0; i < bytes.length; i++){
			fos.write(bytes[i]);
		}
	}catch (Exception e){
		e.printStackTrace();
	}
		//뭔지 아무것도 모르겠다~!
		
		
		
		
		
		
		
		
		
	}

}
