import java.util.Arrays;
import java.util.Scanner;

public class Swea6808 {
	static boolean[] visited = new boolean[19];//방문처리할 배열
	static int[] gcard = new int[9];
	static int[] result = new int[9];
	static int gscore = 0;
	static int iscore = 0;
	static int ans1 = 0;
	static int ans2 = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			ans1 = 0;
			ans2 = 0;
			visited = new boolean[19];
			for (int i = 0; i < 9; i++) {
				int a = sc.nextInt();
				gcard[i] = a;
				visited[a] = true;
			}
			
			permutation(0);
			System.out.println("#"+tc+" "+ans1+" "+ans2);
			
		}
	}
	static void permutation(int cur) {
		if(cur == 9) {
			gscore = 0;
			iscore = 0 ;
			for (int i = 0; i < 9; i++) {
				if(gcard[i]>result[i]) {
					gscore = gscore+gcard[i]+result[i];
				}else {
					iscore = iscore+gcard[i]+result[i];
				}
			}
			if(gscore>iscore) {
				ans1++;
			}else {
				ans2++;
			}
			return;
		}
		
		for (int i = 1; i <=18; i++) {
			if(visited[i]) continue;
			result[cur] = i;
			visited[i] = true;
			permutation(cur+1);
			visited[i] = false;
		}
	}
}
