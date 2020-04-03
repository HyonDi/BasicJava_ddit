import java.util.ArrayList;
import java.util.List;


public class Hello {

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(15);
		intList.add(20);
		intList.add(25);
		intList.add(30);
		intList.add(35);
		intList.add(40);
		
		//리스트에 담긴 값의 간격의 평균
		int sum = 0;
		int avg = 0;
		
		for(int i = 0; i < intList.size()-1; i++){
			sum += intList.get(i+1) - intList.get(i);
		}
		
		avg = sum / (intList.size()-1);
		System.out.println(avg);
		
		//커서사용 :  아래..
		sum = 0;
		int prevI = 0;
		for(int i : intList){
			if(prevI ==0)
				sum = sum + intList.get(i+1) - intList.get(i);
		}
		
	}
}
