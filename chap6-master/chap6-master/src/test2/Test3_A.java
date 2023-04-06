package test2;
/*
구동 클래스를 실행 했을때 다음의 결과가 나오도록 Animal 클래스를 구현하기
[결과]
원숭이:26살
사자:1살
사람:100살

this() : 같은 클래스 내의 다른 생성자를 호출시 사용 
this   : 자기참조변수. 현재 객체의 참조값
         this.인스턴스멤버 
         
멤버변수와 지역변수는 같은 이름을 사용할 수 있다         
*/
class Animal {
	String name;  //힙영역에 할당
	int age;
	//new Animal("원숭이", 26)
	Animal(String name, int age) { //매개변수 : 스택영역에 할당
	    this.name=name;
		this.age=age;
	}
	//new Animal("사자")
	Animal(String name) {
//		this(name,1); //현재 객체의 생성자중 매개변수가 (String,int)인 생성자 호출
	    this.name=name;
		this.age=1;
	}
	//new Animal(100)
	Animal(int age) {
		this("사람",age);//현재 객체의 생성자중 매개변수가 (String,int)인 생성자 호출
	}
	void info() {
		System.out.println(name+":"+age+"살");
	}	
}
public class Test3_A {
	public static void main(String[] args) {
		Animal a1 = new Animal("원숭이", 26);
		Animal a2 = new Animal("사자");
		Animal a3 = new Animal(100);
		a1.info();
		a2.info();
		a3.info();
	}
}
