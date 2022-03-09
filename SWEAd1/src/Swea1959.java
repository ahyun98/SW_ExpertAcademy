import java.util.Scanner;

public class Swea1959 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int max = Integer.MIN_VALUE;
			int N = sc.nextInt();
			int M = sc.nextInt();
			int[] arrN = new int[N];
			int[] arrM = new int[M];

			for (int i = 0; i < arrN.length; i++) {
				arrN[i] = sc.nextInt();
			}
			for (int i = 0; i < arrM.length; i++) {
				arrM[i] = sc.nextInt();
			}
			int minLen = (N > M) ? M : N;

			for (int i = 0; i < Math.abs(N-M)+1; i++) {
				int sum = 0;
				for (int j = 0; j < minLen; j++) {
					if (N < M)
						sum += arrN[j] * arrM[i + j];
					else 
						sum += arrN[i+j] * arrM[j];
				}
				if(max<sum)
					max = sum;
			}
			System.out.println("#"+test_case+" "+max);
		}
	}
}
