import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class Swea1983 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int num = sc.nextInt();
			int stnum = sc.nextInt();
			int max = 0;
			int id = 0;
			ArrayList<Integer> list = new ArrayList<>();
			Map<Double, Integer> scoremap = new TreeMap<>();
			String[] scorearr = new String[num];
			for(int i=0; i<num/10; i++) {
				scorearr[i] = "D0";
				scorearr[i+num/10] = "C-";
				scorearr[i+num*2/10] = "C0";
				scorearr[i+num*3/10] = "C+";
				scorearr[i+num*4/10] = "B-";
				scorearr[i+num*5/10] = "B0";
				scorearr[i+num*6/10] = "B+";
				scorearr[i+num*7/10] = "A-";
				scorearr[i+num*8/10] = "A0";
				scorearr[i+num*9/10] = "A+";
			}
			
			
			for (int i = 0; i < num; i++) {
				double score1 = sc.nextInt();
				double score2 = sc.nextInt();
				double score3 = sc.nextInt();
				scoremap.put(score1 * 0.35 + score2 * 0.45 + score3 * 0.2,i);
			}
			for (Double st : scoremap.keySet()) {
				list.add(scoremap.get(st));
			}
			
			System.out.println("#"+test_case+" "+scorearr[list.indexOf(stnum-1)]);
			
		}
	}
}
