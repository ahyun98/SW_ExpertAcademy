import java.util.Scanner;

public class Swea1926 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			String str = String.valueOf(i);
			if (str.contains("3") || str.contains("6") || str.contains("9")) {
				for (int j = 0; j < str.length(); j++) {
					if (str.charAt(j) == '3' || str.charAt(j) == '6' || str.charAt(j) == '9')
						System.out.print("-");				
				}
				System.out.print(" ");
				
			} else {
				System.out.print(i + " ");
			}
		}
	}
}
