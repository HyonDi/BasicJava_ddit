package c_statement;

import java.util.Scanner;

/*
import java.util.Scanner;//스캐너 사용하려면 이걸 해줘야ㅕ한대. 임포트.
//다른 패키지에있는 클래스를 사용하고 싶을 때, 패키지의 위치를 알려주는 것.
//java.util 이 어딨어?
*/
//ctrl + shift + o(알파벳) : 자동으로 위치 모르는 패키지들을임포트 시켜줌.
//여러개있으면??? 얘가 어떻게알아??

public class ConditionalStatement {

	public static void main(String[] args) {
		/*
		 * <<if 문>> - if : 조건식의 결과가 true 이면 블럭안의 문장을 수행한다. - else if : 다수의 조건이
		 * 필요할 때 if 뒤에 추가한다. - else : 결과가 true인 조건식이 하나도 없는 경우를 위해 추가한다.
		 */

		int a = 10;

		if (a < 100) {
			System.out.println("조건식의 연산 결과가 true 이면 수행된다.");
		}

		if (a < 10) {
			System.out.println("조건식의 연산결과가 false이면 수행되지 않는다.");
		}

		int regNo = 5; // 주민등록번호 첫자리
		String gender = null; // 성별

		if (regNo == 1 || regNo == 3) {
			gender = "남자";
		} else if (regNo == 2 || regNo == 4) {
			gender = "여자";
		} else
			gender = "확인불가";
		System.out.println("당신의 성별은 " + gender + "입니다.");
		// 생성된 문장이 한 문장일 때에는 블럭을 생략할 수 있다. 2문장은 안돼.

		/*
		 * int score = 88; String grade = null;
		 * 
		 * if(90 <= score){ grade = "A"; } else if(80 <= score && score < 90){
		 * //&& 굳이 검사안해도 되는 조건이다. 90이하라는건.) grade = "B"; } else if(70 <= score){
		 * grade = "C"; } else if(60 <= score){ grade = "D"; } else { grade =
		 * "F"; } System.out.println(score + "점에 해당하는 등급은 " + grade + " 입니다.");
		 */
		// 등급 안에서 +와 - 를 나누어보자. A+, A- 같은거처럼.

		int score = 32;
		String grade = null;

		if (90 <= score) {
			grade = "A";
			if (97 <= score) {
				grade += "+";
			} else if (score <= 93) {
				grade += "-";
			}
		} else if (80 <= score) {
			grade = "B";
			if (87 <= score) {
				grade += "+";
			} else if (83 >= score) {
				grade += "-";
			}
		} else if (70 <= score) {
			grade = "C";
			if (77 <= score) {
				grade += "+";
			} else if (73 >= score) {
				grade += "-";
			}
		} else if (60 <= score) {
			grade = "D";
			if (67 <= score) {
				grade += "+";
			} else if (63 >= score) {
				grade += "-";
			}
		} else {
			grade = "F";
			if (57 <= score) {
				grade += "+";
			} else if (53 >= score) {
				grade += "-";
			}
		}

		System.out.println(score + "점에 해당하는 등급은 " + grade + " 입니다.");
		// 이거 줄여서 쓸 수 있지않을까

		/*
		 * <<switch문>>//if문 외에 또다른 조건문 - 조건식과 일차하는 case문 이후의 문장을 수행한다. - 조건식의
		 * 결과는 정수와 문자열만 (JDK1.7부터 문자열 허용) 허용한다.
		 */
		/*
		 * regNo = 4; gender = null;
		 * 
		 * switch(regNo){//조건식의 연산결과는 정수와 문자열만 허용한다. case 1 : case 3 : //case문의
		 * 값은 리터럴과 상수만 사용할 수 있다.(=변수는 불가능) gender = "남자"; break; //break를 만나면
		 * switch문을 빠져나간다. case 2 : case 4 : gender = "여자"; break; default :
		 * gender = "확인불가"; } System.out.println("당신의 성별은 " + gender + " 입니다.");
		 */
		// 디폴트칸에만 break 안써도 되는것임. 다른데는 다 써야함.
		// 핵도 이렇게 만드는건가??

		// 스위치문으로 등급매기기 만들어보자.
		// 범위지정 불가능해. 어떡할래?
		// 나누기 10하래
		score = 100;
		grade = null;
		switch (score / 10) {
		case 9:
		case 10:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";
		}
		System.out.println(score + "점에 해당하는 등급은 " + grade + " 입니다.");
		// 조건이 아니라 위치로의 이동이래. 조건이 까다로워..... 워엉워어우ㅠㅠㅜㅠㅜㅠㅜㅠㅜㅠㅜㅠㅜㅠㅜㅜㅠㅜㅜㅠㅜㅜㅜㅠㅜㅠ
		// 스위치문 장점?: 똑같은 조건인 경우, 스위치문이 실행속도가 조곰 더 빠르대. 굉장히 많이 반복해야할 경우
		// 속도면에서 유리하다. 미친

		//if문은 똑같은 if문이 올 수 있는데, switch문에서 case 는 중복이 될 수 없다.!
		
		//콘솔창에서 입력을 받는방법!!
		//스캐너 Scanner 
/*		Scanner s = new Scanner(System.in); //패키지의 위치를 알려줘야해
		System.out.println("문자열을 입력해주세요>");
		//s.nextLine();//사용자에게 입력받은 문자열을 반환한다. 메서드.
		String input1 = s.nextLine();
		System.out.println("입력받은 문자열 : " + input1);

		System.out.println("숫자를 입력해주세요>");
		//s.nextInt(); //숫자만 입력받을 수 있는 메서드. 버그가 있으니 사용하지 말자.
		//Integer.parseInt(s.nextLine());//문자열을 인트타입으로 바꿔줌.
		int input2 = Integer.parseInt(s.nextLine());
		System.out.println("입력받은 숫자 : " + input2);
*/		

		/*
		//문자열을 입력받고 입력받은 문자열을 출력해주세요.
		Scanner s = new Scanner(System.in);
		System.out.println("문자열을 입력해주세요>");
		String input1 = s.nextLine();
		System.out.println("입력받은 문자열 : " + input1);
		
		System.out.println("숫자를 입력해주세요>");
		int input2 = Integer.parseInt(s.nextLine());
		System.out.println("입력받은 숫자 : " + input2);
		*/
/*		Scanner s = new Scanner(System.in);
		System.out.println("문자열을 입력해주세요>");
		s.nextLine();
*/		
		
		//조건문에대한 문제!
		//숫자를 입력받아 그 숫자가 0인지, 0이 아닌지 출력해주세요.
		/*Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요.>");
		int input1 = Integer.parseInt(s.nextLine());
		System.out.println("입력받은 숫자 : " + input1);
		if (input1 == 0){
			System.out.println("0이다.");
		} else {
			System.out.println("0이 아니다.");
		}
		*/
		
		//숫자를 입력받아 그 숫자가 홀수인지, 짝수인지 출력해 주세요.
		/*Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요.>");
		int input1 = Integer.parseInt(s.nextLine());
		System.out.println("입력받은 숫자 : " + input1);
		if (input1 % 2 == 0){
			System.out.println("짝수이다.");
		} else {
			System.out.println("홀수이다.");}*/
		
		
		//점수 3개를 입력받아, 총점, 평균, 등급을 출력해주세요.
		Scanner s = new Scanner(System.in);
		System.out.println("점수 1 입력 : ");
		int input1 = Integer.parseInt(s.nextLine());
		System.out.println("점수 2 입력 : ");
		int input2 = Integer.parseInt(s.nextLine());
		System.out.println("점수 3 입력 : ");
		int input3 = Integer.parseInt(s.nextLine());
		System.out.println("점수1 :" + input1 + "  /점수2 : " + input2 + "   /점수 3 : " + input3);
		System.out.println("합계 : " + (input1 + input2 + input3));
		System.out.println("평균 : " + ((input1 + input2 + input3)/3));
		int b = (input1 + input2 + input3)/3;
			
		if (90 <= b) {
			grade = "A";
			if (97 <= b) {
				grade += "+";
			} else if (b <= 93) {
				grade += "-";
			}
		} else if (80 <= b) {
			grade = "B";
			if (87 <= b) {
				grade += "+";
			} else if (83 >= b) {
				grade += "-";
			}
		} else if (70 <= b) {
			grade = "C";
			if (77 <= b) {
				grade += "+";
			} else if (73 >= b) {
				grade += "-";
			}
		} else if (60 <= b) {
			grade = "D";
			
			if (67 <= b) {
				grade += "+";
			} else if (63 >= b) {
				grade += "-";
			}
		} else {
			grade = "F";
			if (57 <= b) {
				grade += "+";
			} else if (53 >= b) {
				grade += "-";
			}
		}
		System.out.println(b + "점에 해당하는 등급은 " + grade + " 입니다.");	
		//한번에 바꾸심 ㅠㅠㅠㅜㅠㅜ어케해 :ctrl+f 하고 replace 한다.
		//과제 공유폴더 - 초급자바 - 연애심리테스트 - 프로그램으로 만들 수 있어. 입력, 출력 했으니까.
		//Y하면 다른문제, N 하면 다른문제. 이거 말고 입력하면?
		//결과.
		
		
		
		
		
		

		
		}

}
