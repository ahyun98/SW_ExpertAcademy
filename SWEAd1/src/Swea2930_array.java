import java.util.Scanner;

public class Swea2930_array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for (int tc = 1; tc <= T; tc++) {
			sb.append("#").append(tc).append(" ");
			int N = sc.nextInt();
			int[] arr = new int[N+1];
			int cur = 1;
			int startid = 1;
			for (int i = 0; i < N; i++) {
				int x = sc.nextInt();//1인지 2인지
				if (x==1) {
					int num = sc.nextInt();
					arr[cur]=num; //일단 숫자 넣음
					//비교
					int iter = cur;
					while(true) {
						if(iter>startid && arr[iter/2]<arr[iter]) {
							swap(arr,iter/2,iter);
							iter = iter/2;
						}else {
							break;
						}
					}
					if(cur>1 && arr[cur]%2==1 && arr[cur-1]<arr[cur]) {
						swap(arr,cur-1,cur);
					}
					cur++;
				}else {
					if(arr[startid]==0) {
						sb.append(-1).append(" ");
					}else {
						sb.append(arr[startid]).append(" ");
						arr[startid]=0;
						startid++;					
					}
				}
				for (int j : arr) {
					System.out.print(j+" ");
				}
				System.out.println();
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
	
	public static void swap(int[] arr, int i , int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j]= tmp;
	}
}
