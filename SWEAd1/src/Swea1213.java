import java.util.Scanner;

public class Swea1213 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int test_case = 1; test_case <= 10; test_case++) {
			int tc = sc.nextInt();
			int answer = 0;
			String search = sc.next();
			String orword = sc.next();
			for (int i = 0; i < orword.length()-search.length()+1; i++) {
				if (search.charAt(0) == orword.charAt(i)) {
					for (int j = 1; j < search.length(); j++) {
						if (search.charAt(j) != orword.charAt(i + j)) {
							answer--;
							break;
							
						}	
					}
					answer++;
				}
				
			}
			System.out.println("#"+test_case+" "+answer);
		}
	}
}
