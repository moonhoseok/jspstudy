package chap8;
//Animal 클래스
abstract class Animal {
	String name;
	Animal(String name) {
		this.name = name;
	}
	abstract void eat(); //추상메서드 
}
/*
 * Dove, Monkey 클래스,Flyable 인터페이스 구현하기
 */
class Dove extends Animal implements Flyable{
	Dove() {
		super("비둘기");
	}
	@Override
	void eat() {
		System.out.println("벌레를 잡아먹는다");
	}
	@Override
	public void fly() {
		System.out.println(name + "은 날아 다닌다");
	}
}
class Monkey extends Animal {
	Monkey() {
		super("원숭이");
	}

	@Override
	void eat() {
		System.out.println("나무에서 열매을 따먹는다");
	}
}
interface Flyable {
	void fly();
}
public class Exam1 {
	public static void main(String[] args) {
		Animal a = new Dove();
		a.eat();
		if(a instanceof Flyable) {
			Flyable f = (Flyable)a;
			f.fly();
		}
		a = new Monkey();
		a.eat();
		if(a instanceof Flyable) {
			Flyable f = (Flyable)a;
			f.fly();
		}
	}
}
