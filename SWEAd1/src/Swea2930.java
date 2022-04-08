import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Swea2930 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for (int tc = 1; tc <= T; tc++) {
			PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
			sb.append("#").append(tc).append(" ");
			int N = sc.nextInt();
			for (int i = 0; i < N; i++) {
				int x = sc.nextInt();
				if (x==1) {
					int num = sc.nextInt();
					pq.add(num);
				} else {
					if(pq.isEmpty()) {
						sb.append(-1).append(" ");						
					}else {						
						sb.append(pq.poll()).append(" ");
					}
				}
			}
		}
		sb.append("\n");
		System.out.print(sb);
	}
}
