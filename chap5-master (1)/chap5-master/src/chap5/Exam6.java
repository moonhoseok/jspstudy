package chap5;
/*
 [결과] 
  0
  0  0
  0  0  0
  0  0  0  0
  0  0  0  0  0
  0  0  0  0  0  0
  0  0  0  0  0  0  0
  0  0  0  0  0  0  0  0
  0  0  0  0  0  0  0  0  0
  0  0  0  0  0  0  0  0  0  0 
  
  */
public class Exam6 {
	public static void main(String[] args) {
		int[][] arr = new int[10][]; // 가변배열
		for(int i=0;i<arr.length;i++) {
			arr[i] = new int[i+1];
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
	}
}
