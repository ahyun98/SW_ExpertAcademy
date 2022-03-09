import java.util.Scanner;

public class Swea2050 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String alphabet = sc.next();
		for (int i = 0; i < alphabet.length(); i++) {
			System.out.print(alphabet.charAt(i)-64+" ");
		}
		
	}
}
