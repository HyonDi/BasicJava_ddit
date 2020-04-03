package Z_exam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Score_ArrayList {

	public static void main(String[] args) {
	
		//선생님 답
		ArrayList<String> subjects = new ArrayList<>();
		subjects.add("Java");
		subjects.add("Oracle");
		subjects.add("HTML");
		subjects.add("CSS");
		subjects.add("JQUERY");
		subjects.add("JSP");
		
		ArrayList<Integer> rank = new ArrayList<>();
		
		ArrayList<String> students  = new ArrayList<>();
		students.add("김지선");
		students.add("이누리");
		students.add("정대석");
		students.add("박종민");
		students.add("정재영");
		students.add("강현철");
		students.add("주향한");
		students.add("윤창훈");
		students.add("연은주");
		students.add("김령환");
		students.add("구한나");
		students.add("백종빈");
		students.add("이병훈");
		students.add("강현지");
		students.add("김경운");
		students.add("이지형");
		students.add("이예림");
		students.add("이승재");
		students.add("민태홍");
		students.add("정보람");
		students.add("박진영");
		
		ArrayList<ArrayList<Double>> list = new ArrayList<>(); //여기에 등수하고 점수 넣을거야.
		
		for(int i = 0; i <students.size(); i++){
			ArrayList<Double> score = new ArrayList<>();
			
			score.add(1.0); //석차
			
			for(int j = 0; j < subjects.size(); j++){
				score.add(((double)getRandom(50,100)));
			}
			list.add(score);
		}
		
		
		//총점과 평균을 구한다.
		for(int i =0; i < list.size(); i++){
			ArrayList<Double> score = list.get(i);
			int sum = 0;
			for(int j = 1; j < score.size(); j ++){
				sum += score.get(j);
			}
			score.add((double)sum);//총점
			score.add((double)sum / subjects.size() );//평균
		}
		
		
		//순위를 구한다
		for(int i = 0; i <list.size(); i++){
			for(int j = 0; j < list.size(); j++){
				if(list.get(i).get(subjects.size() +1) < list.get(j).get(subjects.size() + 1)){
					list.get(i).set(0, list.get(i).get(0) + 1);
				}
			}
		}
		
		//순위대로 정렬한다.
		for(int i = 0; i < list.size() - 1; i ++){
			boolean changed = false;
			
			for(int j = 0; j < list.size()-1-i; j++){
				if(list.get(j).get(0) > list.get( j+ 1).get(0)){
					ArrayList<Double> temp = list.get(j);
					list.set(j,list.get(j + 1));
					list.set(j + 1,temp);
					
					String tempName = students.get(j);
					students.set(j, students.get(j+1));
					students.set(j + 1, tempName);
					
					changed = true;
					
				}
			}
			if(!changed) break;
		}
	
		//출력한다
		System.out.print("석차\t이름");
		for(int i = 0; i < subjects.size(); i ++){
			System.out.print("\t" + subjects.get(i));
		}
		System.out.println("\t총점\t평균");
		for(int i = 0; i < list.size(); i ++){
			ArrayList<Double> score = list.get(i);
			for(int j = 0; j < score.size(); j ++){
				System.out.print((int)((double)score.get(j))+"\t");
				if( j ==0){
					System.out.print(students.get(i) + " \t");
				}
			}
			System.out.println();
		}
		
		
		}
	
	static int getRandom(int from, int to){
		return (int)(Math.random() * (Math.abs(to - from) + 1))
				+ Math.min(from, to);
	}

		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		//-------------------------------------------------------------------------------------------


}
		
		


