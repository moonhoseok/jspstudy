package chap4;

import java.util.Scanner;

/*
  삼각형의 높이를 입력받아서 *로 삼각형 출력하기
  [결과]
  삼각형의 높이
  3
  1:
  *
  **
  ***
  2:
  ***
  **
  *

  3:    i   j        if(i <= j) => *,  else 공백
    *   3   3  
   **   2   2 3
  ***   1   1 2 3

  4:    i    j       if(i <= j) => *,  else 공백  
  ***   1    1 2 3 
   **   2    2 3 
    *   3    3

  5:      i     j
   *      0     2            2-0 ~ 2+0 : *
  ***     1     1 2 3        2-1 ~ 2+1 : *
 *****    2     0 1 2 3 4    2-2 ~ 2+2 : *
높이
 1: 바닥 * 1    1*2 -1
 2: 바닥 * 3    2*2 -1
 3: 바닥 * 5    3*2 -1
 4: 바닥 * 7    4*2 -1
  */
public class Exam6 {
	public static void main(String[] args) {
		System.out.println("삼각형의 높이");
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		System.out.println("1:");
		for(int i=1;i<=h;i++) {
			for(int j=1;j<=i;j++) {
			  System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("2:");
		for(int i=h;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("3:");
		for(int i=h;i>=1;i--) {
			for(int j=1;j<=h;j++) {
				if(i <= j) System.out.print("*");
				else if(i > j) System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("4:");
		for(int i=1;i<=h;i++) {
			for(int j=1;j<=h;j++) {
				if(i <= j) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("5:");
		int b = h*2-1; //바닥의 * 갯수
		int m = b/2;   //*중간 인덱스
		for(int i=0;i<h;i++) {
		   for(int j=0;j<b;j++) {
			   if(j >= m-i && j<= m+i) 
				   System.out.print("*");
			   else
				   System.out.print(" ");
		   }
		   System.out.println();
		}
	}
}
