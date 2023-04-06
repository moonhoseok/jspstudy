package chap4;

import java.util.Scanner;

/*
 * 화면에서 자연수를 입력받아서 각 자리수의 합을 구하기
 * [결과]
 * 자연수 입력
 * 123
 * 6
 */
public class Exam5 {
	public static void main(String[] args) {
		System.out.println("자연수 입력");
		Scanner scan = new Scanner(System.in);
		int num =scan.nextInt(); //0
		int sum = 0;  //3+2+1
		while(num > 0) { //0 > 0
			//1%10 => 1
			sum += num%10;
			num /=10; //num = 1 / 10 = 0
		}
		System.out.println("자리수합:"+sum);
	}
}
