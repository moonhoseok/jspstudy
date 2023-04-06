package test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * product.txt 파일을 읽어 6월달,그랜저 판매 수량을 출력하기
 * 
 [결과]
[month=6, con=2, car=그랜저, qty=1, remark=]
[month=6, con=2, car=그랜저, qty=2, remark=]
[month=6, con=2, car=그랜저, qty=1, remark=]
[month=6, con=2, car=그랜저, qty=2, remark=]
[month=6, con=2, car=그랜저, qty=4, remark=]
[month=6, con=2, car=그랜저, qty=5, remark=]
[month=6, con=2, car=그랜저, qty=5, remark=]
합계:20
 */
public class Test3_A {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader
				   (new FileReader("product.txt"));
		int sum = br.lines().map(s -> {
			String[] str = s.split(",");
			String temp = "";
			try {
				temp = str[4];
			} catch (ArrayIndexOutOfBoundsException e) {
				temp = "";	
			}
			return new Car(Integer.parseInt(str[0]), 
					Integer.parseInt(str[1]), 
					str[2], Integer.parseInt(str[3]), temp);
		}).filter(c->c.getMonth()==6 &&
               c.getCar().equals("그랜저") &&
	              c.getCon()==2 ).peek(System.out::println)
		.mapToInt(Car::getQty).sum();
     System.out.println("합계:" + sum);	       

	}
}
