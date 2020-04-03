package e_oop;

import java.util.Scanner;

public class TV {

	
	Scanner s = new Scanner(System.in);
	
	boolean power; //전원
	int channel; //채널 플러스, 마이너스 뿐아니라 숫자눌러서도 할 수 있음.
	int volume; //볼륨
	
	
	TV(){
		power = false;
		channel = 1;
		volume = 5;
	}
	
	
	void power(){
		power = !power;
		System.out.println(power ? "TV 켜짐" : "TV 꺼짐");
		
	}
	
	void channelUp(){
		if(power && channel < 300){
		channel++;
		
		}
	}
	
	void channelDown(){
		if(power && channel > 0){
		channel--;
		}
	}
	
	
	void channelInput(){
		if(power){
		System.out.println("채널 번호 입력 : ");
		int num = Integer.parseInt(s.nextLine());
		
		if(0 < num && num < 300){
		channel = num;
		}
		}
	}
	
	void volumeUp(){
		if(power && volume < 10){
		volume ++;
		}
	}
	
	void volumeDown(){
		if(power && volume >= 0){
		volume --;
		}
	}
	
	
	/*void showVolume(int volume){
		System.out.println("음량. ");
		for(int i = 1; i <= 10; i ++){
			if(i <= volume){
				System.out.println("■");
			}else{
				System.out.println("□");
			}
		}
		System.out.println();
	}
	
	*/
	
	
	
	
	
	
	public static void main(String[] args) {
		
		TV tv = new TV();
	
		tv.power();
		System.out.println("전원 : "+ tv.power + "  채널" + tv.channel + "  음량" + tv.volume);
		
		
		tv.volumeUp();
		System.out.println("전원 : "+ tv.power + "  채널" + tv.channel + "  음량" + tv.volume);
		
		
		
		
		
	}
	
	
	// 드라이브에 TV 이름으로 선생님 답안 넣음!
	//과제제출폴더>클래스만들기폴더>에 월요일까지 만들어오세요.
	//각자 발표를 할거에요. 시연을 할것입니다.
	//들어가야하는 내용: 
	//발표에서)
	//프로그램 주제, 기능, 메서드 구성, 시연.
	
	
	
	
	
	
	
	
	
	
	//뭐..제습기.. 에어프라이어.. 밥솥..스피커..핸드폰
	//미니게임. 술게임.. 그 핸드폰어플같이 있는거처럼..
	//농장키우기게임. 엄청잘만들었다고함.
	//농장을 키우는데 씨앗심고 물주고, 시간기다리면 추수하고..
	//자동차부수기..
	//그 동물농장..미니게임..
	
	
	
	
	//클래스를 하나 혹은 두개 몇개든 상관없음.
	//어떠한 주제를 가지고 프로그램을 만들어 주세요.
	//주제, 대상을 가지고 프로그램을 만들어 주세요.
	//콘솔을 사용해서 입력하고 출력도 되는, 사용자가 사용할 수 있는 프로그램으로 만들어 주세요.
	//클래스파일 하나만 올리면 된다.
	//제한 없음. 마음대로 만들어오세요. 주제 자유.
	
	//
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
