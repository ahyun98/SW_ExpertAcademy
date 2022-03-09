import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Swea1225_Q {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int tc = 1; tc <= 10; tc++) {
			Queue<Integer> Q = new LinkedList<Integer>();
			sc.nextInt();
			for (int i = 0; i < 8; i++) {				
				Q.offer(sc.nextInt());
			}
			int i = 1;
			
			while(Q.peek()>i) {
				Q.offer(Q.poll()-i);
				i=i%5+1;
			}
			Q.poll();
			Q.offer(0);
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < 8; j++) {
				sb.append(Q.poll()).append(" ");
			}
			System.out.print("#"+tc+" "+sb);
			System.out.println();
		}
	}
}
