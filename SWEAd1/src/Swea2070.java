import java.util.Scanner;

public class Swea2070 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int iter=1;
		for(int test_case = 1; test_case <= T; test_case++)
		{	
			String a;
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			if(num1>num2)
				a = ">";
			else if(num1<num2)
				a = "<";
			else
				a = "=";
			
			System.out.println("#" + iter + " " +a);
			iter++;
		}
	}
}
