package d_array;

import java.util.Arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		// 다차원배열
		/*
		다차원 배열
		-배열안에 배열이 저장되어 있는 형태이다.
		
		*/
		
		//2차원 배열
		int[][] numbers = new int[2][3]; //배열의 크기지정. 3개의 크기를 가진 배열이 2개 있다. 총 6개의 값을 저장할 수 있음.
		int numbers2[][] = new int[][]{{1,2,3}, {4,5,6}};// 3개를 담을수 있는 크기가 2개있는것. 위의 것과 동일
		int[] number3[] = { {1,2,3}, {4,5,6}, {7,8,9} }; //이경우에는 선언과 초기화를 동시에 해줘야 한다.얘는 new int[3][3] 총 9개의 값을 저장할 수 있음.
		
		//선언하는 부분을 보면 대괄호의 위치가 전부 다르다. 
		//어느위치에 있던 상관없이 개수가 2개면 된다. 그럼 2차원배열임.
		//보통은 맨 위처럼 타입뒤에 2개를 모두 사용한다.
		
		//다차원 배열은 가변배열로 만들 수 있다.
		//가변배열 = 크기를 일부만 지정해주는 것.
		int[][] numbers4 = new int [3][]; //가변배열
		//1차원에 값을 3개 만들수있는 배열이 만들어진 것.
		//각각의 배열이 크기가 다를 수 있다는 것.
		numbers4[0] = new int [3]; //1차원배열에 접근해서 배열을 생성한 것. 배열안의 배열에.
		numbers4[1] = new int [4];
		numbers4[2] = new int [10];
		//이렇듯 크기를 다르게 지정할 수 있따.
//		numbers[0] = 10; //1차원에 값을 저장할 수 없다.
		
		numbers[0] = new int[5]; //1차원에 배열을 저장할 수 있다.
		
		numbers[0][0] = 10;
		numbers[0][1] = 20;
		numbers[1][0] =100; //2차원에 값을 저장할 수 있다.
		//대괄호가 두우개필요해. 인덱스를 두개!
		System.out.println(numbers.length);//1차원 배열의 길이
		System.out.println(numbers[0].length);//2차원 배열의 길이.
		//이게 만일 가변배열이라면? 지금은 0번인덱스의 길이를 구했지만 가변배열이면 인덱스마다 길이가 달라질 수도 있다.
		//그래서 2차원배열에있는 모든 값을 출력할 때
		for(int i = 0 ; i < numbers.length; i ++){
			for(int j = 0 ; j <numbers[i].length; j++){
				System.out.println(numbers[i][j]);
			}
		}
		
		//1차원 배열의 경우에는 System.out.println(Arrays.toString(numbers)); 이런식으로 해줫었찌만
		//2차원배열같은 경우에는 이렇게하면 값말고 주소가 출력된다.!!!
		for (int i = 0 ; i < numbers.length; i++){
			System.out.println(Arrays.toString(numbers[i])); //이렇게하면 가능하다. 1차원에 먼저 접근을 한 후에 사용하기.
		}
		//어쨋든 for문을 한번 돌려줘야한다.length() 는 문자열배열에서만 사용.(렝스뒤에 소괄호붙이는거.)
		
		int[][] scores = new int[3][5];//3개의 배열은 각각 크기 5이다.
		/*
		 * {{1,2,3,4,5},
		 * {1,2,3,4,5},
		 * {1,2,3,4,5}}
		 * 이런 모양으로 있을 것이다.
		 * scores[1][3] 이면 1번 인덱스의 3번 인덱스. 를 지정했다. 어떤값이 들어있을까? 두번째에 있는 4!
		 * 랜덤한 점수를 채워넣을거임. 총 15개. 한 줄이 1명인거야.(1차원에서 한 인덱스가 1명인거야. 총 3명)학생수 3명 과목수 5개.
		 * 
		 * */
		int[] sum = new int[scores.length]; //합계 구해라.
		double[] avg = new double[scores.length]; //평균을 구해라.
		//일단 랜덤한 값을 1~100 으로 넣어라.
			for (int i = 0 ; i < scores.length; i ++ ){
				for (int j = 0; j < scores[i].length; j ++){
					scores[i][j] = (int)(Math.random()*100) + 1;
				}
			 System.out.println("학생" + (i+1) + " : " + Arrays.toString(scores[i]));
		}
	  //총점과 평균을 구해라.
		/*	for (int i = 0 ; i < scores.length; i ++ ){
				for (int j = 0; j < scores[i].length; j ++){
					sum[i] += scores[i][j];
				}		
			}
			 System.out.println("총점 : " + Arrays.toString(sum));
		
			 
			for (int i = 0 ; i < scores.length; i ++ ){
				avg[i] = (double)sum[i]/scores[i].length;
			}
			 System.out.println("평균 : " + Arrays.toString(avg));
		*/	
			 	
			 
			 //합칠 수 있다.-선생님답안
				for (int i = 0 ; i < scores.length; i ++ ){
					for (int j = 0; j < scores[i].length; j ++){
						sum[i] += scores[i][j];
					}
					avg[i] = (double)sum[i] / scores[i].length;						
					System.out.println("총점 : " + sum[i] + " / " + "평균 : " + avg[i]);
				}
				
			 
			 
		
		
	}// main

}//class
