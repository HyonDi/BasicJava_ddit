package i_collection;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayListClass {

	public static void main(String[] args) {
		
/*
		add(값)		: 마지막 위치에 객체를 추가
		get(int)		: 지정된 위치의 객체를 반환
		set()		: 지정된 위치에 주어진 객체를 저장(수정)
		remove()	: 지정된 위치의 객체를 제거
		.size()		: 지정된 객체의 수 반환 = lnegth
*/
	 //<> 이거는 언제언제붙넌거야 왜붙느,ㄴ거야?
		// 화살괄호안에 오브젝트클래스가 정의되어있다. 
		//제네릭??이라는건데 어떤타입의 값을 저장할건지 지정해주는거다. 어레이리스트 안에는 오브젝트타입만 넣을 수 있다는 뜻.,
		//근데 object 타입이라는건 아무거나 저장 가는하다는 뜻이다.
	ArrayList<Object> list = new ArrayList<Object>();
		
	list.add(10);
	list.add("abc");
	list.add(true);
	list.add(new ArrayListClass());
	
	ArrayList<String> list2 = new ArrayList<>(); //오른쪽에는 String 안넣어??
	
	list2.add("abc");
	list2.add("123");
	list2.add("가나다");
	list2.set(1,  "456");
	
	for(int i = 0 ; i < list2.size(); i++){//size 메서드
		System.out.println(list2.get(i)); //get 메서드
	}
	
	//값을 제거해봅시다.
	list2.remove(0);
	//리스트에 저장된 값을 삭제하면 그 뒤으 모든 값의 인덱스가 당겨진다.	
	System.out.println(list2.get(0));
	System.out.println(list2.get(1));
	
	//1차원배열의 형태이다.
	//2차원배열처럼 사용하려면 어떻게 해야할까??
	//어레이리스트에 어레이리스트를 담으면 된다.
	
	ArrayList<ArrayList<Integer>> list3 = new ArrayList<>();
	//이어레이리스트에는 인티지를 저장할수있는 어레이리스트를 담아야한다.
	
	ArrayList<Integer> list4 = new ArrayList<>();
	list4.add(10);
	
	list3.add(list4); //값이 하나가 들어 갔다.
	
	list4 = new ArrayList<>();
	list4.add(10);
	
	list3.add(list4); //값이 두개가 들어 갔다.
	
	//정수를 저장할 수 있는 ArrayList를 생성해 값을 5번 넣어주세요.
	ArrayList<Integer> al = new ArrayList<Integer>();
	al.add(0);
	al.add(1);
	al.add(2);
	al.add(3);
	al.add(4);
	/*for(int i =1; i < 5; i++){
		al.add(i);
	}
	*/
	for(int i = 0; i < al.size(); i ++){
		System.out.println(al.get(i));
	}
	
	//위에서 만든 ArrayList에 담긴 값들의 합계와 평균을 출력해주세요.
	int sum = 0;
	double avg = 0;
	for(int i = 0; i < al.size(); i++){
		sum += al.get(i);		
	}
	 avg = sum / al.size();
	
	System.out.println("SUM : " + sum + " / " + "AVG : " + avg);
	
	//위에서 만든 ArrayList에 담긴 값들 중 최소값과 최대값을 출력해주세요
	int min = min = al.get(0);;
	int max = min = al.get(0);;
	
	
	for(int i = 0; i < al.size(); i ++){
		if(min > al.get(i)){
			min = al.get(i);			
		}
		if(max < al.get(i)){
			max = al.get(i);
		}
	}
		System.out.println("Min : " + min + " / " + "MAX : " + max);
		

		
		//위에서 만든 ArrayList의 값을 내림차순으로 정렬해주세요.
		for(int i = 0; i < al.size(); i ++){
			for(int j = i + 1; j < al.size(); j ++){
				if(al.get(i)< al.get(j)){
					int temp = al.get(i);
					al.set(i, al.get(j));
					al.set(j,temp);
				}
			}
		}
		System.out.println(al);
		

		
		
		
	}

}
