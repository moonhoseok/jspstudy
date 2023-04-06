package chap5;
/*
 * 2차원 배열의 생성과 초기화
 */
public class ArrayEx8 {
	public static void main(String[] args) {
		int[][] arr = {{10,20},{30,40},{50,60}};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print("arr["+i+"]["+j+"]="+arr[i][j]+",");
			}
			System.out.println();
		}
		//행의 합과 열의 합 출력하기
		//col : 컬럼의 합을 저장 배열. 모든 행의 열의 갯수가 같으므로 arr[0].length
		//      의 크기로 설정
		int[] col = new int[arr[0].length];
		for(int i=0;i<arr.length;i++) {
			int sum = 0;
			for(int j=0;j<arr[i].length;j++) {
				sum += arr[i][j]; //행의 합
				col[j] += arr[i][j];
			}
			System.out.println(i+"행의 합:"+sum);
		}
		for(int i=0;i<col.length;i++) {
			System.out.println(i+"열의 합:"+col[i]);
		}
	}
}
