import java.util.Scanner;

public class Swea2063 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double N = sc.nextInt();
		int remem;
		int sum = 0;
		
		int[] num = new int[(int)N];
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
		System.out.println(num[(int) Math.round(N/2)-1]);

	}
}
