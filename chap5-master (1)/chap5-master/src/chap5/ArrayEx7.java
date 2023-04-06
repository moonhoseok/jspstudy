package chap5;
/*
 * 2차원 배열 예제
 * 2차원 배열은 1차원 배열의 참조변수의 배열임.
 * 자바에서 다차원(2차원이상) 배열은 n-1차원 배열의 참조변수의 배열임
 * => 다차원 배열은 배열의 배열로 표현함.
 */
public class ArrayEx7 {
	public static void main(String[] args) {
		//배열의 선언과생성
		int[] arr[] = new int[3][2]; //2차원 배열 생성
		//초기화
		arr[0][0] = 10;arr[0][1] = 20;
//		arr[0][2] = 20; //2열은 불가 오류
		arr[1][0] = 30;arr[1][1] = 40;
		arr[2][0] = 50;arr[2][1] = 60;
		//2차원 배열의 내용 출력하기
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print("arr["+i+"]["+j+"]="+arr[i][j]+",");
			}
			System.out.println();
		}
		System.out.println("1차원 배열 객체 변경하기");
		int arr1[] = {1,2,3,4,5};
		arr[1] = arr1;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print("arr["+i+"]["+j+"]="+arr[i][j]+",");
			}
			System.out.println();
		}
		//행의 합과 열의 합을 구하기
		System.out.println("행의합=====");
		for(int i=0;i<arr.length;i++) {
			System.out.print(i+"행의 합:");
			int hap = 0;
			for(int j=0;j<arr[i].length;j++) {
				hap += arr[i][j];
			}
			System.out.println(hap);
		}
		System.out.println("열의합=====");
		int maxcol = 0;
		for(int i=0;i<arr.length;i++) {
			if(maxcol < arr[i].length)
				maxcol = arr[i].length;
		}
		int col[] = new int[maxcol];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				col[j]+=arr[i][j];
			}
		}
		for(int i=0;i<col.length;i++)
		   System.out.println(i+"열의 합:"+col[i]);
	}
}
