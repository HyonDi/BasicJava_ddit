package f_oop2.ex_abstract.ex_interface;

public class Starcraft {
	
	public static void main(String[] args) {
	
		
		SCV scv = new SCV();
		
		Tank tank = new Tank();
		Marine marine = new Marine();
		
		scv.repair(tank);
//		scv.repair(marine); //reparable 을 상속받지않아서 repair 불가능.
		
		Repairable r = new Tank(); //타입은 리페어러블인데 r은 탱크클래스로 만든 객체.
		scv.repair(r);
		
	}
	
}

/*<<스타크래프트>>
테란 : 
	scv -일꾼. 하는일: 기계유닛 수리. 기계아니면 수리못함. 
*/

//공통속성묶을 부모클래스
class Unit{
	int hp; //체력
	final int MAX_HP; //최대체력
	
	Unit(int hp){
		MAX_HP = hp;
		this.hp = MAX_HP;
	}
}

class Marine extends Unit {
	Marine(){
		super(40);
	}
}

class Tank extends Unit implements Repairable{
	Tank(){
		super(150);
	}
}

class Dropship extends Unit implements Repairable{
	Dropship(){
		super(125);
	}
}

class SCV extends Unit implements Repairable{
	SCV(){
		super(60);
	}
	
	
	void repair(Repairable r){
		//파라미터로 수리해줄 유닛을 받을거야.기계 : SCV, dropship, tank. marin은 사람이야. 수리불가.
		//Repairable 인터페이스를 상속받은애들(기계로되어있는애들)만 파라미터로 넘길수 있게됨.
		//그러나 repairable 에는 멤버가 없기때문에 아무것도 할 수없다.
		//hp를 멤버로 가진 부모클래스 Unit으로 형변환을 해줘야 한다.
		//관계없는것들을 관계있는거로 만들때에 인터페이스를 사용한다.
		if(r instanceof Unit){//r을 Unit 으로 형변환이 가능한지 확인.instanceof를 이용한 연산결과로 true를 얻었다는 것은 참조변수가 검사한 타입으로 형변환이 가능하다는 것을 뜻합니다.
								//근데 모든게 UNIT 으로 형변환이가능하잖아. -> 우리유닛이어야 치료되게하기위함임. true 로바꾸면 다른팀유닛도 치료해줌. 

			Unit u = (Unit)r;
			
			while(u.hp < u.MAX_HP){
				u.hp++;
			}
		}
	}
}

interface Repairable{
	
}

//인터페이스는 데이터의 한 종류. 클래스도 데이터의 한 종류. 자료형?? 자료형???자료형??