package chap11;

import java.util.Calendar;
import java.util.Scanner;

/*
 * 년도와 월을 입력받아서 년월의 마지막 일자와 요일 출력하기
 * Calendar 객체 이용하기
 */
public class Exam7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("년도와 월을 입력하세요");
		int year = scan.nextInt();
		int mon = scan.nextInt();
		Calendar cal = Calendar.getInstance();
		cal.set(year, mon-1,1); //입력한 년월의 첫번째 날자로 설정
		 //입력한 년월의 마지막일자
		int lastday = cal.getActualMaximum(Calendar.DATE);
		cal.set(year, mon-1,lastday); //입력한 년월의 마지막 날자로 설정
		String week = " 일월화수목금토";
		System.out.println(year+"-"+mon + "-"+lastday + " " + 
		week.charAt(cal.get(Calendar.DAY_OF_WEEK)) + "요일");
		
		System.out.println(cal.get(Calendar.YEAR)+"-"
		    + (cal.get(Calendar.MONTH) + 1) + "-"
			+ cal.get(Calendar.DATE) + " "
		    + week.charAt(cal.get(Calendar.DAY_OF_WEEK)) + "요일");
	}
}