package test;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
  1부터 100까지 중 임의의 숫자를 컴퓨터가 저장하고, 
  값을 입력받아 저장된 값을 맞추는 프로그램을 작성하기
  -1 부터 100까지의 숫자가 아닌 경우 : 1 과 100사이의 숫자만 입력하세요 메세지출력 
  - 숫자가 입력이 안된 경우 :  숫자만 입력하세요  메세지 출력
  계속 입력을 받는다.
  몇번의 입력만에 숫자를 맞추었는지 출력하기.
  단 입력 오류된 입력도 입력 건수에 포함된다.
  
  1. 임의의 수를 저장
  2. 반복문으로 데이터 입력 받기.
     정답과 비교
  3. 입력횟수 증가         
*/
public class Test1_A {
	public static void main(String[] args) {
		//1~100 사이의 임의의 수
		int answer = (int)(Math.random() * 100) + 1;
		int cnt = 0; //입력한 횟수 저장
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("1부터 100까지의 숫자를 입력하세요");
			int num = 0;
			try {
			 num = scan.nextInt();
			 cnt++;
			 if(num < 1 || num > 100) 
				 throw new Exception  //예외 발생
				       ("1부터 100까지의 숫자만 입력하세요");
			} catch(InputMismatchException e) {
				String d = scan.next();
				cnt++;
				System.out.println(d + "는 숫자가 아닙니다.");
				continue;
			} catch(Exception e) {
				System.out.println(e.getMessage());
				continue;
			}
			//1 ~ 100사이의 문자가 입력된 경우만 실행
			if(num == answer) break;
			else if(num > answer) 
				System.out.println("작은수를 입력하세요");
			else 
				System.out.println("큰수를 입력하세요");
		}
		System.out.println("정답입니다. 입력 횟수:" + cnt);		
	}
}
