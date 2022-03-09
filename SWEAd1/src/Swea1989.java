import java.util.Scanner;

public class Swea1989 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			String word = sc.next();
			int half = word.length()/2;
			int flag = 1;
			for (int j = 0; j < half; j++) {
				if(word.charAt(j)!=word.charAt(word.length()-1-j)) {
					flag=0;
				}
			}
			System.out.println("#"+tc+" "+flag);
		}
	}
}
