package chap5;
/*
 * command 라인에서 숫자를 입력받아 숫자의 자리수의 합을 출력하기
 */
public class Exam4 {
	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("숫자를 파라미터로 입력하세요");
			return;
		}
		/*
		 * String[] args = {"123","456"}
		 * args[0] : "123". args[0].length() : 3
		 * args[1] : "456"
		 */
		int sum = 0;
		for(int i=0;i<args[0].length();i++) {
			char ch = args[0].charAt(i); //args[0].charAt(2):'3'
			if(ch >= '0' && ch <= '9')
				sum += ch - '0'; //1+2+3
		}
		for(int i=0;i<args[1].length();i++) {
			char ch = args[1].charAt(i);
			if(ch >= '0' && ch <= '9')
				sum += ch - '0';
		}
		System.out.println("args 의 자리수 합:" + sum);
		sum = 0;
		System.out.println("중첩 반복문으로 처리하기");
		for(String a : args) {
			//a : "456"
			for(int i=0;i<a.length();i++) {
				char ch = a.charAt(i);
				if(ch >= '0' && ch <= '9')
					sum += ch - '0'; //1+2+3+4+5+6
			}
		}
		System.out.println("args 숫자의 자리수 합:"+sum);
	}
}
