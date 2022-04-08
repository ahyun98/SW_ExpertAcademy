import java.util.Scanner;

public class Swea1486 {
	/*
	 * 부분집합 구하기
	 * 
	 */
	static int n; //받아올 숫자의 개수
	static boolean visited[]; //방문처리할 배열
	static int ans; //답
	static int h; //만들어야 할 높이
	static int[] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			n = sc.nextInt();
			h = sc.nextInt();
			arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			ans = Integer.MAX_VALUE-2*h;
			powerset(0,0);
			System.out.println("#"+tc+" "+ans);
		}
	}
	public static void powerset(int cur, int sum) {
		//가지치기 , 이미 sum이 답인 탑의 높이보다 크다면 

		if(sum>=ans+h) {
			return;
		}
		
		if(cur == n) {
			if(sum>=h) {
				ans = Math.min(ans, sum-h);				
			}
			return;
		}
		
		powerset(cur+1,sum+arr[cur]);
		powerset(cur+1,sum);
	}
}
