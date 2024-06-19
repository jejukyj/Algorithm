
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //수의 개수 
		int M = sc.nextInt(); //합을 구해야하는 횟수 
		int[] arr = new int[N+1]; 
		int[] sumArr = new int[N+1]; //누적합 배열 
		int sum=0;
		
		for(int i=1; i<=N; i++) {
			arr[i] = sc.nextInt(); //N개의 수 
			
			sumArr[i] = sumArr[i-1]+arr[i]; //누적합 구하기 
		}
		
		for(int k=0; k<M; k++) { //구간 
			int i = sc.nextInt(); //i부터 
			int j = sc.nextInt(); //j까지 
			
			System.out.println(sumArr[j]-sumArr[i-1]);
			
		}

	}

}
