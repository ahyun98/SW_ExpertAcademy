import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Swea1226 {
	static int[][] map;
	static int ans = 0;
	static boolean[][] visited;
	static int[] dr = { 1, -1, 0, 0 };
	static int[] dc = { 0, 0, 1, -1 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		for (int tc = 1; tc <= 10; tc++) {
			ans = 0;
			int sr = 0;
			int sc = 0;
			Integer.parseInt(br.readLine());
			map = new int[16][16];
			visited = new boolean[16][16];
			// 집어넣고 시작 위치 저장
			for (int i = 0; i < map.length; i++) {
				String str = br.readLine();
				for (int j = 0; j < map.length; j++) {
					map[i][j] = str.charAt(j) - '0';
					if (map[i][j] == 2) {
						sr = i;
						sc = j;
					}
				}
			}
			dfs(sr, sc);
			System.out.println("#"+tc+" "+ans);

		}

	}

	public static void dfs(int r, int c) {
		visited[r][c] = true;

		if (map[r][c] == 3) {
			ans = 1;
			return;
		}

		for (int i = 0; i < dr.length; i++) {
			if (!visited[r+dr[i]][c+dc[i]] && map[r+dr[i]][c+dc[i]] != 1) {
				dfs(r+dr[i], c+dc[i]);
			}
		}
		return;

	}
}
