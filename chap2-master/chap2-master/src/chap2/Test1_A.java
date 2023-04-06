package chap2;

public class Test1_A {
	public static void main(String[] args) {
     //1. 잘못된 문장을 골라내고 그 이유를 설명하시오.		
        char       a='a';   //정상
//	    char       b="a";   //오류. char(b) <-String("a"). 기본자료형과 참조자료형 형변환불가 
	    String     c="a";   //정상
//	    String     d='a';   //오류  String <- char 기본자료형과 참조자료형 형변환불가
//	    char       e='ab';  //오류. char형은 문자한개저장
	    String     f="ab";  //정상
//	    char       g = '';  //오류  char형은 문자한개저장. 문자가 없어도 오류
	    String     h = "";  //정상  String은 빈문자열이 가능함. 

//	    byte   var1 = 128;  //오류. byte형 값의 범위 : -128 ~ 127
		short  var2 = 128;  //정상 
		int    var3 = (int)28L;  //L 접미사있는 리터널값은 long 타입의 리터널
		                    // int <- long : 명시적형변환. 형변환연산자 생략 불가
		long   var4 = 128L; // 정상 long <- long 
		float  var5 = (float)1.2;  // 실수형 리터널의 기본자료형은 double
		                    // float <- double : 명시적형변환
		double var6 = 1.2;  // 정상 double <- double
	    float var9 = '1';   // 정상. '1'의 ASCII코드값을 float 형으로 저장    
	    System.out.println(var9);
	    
	    float f1 = 1F; 
	    float f2 = (float)1.0;  // 형변환연산자 필요 
	    float f3 = '1'; // float <- char. 자동형변환. 형변환연산자 생략 가능  
//	    float f4 = "1"; //기본형과 참조형은 형변환 안됨.  
	    float f5 = (float)1.0d;//d접미사는 double형 리터널에 사용됨.      

	}
}
/*
2.   변수를 선언하기 위해서는 자료형과 변수의 이름을 결정해야합니다. 
      변수 이름으로 사용할 수 있는 것을 고르시오.
      변수이름으로 사용할 수 없는 이유를 작성하시오
      A. false   : 예약어
      B. default : 예약어
      C. _var    : 정상. 
      D. a-class : -은 변수이름으로 사용불가. 사용가능특수문자:_,$
      
3. 변수를 선언하기 위해서는 자료형과 변수의 이름을 결정해야합니다.
   변수 이름으로 사용할 수 있는 것을 고르시오.
    A. s#arp  : # 사용불가
    B. static : 예약어 
    C. _class : 정상
    D. class  : 예약어
    
4. byte 형을 저장할 수 있는 데이터 값의 허용 범위는 얼마입니까?
     -128 ~ 127
 (자료형) : 형변환 연산자
5. float 형 변수 선언이 올바르게 된 것을 모두 고르시오.
   A. float f1 = 1F;   정상 
   B. float f2 = 1.0;  
   C. float f3 = '1';  정상
   D. float f4 = "1";  
   E. float f5 = 1.0d;      
*/

