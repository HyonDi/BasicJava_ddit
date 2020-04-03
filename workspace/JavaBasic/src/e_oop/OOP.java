package e_oop;
//SampleClass, ClassMaker 랑 같이움직임
//main 메서드 있음
public class OOP {

	public static void main(String[] args) {
//oopoop
		/*<<OOP(Object Oriented Programming) : 객체지향 프로그래밍>>
		프로그래밍을 단순히 코드의 연속으로 보는 것이 아니라 객체간의 상호작용으로 보는것.
		코드의 재사용성이 높고 유지보수가 용이하다.
		
		<<객체 생성(인스턴스화)>
		클래스를 사용하기 위해 메모리(heap영역)에 올려놓은 것.
		new 클래스명 (); -> 객체가 저장된 메모리 주소 반환.
		객체 뒤에 참조연산자(.)를 붙여 객체의 변수와 메서드에 접근할 수 있다.
		객체는 생성될 때 마다 새로운 객체가 생성되고, 여러개의 객체가 동시에 존재할 수 있다.
		*/
		/*객체지향 프로그래밍
		메인메서드에 코드를 쭈욱 써왔지만. 객체지향은 메인메서드에 작성된 코드를 여러개로 나누겠다는 뜻임.
		나 혼자하던일을 여러사람이 나눠서 하겠다. 라는거랑 비슷할 수 있겠다.
		
		나 혼자할때랑 여럿이 할때랑 다른건 유기적으로 상호작용을 하면서 일을 해야해.
		코드끼리 상호작용하게 하는것이 객체지향이야.
		코드의 재사용성! 사용한걸 또사용하고 또사용하는거야. 유우우지이보오오수우우.
		분리분리.
		
		객체가 뭐야? 클래스가 메모리에 올라가면 객체가 되어요~!
		같은클래스로만들어졌지만 별개의 존재들이래. --???
		*/
		//SampleClass 에 있는 메서드들을 여기서 사용할거야.
		
		SampleClass sc = new SampleClass(); //샘플클래스도 하나의 메서드..........?클래스인뎅......
				
		sc.method1(); 
		
		sc.method2(5); //메서드2 는 인트타입파라미터가 필요해서 5를 넣었다.
		//5라는 값이 복사가되서 샘플클래스에있는 메ㅔ서드 2 의 매개변수에 들어가게 됨.
		
		String returnString = sc.method3();  //3번메서드는 스트링타입의 리턴타입이있어. 실행 후 스트링타입.
		System.out.println(returnString);
		
		int returnInt = sc.method4(7, 15);  //4번매서드는 인트타입의 파라미터가 두개있어.
											//그래서 인트타입의 리터럴을 넣어줬다.
		System.out.println(returnInt);
		
		//test1() 호출시 출력되는 문장에 번호를 붙여주세요.
		sc.test1();
		
		
		
		
		
		//ClassMaker 의 객체를 생성하고 변수에 저장해주세요.
		ClassMaker cm = new ClassMaker();
		
		//팁 : 객체생성하고 변수를 만들때  클래스의 대문자를 따서 변수이름으로 하는 경우가 많다.
		
		//객체가 저장된 변수를 통해 메서드들을 호출해주세요.
		//파라미터가 있는 메서드는 타입에 맞는 값을 넘겨주시고,
		//리턴타입이 있는 메서드는 리턴받은 값을 출력해주세요.
		
		cm.method1();
		
		String rs = cm.method2();
		System.out.println(rs);
		
		cm.method3(5);
		
		int method4 = cm.method4(7,8);
		System.out.println(method4);
		
		
		//클래스를 만들일은 별로 없음.
		//만들어져있는 메서드를 호출해서 사용하는걸 알아둬야해!
		//객체생성해서 뒤에점찍고 메서드만 호출하면 돼. 파라미터있으면 넣고 리턴타입있으면 받으면 된다.
		
		
		
		//Calculator 를 실행해보자.
		//다음을 한줄씩 계산해서 최종 결과값을 출력해 주세요.
		// + : add			- : subtract  		* : multiply 		% : remainder.
		//1. 123456+ 654321
		
		Calculator cal = new Calculator(); //객체 생성
		
		double o = cal.plus(123456, 654321);
		System.out.println(o);
		
		//2. 1번 결과값 * 123456
		o = cal.mul(o,123456);
		System.out.println(Math.round(o));
		//왜 그냥o만 쓴 값도 그냥 정수인데 정수로 표시를 못할까?//9.6021237312E10 이라고 나온다.
		//printf???
		
		//3. 2번 결과값 / 123456
		o = cal.divide(o,123456);
		System.out.println(o);
		
		//4. 3번 결과값 - 654321
		o = cal.minus(o, 654321);
		System.out.println(o);
		
		//5. 4번 결과값 %123456
		o = cal.rest(o,123456);
		System.out.println(o);
		
		
		//----------선생님 답안
	double result = cal.plus(123456,654321);
		result = cal.mul(result,123456);
		result = cal.divide(result, 123456);
		result = cal.minus(result, 654321);
		result = cal.rest(result,  123456);
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
