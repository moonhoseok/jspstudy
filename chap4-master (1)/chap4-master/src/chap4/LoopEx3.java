package chap4;
/*
 * 중첩반복문 : 반복문 내에 반복문이 존재
 */
public class LoopEx3 {
	public static void main(String[] args) {
		//i:3
		//j:2 ~9
		for(int i=2;i<=9;i++) { 
			System.out.println("\n"+i+"단");
			for(int j=2;j<=9;j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}
	}
}
