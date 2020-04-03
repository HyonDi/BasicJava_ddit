package h_useful;

public class StringSpeedTest {

	public static void main(String[] args) {
//		String str = "a";
		
	/*	long start = System.currentTimeMillis();
		for(int i = 0; i < 200000; i++){
			str += "a";
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start + "ms");
	*/
		
		StringBuffer sb = new StringBuffer("a");
		long start = System.currentTimeMillis();
		for (int i = 0; i < 200000; i++) {
			sb.append("a");
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start + "ms");	
	
//		문자열을 많이 변경해야하면 스트링버퍼를 사용하면 시간이 많이걸리지 않는다.
		
		
	}

}
