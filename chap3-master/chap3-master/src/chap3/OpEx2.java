package chap3;
/*
 * 단항연산자 : 논리부정(!)
 *     부호연산자 : +,-
 *       + : 현재값의 부호를 유지.
 *       - : 현재값의 부호를 변경. 양수 => 음수, 음수=>양수
 *      
 */
public class OpEx2 {
	public static void main(String[] args) {
		System.out.println("true=" + !false);
		System.out.println("false=" + !true);
		System.out.println("5 != 4 :" + ( 5 != 4));  //true
		System.out.println("5 == 4 :" + ( 5 == 4));  //false
		//부호연산자
		int x= -10;
		System.out.println("+x=" + +x); //-10
		System.out.println("-x=" + -x); //10
		x=10;
		System.out.println("+x=" + +x);//10
		System.out.println("-x=" + -x);//-10
	}
}
