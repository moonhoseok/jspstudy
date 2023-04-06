package chap11;

import java.util.Random;

/*
 * true/false 값을 난수로 발생하여 시스템과 사용자 중 3번 연속 true가 나오는 한쪽
 * 승리하는 프로그램 구현하기
 * 
 * 시스템 true   사용자 true
 * 시스템 true   사용자 false
 * 시스템 true   사용자 true
 * 시스템 승리
 */
public class Exam5 {
	public static void main(String[] args) {
/*		
		Random srand = new Random();
		Random urand = new Random();
		srand.setSeed(System.currentTimeMillis());
		urand.setSeed(System.currentTimeMillis()+10000);
		int scnt=0,ucnt=0;
		while(true) {
			if(srand.nextBoolean()) {
			  scnt++;
			  System.out.print("시스템 true\t");
			} else {
			  scnt = 0;
			  System.out.print("시스템 false\t");
			}
			if(urand.nextBoolean()) {
			  ucnt++;
			  System.out.println("사용자 true");
			} else {
			  ucnt = 0;
			  System.out.println("사용자 false");
			}
			if(ucnt == 3 || scnt==3 ) break;
		}
		if(ucnt == scnt) System.out.println("비김");
		else if(ucnt == 3) System.out.println("사용자 승리");
		else System.out.println("시스템 승리");
*/
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis());
		int ucnt=0,scnt=0;
		while(true) {
			boolean svalue = rand.nextBoolean();
			boolean uvalue = rand.nextBoolean();
			if(svalue) {
			  scnt++;
			  System.out.print("시스템 true\t");
			} else {
			  scnt = 0;
			  System.out.print("시스템 false\t");
			}
			if(uvalue) {
			  ucnt++;
			  System.out.println("사용자 true\t");
			} else {
			  ucnt = 0;
			  System.out.println("사용자 false\t");
			}
			if(ucnt == 3 || scnt==3) break;
		} //while 끝
		if(ucnt == scnt) System.out.println("비김");
		else if(ucnt == 3) System.out.println("사용자 승리");
		else System.out.println("시스템 승리");
	}
}
