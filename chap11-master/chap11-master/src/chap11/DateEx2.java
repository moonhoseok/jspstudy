package chap11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 날짜 설정하기
 */
public class DateEx2 {
	public static void main(String[] args) {
		Date now = new Date();
		//1970년 이후부터 현재까지의 시간을 밀리초 리턴
		System.out.println(now.getTime());
		System.out.println(System.currentTimeMillis());
		//2023-03-01을 요일과 밀리초 출력하기
		//문자열값을 Date객체로 변경. SimpleDateFormat 클래스 이용
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		String sday = "2023-03-01";
		Date day = null;
		try {
			day = sf.parse(sday);
		} catch(ParseException e) {
			e.printStackTrace();
		}
		System.out.println(day);
		//요일 출력
		System.out.println(new SimpleDateFormat("E요일").format(day));
		System.out.println(day.getTime());
		//day 날짜에서 5일 이후의 날짜와 요일 출력하기
		day.setTime(day.getTime()+(1000*60*60*24*5));
		System.out.println
		(new SimpleDateFormat("yyyy-MM-dd E요일").format(day));
		
		
	}
}
