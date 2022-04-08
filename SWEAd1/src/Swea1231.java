import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Swea1231 {
	static char[] tree;
	static int size;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		for (int tc = 1; tc <= 10; tc++) {
			int N = Integer.parseInt(br.readLine());
			tree = new char[N+1];
			size = N;
			for (int i = 1; i <= N; i++) {
				st = new StringTokenizer(br.readLine());
				st.nextToken();
				String alphabet = st.nextToken();
				tree[i] = alphabet.charAt(0);
			}
			System.out.println();
			System.out.print("#"+tc+" ");
			inorder(1);
			System.out.println();
		}
	}
	
	public static void inorder(int here){
		if(here>size) return;
		int leftnode = here*2;
		int rightnode = here*2+1;
		inorder(leftnode);
		System.out.print(tree[here]);
		inorder(rightnode);
		
	}
}
