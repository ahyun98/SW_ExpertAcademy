import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Swea1216 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		for (int tc = 1; tc <= 10; tc++) {
			int num = sc.nextInt();
			char[][] arr = new char[100][100];

			int id = 0;
			for (int i = 0; i < 100; i++) {
				String b = sc.next();
				arr[i] = b.toCharArray();
			}

			int len = 1;
			for (int i = 0; i < arr.length; i++) {
				for (int j = 1; j < arr.length - 1; j++) {
					int check = 1;
					if (arr[i][j - 1] == arr[i][j + 1]) {

						while (j - check >= 0 && j + check <= arr.length-1 && arr[i][j - (check)] == arr[i][j + (check)]) {
							++check;
						}
						len = Math.max(len, 2 * check - 1);

					} else if (arr[i][j - 1] == arr[i][j]) {
						while (j - 1 - check >= 0 && j + check <= arr.length - 1
								&& arr[i][j - 1 - (check)] == arr[i][j + (check)]) {
							++check;
						}
						len = Math.max(len, 2 * check);
					}
				}
			}

			for (int j = 0; j < arr.length; j++) {
				for (int i = 1; i < arr.length - 1; i++) {
					int check = 1;
					if (arr[i - 1][j] == arr[i + 1][j]) {

						while (i - check >= 0 && i + check <= arr.length-1 && arr[i - (check)][j] == arr[i + (check)][j]) {
							++check;
						}

						len = Math.max(len, 2 * check - 1);

					} else if (arr[i - 1][j] == arr[i][j]) {
						while (i - 1 - check >= 0 && i + check <= arr.length - 1
								&& arr[i - 1 - (check)][j] == arr[i + (check)][j]) {
							++check;
						}
						len = Math.max(len, 2 * check);
					}
				}
			}
			System.out.println("#"+tc+" "+len);
		}
	}

}
