package exam;

import java.util.Scanner;

public class SearchNumber2 {
	public static void main(String[] args) {
		int num = 31;
		System.out.println("0부터 " + num + "까지의 숫자 중 한개를 생각하세요");
		String bin = Integer.toBinaryString(num);
        int[] arr = new int[bin.length()];
        Scanner scan = new Scanner(System.in);
		for (int index = 0;index < bin.length();index++) {
			int cnt = 0;
			for(int i=num;i > 0 ;i--) {
				String binary = Integer.toBinaryString(i);
				String padding = "";
				for(int m=binary.length();m<bin.length();m++) {
					 padding +="0";
				}
				binary = padding + binary;
				if(binary.charAt(index) == '1'){
					cnt++;
					System.out.print(i + ((cnt%5==0)?"\n":", "));
				}
			}
			
			System.out.println("\n숫자가 있으면 y 없으면 n :");
			String yn = scan.next();
			if(yn.equalsIgnoreCase("y")) {
				arr[index] = 1;
			}
		}
		int searchNumber = 0;
		for(int i = arr.length-1;i>= 0;i--) {
			if(arr[i] == 1) {
				searchNumber += 
						(int)(Math.pow(2, bin.length() - i - 1));
			}
		}
		System.out.println();
		System.out.println("당신이 생각한 숫자 :" + searchNumber);
	}
}