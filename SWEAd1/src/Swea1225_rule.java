import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Swea1225_rule {
	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		for (int tc = 1; tc <= 10; tc++) {
			LinkedList<Integer> L = new LinkedList<Integer>();
			br.readLine();
			int[] arr = new int[8];
			int min = Integer.MAX_VALUE;
			st= new StringTokenizer(br.readLine());
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
				min = Math.min(min, arr[i]);
			}
			int iter;
			if (min > 15) {
				iter = (min % 15 == 0) ? min / 15 - 1 : min / 15;
				for (int i = 0; i < arr.length; i++) {
					L.add(arr[i] - (iter * 15));
				}
			}
			
			int i = 1;
			int start = 0;
			while(L.get(start)>i) {
				L.add(L.get(start)-i);
				i=i%5+1;
				start++;
			}
			L.add(0);
			sb.append("#").append(tc).append(" ");
			for (int j = L.size()-8; j < L.size(); j++) {
				sb.append(L.get(j)).append(" ");
			}
			sb.append("\n");


		}
		System.out.println(sb);
	}
}