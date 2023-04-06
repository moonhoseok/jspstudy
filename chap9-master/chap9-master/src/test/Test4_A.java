package test;
/* 
main 메서드에서 method1() 메서드를 호출하고, 
method1 메서드에서 value 값을 출력하여 다음의 결과가 나오도록 프로그램 수정하기
[결과]
30
20
10
*/
class Outer2 {
	int value = 10;
	class Inner {
		int value = 20;
		void method1() {  //내부클래스의 멤버
			int value = 30;
			System.out.println(value);
 			System.out.println(this.value); //내부클래스의 멤버변수 value 값
			System.out.println(Outer2.this.value); //외부클래스의 멤버변수 value 값
		}
	}
}

public class Test4_A {
	public static void main(String[] args) {
		new Outer2().new Inner().method1();
	}
}