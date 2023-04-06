package test;
//다음 소스는 컴파일 오류가 발생한다. 결과가 "Tested" 가 출력되도록 프로그램을 수정하기

public class Test2_A {
	static Beta getIt() {
		return new Alpha();
	}
	public static void main(String[] args) {
		//b : Alpha 객체.
		Beta b = getIt();
//		System.out.println(b.testIt());
		System.out.println(((Alpha)b).testIt());
		Alpha a = (Alpha)b; //구현클래스타입 <= 인터페이스타입 : 형변환연산자 생략불가
		System.out.println(a.testIt());
		Gamma g = (Gamma)b;  //ClassCastException 예외 발생
		System.out.println(g.testIt1());
	}
}
