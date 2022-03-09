import java.util.Scanner;

public class Swea1859 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int day = sc.nextInt();
			int[] priceList = new int[day];
			for (int i = 0; i < priceList.length; i++) {
				priceList[i] = sc.nextInt();
			}

			int endprice = priceList[day - 1];
			int purchase = 0;
			long profit = 0;
			int maxprice = 0;
			int purchasenum = 0;
			boolean flag = false;

			for (int i = 0; i < priceList.length; i++) {
				if (i == day - 1) {
					profit += priceList[i] * purchasenum - purchase;
				} else if (priceList[i] < endprice) {

					purchase += priceList[i];
					purchasenum++;

				} else if (priceList[i] > maxprice) {
					maxprice = priceList[i];
					for (int j = i + 1; j < priceList.length; j++) {
						if (maxprice < priceList[j]) {
							flag = true;
							break;
						}
					}
					if (flag) {purchase += priceList[i];
						purchasenum++;

						
					} else {profit += priceList[i] * purchasenum - purchase;

						purchase = 0;
						purchasenum = 0;
						
					}
					flag=false;
				}
				maxprice = 0;
			}
			System.out.println("#" + test_case + " " + profit);

		}
	}
}
