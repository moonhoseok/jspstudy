package chap4;
/*
 * switch(조건값)
 *   조건값으로 사용할 수 있는 자료형
 *   byte,short,int,char,String 만 가능함 
 */
public class SwitchEx3 {
	public static void main(String[] args) {
		String v = ""+1;
		switch(v) {
		case "1" : System.out.println(v);break;
		default :System.out.println(v+10);
		}
		int a = 2;
		int b = 1;
		switch(a) {
		case 1 : switch(b) {
		            case 1: System.out.println("b="+b);
		         }
		         break;
		case 2 : switch(b) {
                 case 1: System.out.println("b="+(b+1));
                 }
		         break;
		}
	}
}
