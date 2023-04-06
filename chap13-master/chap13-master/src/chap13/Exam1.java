package chap13;

import java.util.function.IntPredicate;

/*
 * Predicate 인터페이스를 사용하여 1~100사이의 임의의 수 10개를 
 * 배열에 저장하고, 그중 짝수,홀수를 구분하여 출력.
 * 짝수와 홀수의 합도 함께 출력하기
 * IntPredicate 인터페이스
 *  boolean test(int)
 */
public class Exam1 {
	private static int[] arr = new int[10];
	public static void main(String[] args) {
		for(int i=0; i<arr.length; i++) {
			arr[i]= (int)(Math.random()*100)+1;
		    System.out.print(arr[i]+",");
		}
		System.out.println();
		System.out.println("홀수 :"+numlist(a->a%2==1));
		System.out.println("짝수 :"+numlist(a->a%2==0));
	}
	private static String numlist(IntPredicate p) {
		int sum = 0;
		StringBuffer sb = new StringBuffer();
		for(int a : arr) {
			if(p.test(a)) {
				sb.append(a+",");
				sum += a;
			}
		}
		sb.append("합계:"+sum);
		return sb.toString();
	}
}
