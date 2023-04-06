package chap7;
/*
 * final 제한자 : 변경 불가의 의미
 * final 클래스(종단클래스) : 상속불가 클래스. 다른클래스의 부모 클래스가 안됨.
 *                      String, Math => final 클래스 
 */
class A {}
final class Final extends A{}
class FinalSub extends Final {}
class MyString extends String {}
public class FinalClass {
	public static void main(String[] args) {
	}
}
