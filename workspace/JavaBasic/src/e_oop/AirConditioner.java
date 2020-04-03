package e_oop;

public class AirConditioner {

	/*가상의 에어컨!
	몇개의 버튼이 있어여. 리모콘이있거나. 리모콘에도 버튼이 있을거야.
	전원. 온도변경. 풍량조절. 의 속성을 변경하는 메서드를 반들거야.
	속성은 변수로 만들면 돼.
	전원을 담당할 변수는 켜고 끄고 2개. ON/ OFF boolean 타입이면 돼.
	*/
	boolean power; //전원
	int temperature; //온도
	int airVolume; //풍량
	
	AirConditioner(){ //변수를 초기화함!!에어컨 처음사서 딱 켠 상태. 생성자.
		power = false;
		temperature = 24;
		airVolume = 1;
	}

	
	
	
	//전원부터 만들자. 버튼을 누를때마다 켜졋다 꺼졌다가 반복된다.
	void power(){
		power = !power;
		
	}
	
	//온도버튼. 증가버튼, 감소버튼 2개가 있어.
	//증가버튼부터 만들자.
	void temperatureUp(){
		if(power && temperature < 30){
			temperature ++;
			
			}
		
	}
	
	//온도 감소버튼.
	void temperatureDown(){
		if(power && temperature > 18){
			temperature --;
			
			}
	}
	
	//풍량버튼.
	//1,2,3 갔다가 다시누르면 1.
	void airVolume(){
		if(power){
			if(3 < ++airVolume){
				airVolume = 1;
				}
		}//조건문보다 ++ 이먼저실행되서, 실행되고 비교 후 3보다 크면1로변경.
	}
	
	
	
	
	//그대로 실행하면 실행이 안될거야.아무론 제한도 없음. 전원꺼져있을때도 다 올라가고 바뀜.
	
	
	//온도가 18도~ 30도까지로 변경할 수 있게 해주시고,
	//전원을 켰을때만 버튼들이 작동되도록 메서드들을 변경해주세요.
	
	
	
	public static void main(String[] args) {
		
		AirConditioner ac = new AirConditioner();
		ac.power();
		System.out.println("전원 : "+ ac.power + "   온도 : " + ac.temperature +"   세기 :" + ac.airVolume);
		
		ac.temperatureUp();
		System.out.println("전원 : "+ ac.power + "   온도 : " + ac.temperature +"   세기 :" + ac.airVolume);
		
		ac.temperatureDown();
		System.out.println("전원 : "+ ac.power + "   온도 : " + ac.temperature +"   세기 :" + ac.airVolume);
		
		
		ac.airVolume();
		ac.airVolume();
		System.out.println("전원 : "+ ac.power + "   온도 : " + ac.temperature +"   세기 :" + ac.airVolume);
		
	}
	
	
	
	
	
	
}
