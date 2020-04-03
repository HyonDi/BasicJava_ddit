package i_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
//
public class HashMapClass {

	public static void main(String[] args) {
		
/*		put()		: 지정된 키와 값을 저장
		get()		: 지정된 키의 값을 반환(없으면 null)
		remove()	: 지정된 키로 저장된 값을 제거
		keySet()	: 저장된 모든 키를 Set 으로 반환 (key를 모를때 사용)
*/
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("title", "제목입니다."); //"title" 이라는 키로 "제목입니다." 라는 값을 가진것. 키는 대체로 String 으로 사용합니다.!
		map.put("content", "내용입니다.");
		map.put("user", "김승섭");
		map.put("date", "2019-12-18 3:43");
		
		System.out.println(map.get("title"));
		System.out.println(map.get("content"));
		System.out.println(map.get("user"));
		System.out.println(map.get("date"));
		
		map.put("user", "홍길동"); //새로운 값이 덮어쓴다. 키 하나당 값 하나.
		System.out.println(map.get("user"));
		
		map.remove("user");
		System.out.println(map.get("user")); //홍길동이없어졌다.
		
		//map에 저장된 모든 내용 출력 
		Set<String> keys = map.keySet();//SET 은 인터페이스에요....
		for(String key : keys){
			String value = map.get(key);
			System.out.println(key + " : " + value);
		}
		
		//-------------------------------------------------------------
		System.out.println("---------------------------------------------------------");
		
		
		ArrayList<HashMap<String,Object>> arrl = new ArrayList<>();
		HashMap<String, Object> map1 = new HashMap<>();
		map1.put("LPROD_ID", "1");
		map1.put("LPROD_GU", "P101");
		map1.put("LPROD_NM", "컴퓨터제품");
		
		HashMap<String, Object> map2 = new HashMap<>();
		map2.put("LPROD_ID", "2");
		map2.put("LPROD_GU", "P102");
		map2.put("LPROD_NM", "전자제품");
		
		HashMap<String, Object> map3 = new HashMap<>();
		map3.put("LPROD_ID", "3");
		map3.put("LPROD_GU", "P201");
		map3.put("LPROD_NM", "여성캐주얼");
		
		HashMap<String, Object> map4 = new HashMap<>();
		map4.put("LPROD_ID", "4");
		map4.put("LPROD_GU", "P202");
		map4.put("LPROD_NM", "남성캐주얼");
		
		HashMap<String, Object> map5 = new HashMap<>();
		map5.put("LPROD_ID", "5");
		map5.put("LPROD_GU", "P301");
		map5.put("LPROD_NM", "피혁잡화");
		
		HashMap<String, Object> map6 = new HashMap<>();
		map6.put("LPROD_ID", "6");
		map6.put("LPROD_GU", "P302");
		map6.put("LPROD_NM", "화장품");
		
		HashMap<String, Object> map7 = new HashMap<>();
		map7.put("LPROD_ID", "7");
		map7.put("LPROD_GU", "P401");
		map7.put("LPROD_NM", "음반/CD");
		
		HashMap<String, Object> map8 = new HashMap<>();
		map8.put("LPROD_ID", "8");
		map8.put("LPROD_GU", "P402");
		map8.put("LPROD_NM", "도서");
		
		HashMap<String, Object> map9 = new HashMap<>();
		map9.put("LPROD_ID", "9");
		map9.put("LPROD_GU", "P403");
		map9.put("LPROD_NM", "문구류");
		
		
		arrl.add(map1);
		arrl.add(map2);
		arrl.add(map3);
		arrl.add(map4);
		arrl.add(map5);
		arrl.add(map6);
		arrl.add(map7);
		arrl.add(map8);
		arrl.add(map9);
		

		for(int i =0; i < arrl.size(); i++){
		System.out.println(arrl.get(i));
	}

		System.out.println("-------------------------------------------------------------------------");
		
		for(String key : arrl.get(0).keySet()){
			System.out.print(key + "\t");
		}
		System.out.println();
		for(int i =0 ;i < arrl.size(); i++){
			HashMap<String,Object> hashMap = arrl.get(i);
			Set<String> keyset = hashMap.keySet();
			for(String key : keyset){
				System.out.print(hashMap.get(key) + "\t\t");
			}
			System.out.println();
		}
		
//		keySet 을 어떻게 사용하는지 모르겠다.
		// 익숙해지게 많이 사용을 해봐야해요.
		
		/*프로젝트에 해쉬맵사용 별로안하고..vo클래스?? 에담을거임.
				어레이리스트를 많이 쓸거야~! 많이 연습해~!
		*/
		
		
	}

}
