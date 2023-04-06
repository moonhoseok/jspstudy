package chap15;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
/* 대용량 데이터 파일를 생성하기 */
public class GeneratorProductFile {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = null; 
		String[] cars = {"아반테","그랜저","SM7","BMW","벤즈","K9"};
		String[] remarks = {"몰라요","싫어요","그냥그래요","좋아요"};//반품사유
		int limit = 0;
		int con = 0;
		fos = new FileOutputStream("product.txt"); //파일 생성
		PrintStream ps = new PrintStream(fos);
		while(limit++ < 1000) {
			ps.print((int)(Math.random()*12) + 1 + ",");
			con = (int)(Math.random()*3) + 1;//1.생산, 2.판매, 3.반품
			ps.print(con+",");
			ps.print(cars[(int)(Math.random() * cars.length)]+",");
			ps.print((int)(Math.random()*5)+1);//1~5 임의의값 : 판매수량
			if(con==3) { //반품 사유.
				ps.print(",");
				ps.print(remarks[(int)(Math.random()*3)]);
			}
			ps.println();
		}
		ps.flush();ps.close();
	}
}
