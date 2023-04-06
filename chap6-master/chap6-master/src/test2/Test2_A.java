package test2;
/*
2. Coin 클래스와 구동 클래스 구현하기
  Coin 클래스
   멤버변수 : int side (앞면:0, 뒷면:1), serialNo(동전번호), 
            sno(동전번호 생성을위한 클래스변수)
   멤버메서드 : void flip()
                Math.random() 메서드를 사용하여 side를 결정.

  구동클래스
    Coin 클래스의 객체를 10개 생성하기.
    객체생성시, 동전번호를 입력하고, flip() 메서드를 이용하여 각각의 동전이 앞면인지 뒷면인지
    여부를 출력하기

  [결과]
1번 동전 : 앞면
2번 동전 : 앞면
3번 동전 : 뒷면
4번 동전 : 앞면
5번 동전 : 뒷면
6번 동전 : 뒷면
7번 동전 : 뒷면
8번 동전 : 뒷면
9번 동전 : 뒷면
10번 동전 : 뒷면
전체 앞면 동전의 갯수 :3
전체 뒷면 동전의 갯수 :7
 */
class Coin {
	int side, serialNo;
	static int sno;
	Coin() {  //생성자
		serialNo = ++sno;
	}
	void flip() {
		side = (int)(Math.random() * 2);
	}
	public String toString() {
		return serialNo + "번 동전 : " + ((side==0)?"앞면":"뒷면");
	}
}
public class Test2_A {
	public static void main(String[] args) {
		Coin[] coinarr = new Coin[10]; //Coin 참조변수 10개를 저장한 배열 객체
		int[] cntarr = new int[2]; //0:앞면갯수,1:뒤면갯수
		for(int i=0;i<coinarr.length;i++) {
			coinarr[i] = new Coin();  //Coin 객체
			coinarr[i].flip(); //앞/뒷 면 중 선택
			System.out.println(coinarr[i]);  //toString() 메서드 호출
			cntarr[coinarr[i].side]++;
		}
		System.out.println("전체 앞면 동전의 갯수 :" + cntarr[0]);
		System.out.println("전체 뒷면 동전의 갯수 :" + cntarr[1]);	
	}
}
