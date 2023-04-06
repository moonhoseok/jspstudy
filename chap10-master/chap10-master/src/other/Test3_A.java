package other;

/*
 * 11*11 크기의 사각형이 있다고 가정할때 다음 결과를 출력되도록 프로그램 작성하기

X         X
 X       X 
  X     X  
   X   X   
    X X    
     X     
    X X    
   X   X   
  X     X  
 X       X 
X         X
 
*/
public class Test3_A {
	public static void main(String[] args) {
		Object obj;
		obj.finalize();
		char[][] arr = new char[11][11];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i + j == 10)
					arr[i][j] = 'X';
				else if (i == j)
					arr[i][j] = 'X';
				else
					arr[i][j] = ' ';
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
