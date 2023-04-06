package chap11;
/*
 * count() 메서드 구현하기
 * count(원래문자열,찾는문자열) : 원래 문자열에서 찾는 문자열의 갯수 리턴
 */
public class Exam2 {
	public static void main(String[] args) {
		System.out.println(count("12345AB12AB45AB","12")); //2
		System.out.println(count("12345AB12AB45AB","AB")); //3
		System.out.println(count("12345","6"));            //0
	}
	private static int count(String s1, String s2) {
		int cnt=0,index=0;
		//s1 = 12345AB12AB45AB
		//s2 = 12
		while(true) {
			index = s1.indexOf(s2,index);
			if(index < 0) break;
			cnt++;
			index++;
		}
		return cnt;
	}
}
