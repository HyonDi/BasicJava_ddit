package d_array;

import java.util.Arrays;


public class Score {

	public static void main(String[] args) {
		
		/*우리반 모두의 Java, Oracle, HTML, CSS, JQuery, JSP 점수를
		50~100까지 랜덤으로 생성시켜주시고,
		석차순으로 석차, 이름, 과목별 점수, 총점, 평균을 출력해주세요.
		
		순위  이름  Java  Oracle HTML CSS  JQuery  JSP  총점  평균
		1   홍길동   90    100    80    50   30     90   400  70
		*/
		
/*		int[][] scores = new int[19][6];		
		//이름
		String[] name = {"김지선", "이누리", "박종민", "정대석", "정재영", "강현철", "주향한", "윤창훈", "연은주", "김령환", "구한나",
						"백종빈", "이병훈", "강현지", "김경운", "이지형", "이예림", "이승재","민태홍"};	
		//랜덤 점수 넣기
		int[] sum = new int[scores.length]; 
		double[] avg = new double[scores.length]; 
		for (int i = 0 ; i < scores.length; i ++ ){
			for (int j = 0; j < scores[i].length; j ++){
					scores[i][j] = (int)(Math.random()*50 + 50) ;
			}
			 
		}

		//총점, 평균
		for (int i = 0 ; i < scores.length; i ++ ){
			for (int j = 0; j < scores[i].length; j ++){
					sum[i] += scores[i][j];
			}
				avg[i] = (double)sum[i] / scores[i].length;						
		}
			
	  
		//석차
		int[] rank = new int[sum.length];//점수가 들어있는 배열과 동일한 크기
			
		for(int i = 0; i < rank.length; i++){
				rank[i] = 1;
		}
		
		for (int i = 0; i <sum.length; i++){
			for(int j =0; j < sum.length; j++){
				if(sum[i] < sum[j]){
					rank[i]++;
				}
			}
		}
			
		System.out.println("순위           " + "이름     " + "Java  " + "Oracle  " + "HTML  " + "CSS  " + "JQuery  " + "JSP  " + "총점     " + "평균");
		
		//정렬할때는 통째로 바꾼다고 생각하고 하면 된대.
		//정렬	
		
	
		for ( int i = 0 ; i < rank.length - 1; i++) {
			for (int j = i + 1 ; j < rank.length; j ++){
				if(rank[i] > rank[j]){
					int temp1 = rank[i];
					rank[i] = rank[j];
					rank[j] = temp1;
					
					String temp2 = name[i];
					name[i] = name[j];
					name[j] = temp2;
					
					int[] a = scores[i];
					scores[i] = scores[j];
					scores[j] = a;
					
					int b = sum[i];
					sum[i] = sum[j];
					sum[j] =  b;
					
					double c = avg[i];
					avg[i] = avg[j];
					avg[j] = c;
					
				}																									
			}								
		}
		
		//출력		
		for (int i = 0; i< scores.length; i++){				
				
			System.out.print(rank[i]+ "\t" + name[i] + "\t");
				
			for(int j = 0; j < scores[i].length; j++){
				System.out.print(scores[i][j] + "    " );					
			}
			System.out.println(sum[i] + "\t" + Math.round((avg[i])*10)/10.0);			
		}
												
			
			
			
			
		
		
			
			
			
			
		*/	
			
			
			//정렬
			/*for (int i = 0 ; i < rank.length - 1; i++) {
				for (int j = i + 1 ; j < rank[i].length; j ++){
					if(rank[i] > rank[j]){
						int temp1 = rank[i];
						rank[i] = rank[j];
						rank[j] = temp1;
					}
					
				}
			}
	*/
			
		
		//-------------------선생님 답안
		
	String[] students = {"정대석", "박종민", "이누리", "김지선", "강현지"};
	String[] subjects = {"Java", "Oracle", "HTML", "JQUERY", "JSP"};
	double[][] scores1 = new double[students.length][subjects.length + 3];//왜 +3? 점수말고도 총점, 평균, 석차도 넣어야해서.
	
	//점수를 입력한다.
	
	for(int i = 0; i < scores1.length; i++){
		scores1[i][0] = 1; //0번인덱스에 석차. 1번인덱스부터 점수.
		for(int j = 0 ; j < subjects.length; j++){
			scores1[i][j+1] = (int)(Math.random() * 51) +50;
		}
	}
	
	//총점과 평균을 구한다.
	for(int i = 0; i < scores1.length; i++){
		for(int j = 0; j < subjects.length; j ++){
			scores1[i][scores1[i].length - 2]
					+= scores1[i][j+1]; //총점
		}
		scores1[i][scores1[i].length -1]
				= (int)(scores1[i][scores1[i].length - 2]
						/subjects.length * 100 + 0.5) 
						/100.0; //평균
	}
		
	//석차를 구한다.
	for(int i = 0; i < scores1.length; i++){
		for(int j = 0; j < scores1.length; j ++){
			if(scores1[i][scores1[i].length - 1] < scores1[j][scores1[j].length - 1]){
				scores1[i][0]++;
			}
		}
	}
	
	
		//정렬한다.
		for(int i = 0; i <scores1.length - 1; i++){
			for (int j = i + 1; j < scores1.length; j ++){
				if(scores1[i][0] > scores1[j][0]){
					double[] temp11 = scores1[i];
					scores1[i] = scores1[j];
					scores1[j] = temp11;
					
					String tempName = students[i];
					students[i] = students[j];
					students[j] = tempName;
				}
			}
		}
		
		
		//출력한다.
		System.out.print("석차\t이름");
		for (int i = 0; i < subjects.length; i ++){
			System.out.print("\t" + subjects[i]);
			
			
		}
		System.out.println("\t총점\t평균");
		
		for(int i = 0; i < scores1.length; i++){
			System.out.print((int)scores1[i][0] + "\t" + students[i]);
			for(int j = 1; j < scores1[i].length; j ++){
				System.out.print("\t" + scores1[i][j]);
			
			}
			System.out.println();
		}
		
		System.out.print("과목별 평균");
		for(int i = 1; i <= subjects.length; i ++){
			double sum = 0;
			for(int j = 0; j < scores1.length; j++){
				sum += scores1[j][i];
			}
			double avg = (int)(sum / scores1.length * 100 +0.5)
					/100.0;
			System.out.print("\t" + avg);
		}
		//어떻게 자바칸에맞춰서나오지........ 총점평균이랑 평균평균은??
		//ctrl + shift+ b  => 커서 둔 곳 브레이크포인트  // f6 : 한줄씩 실행함
		
		
		
		
		
		
		
		
		
			
		
	}

}
