
package a_variable;

import java.util.Scanner;


//1-2
/*	
		*/
public class practice {
	static public void main(String[] args) {
/*		
		int x = 0;
		int y = 0;
		
		while (0 <= x && x<= 10 ){
			 y = 0;
			while (0 <= y && y <= 10){
				
				if (2*x + 4*y == 10){
					System.out.println(x + " / " + y );
				}
				y++;
				
			}
			x++;			
		}
	*/	
 //왜 5/0 의 결과는 안나오지??

		
		
		/*
		String str = "12345";
		int sum = 0;
		
		for(int i=0; i < str.length(); i++) {
			sum += str.charAt(i) - '0';			
		}
		System.out.println("sum="+sum);
		*/
		
		
		
		/*String value = "12o34";
		char ch = ' ';
		boolean isNumber = true;
		// 반복문과 charAt(int i)를 이용해서 문자열의 문자를
		// 하나씩 읽어서 검사한다.
		for(int i=0; i < value.length() ;i++) {
			if(!(0 <= value.charAt(i)-'0' && value.charAt(i)-'0' <= 9)){
			 isNumber = false;
			}
		}
		
		if (isNumber) {
		System.out.println(value+"는 숫자입니다.");
		} else {
		System.out.println(value+"는 숫자가 아닙니다.");
		}*/

		//숫자를 입력받아 입력받은 숫자에 3자리마다 콤마(,)를 붙여 출력해주세요.
		//123456-> 123,456   1234567-> 1,234,567
		
		/*
		Scanner s = new Scanner(System.in);		
		System.out.println("숫자 입력 > ");
		String input = s.nextLine();
		for(int i = input.length()- 3; i > 0; i = i -3){
			String temp1 = input.substring(0, i);
			String temp2 = input.substring(i);
			input = temp1 + ", " + temp2;
		}
		System.out.println(input);
	*/
				 
		//1234567-> 3자리마다 콤마를 찍어야해.
		//콤마찍어담을 새로운 변수를 만든다.
		//이 변수에 뒤에서부터 한자리씩 넣는다.
		//	
		//안에 포문에서 숫자를 입력.
		//밖 포문에서 콤마를 적는다.
		//근데 안포문은 밖포문이랑 연관이있어야하는데..무슨연관이냐면...
		//숫자 7개(1234567) 면 뒤에서부터 스트링 크기만큼 --시키면서 3번을옮기면 콤마를찍어야함.
		//돌아가는 포문은 i
		
	/*	Scanner s = new Scanner(System.in);
		System.out.println("숫자> ");
		String input2 = (s.nextLine());
		String temp = "";
		
		for (int i =input2.length()-1; i >=0; i--){
			temp = input2.charAt(i) + temp;
			if((input2.length()-i)%3==0)temp = "," + temp;
		}System.out.println(temp);
		
		*/
		
		//답
	/*	Scanner s = new Scanner(System.in);
		System.out.println("숫자> ");
		String number = (s.nextLine());
		String newNumber = ""; //숫자 저장할 새로운 변수*/
		/*
		int count = 0; //몇번숫자를 담았는지 셀것이다.
		
		for(int i = number.length() - 1; i >=0; i --) {
			newNumber = number.charAt(i) + newNumber;
			count++;
			if(count % 3 == 0){
				newNumber = "," + newNumber;
			}
		}
		System.out.println(newNumber);
		*/
		
		
		/*
		int count = 0; //몇번숫자를 담았는지 셀것이다.
		
		for(int i = number.length() - 1; i >=0; i --) {
			newNumber = number.charAt(i) + newNumber;
			count++;
			if(count % 3 == 0 && count != number.length()){ //맨앞에는 찍지 않도록 조건 추가. 왜지??
				newNumber = "," + newNumber;
			}
		}
		System.out.println(newNumber);*/
		//문자열이라 더하면 숫자연산이아니라 그냥 더해지는건가?
		//내가생각하고있는걸 코드로옮기기..................
		
		
		
		
		/*  7번문제
		if(args.length!=1) {
			System.out.println("USAGE: java Exercise5_7 3120");
			System.exit(0);
			}
		
			// 문자열을 숫자로 변환한다. 입력한 값이 숫자가 아닐 경우 예외가 발생한다.
			int money = Integer.parseInt(args[0]);
			System.out.println("money="+money);
			int[] coinUnit = {500, 100, 50, 10 }; // 동전의 단위
			int[] coin = {5, 5, 5, 5}; // 단위별 동전의 개수
			
			for(int i=0;i<coinUnit.length;i++) {
			int coinNum = 0; //필요한 동전의 개수
			
			coinNum = money / coinUnit[i];
			coin[i] -= coinNum;
			
			money = money - coin[i] * coinUnit[i];
			
										
												
			
			System.out.println(coinUnit[i]+"원: "+coinNum);
			}
			if(money > 0) {
			System.out.println("거스름돈이 부족합니다.");
			System.exit(0); // 프로그램을 종료한다.
			}
			System.out.println("=남은 동전의 개수 =");
			for(int i=0;i<coinUnit.length;i++) {
			System.out.println(coinUnit[i]+"원:"+coin[i]);
			}
		*/
		
	/*	String[] words = { "television", "computer", "mouse", "phone" };
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0;i<words.length;i++) {
			
		char[] question = words[i].toCharArray(); // String을 char[]로 변환
		 
		char temp;
		 int p = (int)Math.random()*words.length;
		 
		 for(int j = 0; j < question.length; j++ ){
		 temp= question[p];
		 question[p] = question[j];
		 question[j] = temp ;
		 
		 }
		 System.out.println(question);
		System.out.printf("Q%d. %s의 정답을 입력하세요.>",
		i+1, new String(question));
		String answer = scanner.nextLine();
		// trim()으로 answer의 좌우 공백을 제거한 후, equals로 word[i]와 비교
		if(words[i].equals(answer.trim()))
		System.out.printf("맞았습니다.%n%n");
		else
		System.out.printf("틀렸습니다.%n%n");
		}
		*/
		
	/*	if(args.length!=1) {
			System.out.println("USAGE: java Exercise5_7 3120");
			System.exit(0);
			}
			// 문자열을 숫자로 변환한다. 입력한 값이 숫자가 아닐 경우 예외가 발생한다.
			int money = Integer.parseInt(args[0]);
			System.out.println("money="+money);
			int[] coinUnit = {500, 100, 50, 10 }; // 동전의 단위
			int[] coin = {5, 5, 5, 5}; // 단위별 동전의 개수
			for(int i=0;i<coinUnit.length;i++) {
			int coinNum = 0;
			 (1) 아래의 로직에 맞게 코드를 작성하시오.
			1. 금액(money)을 동전단위로 나눠서 필요한 동전의 개수(coinNum)를 구한다.
			2. 배열 coin에서 coinNum만큼의 동전을 뺀다.
			(만일 충분한 동전이 없다면 배열 coin에 있는 만큼만 뺀다.)
			3. 금액에서 동전의 개수(coinNum)와 동전단위를 곱한 값을 뺀다.
		1. 	coinNum = money / coinUnit[i];
				
		2.	if(coin[i] > coinNum){
					coin[i] -= coinNum;
				}else {coinNum = coin[i];
				coin[i] -= coinNum;
				}
					
		3.	money -= (coinUnit[i]*coinNum);
				
			
			
			
			
			
			
			System.out.println(coinUnit[i]+"원: "+coinNum);
			}
			if(money > 0) {
			System.out.println("거스름돈이 부족합니다.");
			System.exit(0); // 프로그램을 종료한다.
			}
			System.out.println("=남은 동전의 개수 =");
			for(int i=0;i<coinUnit.length;i++) {
			System.out.println(coinUnit[i]+"원:"+coin[i]);
			}
		
*/		
		
		
		char[] abcCode =
			{ '`','~','!','@','#','$','%','^','&','*',
			'(',')','-','_','+','=','|','[',']','{',
			'}',';',':',',','.','/'};
			// 0 1 2 3 4 5 6 7 8 9
			char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
			String src = "abc123";
			String result = "";
			// 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
			for(int i=0; i < src.length();i++) {
				char ch = src.charAt(i);
				if('a' <= ch && ch <= 'z' ){
					result += abcCode[src.indexOf(ch)];
				}else if('0' <= ch && ch <= '9'){
					result += numCode[ch - 48];}
			}
			System.out.println("src:"+src);
			System.out.println("result:"+result);
			 // end of class
	/*		0 1 2 3 4 5 6 7 8 9
			q w e r t y u i o p
			u v w x y z
			} ; : , . /
			a b c d e f g h i j k l m n o p q r s t
			` ~ ! @ # $ % ^ & * ( ) - _ + = | [ ] {
			
	*/	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//
}//


