import java.util.Scanner;

public class Swea2805 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int profit = 0;
			int N = sc.nextInt();
			int[][] field = new int[N][N];
			

			// 필드 채우기
			for (int k = 0; k < N; k++) {
				String a = sc.next();
				for (int j = 0; j < N; j++) {
					field[k][j] = a.charAt(j)-48;
				}

			}

			int center = (N - 1) / 2;
			for (int i = 0; i < N; i++) {
				int num = i;
				if (num > center)
					num = N - num-1;
				for (int j = num*-1; j < num + 1; j++) {
					profit += field[i][center + j];
				}
			}

			System.out.println("#" + tc + " " + profit);
		}
	}
}
