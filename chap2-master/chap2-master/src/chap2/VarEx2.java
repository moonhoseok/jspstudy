package chap2;
/*
 * 문자형  : char 기본자료형. 한개문자.  작은따옴표 표현, '
 * 문자열형 : String 참조자료형. 문자0개이상. 큰따옴표 표현, " 
 * 특수 문자 : \
 * 
 */  
public class VarEx2 {
	public static void main(String[] args) {
// 	   char ch1 = '';  //문자는 한개 필요. 오류발생
//	   char ch1 = "";   //"는 문자열의 의미. String 객체만 가능. 오류발생
	   char ch1 = 'A';
	   System.out.println(ch1);  //A
	   char ch2=66;
	   System.out.println(ch2); //B
	   System.out.println('B'-'A'); //1
	   //특수문자
	   char single = '\''; //\' : 순수 문자 '
       System.out.println(single);
       System.out.println("서울\t대전\t대구\t부산");  // \t : 탭
       System.out.println("안녕하세요\n이부분은 다음줄에 출력됩니다."); //\n : 다음라인 newline
       System.out.println("\uD64D\uAE38\uB3D9"); //  유니코드
       System.out.println("c:\\test");  // \\ : 순수 문자 \
       
       // 변수 선언
//       int true = 100;  //오류 true 예약어. 예약어는 변수명 사용불가
       int True = 100;
       char $harp = '#';  //가능
//       int 7up = 7;   //숫자 시작 안됨.
       int 숫자=0;  //한글 변수명 사용 가능함. 권장하지 않음.
	}
}
