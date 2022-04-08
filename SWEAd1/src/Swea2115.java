import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Swea2115 {

	static int n;
	static int m;
	static int C;
	static int[][] bee;
	static Honey first, second;

	static class Honey {
		int cost, r, c;

		public Honey(int cost, int r, int c) {
			this.cost = cost;
			this.r = r;
			this.c = c;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			C = Integer.parseInt(st.nextToken());
			bee = new int[n][n];

			for (int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < n; j++) {
					bee[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			first = new Honey(0, 0, 0);
			second = new Honey(0, 0, 0);

			for (int i = 0; i < bee.length; i++) {
				for (int j = 0; j < bee.length - m + 1; j++) {
					harvest(i, j);
				}
			}
			System.out.println("#" + tc + " " + (first.cost + second.cost));
		}
	}

	private static void harvest(int r, int c) {
		int maxCost = 0; // 이번차례에 벌통에 구한 최대값
		int[] tmp = new int[m];
		for (int i = 0; i < tmp.length; i++) {
			tmp[i] = bee[r][c + i];
		}
		for (int i = 0; i < (1 << m); i++) {
			int sumHoney = 0;
			int sumCost = 0;

			for (int j = 0; j < tmp.length; j++) {
				if ((i & 1 << j) != 0) {
					sumHoney += tmp[j];
					sumCost += tmp[j] * tmp[j];
				}
			}
//			System.out.println(sumCost);				
			if (sumHoney <= C) {
				maxCost = (maxCost<sumCost) ? sumCost : maxCost;
			}
		}

		if (maxCost > first.cost) {
			if (r == first.r && c < first.c + m) {
				first = new Honey(maxCost, r, c);
			} else {
				second = first;
				first = new Honey(maxCost, r, c);
			}
		} else if (maxCost > second.cost) {
			if (r != first.r || c >= first.c + m) {
				second = new Honey(maxCost, r, c);
			}
		}
//		System.out.println(first.cost+" "+second.cost);
	}
}
