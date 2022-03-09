import java.util.Scanner;

public class Swea11315 {
	static char[][] checkerboard;
	static boolean omok;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			omok = false;

			int N = sc.nextInt();
			checkerboard = new char[N][N];
			String ans = "NO";

			for (int i = 0; i < checkerboard.length; i++) {
				String word = sc.next();
				for (int j = 0; j < checkerboard.length; j++) {
					checkerboard[i][j] = word.charAt(j);
				}
			}


			for (int i = 0; i < checkerboard.length; i++) {
				for (int j = 0; j < checkerboard.length; j++) {
					if (checkerboard[i][j] == 'o') {
						check(i, j);
						if (omok) {
							ans = "YES";
						}
					}
				}
			}
			System.out.println("#" + tc + " " + ans);
		}
	}

	static void check(int r, int c) {
		int iter = 1;
		for (int i = 1; i < 5; i++) {
			if (r + i < checkerboard.length && checkerboard[r + i][c] == 'o') {
				iter++;

			}
			if (iter == 5) {
				omok = true;

			}
		}
		iter = 1;
		for (int i = 1; i < 5; i++) {

			if (c + i < checkerboard.length && checkerboard[r][c + i] == 'o') {
				iter++;
			}
			if (iter == 5) {
				omok = true;

			}
		}
		iter = 1;
		for (int i = 1; i < 5; i++) {

			if (r + i < checkerboard.length && c + i < checkerboard.length && checkerboard[r + i][c + i] == 'o') {
				iter++;
			}
			if (iter == 5) {
				omok = true;

			}
		}
		iter = 1;
		for (int i = 1; i < 5; i++) {

			if (r + i < checkerboard.length && c - i >= 0 && checkerboard[r + i][c - i] == 'o') {
				iter++;
			}
			if (iter == 5) {
				omok = true;

			}
		}

	}

}
