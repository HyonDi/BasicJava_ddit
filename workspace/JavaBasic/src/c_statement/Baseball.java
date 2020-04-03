package c_statement;

import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		//숫자 야구 게임을 만들어 주세요.
		//세자리의 랜덤 숫자를 생성해라. 세자리가 겹치지 않게.
		//1~9까지 겹치지 않는 숫자 3개.
		//사용자가 입력을해서 맞출때 까지 반복하도록.
		//입력하면 숫자와 정답을 비교해서 S, B, O 의 갯수 센다.
		//S 가 3개가 나오면 정답. 아니면 다시돌리기.
				

/*		int a = 0; int b = 0; int c = 0; int abc = 0;
		 
		a = (int)(Math.random() * 9+1);
		//System.out.println(a);
		
		while (true){				
		b = (int)(Math.random() * 9+1);
		if (a != b) {
			break;
		}		
		}
		//System.out.println(b);		
		while (true){				
			c = (int)(Math.random() * 9+1);
			if (a != c && b != c) {
				break;
			}			
			}
		//System.out.println(c);
		
		abc = a*100 + b*10 + c;
		//System.out.println(abc);		
		int a1 = a;
		int a2 = b;
		int a3 = c;
		//System.out.println(a1 + "/" + a2 + "/" + a3 );
//--------------------------------------------------------------------위 : 랜덤 숫자 뽑기. 								
		int input = 0; 
		
		Scanner s = new Scanner(System.in);
		do{
			int ball = 0;
			int strike = 0;
			
			System.out.println("숫자 3개 입력해라> ");
			input = Integer.parseInt(s.nextLine());
			
			int i1 = input / 100;
			int i2= input / 10 % 10;
			int i3 = input % 10; 
			//System.out.println(i1 + "/" + i2 + "/" + i3 );
			
			
			//if ( a1 == i1 && a2 == i2 && 13 == i3){
			if ( a1 == i1){
				strike++;
			}
			if(a2 == i2){
				strike++;
			}			
			if( a3 == i3) {
				strike++;	
			}
			
			if (a1 == i2 ||  a1 == i3){
				 ball++;
			}
			if(a2 == i1 || a2 == i3){
				ball++;
			}
			if(a3 == i1 || a3 == i2){
				ball++;
			}
			
			int out = 3 - (strike + ball);
			
			System.out.println(strike + "스트라이크  " + ball + "볼  " + out + "아웃");
			if (strike == 3){
				System.out.println("정답");
			}
			 
		}while(input != abc); //정답과 인풋이 다른 경우에만 돌린다.
		//비교하려면 입력을 받아야하니까 실행먼저 시켜야함.
*/
		
		
		
		
		//선생님답안
		//세개의 랜덤한 숫자.
		
		
		
		int a1, a2, a3;
		
		a1 = (int)(Math.random()*9)+1;
		
		do{
			a2 = (int)(Math.random()*9)+1;
		} while(a1==a2);
		
		do{
			a3 = (int)(Math.random()*9)+1;
		} while(a1==a3 || a2==a3);
		
		Scanner s = new Scanner(System.in);
		int count = 0; //정답을 맞추기 위해 몇번 시도했는지 숫자를 세기 위함.
		while(true){
			System.out.println("3자리 숫자를 입력해주세요. > ");
			int input = Integer.parseInt(s.nextLine());
			int i3 = input % 10;
			input /= 10;
			int i2 = input % 10;
			input /= 10;
			int i1 = input %10;
			//자리수별로 나눠담음.
			
			int strike = 0;
			int ball = 0;
			int out = 0;
			
			if(a1 == i1) strike ++;
			if(a2 == i2) strike ++;
			if(a3 == i3) strike ++;
			
			if(a1 == i2 || a1 == i3) ball ++;
			if(a2 == i1 || a2 == i3) ball ++;
			if(a3 == i1 || a3 == i2) ball ++;
			
			if(a1 != i1 && a1 != i2 && a1 != i3) out ++;
			if(a2 != i1 && a2 != i2 && a2 != i3) out ++;
		    if(a3 != i1 && a3 != i2 && a3 != i3) out ++;
		   	//out = 3 - strike - ball;

		   	System.out.println(++count + "차 시도 (" +  i1 + i2 + i3 + ") : "
		   			+ strike + "S  " + ball + "B  " + out + "O");
		   	System.out.println("--------------------------------------");
		   	if(strike ==3){
		   		System.out.println("정답입니다!");
		   		break;
		   	}
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
  }
	


