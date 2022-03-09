import java.util.Scanner;

public class Solution_2072 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //입력 받아오는 함수
		int[] numarr = new int[10]; //int로 길이 10의 배열 만들기
		int sum = 0; 
		int num = 0;
		// numarr의 길이만큼 변수를 받아오기
		// 받아온 변수가 홀수일 경우 원래의 값에 num값 더하기
		for (int i=0;i<numarr.length; i++) { 
			num = sc.nextInt();
			if (num%2!=0) {
				sum = sum + num;
			}
		}
		System.out.println(sum);
	}
}
