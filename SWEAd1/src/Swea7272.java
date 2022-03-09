import java.util.Arrays;
import java.util.Scanner;

public class Swea7272 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			String ans = "SAME";
			char[] zero = {'C','E','F','G','H','I','J','K','L','M','N','S','T','U','V','W','X','Y','Z'};
			char[] one = {'A','D','O','P','Q','R'};
			char[] two = {'B'};
			char[] word1 = sc.next().toCharArray();
			char[] word2 = sc.next().toCharArray();
			if (word1.length!=word2.length) {
				ans = "DIFF";
			}else {
				for (int i = 0; i < word1.length; i++) {
					char ch = word1[i];
					char ch2 = word2[i];
					if(contain(ch,zero)) {
						if(!contain(ch2,zero)) {
							ans="DIFF";
							break;
						}
					}else if(contain(ch,one)) {
						if(!contain(ch2,one)) {
							ans="DIFF";
							break;
						}
					}else if(contain(ch,two)) {
						if(!contain(ch2,two)) {
							ans="DIFF";
							break;
						}
					}
				
				}
			}
			System.out.println("#"+tc+" "+ans);
			
		}
	}
	static boolean contain(char ch, char[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==ch) {
				return true;
			}
		}
		return false;
	}
}
