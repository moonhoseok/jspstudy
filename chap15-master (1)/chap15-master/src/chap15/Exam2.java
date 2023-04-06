package chap15;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/*
 *  1부터 100사이의 임의의 수 100 개를 IntStream 에 저장하고
 *  저장된 수의 총합,평균, 짝수평균,홀수 평균, 짝수 갯수,홀수 갯수 출력하기
 *  Random 클래스 이용하기. 
 *  
 *  new Random(seed).ints(갯수,시작값,종료값+1)
 *  
 */
public class Exam2 {
	public static void main(String[] args) {
		new Random(1000).ints(10,1,101)
		.forEach(s->System.out.print(s+","));
		System.out.println();
		
		new Random(1000).ints(10,1,101)
		.forEach(s->System.out.print(s+","));
		System.out.println();		
		System.out.println("총합:"+new Random(1000).ints(100,1,101).sum());
		System.out.println
		("평균:"+new Random(1000).ints(100,1,101).average().getAsDouble());
		System.out.println("짝수 평균:"
		+new Random(1000).ints(100,1,101).filter(i->i%2==0).average().getAsDouble());
		System.out.println("홀수 평균:"
		+new Random(1000).ints(100,1,101).filter(i->i%2==1).average().getAsDouble());
		System.out.println("짝수 갯수:"
		+new Random(1000).ints(100,1,101).filter(i->i%2==0).count());
		System.out.println("홀수 갯수:"
		+new Random(1000).ints(100,1,101).filter(i->i%2==1).count());
	}
}
