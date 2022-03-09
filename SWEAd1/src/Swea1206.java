import java.util.Scanner;

public class Swea1206 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int iter = 1;
		for (int test_case = 1; test_case <= 10; test_case++) {
			int length = sc.nextInt();
			int[] arr = new int[length];
			int sum = 0;
			int num = 0;
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}

			// 정렬
			for (int i = 2; i < arr.length - 2; i++) {

				if (Math.max(arr[i - 2],
						Math.max(arr[i - 1], Math.max(arr[i], Math.max(arr[i + 1], arr[i + 2])))) == arr[i]) {
					num += arr[i] - Math.max(arr[i - 2], Math.max(arr[i - 1], Math.max(arr[i + 1], arr[i + 2])));
				}

			}
			System.out.println("#" + iter + " " + num);
			iter++;
		}
	}
}
