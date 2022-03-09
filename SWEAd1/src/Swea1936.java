import java.util.Scanner;

public class Swea1936 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a>b && a-b==1) {
			System.out.println("A");
		}else if(a==1 && b==3) {
			System.out.println("A");
		}else {
			System.out.println("B");
		}
	}
}
