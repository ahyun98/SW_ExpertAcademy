import java.util.Scanner;

public class Swea2056 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			String date = sc.next();
			int year = Integer.parseInt(date.substring(0, 4));
			int month = Integer.parseInt(date.substring(4, 6));
			int day = Integer.parseInt(date.substring(6, 8));

			int[] daylist = {31,28,31,30,31,30,31,31,30,31,30,31};
			
			if(month<1 || month>12)
				System.out.println("#"+test_case+" -1");
			else if(daylist[month-1]<day || day<1)
				System.out.println("#"+test_case+" -1");
			else
				System.out.println("#"+test_case+" "+date.substring(0, 4)+"/"+date.substring(4, 6)+"/"+date.substring(6, 8));
			
			
		}
	}
}
