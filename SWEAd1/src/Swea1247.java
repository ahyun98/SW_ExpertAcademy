import java.util.Arrays;
import java.util.Scanner;

public class Swea1247 {
	static int[][] loc;
	static int[] result;
	static boolean[] visited;
	static int mind;
	static int N;
	static int dx;
	static int dy;
	static int hx;
	static int hy;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			mind = Integer.MAX_VALUE;
			N = sc.nextInt(); //고객의 수
			loc = new int[N][2]; //좌표
			visited = new boolean[N];
			result = new int[N];
			
			dx = sc.nextInt(); //회사 주소
			dy = sc.nextInt();
			hx = sc.nextInt();//집주소
			hy = sc.nextInt();
			for (int i = 0; i < N; i++) {
				loc[i][0] = sc.nextInt();
				loc[i][1] = sc.nextInt();
			}
			
			permutation(0);
			
			System.out.println("#"+tc+" "+mind);
		}
	}
	static void permutation(int cur) {
		if(cur == N) {
			int d = 0;
			d = Math.abs(dx-loc[result[0]][0])+Math.abs(dy-loc[result[0]][1]);
			for (int i = 0; i < N-1; i++) {
				int orX = loc[result[i]][0];
				int orY = loc[result[i]][1];
				int newX = loc[result[i+1]][0];
				int newY = loc[result[i+1]][1];
				d+=Math.abs(newX-orX)+Math.abs(newY-orY);
			}
			d+=Math.abs(hx-loc[result[N-1]][0])+Math.abs(hy-loc[result[N-1]][1]);
			System.out.println(d);
			mind = Math.min(mind, d);
			return;
		}
		
		for (int i = 0; i < N; i++) {
			if(visited[i]) continue;
			result[cur] = i;
			visited[i] = true;
			permutation(cur+1);
			visited[i] =false;
		}
	}
}
