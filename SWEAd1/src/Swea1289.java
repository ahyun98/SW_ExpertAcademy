import java.util.Scanner;

public class Swea1289 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for (int tc = 1; tc <= T; tc++) {
			int ans = 0;
			char[] word = sc.next().toCharArray();
			for (int i = 0; i < word.length; i++) {
				if(word[i]=='1') {
					for (int j = i; j < word.length; j++) {
						if(word[j]=='0') {
							word[j]='1';
						}else {
							word[j]='0';
						}
					}
					ans++;
				}
			}
			
			System.out.println("#"+tc+" "+ans);
		}
	}
}
