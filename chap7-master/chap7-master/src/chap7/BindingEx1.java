package chap7;
/*
 * 부모 클래스의 멤버와 자손클래스의 멤버가 같은 멤버가 존재하는 경우
 *   멤버변수 : 참조변수의 자료형을 기준으로 호출
 *   멤버메서드 : 객체의 최종 오버라이딩된 메서드가 호출된다.
 *   
 * java.lang.ClassCastException : 
 *      참조변수로 객체를 참조할 수 없는 경우 발생되는 예외  
 */
class Parent2 {
	int x = 10;
	void method() {
		System.out.println("Parent2 클래스의 method");
	}
}
class Child2 extends Parent2 {
	int x = 20;
	void method() {
		System.out.println("Child2 클래스의 method");
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);
		System.out.println("super.x=" + super.x);
	}
}
public class BindingEx1 {
	public static void main(String[] args) {
		Parent2 p = new Child2();
		Parent2 p1 = new Parent2();
		System.out.println(p.x);
		Child2 c = (Child2)p; //부모타입참조변수 > 자손타입참조변수
		System.out.println(c.x);
		System.out.println(p1.x);
		p.method();
		c.method();
		p1.method();
	
		
		//부모객체를 자손타입의 참조변수로 참조
		Object o = new Parent2(); //java.lang.ClassCastException
		System.out.println(c.x);
		String s= (String)o;
	}
}
