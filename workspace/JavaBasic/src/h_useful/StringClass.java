package h_useful;

import java.util.Arrays;

public class StringClass {

	public static void main(String[] args) {
/*		equals()		: 문자열을 비교하여 같으면 true, 다르면 false 를 반환한다.
		length()		: 문자열의 길이를 반환한다.
		substring()		: 주어진 범위에 해당하는 문자열을 반환한다.
		charAt()		: 지정된 위치의 문자를 반환한다.
		indexOf()		: 주어진 문자의 위치를 반환한다.
		lastIndexOf()	: 주어진 문자의 마지막 위치를 반환한다.
		replace()		: 문자열 내의 주어진 문자(문자열)을 새로운 문자(문자열)로 바꾼 문자열을 반환한다.
		replaceAll()	: 문자열 내의 주어진 정규표현식과 일치하는 문자열을 새로운 문자열로 바꾼 문자열을 반환한다.
		split()			: 문자열을 주어진 정규표현식과 일치하는 문자열로 나누어 문자열 배열로 반환한다.
		startsWith()	: 주어진 문자열로 시작하는 여부를 반환한다.
		endsWith()		: 주어진문자열로 끝나는지 여부를 반환한다.
		toUpperCase()	: 문자열을 대문자로 변환한 문자열을 반환한다.
		toLowerCase()	: 문자열을 소문자로 변환한 문자열을 반환한다.
		trim 			: 양끝의 공백을 제거한 문자열을 반환한다.
*/		
		String str = "abc abc  abc";
		System.out.println(str.indexOf("a")); //전부 알려줄순 없을까
		System.out.println(str.lastIndexOf("a"));
		System.out.println(str.indexOf("a", 1));
		
		System.out.println(str.replace("a", "0"));
		System.out.println(str.replaceAll("[a-z]","0")); //정규 표현식! 문자열의 패턴! a-z 까지.
		
		System.out.println(Arrays.toString(str.split(" ")));
		System.out.println(Arrays.toString(str.split(" +"))); //정규표현식의 표현 중 하나. 플러스 앞에있는 문자가 1개 이상. 1개여도되고 2개여도되고 3개여도됨.
		
		System.out.println(str.startsWith("a"));
		System.out.println(str.startsWith("b"));
		
		System.out.println(str.endsWith("c"));
		System.out.println(str.endsWith("b"));
		
		System.out.println(str.toUpperCase());
		
		System.out.println(str.toUpperCase().toLowerCase());

		String str2 = " abc abc ";
		System.out.println(str2);
		System.out.println(str2.trim());
		
//		trim : 회원가입같은거 할때 사용함. 사용자의 실수를 방지하기 위해서.
		
		
		
		
		
	}

}
