package c_statement;

import java.util.Scanner;

public class RepetitiveStatement {

	public static void main(String[] args) {
		/*          for / while
		 * <<for 문>>
		 * -for(int i = 1; i <= 10; 1++){  }
		 * -for(1부터 10까지 1씩 증가하면서 반복){  }
		 * 
		 */
		
		for(int i = 1; i <= 10; i++){
			//for(초기화; 조건식; 증감식){}
			//초기화 : 조건식과 증감식에 사용할 변수 초기화.
			//조건식 : 연산결과사 true이면 블럭안의 내용을 수행한다.
			//증감식 : 변수를 증가/감소시켜 반복을 제어한다.
			System.out.println(i + " 번 째 반복.");
			//초기화한 변수를 블럭안에서 사용할 수 있다.
			//포문 안에서만 사용할 수 있는 지역변수. 블럭안에 들어있는 변수를 지역변수라고 함.
			//만들어진 중괄호를 벗어나면 사라짐. 중괄호밖에선 사용 불가능.
			//포문 안에있는 i 도 마찬가지.
			//패턴이 있는 문장을 반복하기 위해서 사용한다.
		}
			
		//
		int sum = 0; //1부터 10까지의 함계를 저장할 것이다.
		sum += 1;
		sum += 2;
		sum += 3;
		sum += 4;
		sum += 5;
		sum += 6;
		sum += 7;
		sum += 8;
		sum += 9;
		sum += 10;
		System.out.println(sum);
		
		
		sum = 0;
		//반복문을 사용하면 규칙이 있는 반복되는 작업을 짧게 표현할 수 있다.
		for (int i = 1; i <= 100; i++){
			sum += i;
		}
		System.out.println(sum);
		
		//---------------------------------------------
		sum = 0;
		for (int i = 100; i >= 1; i--){
			sum += i;                      // 여기이상! 5050이 안나옴
			System.out.println(sum);
		}
		//--------------------------------------------------
		
		
		
		//1부터 100까지의 짝수의합을 구해보자.
		sum = 0;
		for (int i = 0; i<=100; i +=2){
			sum +=i;
		}
		  System.out.println(sum);
		
		sum = 0;
		for (int i =1; i<= 100; i ++){
			if(i%2 == 0){
				sum +=i;
			}
		}
		System.out.println(sum);
		
		//1~100까지의 홀수의 합울 구해라.
		
				sum = 0;
				for (int i = 1; i<=100;i++){
				if(i % 2 == 1){
				sum +=i;
					}
				}
				System.out.println(sum);
	
				
				sum = 0;
				for (int i =1; i<=100; i +=2){
					sum += 1;
				}
				System.out.println(sum);
				
				
				
				//구구단을 출력해보자.
				/*
				 * 2*1 = 2
				 * 2*2 = 4
				 * 2*3 = 6
				 * */
				
				for(int i= 1; i<9;i++){
					System.out.println("2 * " + i + " = " + i * 2);
				}
				
				
				//7단 출력
				for (int i = 1; i<= 9 ; i ++){
					System.out.println("7 * " + i + " = "+ i * 7);
				}
				
				
				//2~9단 한번에 출력
				for (int i = 2 ; i<=9 ; i++){
					for (int q = 1 ; q<=9; q++){
						System.out.println(i + "*" + q + " = " + i * q);
					}
				}
				
				
				//구구단 전체의 짝수단 홀수줄만 출력 1  or  if문써서.
				for (int i = 2 ; i<=9 ; i+=2){					
					for (int q = 1 ; q<=9; q+=2){					
						System.out.println(i + "*" + q + " = " + i * q);
					}
				}
								
				//구구단 전체를 가로로 출력해주세요.				
				for (int i = 1 ; i<=9 ; i++){
					for (int q = 2 ; q<=9; q++){
						System.out.print(q + " * " + i + " = " + i * q  + "\t"); //\t : 탭이래. 정갈하게나옴..
					}
					System.out.println();
				}
				
				//별찍기 사각형
				for(int i = 1; i <= 5; i++){
					for(int j = 1; j <= 10 ; j++){
						System.out.print("*");
					}
					System.out.println();
				}
				
				//별찍기 왼쪽아래 직각 삼각형
				for(int i = 1; i <= 10; i++){
					for(int j = 1; j <= i ; j++){
						System.out.print("*");
					}
					System.out.println();
				}
				
				//별찍기 왼쪽 위 직각 삼각형
				for(int i = 10; i >= 1; i--){
					for(int j = 1; j <= i ; j++){
						System.out.print("*");
					}
					System.out.println();
				}
				
				
				//별찍기 오른쪽 아래, 오른쪽 위
				//공백으로만든 삼각형 + 별로만든삼각형 하셨넹...ㅜㅜㅜㅜㅜㅜㅜ 
				
				//별찍기 왼쪽아래 직각 삼각형
				for(int i = 1; i <= 10; i++){
					for(int j = 1; j <= i ; j++){
						System.out.print("    ");
					}
					System.out.println();
				}
				
				/*
				<<while문>>
				-while(조건식) {  }
				-조건식의 결과가 true인 동안 계속해서 반복.
				-반복횟수를 알 수 없을때 사용한다. 내가 원할때까지. 
				*/
				/*
				Scanner s = new Scanner(System.in);
				
				while(true){
					System.out.println("몇단을 출력할까요?(0 : 종료)");
					int dan = Integer.parseInt(s.nextLine());
					
					if(dan == 0){
						System.out.println("종료되었습니다.");
						break;					
					}
										
					for(int i =1; i < 9; i ++){
						System.out.println(dan + " * " + i + " = " +  i * dan);										
					}			
				}
				*/
				/*
				 * << do-while 문 >>
				 * -do{  }while(조건식);
				 * -최소한 한번의 수행을 보장한다.
				 */
				/*
				//while은 조건이 맞는지 확인 후 돌리지만, do while은 한번 돌리고 조건이 맞는지 본다.
				//숫자맞추기 게임. 랜덤한 숫자맞추기 게임. 업다운이넹
				int answer = (int)(Math.random() * 100) +1;
				//1~100사이의 랜덤수를 발생시킨다.
				int input = 0;
				Scanner s = new Scanner(System.in);
				do{
					System.out.println("1~100 사이의 수를 입력해주세요>");
					input = Integer.parseInt(s.nextLine());
					
					if(answer < input){
						System.out.println(input + " 보다 작습니다.");
					}else if(input < answer){
						System.out.println(input + " 보다 큽니다.");
					}else{
						System.out.println("정답입니다!!");
					}
				}while(input != answer); //정답과 인풋이 다른 경우에만 돌린다.
				//비교하려면 입력을 받아야하니까 실행먼저 시켜야함.
				*/
			
				//이름붙은 반복문
				
				outer : for(int i = 2; i<=9; i ++){
					for(int j = 1; j <= 9; j++){
						if(j == 5){
							//		break; //가장 가까운 반복문 하나를 빠져나간다.
							//		break outer; //: outer 라는 이름의 반복문을 빠져나간다.
							//		continue;// : 가장 가까운 반복문의 현재 반복 회차를 빠져나간다.
							continue outer; //: outer라는 이름의 현재 반복회차를 빠져나간다.
						}
						System.out.println(i + " * " + j + " = " + i * j);
					}
					System.out.println();
				}
				
				
				
				
			
				
	}

}
