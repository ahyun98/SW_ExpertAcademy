import java.util.Scanner;

public class Swea2930_temp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for (int tc = 1; tc <= T; tc++) {
			sb.append("#").append(tc).append(" ");
			int N = sc.nextInt();
			int[] arr = new int[N+1];
			int cur = 1;
			
			for (int i = 0; i < N; i++) {
				int x = sc.nextInt();//1인지 2인지
				if (x==1) {
					int num = sc.nextInt();
					arr[cur]=num; //일단 숫자 넣음
					//비교
					int iter = cur;
					while(true) {
						if(iter>1 && arr[iter/2]<arr[iter]) {
							swap(arr,iter/2,iter);
							iter = iter/2;
						}else {
							break;
						}
					}
					cur++;
				}else {
					if(cur==1) {
						sb.append(-1).append(" ");
					}else {
						sb.append(arr[1]).append(" ");
						arr[1] = arr[--cur];
						int iter = 1;
						int child = iter*2;
						if( child + 1 < cur && arr[child] < arr[child+1])
				            child = child+1;
						while(true) {
							if(child < cur && arr[iter]<arr[child]) {
								swap(arr,iter,child);
								iter = child;
								child = iter * 2;
								if( child + 1 < cur && arr[child] < arr[child+1])
						            child = child+1;
							}else {
								break;
							}
						}
					}
				}
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
