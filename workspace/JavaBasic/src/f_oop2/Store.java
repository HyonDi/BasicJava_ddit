package f_oop2;

public class Store {

	public static void main(String[] args) {
		Customer c = new Customer();

		Product p = new Desktop();
		p.info();
		c.buy(p);
		
		Product o = new TV(); //Up casting
		o.info();
		c.buy(o);
		

		c.showItem();
		
//타입 = 안에..메서드..인가봄 타입..../././.;.;ㅔ.,;ㅣ,;ㅣ,;ㅣ타입이뭐야ㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜ

	}

}

//상품!
class Product{
	String name;
	int price;
	
	Product(String name, int price){
		this.name = name;
		this.price = price;
	}
	void info(){
		System.out.println("-----------------------------------------");
		System.out.println("상품명 :	" + name);
		System.out.println("금액 : 	" + price + " 원");
		System.out.println("-----------------------------------------");
	}
}


class Desktop extends Product{
	Desktop(){
		super("삼성 컴퓨터", 500000);//부모클래스(Product)의 생성자 호출
	}
}

class TV extends Product{
	TV(){
		super("LG TV", 1000000);
	}
}
	


	
	
class Customer{
	int money = 2000000000;
	Product[] item = new Product[10];//장바구니. product 를 상속받은 클래스들은 모두 저장가능하니까 product 로 타입을 지정햇따. 이 배열에는  객체 자체가 들어가는것. 뭔소리지
	
	
	
	void buy(Product p){
		if(money < p.price){
			System.out.println("돈이  부족하다.");//파라미터타입이 product야. 어느한쪽만 지정하면 다른 하나는 받을 수 없으니까. 그냥 string 으로하면 안되나보네 ㅜㅜㅜㅠㅜㅠㅜㅠㅜㅠㅠㅜㅠㅜ
			return;
		}
		money -= p.price;
		
		for (int i = 0; i < item.length; i+=1){
			if(item[i] == null){
				item[i] = p;
				break;
			}
		}
		System.out.println(p.name + "을 구매했다.");
	}
	
		void showItem(){
			System.out.println("-------------------장바구니--------------------");
			for(int i = 0 ; i < item.length; i++){
				if(item[i] != null){
					System.out.println(i + 1 + "." + item[i].name);
				}
			}
			System.out.println("----------------------------------------------------------");
		}
	}

