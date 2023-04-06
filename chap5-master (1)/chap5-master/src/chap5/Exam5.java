package chap5;

import java.util.Scanner;

/*
다음의 결과가 나오도록 프로그램을 작성하시오. 2차원 배열을 이용하여 구현하기

[결과]
삼각형의 높이를 입력하세요
5

15 14 13 12 11 
10  9  8  7 
 6  5  4 
 3  2 
 1
*/
public class Exam5 {
	public static void main(String[] args) {
		System.out.println("삼각형의 높이를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt(); //삼각형의 높이. 배열의 행의 수.
		int data= 0; //첫번째 숫자값 지정
		for(int i=1;i<=len;i++) {
			data += i;
		}
		//가변 배열로 배열 설정
		int[][] matrix = new int[len][];
		//1차원 배열 객체 생성
		for(int i=0;i<matrix.length;i++) {
			matrix[i] = new int[len-i];
		}
		//배열에 값을 설정하기 
		for(int i=0;i<len;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				matrix[i][j] = data--;
			}
		}
		//배열의 값 출력하기
		for(int i=0;i<len;i++) {
			for(int j=0;j<matrix[i].length;j++) {
			    System.out.printf("%3d",matrix[i][j]);
			}
			System.out.println();
		}	
	}
}
