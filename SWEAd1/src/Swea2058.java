import java.util.Scanner;

public class Swea2058 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String stnum = sc.next();
		int sum = 0;
		for(int i=0; i<stnum.length(); i++) {
			int num = ((int) stnum.charAt(i)) - 48;
			sum += num;
		}
		System.out.println(sum);
	}
}
