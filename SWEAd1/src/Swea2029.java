import java.util.Scanner;

public class Swea2029 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case=1; test_case<=T; test_case++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			System.out.println("#"+test_case+" "+num1/num2+" "+num1%num2);
		}
	}
}
