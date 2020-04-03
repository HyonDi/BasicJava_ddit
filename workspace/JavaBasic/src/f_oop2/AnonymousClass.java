package f_oop2;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymousClass {

	public static void main(String[] args) {
		//익명클래스.
		//하나의 부모 클래스나 인터페이스를 상속받아 클래스를 선언함과 동시에 객체를 생성하는 클래스. 이름이 없어
		//이름이 없다는것은 사용처가 정해져있는거야. 그 정해진 그 곳에서만 사용하는거.다른데서 부를 필요가 이유가 없으니 이름이 없음.
		
		Button b = new Button();
		
		b.addActionListener(new ActionListener(){
			//ActionListener 를 상속받은 자식 클래스
			//이 버튼에만 들어가는 거기때문에 이름이 필요없음. gui 그래픽 유저 인터페이스 만들때 주로 사용한다. 
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼을 누르면 실행");
				
			}
		});
		
		
		

	}

}
