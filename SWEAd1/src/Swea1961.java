import java.util.Scanner;

public class Swea1961 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int[][] arr = new int[N][N];
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			StringBuilder sb = new StringBuilder();
			sb.append("#").append(tc).append("\n");
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					sb.append(arr[arr.length-1-j][i]);
					
				}
				sb.append(" ");
				for (int j = 0; j < arr.length; j++) {
					sb.append(arr[arr.length-1-i][arr.length-1-j]);
				}
				sb.append(" ");
				for (int j = 0; j < arr.length; j++) {
					sb.append(arr[j][arr.length-1-i]);
				}
				sb.append("\n");
			}
			System.out.println(sb);
			
			
		}
	}
}
