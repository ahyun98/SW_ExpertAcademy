import java.util.Scanner;

public class Swea1940 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int iter = sc.nextInt();
			int value = 0;
			int speed = 0;
			int result = 0;
			for (int i = 0; i < iter; i++) {
				int command = sc.nextInt();
				if (command == 1) {
					value = sc.nextInt();
					speed += value;
					result += speed;
				} else if (command == 2) {
					value = sc.nextInt();
					if (value > speed) {
						speed = 0;
					}
					if (speed > 0)
						speed -= value;
					result += speed;
				} else {
					result += speed;
				}

			}
			System.out.println("#" + test_case + " " + result);

		}
	}
}
