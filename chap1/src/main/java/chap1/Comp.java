package chap1;

public class Comp {
	public static void g(){
		System.out.println("안녕하세여");
	}
	public static int s(int a, int b) {
		int result = a*b;
		return result;
	}
	public static void main(String[] args) {
		//메소드 
		g();
		System.out.println(s(1,4));
	}

}
