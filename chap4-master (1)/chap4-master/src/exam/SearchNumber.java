package exam;

import java.util.Scanner;

public class SearchNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int maxint = (int) (Math.random() * 16) + 32;
		System.out.println("0부터 " + maxint + "까지의 숫자 중 한개를 생각하세요");
		String numbit = "";
		String input = "";
		String temp = "";
		int searchnum = 0;
		String maxbit = Integer.toBinaryString(maxint);
		for (int index = 0; index < maxbit.length(); index++) {
			int printcount = 0;
			for (int i = 0; i <= maxint; i++) {
				numbit = Integer.toBinaryString(i);
				temp = "";
				for (int zero = 0; zero < maxbit.length() - numbit.length(); zero++) {
					temp = "0" + temp;
				}
				numbit = temp + numbit;
				if (numbit.charAt(index) == '1') {
					printcount++;
					System.out.print(i + " ");
					if (printcount % 5 == 0) {
						System.out.println();
						printcount = 0;
					}
				}
			}
			System.out.println();
			System.out.println("번호가 있으면 y 아니면 n 입력");
			input = sc.next();
			if (input.equalsIgnoreCase("y")) {
				searchnum += (int) Math.pow(2, (maxbit.length() - 1 - index));
			}
		}
		System.out.println("당신의 번호:" + searchnum);
	}
}
