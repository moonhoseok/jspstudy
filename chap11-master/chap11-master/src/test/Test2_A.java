package test;
/*
 * 다음 결과가 나오도록 프로그램 수정하기
 * [결과]
 * basket
 * basketball
 */
public class Test2_A {
	public static void main(String[] args) {
		String str = "base"; 
		//basket
		System.out.println(str=str.replace('e','k')+"et");
		str += "ball"; 
		System.out.println(str);
	}
}