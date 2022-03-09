import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Swea1228 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int tc = 1; tc <= 10; tc++) {
			List<Integer> arr = new LinkedList<>();
			int ornum = sc.nextInt();
			for (int i = 0; i < ornum; i++) {
				arr.add(sc.nextInt());
			}
			int commandNum = sc.nextInt();
			for (int i = 0; i < commandNum; i++) {
				sc.next();
				int idx = sc.nextInt();
				int insertnum = sc.nextInt();
				for (int j = 0; j < insertnum; j++) {
					arr.add(idx, sc.nextInt());
					idx++;
				}
			}
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < 10; i++) {
				sb.append(arr.get(i)).append(" ");
			}
			System.out.println("#"+tc+" "+sb);
		}
	}
}
