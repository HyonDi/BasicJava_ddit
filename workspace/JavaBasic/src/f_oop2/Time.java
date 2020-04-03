package f_oop2;

public class Time {
	
	//시간 : 시, 분, 초
	
	private int hour;
	private int minute;
	private int second;
	//외부클래스에서 접근 불가능.
	//게터세터? get 으로 값을 받고, set 으로 값을 세팅( 파라미터를 넘김으로)
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		if(hour < 0){
			this.hour = 0;
		}else{
			this.hour = hour % 24;
		}
		
		
		
		/*if(hour >= 0 && hour < 24){
			this.hour = hour;
		}else if(hour >= 24){
			hour -= 24;
			this.hour = hour;
		}else if(hour < 0){
			this.hour = 0;
		}*/
	}
	
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		if(minute < 0){
			this.minute = 0;
		}else {
			setHour(this.hour + minute / 60);
			this.minute = minute % 60;
		}
		
		
		/*if(minute >=0 && minute <60){
			this.minute = minute;
		} else if(minute >= 60 ){
			hour += minute /60;
			minute += minute % 60;
		} else if(minute > 100000){
			minute = 0;
		} 
	*/	
		
	}
	
	
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		if(second < 0){
			this.second = 0;
		}else {
			setMinute(this.minute + second / 60);
			this.second = second % 60;
		}
		
		
		
		/*if(second >=0 && second <60){
			this.second = second;
		} else if(second >= 60){
			minute += second /60;
			second += second % 60;
		} else if(second > 100000){
			second = 0;
		}*/
		
		
		
	/*	this.minute = this.minute + second / 60 ;
	 * 이거는 생성자를 거치지않아서 초기화 하는 메서드를..거치지않아서....,,그 60넘으면 올라가고그런걸 못함!!
		
		setMinute(this.minute + second / 60);
		--> 둘 차이??*/
		
		
		
		
		
	}
	//60 의 배수마다 초 0으로 초기화하고, 61이면  60만 빼야해. 125면 한번 60빼고 또 60빼고 5가남아야해.
	
	
	
	
	
	
	//Object 클래스로부터 상속받은 메서드
	@Override
	public String toString(){
		return hour + ":" + minute + ":" + second;
	}
}
