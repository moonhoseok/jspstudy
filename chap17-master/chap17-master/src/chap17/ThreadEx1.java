package chap17;
/*
 * Thread 생성
 * 1. Thread 클래스 상속 
 *     => run() 메서드 구현
 * 2. Runnable 인터페이스 구현
 *     => run() 메서드 구현
 */
class Thread1 extends Thread {
	Thread1(String name) {
		super(name); //스레드 이름설정
	}
	@Override
	public void run() {  //Running 상태
		for(int i=1;i<=5;i++) {
			//getName() : Thread 클래스의 이름 리턴
			System.out.println(i+"=" + getName());
			try {
				sleep(1000); //1000밀리초 = 1초 동안 대기. 대기 상태
			}catch(InterruptedException e ) {}
		}
	} //Dead 상태. 종료
}
public class ThreadEx1 {
	public static void main(String[] args) {
		System.out.println("main 스레드 시작");
		Thread t1 = new Thread1("First"); //객체 생성
		Thread t2 = new Thread1("Second");//객체 생성
		t1.start(); t2.start();    //Runnable 상태(실행 가능)
		/*
		 * start() : 스레드의 시작
		 * 1. 스택영역을 병렬화 함.
		 * 2. 병렬화된 스택영역에 run() 메서드 호출
		 */
//		t1.run(); t2.run();
		System.out.println("main 스레드 종료");
	}
}
