package e_oop;

public class RecursiveCall {

	public static void main(String[] args) {
		
		/*<<재귀호출>>
		-메서드 내에서 메서드 자신을 호출하는 것이다.
		-재귀 호출을 하는 메서드를 재귀 메서드라고 한다.
		-무한반복을 벗어나기 위한 조건이있어야 한다.
		*/

		/*벗어나는 조건이 반드시 포함되어 있어야해.
		재귀메서드를 한 번 만들어 보자.
		팩토리얼 : 4! == 4 * 3 * 2 * 1 == 24
		팩토리얼을 계산하는 메서드를 재귀메서드로 만들어 봅시다.
		*/
		
		int result = factorial(4);
		
		
	/*	| factorial(1)	| 1*
		| factorial(2)	| 2 * factorial(1) (*1)
		| factorial(3)	| 3 * factorial(2) (2*1)
		| factorial(4)	| 4 * factorial(3) (3*2*1)
		| main()		|
		*/
		
		
//		오련게 있구나 정도로만 알아두자.
		
		
		
	}

	private static int factorial(int i) {
		int result = 0;
		
		if( i == 1 ){
			result = 1;
		}else{
			result = i * factorial(i - 1);
		}
		
		return result;
	}

	
	
	
	
	
	
	
	
	
}

