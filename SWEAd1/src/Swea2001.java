import java.util.Scanner;

public class Swea2001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int max = Integer.MIN_VALUE;
			int[][] arr = new int[N][N];
			// 입력받아서 배열만들기
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			for (int i = 0; i < arr.length-M+1; i++) {
				for (int j = 0; j < arr.length-M+1; j++) {
					max = Math.max(max, square(arr,i,j,M));
				}
			}
			System.out.println("#"+tc+" "+max);

		}
	}

	public static int square(int[][] arr,int startrow, int startcol, int M) {
		int sum=0;
		for (int i = startrow; i < startrow+M; i++) {
			for (int j = startcol; j < startcol+M; j++) {
				sum+=arr[i][j];
			}
		}
		return sum;
	}
}
