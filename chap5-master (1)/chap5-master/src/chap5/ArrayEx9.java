package chap5;
/*
 * 가변 배열 : 다차원 배열에서만 가능.
 *           첫번째 배열의 갯수만 설정하고 나머지값은 설정 하지 않음
 *           
 * System.out.printf() : 형식화 문자를 이용한 화면 출력 함수
 *           형식화 문자 : %d : 10진 정수
 *                      %3d : 3자리를 확보하여 10진 정수를 출력
 *                      %f  : 실수 출력
 *                      %10.2f : 10자리를 확보하고, 소숫점이하 2자리로 실수 출력 
 *                      %c  : 문자 한개 출력
 *                      %s  : 문자열 출력
 */
public class ArrayEx9 {
	public static void main(String[] args) {
		int arr[][] = new int[3][]; //가변배열로 설정
		arr[0] = new int[] {10,20};
		arr[1] = new int[] {30,40,50};
		arr[2] = new int[] {60};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.printf("arr[%d][%d]=%3d\t",i,j,arr[i][j]);
			}
			System.out.println();
		}
	}
}
