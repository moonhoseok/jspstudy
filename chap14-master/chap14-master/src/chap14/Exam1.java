package chap14;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * FileWriter 클래스를 이용하여 화면에서 입력된 내용을 data2.txt 파일에 저장하기
 * 화면에서 내용의 입력은 exit가 입력될때까지 계속 입력받기
 */
public class Exam1 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("data2.txt에 등록할 내용을 입력하세요(종료:exit)");
		FileWriter fw = new FileWriter("data2.txt");
		while(true) {
			String data = scan.nextLine();
			if(data.equals("exit")) break;
			fw.write(data+"\n");
		}
		fw.flush();
		fw.close();
	}
}
