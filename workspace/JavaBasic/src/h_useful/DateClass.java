package h_useful;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		Date today = new Date(); //현재날짜가 기본적으로 세팅된다.
		System.out.println(today); //우리가 원하는 포맷으로 나오도록 바꿔보자.
		
		//날짜 - > 포멧 -> 문자열
		
		SimpleDateFormat sdf1 =	new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 =	new SimpleDateFormat("HH:mm:ss.sss");
		SimpleDateFormat sdf3 =	new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat sdf4 =	new SimpleDateFormat("yy-MM-dd hh:mm:ss a");
//		대문자 MM : 월. 
//		소문자 mm : 분
//		HH : 24시간 hh : 12시간. a 는 12시간 기준이기때문에 오전/오후 표시해ㅑ준다.
		
		System.out.println(sdf1.format(today));
		System.out.println(sdf2.format(today));
		System.out.println(sdf3.format(today));
		System.out.println(sdf4.format(today));
		
		//문자열 -> 포멧 -> 날짜
		String str = "2019년 12월 17일";
		SimpleDateFormat sdf5 = new SimpleDateFormat("yyyy년 MM월 dd일");
		try {
			Date dateStr = sdf5.parse(str);
			
			System.out.println(sdf1.format(dateStr));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		System.out.println("-----------------------------------------");
		
		Calendar cal = Calendar.getInstance();
		
		cal.setTime(new Date());
		cal.set(2019, 11, 17); //2019/12/17(월은0부터 시작해서 -1해줘야함.)
		System.out.println(sdf3.format(cal.getTime()));
		
		//날짜 계산
		cal.add(Calendar.YEAR,1);
		cal.add(Calendar.MONTH,2);
		cal.add(Calendar.DAY_OF_MONTH,-3);
		cal.add(Calendar.HOUR,2);
		cal.add(Calendar.MINUTE,5);
		cal.add(Calendar.SECOND,-10);
		
		System.out.println(sdf3.format(cal.getTime()));
		
		
		
		
	}

}







