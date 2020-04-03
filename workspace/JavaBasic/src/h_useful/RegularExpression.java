package h_useful;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
/*		<<  정규표현식 : 문자열의 패턴을 검사하는 표현식  >>
		회원가입할때 주로 사용한다. 조오건 을 검사할때 정규표현식을 사용한다.
		
		^		: 뒷 문자로 시작
		$		: 앞 문자로 종료
		.		: 임의의 문자 1개. 1개. 1개. (줄바꿈 제외)
		*		: 앞문자가 0개 이상
		+		: 앞 문자가 1개 이상
		?		: 앞 문자가 없거나 1개
		[]		: 문자의 집합이나 범위([A-Z] : A부터 Z 까지, [^A-Z] : A부터 Z가 아닌 것)0~9, 가~하 등등 . 가에서 롱까지도 될까?
		{}		: 앞 문자의 개수({2} : 2RO, {2,4} : 2개이상 4개이하)
		()		: 그룹화(1개의 문자처럼 인식)
		|		: or 연산
		\s		: 공백, 탭, 줄바꿈
		\S		: 공백, 탭, 줄바꿈이 아닌문자.
		\w		: 알파벳이나 숫자
		\W		: 알파벳이나 숫자가 아닌 문자.
		\d		: 숫자
		\D		: 숫자가 아닌 문자
		(?!)	: 뒷 문자의 대소문자 구분 안함.
		\		: 정규표현식에서 사용되는 특수문자 표현
*/
		
		//패턴을 표현할때는 좁게 설정하는 것이 좋아요. 그래야 내가 원하는 패턴을 찾을 수 있습니다.
		String str = "abc123";
		
//		String regex = "[a-z]{3}[0-9]{1,3}";
//		String regex = "[a-z0-9]+";
//		String regex = "\\w*";
		String regex = ".*";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str);
		System.out.println(m.matches());
		
		
//		문제를 풉니다.
//		아이디, 전화번호, 이메일주소의 유효성을 검사하는 정규표현식을 만들어 주세요.
//		아이디 : 5~20자 영문소문자, 숫자와 특수기호 _, - 만 사용 가능합니다.
//		이메일주소는??: 가운데 @들어가고 뒤에는 .???으로 끝나야함.
//		전화번호 : 010으로 시작하고 총 11글자. 가운데 4글자 뒤에 4글자.
		
		//핸드폰번호
		String phnum = "010-2075-7087";		
		String php = "^010-[0-9]{4}-[0-9]{4}";//던댕님 : "^0\\d{1,3}-\\d{3,4}-\\d{4}"
				
		Pattern ph = Pattern.compile(php);
		Matcher mph = ph.matcher(phnum);
		System.out.println(mph.matches());
		
		//아이디
		String idid = "patss12r_-_";
		String idp = "[a-z0-9-_]{5,20}"; 
		
		Pattern id = Pattern.compile(idp);
		Matcher mid = id.matcher(idid);
		System.out.println(mid.matches());
		
		//이메일주소
		String emailadr = "patiss12r@naver.com";
		String emailp = "[a-z0-9-_]{5,20}@[a-zA-z0-9]+\\.[a-zA-z]{3}"; //던댕님 : [a-zA-Z]+\\.(?!)(com|net|org|([a-z]{2}\\.kr))%
		
		Pattern email = Pattern.compile(emailp);
		Matcher memail = email.matcher(emailadr);
		System.out.println(memail.matches());
		
		
	}

}
