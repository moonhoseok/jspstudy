package chap4;
/*
 * 1부터 100까지의 합이 1000이 넘는 순간의 값을 출력하기 
 */
public class Exam10 {
	public static void main(String[] args) {
		int sum = 0,i=0;
		for(i=1;i<=100;i++) {
			sum += i;
			if(sum >= 1000)
				break;
		}
		System.out.println(sum);
		System.out.println("합이 1000이 넘는 순간의 숫자 :" + i);
	}
}
