import java.util.Scanner;

public class Swea1247_2 {
	static int N;
	static int mind;
	static boolean[] visited;
	static int[][] loc;
	static int lastX;
	static int lastY;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			mind = Integer.MAX_VALUE;
			N = sc.nextInt();
			
			loc = new int[N][2]; //좌표
			visited = new boolean[N];
			
			int dx = sc.nextInt(); //회사 주소
			int dy = sc.nextInt();
			lastX = sc.nextInt();//집주소
			lastY = sc.nextInt();
			for (int i = 0; i < N; i++) {
				loc[i][0] = sc.nextInt();
				loc[i][1] = sc.nextInt();
			}
			
			permutation(0,dx,dy,0);
			
			System.out.println("#"+tc+" "+mind);
		}
	}
	static void permutation(int cur, int hx, int hy, int d) {
		if(d > mind) {
			return;
		}
		
		if(cur == N) {
			d += Math.abs(hx-lastX)+Math.abs(hy-lastY);
			mind = Math.min(mind, d);
			return;
		}
		
		for (int i = 0; i < N; i++) {
			if(visited[i]) continue;
			visited[i] = true;
			permutation(cur+1,loc[i][0],loc[i][1],d+Math.abs(hx-loc[i][0])+Math.abs(hy-loc[i][1]));
			visited[i] = false;
		}
	}
}
