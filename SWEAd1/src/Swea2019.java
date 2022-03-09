import java.util.Scanner;

public class Swea2019 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int start = 1;
		for(int i=0; i<=num; i++) {
			System.out.print(start+" ");
			start*=2;
		}
		
	}
}
