package h_useful;

import java.util.Vector;

public class WrapperClass {
	public static void main(String[] args) {
/*		Wrapper 클래스 	: 기본형 타입을 객체로 사용해야 할 때 대신 사용하는 클래스
		boolean		: Boolean
		char 		: Character
		byte		: Byte
		short		: Short
		int			: Integer
		long		: Long
		float		: Float
		double		: Double
*/ //앞글자를 대문자로 바꾸는데 integer 랑 character 만 다르다.
		
		int i = 10;
		Integer iw = new Integer(20);
		//둘간의 연산이 가능하다.
		//원래 기본형타입과 참조형타입은 연산이 불가능한데
		//기본형타입과 래퍼클래스는 연산이 가능하다.
		System.out.println(i + iw);
		
		
		
		System.out.println(Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
		//int 타입의 최소값과 최대값.
		
		System.out.println(i + Integer.parseInt("20"));
		
		System.out.println(i + String.valueOf(20));
		
		//합친 것
		
		System.out.println(i + Integer.valueOf("20")); /*= parseInt 와 같은 효과.*/
				
		/*collection 사용할때에 사용하ㅑㄹ 수 있다.
*/		
		Vector<Integer> v = new Vector<Integer>();
		
		v.add(new Integer(10));
		
		v.add(new Integer(10));
		v.add(10); //오토박싱 : 기본형타입이 wrapper 클라스 자동 병환
		
		Integer interger = v.get(0);
		
		Integer integer = v.get(0);
		int i2 = v.get(0); // 언바ㅓㄱ싱. wrapper 크래스가 기본형 타입으로 자동변환해줌.
		
		
		
		
		
	}
}
