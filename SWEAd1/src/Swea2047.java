import java.util.Scanner;

public class Swea2047 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String alphabet = sc.next();
		int Upper;
		for (int i = 0; i < alphabet.length(); i++) {
			if(97<=alphabet.charAt(i) && alphabet.charAt(i)<=122) {
				Upper = alphabet.charAt(i)-32;
				System.out.print((char) Upper);
			}
				 
			else
				System.out.print(alphabet.charAt(i));
		}
		
	}
}

