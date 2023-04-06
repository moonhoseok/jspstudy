package chap11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Date  클래스 예제
 * SimpleDateFormat : 형식화 클래스. java.text 패키지의 클래스
 *     String format(Date) : Date 객체를 형식화된 문자열로 변경.
 *     Date parse(String)  : 형식화된 문자열로 이루어진 날짜 형태를 Date 객체 변경
 *  날짜 format에 사용되는 문자
 *  yyyy : 년도 4자리
 *  MM   : 월 2자리
 *  dd   : 일 2자리
 *  HH   : 시간 2자리
 *  mm   : 분 2자리
 *  ss   : 초 2자리
 *  E    : 요일 
 *  a    : 오전/오후  
 */
public class DateEx1 {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		SimpleDateFormat sf = new SimpleDateFormat
				("yyyy년MM월dd HH시mm분ss초 E a");
		System.out.println(sf.format(now));
		SimpleDateFormat sf2 = new SimpleDateFormat
				("yyyy-MM-dd HH:mm:ss");
		String dstr = "2023-12-25 10:00:00";
		Date day=null; //지역변수 초기화
		try {
			day = sf2.parse(dstr); //예외발생가능
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(day);
		//day 날짜를 "2023-12-25 월요일" 형식으로 출력하기
		SimpleDateFormat sf3 = new SimpleDateFormat("yyyy-MM-dd E요일");
		System.out.println(sf3.format(day));
		
	}
}
