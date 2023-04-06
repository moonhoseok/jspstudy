package chap5;
/*
 * Command line 에서 파라미터 받기
 */
public class ArrayEx6 {
	//프로그램 시작. 구동클래스
	/*
	 * 1. 소스 코딩
	 * 2. 컴파일러 => .class 바이트 코드 생성
	 *    javac ArrayEx6.java  =>ArrayEx6.class 생성됨 
	 * 3. 실행. 인터프리터로 실행
	 *    java ArrayEx6
	 * 4. java 인터프리터의 기능
	 *    - jvm 환경 설정
	 *    - 바이트코드 메모리에 로드. 검증.
	 *    - main 메서드 호출. args 배열의 값을 설정 가능      
	 */
	 public static void main (String[] args) { 
		 if(args.length == 0) {
			 System.out.println("command 라인에 파라미터를 입력하세요");
			 return; //현재 main 메서드 종료=>프로그램 종료
		 }
		 for(String a : args) {
			 System.out.println(a);
		 }
	}
}
