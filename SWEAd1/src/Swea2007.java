import java.util.Scanner;

public class Swea2007 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			char[] word = sc.next().toCharArray();
			int ans = 0;
			int cnt=0;
			out : for (int i = 0; i < word.length/2+1; i++) {
				int repeatend = i;
				String check="";
				for (int j = 0; j < repeatend; j++) {
					check +=word[j];
				}
				System.out.println(check);
				for (int j = 0; j < word.length-repeatend-1; j++) {
					
					
				}
			}
			System.out.println("#"+tc+" "+(ans+1));
		} 
	}
}
