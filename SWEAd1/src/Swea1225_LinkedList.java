import java.util.LinkedList;
import java.util.Scanner;

public class Swea1225_LinkedList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int tc = 1; tc <= 10; tc++) {
			LinkedList<Integer> L = new LinkedList<Integer>();
			sc.nextInt();
			for (int i = 0; i < 8; i++) {				
				L.add(sc.nextInt());
			}
			int i = 1;
			int start = 0;
			while(L.get(start)>i) {
				L.add(L.get(start)-i);
				i=i%5+1;
				start++;
			}
			L.add(0);
			StringBuilder sb = new StringBuilder();
			for (int j = L.size()-8; j < L.size(); j++) {
				sb.append(L.get(j)).append(" ");
			}
			System.out.print("#"+tc+" "+sb);
			System.out.println();
		}
	}
}