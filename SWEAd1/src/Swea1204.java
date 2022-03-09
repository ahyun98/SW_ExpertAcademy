import java.util.Scanner;

public class Swea1204 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int iter= sc.nextInt();
			int[] cnt = new int[1000];
			for (int i = 0; i < cnt.length; i++) {
				int num = sc.nextInt();
				cnt[num]++;
			}
			int max = 0;
			int max_id = 0;
			for (int i = 0; i < cnt.length; i++) {
				if(max <= cnt[i]) {
					max = cnt[i];
					max_id = i;
				}
			}
			
			System.out.println("#" + iter + " " +max_id);
			
		}
		
	}
}
