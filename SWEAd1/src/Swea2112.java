import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Swea2112 {
	/*
	 * 삼진트리 부분집합
	 * 각각의 층에서 약품을 넣거나, A약품을 넣거나, B약품을 넣는 방식으로 가면 됨.
	 * 끝까지 가면 check함수로 세개 연속된 값이 있는지 확인.
	 */
	static int D, W, K; //보호필름의 두께, 보호 필름의 가로크기, 합격기준
	static int[][] info; //보호 필름의 단면 정보
	static int[] visited; //방문처리 -1은 약품 처리 안함. 0은 A로 바꿈, 1은 B로 바꿈
	static int ans;
	static int[][] result;
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			ans = Integer.MAX_VALUE;
			D = sc.nextInt();
			W = sc.nextInt();
			K = sc.nextInt();
			info = new int[D][W];
			result = new int[D][W];
			visited = new int[D];
			for (int i = 0; i < D; i++) {
				for (int j = 0; j < W; j++) {
					info[i][j] = sc.nextInt();
				}
			}
			
			powerset(0,0);
			sb.append("#"+tc+" "+ans).append("\n");
		}
		bw.write(sb.toString());
		bw.flush();
	}
	private static void powerset(int cur,int change) {
		
		if(change>=ans) {
			return;
		}
		if(cur == D) {
			//끝까지 순회를 다 하고 나면 -1인건 변화하지않고 그대로, 0이면 모든 열을 0으로 , 1이면 모든 열을 1로
			for (int i = 0; i < visited.length; i++) {
				if(visited[i] == 0) {
					for (int j = 0; j < W; j++) {
						result[i][j] = 0;
					}
				}else if(visited[i]==1) {
					for (int j = 0; j < W; j++) {
						result[i][j] = 1;
					}
				}else {
					for (int j = 0; j < W; j++) {
						result[i][j] = info[i][j];
					}
				}
			}
			if(check()) {
				ans = Math.min(change, ans);
//				System.out.println("-----------------");
//				System.out.println(Arrays.toString(visited));
//				for (int i = 0; i < info.length; i++) {
//					for (int j = 0; j < info[i].length; j++) {
//						System.out.print(result[i][j]);
//					}
//					System.out.println();
//				}
			}
			return;
		}
		
		visited[cur] = 0;
		powerset(cur+1,change+1);
		
		visited[cur] = 1;
		powerset(cur+1,change+1);
		
		visited[cur] = -1;
		powerset(cur+1,change);
	}
	private static boolean check() {
		for (int i = 0; i < W; i++) {
			int count = 0;
			int maxcount = 0;
			for (int j = 1; j < D; j++) {
				if(result[j-1][i] == result[j][i]) {
					count++;
					maxcount = Math.max(maxcount, count);
				}else {
					maxcount = Math.max(maxcount, count);
					count=0;
				}
			}
			if(maxcount<K-1) {
				return false;
			}
		}
		return true;
	}
}
