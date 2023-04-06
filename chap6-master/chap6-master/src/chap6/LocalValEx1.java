package chap6;
/*
 * 지역변수는 반드시 초기화 되어야 한다.
 * 매개변수도 지역변수.
 */
public class LocalValEx1 {
	public static void main(String[] args) {
		int num;  //지역변수. 변수 선언
//		System.out.println(num); //초기화 하지 않은 지역변수 출력불가.
		boolean b = true;
		if (b) {
			num = 100;
		} else {
			num = 200;
		}
		System.out.println(num);
		int num2=0;
		if (b) {
			num2 = 100;
		}	
		System.out.println(num2);
		String grade=null;
		int score = 85;
		switch(score/10) {
		 case 9: grade="A";break;
		 case 8: grade="B";break;
		 case 7: grade="C";break;
//		 default : grade="F";
		}
		System.out.println(grade + "학점");
	}
}
