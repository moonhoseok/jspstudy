package chap12;

import java.util.HashSet;
import java.util.Set;

//Student2 클래스 구현하기.
// 학번과 이름이 같은 경우 같은 학생으로 인식하도록 하기
public class Exam3 {
	public static void main(String[] args) {
		Set<Student2> set = new HashSet<>();
		set.add(new Student2(1,"홍길동","경영"));
		set.add(new Student2(2,"홍길순","경영"));
		set.add(new Student2(2,"홍길순","컴공"));
		set.add(new Student2(1,"홍길동","통계"));
		set.add(new Student2(3,"홍길동","컴공"));
		System.out.println("등록학생수:"+set.size()); //3
		System.out.println("등록학생:"); 
		for(Student2 s : set)
			System.out.println(s); //3명 출력
	}
}
