package chap6;
/*
 * this 예약어 예제
 * 
 * this() 생성자 : 클래스 내부의 다른 생성자 호출시 사용
 *               반드시 첫줄에 구현해야 한다.
 *               
 * this 참조변수 : 자기참조 변수
 *             현재 객체의 참조값을 저장하고 있음.
 *             인스턴스 메서드에서만 사용이 가능함=>인스턴스메서드 내부에 지역변수 선언함
 *             지역변수와 멤버변수는 같은이름 사용가능
 *             지역변수와 멤버변수 구분시 사용함.
 */
class Car4 {
	String color;
	int number;
	int serialNo;
	static int sno;
	Car4(String color,int number) {
		System.out.println("Car4(String,int) 생성자");
		this.color = color;
		this.number =number;
		this.serialNo = ++sno;
	}
	Car4() {
		this("White",1111); //Car4(String,int) 생성자 호출. 첫줄에 작성해야함
		System.out.println("Car4() 생성자");
		/*
		color = "White";
		number =1111;
		this.serialNo = ++sno;
		*/
	}
	Car4(String color) {
		this(color,1111);//Car4(String,int) 생성자 호출. 첫줄에 작성해야함
		System.out.println("Car4(String) 생성자");
	}
	Car4(int number) {
		this("White",number);//Car4(String,int) 생성자 호출. 첫줄에 작성해야함
		System.out.println("Car4(int) 생성자");
	}
	Car4(Car4 c) {
		this(c.color,c.number);//Car4(String,int) 생성자 호출. 첫줄에 작성해야함
		System.out.println("Car4(Car4) 생성자");
	}
	public String toString() {
		return serialNo + "번 자동차:"+color + "," + number;
	}
}
public class ThisEx1 {
	public static void main(String[] args) {
		Car4 c1 = new Car4("Blue",1234);
		Car4 c2 = new Car4();  //color="white", number=1111 멤버값 설정
		Car4 c3 = new Car4("Red");  //color="Red", number=1111 멤버값 설정
		Car4 c4 = new Car4(1234); //"White",1234 멤버값 설정
		Car4 c5 = new Car4(c1);   //c1와 같은 멤버로 설정
		Car4 c6 = new Car4(c3.color,c3.number);   //c3와 같은 멤버로 설정
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
	}
}
