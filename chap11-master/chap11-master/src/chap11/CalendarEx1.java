package chap11;

import java.util.Calendar;

/*
 * Calendar 클래스 예제
 *  추상클래스 : 객체화 불가. =>  new Calendar() 형식으로 객체화 불가
 *  static 메서드 : getInstance() 메서드를 통해 객체화.
 */
public class CalendarEx1 {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance(); //현재일시 리턴
		System.out.println(today);
		System.out.println("년도:"+today.get(Calendar.YEAR));
		System.out.println
		  ("월(0:1월,1:2월 ~ 11:12월):"+(today.get(Calendar.MONTH)+1));
		System.out.println
		    ("년도기준 몇째주:"+today.get(Calendar.WEEK_OF_YEAR));
		System.out.println
	    ("월기준 몇째주:"+today.get(Calendar.WEEK_OF_MONTH));
		System.out.println("일자:"+today.get(Calendar.DATE));
		System.out.println("월기준일자:"+today.get(Calendar.DAY_OF_MONTH));
		System.out.println("년기준일자:"+today.get(Calendar.DAY_OF_YEAR));
		System.out.println
		   ("요일(1:일~7:토):"+today.get(Calendar.DAY_OF_WEEK));
		System.out.println
		   ("월기준 몇째요일:"+today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println
		   ("오전(0),오후(1):"+today.get(Calendar.AM_PM));
		System.out.println
		   ("시간(0~11):"+today.get(Calendar.HOUR));
		System.out.println
		   ("시간(0~23):"+today.get(Calendar.HOUR_OF_DAY));
		System.out.println("분(0~59):"+today.get(Calendar.MINUTE));
		System.out.println("초(0~59):"+today.get(Calendar.SECOND));
		System.out.println("밀리초(0~999):"+today.get(Calendar.MILLISECOND));
//Calendar.ZONE_OFFSET: 시간대를 밀리초로 리턴.
		System.out.println("TimeZone(-12~12):"
		       +today.get(Calendar.ZONE_OFFSET)/(1000*60*60));
		System.out.println("이번달의 마지막일자:" +
		       today.getActualMaximum(Calendar.DATE));		
	}
}
