import java.util.Scanner;

public class Swea1209 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int test_case = 1; test_case <= 10; test_case++) {
			int tc = sc.nextInt();
			int[][] arr = new int[100][100];
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			int sum = 0;
			int max = Integer.MIN_VALUE;
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					sum += arr[i][j];
				}
				max = Math.max(max, sum);
				sum = 0;
			}

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					sum += arr[j][i];
				}
				max = Math.max(max, sum);
				sum = 0;
			}

			for (int i = 0; i < arr.length; i++) {
				sum += arr[i][i];
			}
			max = Math.max(max, sum);
			sum = 0;

			for (int i = 0; i < arr.length; i++) {
				sum += arr[i][arr.length - i-1];
			}
			max = Math.max(max, sum);
			sum = 0;
			System.out.println("#"+test_case+" "+max);

		}
	}
}
