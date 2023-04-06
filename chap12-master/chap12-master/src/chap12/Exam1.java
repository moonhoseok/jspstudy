package chap12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

/*
 * 화면에서 홀수개의 정수를 입력받아 입력받은 숫자의 평균과 중간값 출력하기
 * 999 숫자가 입력된 경우 입력 종료.
 * 평균 : 총합/요소의갯수
 * 중간값 : 입력받은 숫자를 정렬하여 가운데값
 * 
 * [결과]
 * 10 40 30 60 30 999
 * 평균 : (10 40 30 60 30)의 합/5
 * 중간값 : 10 30 30 40 60 의 중간 값 30 
 */
public class Exam1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("홀수개의 정수를 입력하세요(종료:999)");
//		List<Integer> list = new ArrayList<>();
		List<Integer> list = new Vector<>();
		int sum = 0;
		while(true) {
			int num = scan.nextInt();
			if(num == 999) break;
			list.add(num); //요소추가 
			sum += num;
		}
		if(list.size() % 2 == 0) {
			System.out.println("홀수개의 정수가 필요합니다. 한번 더 입력하세요");
			int num = scan.nextInt();
			list.add(num);
			sum += num;
		}
		System.out.println(list + "=> 평균:" + (double)sum/list.size());
		Collections.sort(list);
		System.out.println(list + "=> 중간값:" + list.get(list.size()/2));
	}
}
