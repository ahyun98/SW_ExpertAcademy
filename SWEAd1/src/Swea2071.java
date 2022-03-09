import java.util.Scanner;

public class Swea2071 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		int iter=1;
		for(int test_case = 1; test_case <= T; test_case++)
		{	
			int sum = 0;
			int[] arr = new int[10];
			for (int i = 0; i < arr.length; i++) {
				sum += sc.nextInt();
			}
			System.out.println("#" + iter + " " +Math.round((double) sum/10));
			iter++;

		}
	}
}
