package d_array;

import java.util.Arrays;

public class sort {

	public static void main(String[] args) {
		//계속 복습하고 만들기해야 익숙해집니다. 열심히하쟈~!
		
		
		//array 에서 섞은 변수들 다시 정렬하기 하자.
		
/*
		<<정렬>>
		
		- 선택정렬 : 첫번째 숫자부터 그 뒤의 모든 숫자들과 비교해서 
					작은수와 자리바꾸기를 반복해 앞에서부터 작은 수를 채워나가는 방식.
					
		- 버블정렬 : 첫번째 숫자부터 바로 뒷 숫자와 비교해서 작은 수와 자리바꾸기를 반복해
					뒤에서부터 큰 수를 채워나가는 방식
					
		- 삽입정렬 : 두번째 숫자부터 그 앞의 모든 숫자들과 비교해서 큰 수들을 뒤로 밀고
					중간에 삽입하는 방식
		- 석차구하기 : 모든 점수가 1등으로 시작해서 다른 점수들과 비교해 자신의 점수가 작으면
					등수를 1씩 증가시키는 방식.
*/
		//랜덤숫자담긴 배열을 만들자
		
		int[] numbers = new int[10];
		
		for(int i = 0; i <numbers.length; i++){
			numbers[i] = i + 1;
		}
		
		//ctrl + 1  :  에러해결방법 제시해준다.
		//shuffle 이라는 이름의 메서드를 만들었다. 메인메서드 아래에 있음.
		//셔플메서드 전부 실행하면 다시 메인메서드의 멈췃던부분으로가서 실행.
		
		shuffle(numbers); //아래 셔플메서드를 실행한거니까 여기 섞인거임.
	//	System.out.println("섞음 : " + Arrays.toString(numbers));
		//이제 그걸 정렬해보자.
		//1. 선택정렬 : 맨앞에서부터 자신보다 작은숫자를만나면 자리를 바꾼다.
	//	selectSort(numbers); //선택정렬.
		
		//2. 버블정렬은 한바퀴 돌면, 10(가장 큰 숫자)가 맨 뒤로 가게됨.
		//그래서 한바퀴 돌았으면 가장큰숫자-1까지만 비교하면 됨.
	//	bubleSort(numbers); //버블정렬.
		
		//3. 삽입정렬 : 두번째부터 시작. 앞 숫자랑 비교. 두번째 숫자를 임시로 밖에 뺴놓고 비교.
		//빼논값이랑 앞에거를 비교. 앞이 더 크면 앞숫자를 뒤로 한칸 움직임.아니면 패스(numbers[i]  를 ++시켜주면 되겠네)
		//인덱스2번이랑 1번비교. 앞이 더 크면 뒤로한칸 밀고 빼놓은 비교상대(인덱스2번을 앞에있는 모두와 비교해야함)
		//두번째부터 임시로 숫자를 비교. 큰경우에 는 뒤로밀고, 작은경우에는 작은숫자 바로뒤로 채워넣음.
	//	insertSort(numbers); //삽입정렬.
		
		//4. 석차구하기. 
		printRank(numbers); //석차구하기
		
		
		System.out.println(Arrays.toString(numbers));
	}
	
	
	private static void printRank(int[] numbers) {
		
		int[] r = new int[10];
	/*	for (int i = 0; i < r.length ; i ++){
			r[i] = 1;
		}
		System.out.println(Arrays.toString(r));*/
	//------------------------------------------------------	
		
		for(int i = 0; i < numbers.length; i++){
			r[i]++;
			for(int j = 0; j < numbers.length; j++){
				if(numbers[i] < numbers[j]){
					r[i] += 1;
				}
			}
		}
	//-------------선생님 답안
		int[] rank = new int[numbers.length];//점수가 들어있는 배열과 동일한 크기
		
		for(int i = 0; i < rank.length; i++){
			rank[i] = 1;
		}
		for (int i = 0; i <numbers.length; i++){
			for(int j =0; j < numbers.length; j++){
				if(numbers[i] < numbers[j]){
					rank[i]++;
				}
			}
		}
		for (int i = 0; i <numbers.length; i++){
			System.out.print(numbers[i] + " : " + rank[i] + "등,  ");
		}
		System.out.println();
		
		System.out.println("석차구하기 : " + Arrays.toString(r));
		
	}
		
		
		
		
		
		
	


