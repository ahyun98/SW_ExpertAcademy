import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Swea1952 {
	static int d, m1, m3, y;
	static int[] month;
	static int minCost;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			d = Integer.parseInt(st.nextToken());
			m1 = Integer.parseInt(st.nextToken());
			m3 = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			month = new int[13];
			st = new StringTokenizer(br.readLine());
			for (int i = 1; i < 13; i++) {
				month[i] = Integer.parseInt(st.nextToken());
			}
			
			minCost = y;
			
			calc(1,0);
			
			System.out.println("#"+tc+" "+minCost);
		}	
	}
	private static void calc(int m, int cost) {
		if(m >= 13) {
			minCost = Math.min(minCost, cost);
			return;
		}
		calc(m+1, cost+month[m]*d);
		
		calc(m+1, cost+m1);
		
		calc(m+3, cost+m3);
	}
}
