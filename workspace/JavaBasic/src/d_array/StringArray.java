package d_array;

public class StringArray {

	public static void main(String[] args) {
		//String 이가진 메서드들을 볼거야
		
		String s = new String("ABCD");//참조형 타입을 초기화하는 방법
		String str = "ABCD"; //string 은 (뉴 타입) 이부분 생략 가능. 자주쓰여서.
		//배열도 참조형이라 뉴 타입 썼었어. 유우우우일하게 스트링만 저렇게 생략 가능하다.
		
		//문자배열을 반환해주는 메서드다.(str.toCharArray() 가.) 얘는 문자배열을 불러오는거.
		char[] charArray = str.toCharArray();
		System.out.println(charArray); 
		//캐릭터형 배열은 그냥 저렇게 쳤을때에 주소가 아니라, 배열의 내용이 출력된다. 캐릭터타입 배열만!!
		//메서드는 클래스. 점찍었을때 뒤에 나오는거. 우리지금 치고있는곳은 메인메서드고.
		//이 페이지는 클래스인데, String 도 클레스이고 이 페이지같은거라는거네
		
		//String 클래스 내부에 문자배열을 다루는 여러가지 메서드가 정의되어 있다.
/*
		<<String 의 주요 메서드>>
		- equals()		: 문자열의 내용이 같은지 확인한다. 
		- length()		: 문자열의 길이를 반환한다.
		- charAt()		: 문자열에서 해당 위치(인덱스)에 있는 문자를 반환한다.
		- substring() 	: 문자열에서 해당 범위(시작인덱스,끝인덱스)에 있는 문자열을 반환한다.
		- indexOf()		: 문자열 내의 특정 문자열의 인덱스를 반환한다.
		- replace() 	: 문자열 내의 특정 문자열을 원하는 문자열로 변경해 반환한다.
*/
		//배열은 크기변경 안돼서 변경하고싶으면 새로만들어야했음.
		//String 은 뭐가됐든 변경을하면 새로운 문자열을 만들어버림. 기존내용을 변경하는게 아냐.
		//계속해서 변경이 있을때마다 주소가 바뀜. 기존거 삭제해버리고 새로만들기때문.
		
		for( int i=0; i <str.length(); i++){//메서드이기때문에 str.length() 라고 소괄호사용해야함.
			System.out.println(str.charAt(i));//캐릭터타입으로 반환함!!!= charArray[i]
		}
		
		String revStr = ""; //str을 거꾸로 담을 변수.		
		//뒤에서부터 한글자씩 가져와서 새로운 변수에 더한다.
		
		for (int i=str.length() - 1; i >= 0;i--){
			revStr += str.charAt(i);
		}
		System.out.println(revStr);
		
		str = "0123456789";
		String sub1 = str.substring(3);       //인덱스 번호를 하나쓰면(3) 하나쓴거(인덱스3번)부터 끝까지 반환한다.
		//메소드에 들어가는 값을 파라미터라고 부름(3이 파라미터임.)
		System.out.println(sub1);
		
		String sub2 = str.substring(5,8);  //인덱스 5번부터 인덱스8번 전까지(8번은 안나옴)반환한다.
		System.out.println(sub2);  //파라미터2개를 쓰면 시작과 끝을 정할 수 있음.
		
		str = "치킨 피자 돈까스 떡볶이";
		int idx = str.indexOf("피자");//피자의 '시작' 인덱스를 반환한다.
		System.out.println(idx);//공백도 인덱스값을 가짐.
		
		int idx2 = str.indexOf("햄버거");
		System.out.println(idx2); //-1 이 출력된다.해당 문자열이 없을때에는 -1반환.
		
		//서브스트링과 인덱스오브를 같이 사용해보자.
		String[] menus = {
				"치킨 18000원",
				"피자 9900원",
				"돈까스 8000원",
				"떡볶이 500원"
		};//문자열배열을 만들었다.
		//메뉴이름만 가져오고싶어. 근데 길이가 달라. 어떻게 지정하지?
		//서브스트링이랑 인덱스오브를 조합하면 된다.
		
		for(String menu : menus){ //메뉴에있는걸 하나씩 스트링메뉴에 넣어서 실핸한다.향상된 포문.
			String name = menu.substring(0,menu.indexOf(" "));//메뉴이름뒤에 공백이 하나씩 있다는 패턴이 있음을 알 수 잇따.
			System.out.println(name);
			}
		//가격만 분리시켜 int형 변수에 담아주세요.

		for(String menu : menus){
			int price = Integer.parseInt(menu.substring(menu.indexOf(" ") + 1, menu.indexOf("원")));			
			System.out.println(price);
		}
		
		str = "123456789";
		str = str.replace("3", "짝");
		//선생님짱이당...
		System.out.println(str);
		//3의 배수마다 짝으로 바꾸려면??
		
		str = str.replace("6","짝");
		str = str.replace("9","짝");
		System.out.println(str);
		
		//369게임방법. 여기에 5의배수에 만세를하면?--------------------------------------------------
		for (int i = 0 ; i > str.length() ; i++){
			if(i%3 == 0){
			str = str.replace("i","짝");
			if(i%5 == 0){
				str = str.replace("i","만세");
			}
		}
		}
		System.out.println(str);
	//-------------------------------------------------------------배열만들어서 실행해봅시다.ex) 1~100
		
		
		
		
		
		
		
		
		
		
		String pn = "010-2363-3647";
		//하이픈(-)을 제거해서 출력해주세요
		
		pn = pn.replace("-","");
		System.out.println(pn);
		//replace 는 존재하는 선택문자열을 전부 찾아서 바꿔준다.
		
		
		//어떨때 유니코드로 나오고 어떨때 숫자로나고하는지 찾아공부해보자.....
		
		
		
		
		
	}

}