	private static void insertSort(int[] numbers) {

/*		for ( i =1; i > numbers.length; i ++){
			int qq = numbers[i];//포문..에넣어야할듯
			if ( numbers[i] < numbers[i-1]){
				numbers[i] = numbers[i-1];
			
			}
		}
*///시도1		
		
		
		for ( int i = 1; i < numbers.length; i ++){
			int temp = numbers[i];
			int j =0;
			for ( j = i-1 ; j >= 0; j--){
				
				if(temp < numbers[j]){
					numbers[j+1] = numbers[j];
				}else{ break;}
			} 
			numbers[j + 1] = temp;
		}	
		System.out.println("삽입정렬 : " + Arrays.toString(numbers));
	
		//부분에 틀린부분을 적었음! 읽어보렴
		
	/*	for(int i = 1; i < numbers.length; i++){
			int temp = numbers[i];
			int j = 0;
			for(j = i - 1; j >= 0; j --){
				if(temp < numbers[j]){
					numbers[j+1] = numbers[j];
				}else{
					break;
				}
			}
			numbers[j + 1] = temp;
		}	
		System.out.println("삽입정렬 : " + Arrays.toString(numbers));
	*/
	
	}
	
	
	
	
	
	
	
	
	
	

	private static void bubleSort(int[] numbers) {
	/*	for (int q = numbers.length; 0 < q ; q--){			
			for (int i = 0; i < numbers.length; i ++){
				for (int j = i+1; j < i+2; j ++){
					if(numbers[i] > numbers[j]){
						int temp = numbers[i];
						numbers[i] = numbers[j];
						numbers[j] = temp;
					}
				}			
			}
		}System.out.println("버블정렬 : " + Arrays.toString(numbers));
	*///시도 1
	
	/*for(int j = numbers.length; j > 0 ; j --){
		for(int i = 0; i < numbers.length; i ++){	
			if(numbers[i] > numbers[i+1]){
				int temp = numbers[i];
				numbers[i] = numbers[i+1];
				numbers[i+1] = temp;
			}
		}
	}
	System.out.println("버블정렬 : " + Arrays.toString(numbers));*///시도2
		////답 : 
		for(int i = 0; i < numbers.length - 1/*맨 마지막거를 비교안하니까.*/; i++){
			boolean changed = false;//중간에 바뀌었는지, 안바뀌었는지를 알기 위함. 중간에 체크하고싶을때 불린타입 사용함.
			for(int j = 0; j < numbers.length - i - 1/*i 가 한바퀴돌때마다 1씩 증가.
			증가하는 i 를 빼주면 비교... -1 은 j가 8까지만 움직이기때문(맨처음바퀴에서를 예로 들음.)*/; j ++){
				if(numbers[j] > numbers[j + 1]){
					int temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
					changed = true;
				}
			}
			if(!changed){
				break;
			}
		}
		System.out.println("버블정렬 : " + Arrays.toString(numbers));
	
	
	
	
	
	
	
	
	
	
	
	
	}
	

	
	
	
	
	
	
	
	
	
	
	private static void selectSort(int[] numbers) {
/*
 		int temp = 0;
		for(int i = 0 ; i < numbers.length; i++){
			for(int j = 0; j <numbers.length; j++){
				//왜 j의 범위를 i 로 바꿔도 되는거지??똑같이 넘버스 길이어야하는거아닌가?
				if(numbers[i] < numbers[j]){
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
			
		}
		System.out.println("선택정렬 : " + Arrays.toString(numbers));
		//이거는 선택정렬이 아니라셔ㅠㅠㅠ
*/
	//-------------------------------------------------------------	
		//인덱스0은 인덱스1부터 비교를 한다. 그리고 인덱스1은 인덱스2부터 비교를 한다. 비교하는숫자가 점점 줄어드는것. 
		//맨마지막은 비교안해도됨. 
		for (int i = 0 ; i < numbers.length - 1/*맨마지막은 안돌아도 되니까*/; i++) {
			for (int j = i + 1 /*i의 다음인덱스부터 비교하니까.*/; j < numbers.length; j ++){
				if(numbers[i] > numbers[j]){
					int temp1 = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp1;
				}
			}
		}
		
		System.out.println("선택정렬 : " + Arrays.toString(numbers));
		
					
	}


	private static void shuffle(int[] numbers) {
		for(int i = 0; i < numbers.length *10; i++){
			int random = (int)(Math.random()*numbers.length);
			
			int temp = numbers[0];
			numbers[0] = numbers[random];
			numbers[random] = temp;
		//이게..섞는..그거임...	
		
		}
		
	}

}
//String : 클래스야. 문자열을 편리하게 사용하기위한 메서드들이 담겨있을거임.
//문자를 저장할수있는 배열 변수가 있음. 캐릭터형 배열이 변수로 선언되어있다.
//문자여러개를 저장할수 있고, 이걸 문자여러개로 문자열로 표현해주는거임.
//
