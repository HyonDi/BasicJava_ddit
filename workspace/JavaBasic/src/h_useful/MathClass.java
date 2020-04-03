package h_useful;

public class MathClass {

	public static void main(String[] args) {
/*		round()		: 반올림
		ceil()		: 올림. 세일cㅔ일
		floor()		: 내림
		abs()		: 절대값. absolute 의 줄임말.
		random()	: double 난수 발생(0.0 ~ 1.0 미만0.999999999999999999999999999999999999999999999까지.)
*/
		double d1 = 0.5;
		double d2 = -0.5;
		
		//반올림
		System.out.println(Math.round(d1));
		System.out.println(Math.round(d2));
		
		
		//올림
		System.out.println(Math.ceil(d1));
		System.out.println(Math.ceil(d2));
	
		//내림
		System.out.println(Math.floor(d1));
		System.out.println(Math.floor(d2));
	
		//절대값
		System.out.println(Math.abs(d1));
		System.out.println(Math.abs(d2));

		for(int i = 0; i < 30; i ++){
			int random = getRandom(5,10);
			System.out.print(random + " ");
		}
	}
	static int getRandom(int from, int to){ /*파라미터로 받은 두 수 사이의 랜덤수 발생.*/
		return (int)(Math.random() * (Math.abs(to - from) +1))
				+ Math.min(from, to);/*(둘줄 더 작은값 리턴하는 내용)*/
	}
	
	
	
	
	
	
	
}
