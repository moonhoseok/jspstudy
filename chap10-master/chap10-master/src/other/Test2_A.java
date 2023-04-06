package other;

import java.util.Scanner;

/*
국어, 영어, 수학, 물리, 화학, 사회, 컴퓨터 점수를  입력받은 후, 총점, 평균을 구하고 이들 모두에 대한 
막대그래프를 아래 조건에 맞게 그릴 수 있는 프로그램을 작성하시오.
(1) 국어, 영어, 수학, 물리, 화학, 사회, 컴퓨터 점수를 점수를 입력받은 후, 
   이에 대한 총점, 평균, 최대 점수, 최소 점수를 구한다. 
(2) 평균은 정수로 출력해야하며, 소수점은 모두 버린다. 
(3) 위에서 구한 점수들을 출력 후에는 이들 값을 기준으로모두 막대그래프로 표현한다.
과목별 점수와, 평균, 최대점수, 최소점수가 그래프를 그려야할 대상이며 막대그래프는 10 점 당 '*' 하나로 
대표하며, 10 의 단위이하의 자리숫자는 고려하지 않는다. 

[결과]
국어 영어 수학 물리 화학 사회 컴퓨터 점수를(1 - 100) 입력하세요
70 80 90 100 80 75 60

총합 :555
평균 :79
최대 :100
최소 :60

100	 	 	 	*	 	 	 	*	 	 
 90	 	 	*	*	 	 	 	*	 	 
 80	 	*	*	*	*	 	 	*	 	 
 70	*	*	*	*	*	*	 	*	 	*
 60	*	*	*	*	*	*	*	*	*	*
 50	*	*	*	*	*	*	*	*	*	*
 40	*	*	*	*	*	*	*	*	*	*
 30	*	*	*	*	*	*	*	*	*	*
 20	*	*	*	*	*	*	*	*	*	*
 10	*	*	*	*	*	*	*	*	*	*
	국어	영어	수학	물리	화학	사회	컴퓨터	최대	최소	평균	

*/
public class Test2_A {
	public static void main(String[] args) {
		int score[] = new int[10];
		String subject[] = {"국어", "영어", "수학", "물리", 
				"화학", "사회", "컴퓨터","최대","최소","평균"};
		int sum = 0, max = 0, min = 100, avg = 0;
		Scanner scan = new Scanner(System.in);

		System.out.println("국어 영어 수학 물리 화학 사회 컴퓨터 점수를(1 - 100) 입력하세요");
		for (int i = 0; i < score.length - 3; i++) {
			score[i] = scan.nextInt();
		}
		for (int i = 0; i < score.length - 3; i++) {
			sum += score[i];
			if (max < score[i])
				max = score[i];// 최대값
			if (min > score[i]) {
				min = score[i];// 최소값
			}
		}
		System.out.println();
		System.out.println("총합 :" + sum);
		System.out.println("평균 :" + sum / 7);
		System.out.println("최대 :" + max);
		System.out.println("최소 :" + min);
		System.out.println();
		score[9] = sum / 7;
		score[7] = max;
		score[8] = min;
		// 그래프 출력
		char[][] graph = new char[10][10];
		for (int i = 0; i < graph.length; i++) {
			for (int j = 0; j < graph[i].length; j++) {
				int s = score[j] / 10;
				if (i < s)
					graph[i][j] = '*';
				else
					graph[i][j] = ' ';
			}
		}

		for (int i = graph.length - 1; i >= 0; i--) {
			if (i == (graph.length - 1))
				System.out.printf("100");
			else
				System.out.print(" "+(char) ((i + 1) + '0')+"0");
			for (int j = 0; j < graph[i].length; j++) {
				System.out.printf("%6c",graph[i][j]);
			}
			System.out.println();
		}
		System.out.printf("%3s"," ");
		for (int i = 0; i < score.length; i++) {
			System.out.printf("%6s",subject[i]);			
		}
		System.out.println();
	}
}
