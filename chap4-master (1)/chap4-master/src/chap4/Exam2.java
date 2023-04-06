package chap4;

import java.util.Scanner;

/*
 * 콘솔에서 한개의 문자를 입력받아 대문자,소문자,숫자,기타문자인지 출력하기
 * [결과]
 * 한개의 문자를 입력하세요
 * A
 * 대문자
 */
public class Exam2 {
	public static void main(String[] args) {
		System.out.println("한개의 문자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		//scan.next() : 문자열로 입력
		//charAt(0)  : 문자열에서 0번인덱스(첫번째) 문자 리턴
		char ch = scan.next().charAt(0);
		System.out.print(ch+":");
		if(ch>='A' && ch <= 'Z')
			System.out.println("대문자");
		else if (ch>='a' && ch <= 'z')
			System.out.println("소문자");
		else if (ch>='0' && ch <= '9')
			System.out.println("숫자");
		else 
			System.out.println("기타문자");
		//A 코드값 출력하기
		System.out.println("A="+(int)'A');
	}
}
