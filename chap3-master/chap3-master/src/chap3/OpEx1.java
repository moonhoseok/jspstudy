package chap3;
/*
 * 단항연산자 : 연산자의 피연산자가 한개인 연산자.
 * 
 * 1. 증감연산자 : ++,--
 *     ++ : 변수의 값을 1 증가
 *     -- : 변수의 값을 1 감수
 */
public class OpEx1 {
	public static void main(String[] args) {
		int x=5,y=5;
		//후위형
		x++; //x의 값을 1 증가. x=6
		y--; //y의 값을 1 감소. y=4
		System.out.println("x="+x+",y="+y); //x=6,y=4
		//전위형
		++x;
		--y;
		System.out.println("x="+x+",y="+y); //x=7,y=3
		x=y=5;
		y = ++x;
		System.out.println("x="+x+",y="+y); //x=6,y=6
		y = x++;
		System.out.println("x="+x+",y="+y); //x=7,y=6
		System.out.println("x=" + x++); //x=7
		System.out.println("x=" + ++x); //x=9
	}

}
