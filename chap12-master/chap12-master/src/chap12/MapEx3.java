package chap12;

import java.util.Comparator;
import java.util.TreeMap;

/*
 * TreeMap 예제 : key 순으로 정렬됨
 */
public class MapEx3 {
	public static void main(String[] args) {
//		TreeMap<Integer, String> scores = new TreeMap<>();
		TreeMap<Integer, String> scores = 
				          new TreeMap<>(Comparator.reverseOrder());
		scores.put(87, "홍길동");
		scores.put(98, "이몽룡");
		scores.put(75, "임꺽정");
		scores.put(94, "김삿갓");
		scores.put(80, "성춘향");
		scores.put(88, "향단이");
		System.out.println(scores);
		System.out.println("첫번째 key :" + scores.firstKey());
		System.out.println("첫번째 entry :" + scores.firstEntry());
		//가장 높은 점수를 받은 사람의 이름 출력하기
		System.out.println
		       ("높은 점수 이름 :" + scores.get(scores.firstKey()));
		System.out.println
	       ("높은 점수 이름 :" + scores.firstEntry().getValue());
		System.out.println("마지막 key :" + scores.lastKey());
		System.out.println("마지막 entry :" + scores.lastEntry());
		System.out.println("94점 앞 점수");
		System.out.println(scores.lowerEntry(94));
		System.out.println("94점 뒤 점수");
		System.out.println(scores.higherEntry(94));
		System.out.println("94점 앞 점수 94점 포함");
		System.out.println(scores.floorEntry(94));
		System.out.println("94점 뒤 점수 94점 포함");
		System.out.println(scores.ceilingEntry(94));
	}
}
