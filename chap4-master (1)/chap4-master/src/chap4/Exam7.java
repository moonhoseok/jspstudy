package chap4;

/*
 * 가로 구구단 출력하기
 * 2*2=4    3*2=6  ...  9*2=18
 * 2*3=6
 * ...
 * 2*9=18   3*9=27      9*9=81 
 */
public class Exam7 {
	public static void main(String[] args) {
		for(int i=2;i<=9;i++)
			System.out.print(i+"단"+"\t");
		System.out.println();
		for(int j=2;j<=9;j++) {      //항
			for(int i=2;i<=9;i++) {  //단
				System.out.print(i+"*"+j+"="+(i*j) + "\t");
			}
			System.out.println();
		}
	}
}
