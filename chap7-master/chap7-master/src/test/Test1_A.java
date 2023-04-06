package test;
/*
 * Coin 클래스를 이용하기.
 * 두개의 Coin 객체를 생성하기 myCoin, youCoin 객체 생성하기
 * 앞면이 연속해서 3번 나오면 승리. => myCoin 승리, youCoin 승리, 비김.  
 */
/*
class Coin {
	int side;
	void flip() {
		side = (int)(Math.random()*2);
	}
}
*/
public class Test1_A {	
	public static void main(String[] args) {
		Coin myCoin = new Coin();
		Coin youCoin = new Coin();
		int mycount = 0, youcount = 0;
		System.out.println("myCoin\tyouCoin");
		while(true){
			myCoin.flip();
			youCoin.flip();
			if(myCoin.side == 0){
				System.out.print("앞면\t");
				mycount++;
			}else{
				System.out.print("뒷면\t");
				mycount = 0;
			}			
			if(youCoin.side == 0){
				System.out.print("앞면\n");
				youcount++;
			}else{
				System.out.print("뒷면\n");
				youcount = 0;
			}			
			if(mycount == 3 || youcount == 3)
				break; //반복문 종료
		}
		//결과 출력
		if(mycount > youcount)
			System.out.println("myCoin 승리");
		else if(mycount < youcount)
			System.out.println("youCoin 승리");
		else
			System.out.println("비김");
	}		
}

