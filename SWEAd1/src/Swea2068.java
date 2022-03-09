
import java.util.Scanner;

public class Swea2068 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int remem;
		int iter = 1;

		for (int test_case = 1; test_case <= T; test_case++) {

			int sum = 0;
			int[] num = new int[10];
			for (int i = 0; i < num.length; i++) {
				num[i] = sc.nextInt();
			}

			// 정렬
			for (int i = 0; i < num.length - 1; i++) {
				for (int j = i + 1; j < num.length; j++) {
					if (num[i] > num[j]) {
						remem = num[i];
						num[i] = num[j];
						num[j] = remem;

					}
				}
			}

			System.out.println("#" + iter + " " +num[9]);
			iter++;
		}
	}
}
