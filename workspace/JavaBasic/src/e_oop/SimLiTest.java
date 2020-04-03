package e_oop;

import java.util.Scanner;

public class SimLiTest {

	public static void main(String[] args) {
		//연애심리테스트를 다시 만들어 봅니다.
		//각메서드에서 질문을하고,유저한테 입력하게 해.
		//Y면 두번째메서드출력.N이 입력되면 4번째 메서드 출력.
		//각 메서드에서 해야할 일은 Y ,N 을 입력받고 해당 메서드만 호출.
		//마지막 결과 출력.
		//메인메서드에서는 
		
		new SimLiTest(). question1();
		
		// 퀘스쳔 1만 실행시킴!
		
	}//메인메서드
	
	
	
	
	Scanner s = new Scanner(System.in);
	
	void question1(){
		System.out.println("나는 금사빠다");
		String a = s.nextLine();
		if(a.equals("Y")){
			question2();
		} else {
			question4();
		}
	}
	
	
	void question2(){
		System.out.println("연애할 때 끌려다니는 타입이다.");
		String a = s.nextLine();
		if(a.equals("Y") ){
			question5();
		} else {
		question3();
		}
	}
	
	
	void question3(){
		System.out.println("데이트 코스는 미리 짜는게 편하다.");
		String a = s.nextLine();
		if(a.equals("Y")){
			question6();
		}else {
			question5();
		}
	}
	
	
	void question4(){
		System.out.println("감정기복이 크지 않다.");
		String a = s.nextLine();
		if(a.equals("Y")){
			question7();
		}else {
			question5();
		}
	}
	
	
	void question5(){
		System.out.println("감정 표현에 솔직한 편이다.");
		String a = s.nextLine();
		if(a.equals("Y")){
			question8();
		}else {
			question6();
		}
	}
	
	
	void question6(){
		System.out.println("활동적인 데이트가 좋다.");
		String a = s.nextLine();
		if(a.equals("Y")){
			question8();
		}else {
			question9();
		}
	}
	
	
	void question7(){
		System.out.println("연락이 없어도 믿고 기다리는 편이다.");
		String a = s.nextLine();
		if(a.equals("Y")){
			System.out.println("A타입 : 서로에 대한 신뢰감이 깊고, 존중해주는 어른스러운 연애를 하는 타입!" );
		}else {
			question8();
		}
	}
	
	
	void question8(){
		System.out.println("이성친구는 존재할 수 없다.");
		String a = s.nextLine();
		if(a.equals("Y")){
			question9();
		}else {
			System.out.println("B타입 : 구속을 하는것도, 받는 것도 싫은 자유로운 연애를 하는타입!");
		}
	}
	
	
	void question9(){
		System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
		String a = s.nextLine();
		if(a.equals("Y")){
			System.out.println("D타입 : 무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");
		}else {
			System.out.println("C타입 : 이것은 의리인가 사랑인가 ... 친구같이 편안한 연애를 하는 타입!");
		}
	}
	
	//-----------------선생님 답안---------------------------------------------------------
	
	/*
	
	위에 질문과 답 배열을 따로 만들었다.(메인메서드 밖에!) 
	question 의 인덱스와 result 의 인덱스번호만 바꿔주면 됨.
	아래 미완성함.
	
	Scanner s = new Scanner(System.in);
	
	void question1(){
		System.out.println(questions[0]);
		String answer = s.nextLine();
		if(answer.equls("Y")){
			qusetion2();
		}else if(answer.equals("N")){
				qusetion4()
		}
	}
	
	void question1(){
		System.out.println(questions[0]);
		String answer = s.nextLine();
		if(answer.equls("Y")){
			qusetion2();
		}else if(answer.equals("N")){
				qusetion4()
		}
	}
	
	void question1(){
		System.out.println(questions[0]);
		String answer = s.nextLine();
		if(answer.equls("Y")){
			qusetion2();
		}else if(answer.equals("N")){
				qusetion4()
		}
	}
	
	void question1(){
		System.out.println(questions[0]);
		String answer = s.nextLine();
		if(answer.equls("Y")){
			qusetion2();
		}else if(answer.equals("N")){
				qusetion4()
		}
	}
	
	void question1(){
		System.out.println(questions[0]);
		String answer = s.nextLine();
		if(answer.equls("Y")){
			qusetion2();
		}else if(answer.equals("N")){
				qusetion4()
		}
	}
	
	void question6(){
		System.out.println(questions[0]);
		String answer = s.nextLine();
		if(answer.equls("Y")){
			qusetion2();
		}else if(answer.equals("N")){
				qusetion4()
		}
	}
	
	void question7(){
		System.out.println(questions[0]);
		String answer = s.nextLine();
		if(answer.equls("Y")){
			qusetion2();
		}else if(answer.equals("N")){
				qusetion4()
		}
	}
	
	void question8(){
		System.out.println(questions[0]);
		String answer = s.nextLine();
		if(answer.equls("Y")){
			qusetion2();
		}else if(answer.equals("N")){
				qusetion4()
		}
	}
	
	void question9(){
		System.out.println(questions[0]);
		String answer = s.nextLine();
		if(answer.equls("Y")){
			qusetion2();
		}else if(answer.equals("N")){
				qusetion4()
		}
	}
	
*/
		//메서드 만들고 호출에 익숙해지도록 합시다.
	
	
	
	
	
	
	
}//클래스
