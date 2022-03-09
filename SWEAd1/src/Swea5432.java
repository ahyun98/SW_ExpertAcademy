import java.util.Scanner;

public class Swea5432 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int answer = 0;
			int open = 0;
			int close = 0;
			String problem = sc.next();
			for (int j = 0; j < problem.length(); j++) {
				if(problem.charAt(j)==40 && problem.charAt(j+1)==41) {					
					answer+=(open-close);
//					System.out.println("현재 answer: "+answer);
					close--;
				}else if(problem.charAt(j)==40) {
					answer++;
					open++;
//					System.out.println("현재 open: "+open);
				}else if(problem.charAt(j)==41) {
					close++;
//					System.out.println("현재 close: "+close);
				}
			}
			System.out.println("#"+tc+" "+answer);
			
		}
	}
}
