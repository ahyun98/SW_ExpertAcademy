import java.util.Scanner;

public class Swea2005 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] pascal = new int[10][10];
		int T = sc.nextInt();
		for (int i = 0; i < pascal.length; i++) {
			for (int j = 0; j < pascal.length; j++) {
				if(j==i || j==0) {
					pascal[i][j]=1;
				}else if(j<=i){
					pascal[i][j] = pascal[i-1][j-1]+pascal[i-1][j];
				}
			}
		}
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int iter = 1;
			System.out.println("#"+tc);
			for (int i = 0; i < N; i++) {
				for (int j = 0; j <= i; j++) {
					System.out.print(pascal[i][j]+" ");
				}
				System.out.println();
			}
		}
	}
}
