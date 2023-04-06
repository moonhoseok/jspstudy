package chap7;
// 생성자의 접근 제한자를 private : 객체의 갯수를 한개만.
class SingleObject {
	private static SingleObject obj = new SingleObject();
	private SingleObject() {}
	int value = 100;
	public static SingleObject getObject() {
		return obj;
	}
}
public class SingletonEx1 {
	public static void main(String[] args) {
//		SingleObject o = new SingleObject(); //객체 생성 불가
		//value 값 출력하기
		SingleObject o = SingleObject.getObject();
		System.out.println(o.value); //100
		SingleObject o2 = SingleObject.getObject();
		System.out.println(o2.value); //100
		o.value=200;
		System.out.println(o.value); //200
		System.out.println(o2.value); //200
	}
}
