import java.util.Scanner;

public class Swea1210 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int answer = 0;
		for (int test_case = 1; test_case <= 10; test_case++) {
			int iter = sc.nextInt();
			int[][] ladder = new int[100][100];
			int nr;
			int nc;

			for (int i = 0; i < ladder.length; i++) {
				for (int j = 0; j < ladder.length; j++) {
					ladder[i][j] = sc.nextInt();
				}
			}
			
			for (int k = 0; k < ladder.length; k++) {
				if (ladder[99][k] == 2) {
					nr = 99;
					nc = k;
					while (nr > 0) {
						if (nr + 0 >= 0 && nc + 1 >= 0 && nc + 1 < 100 && ladder[nr][nc + 1] == 1) {
							ladder[nr][nc] = 3;
							nr = nr;
							nc = nc + 1;
							answer = nc;
						} else if (nr + 0 >= 0 && nc - 1 >= 0 && ladder[nr][nc - 1] == 1) {
							ladder[nr][nc] = 3;
							nr = nr;
							nc = nc - 1;
							answer = nc;
						} else {
							ladder[nr][nc] = 3;
							nr = nr - 1;
							nc = nc;
							answer = nc;
						}
					}
				}
			}
			System.out.println("#" + test_case + " " + answer);
		}
	}
}
