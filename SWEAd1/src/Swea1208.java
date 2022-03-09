import java.util.Scanner;

public class Swea1208 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int test_case = 1; test_case <= 10; test_case++) {
			int[] box = new int[100];
			int[] count = new int[101];
			int dump = sc.nextInt();
			int max = 100;
			int min = 1;
			for (int i = 0; i < box.length; i++) {
				box[i] = sc.nextInt();
			}

			// 빈도수 확인
			for (int i = 0; i < box.length; i++) {
				count[box[i]]++;
			}
			while (dump != 0) {
				if (count[max] != 0) {
					if (count[min] == 0) {
						min++;
						
					} else {
						count[max]--;
						count[max - 1]++;
						count[min]--;
						count[min + 1]++;
						dump--;
					}
				} else {
					max--;
				}
				
			}
			if(count[max]==0) max--;
			if(count[min]==0) min++;
			System.out.println("#"+test_case+" "+(max-min));


		}
	}

}
