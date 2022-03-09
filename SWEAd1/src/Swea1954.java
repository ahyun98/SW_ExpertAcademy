import java.util.Scanner;

public class Swea1954 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int num = sc.nextInt();
			int[][] numarr = new int[num][num];
			int a = 1;

			for (int i = 0; i < num; i++) {
				int j = 0;
				while (j < num) {
					if (numarr[i][j] == 0) {
						numarr[i][j++] = a++;
					} else {
						j++;
					}
				}
				j = 0;
				while (j < num) {
					if (numarr[j][num - i - 1] == 0) {
						numarr[j++][num - i - 1] = a++;
					} else {
						j++;
					}

				}
				j--;
				while (j >= 0) {
					if (numarr[num - i - 1][j] == 0) {
						numarr[num - i - 1][j--] = a++;
					} else {
						j--;
					}
				}
				j = num - 1;
				while (j >= 0) {
					if (numarr[j][i] == 0) {
						numarr[j--][i] = a++;
					} else {
						j--;
					}
				}
			}
			System.out.println("#"+tc);
			for (int i = 0; i < numarr.length; i++) {
				for (int j = 0; j < numarr.length; j++) {
					System.out.print(numarr[i][j]+" ");
				}
				System.out.println();
			}

		}
	}
}
