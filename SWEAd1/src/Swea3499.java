import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Swea3499 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			Queue<String> Q1 = new LinkedList<>();
			Queue<String> Q2 = new LinkedList<>();
			int mid = (N%2 ==0) ? N/2 : (N+1)/2;
			
			for (int i = 0; i < mid; i++) {
				Q1.add(sc.next());
			}
			for (int i = mid; i < N; i++) {
				Q2.add(sc.next());
			}
			StringBuilder sb = new StringBuilder();
			while(!Q1.isEmpty()) {
				if(Q2.isEmpty()) {
					sb.append(Q1.poll()).append(" ");
					break;
				}
				sb.append(Q1.poll()).append(" ").append(Q2.poll()).append(" ");
			}
			
			System.out.println("#"+tc+" "+sb);
		}
	}
}
