import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //동전의 종류 
		int K = sc.nextInt(); //가치의 합 
		int[] A = new int[N];
		int cnt=0;
		
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt(); //동전의 가치 
		}
		
		
		for(int i=N-1; i>=0; i--) {
			if(A[i]>K) {
				continue;
			}

			else {
				if(K==0)
					break;
				cnt += K/A[i];
				K = K%A[i];
			}
		}
		
		System.out.println(cnt);
		
		sc.close();
	}
	
}
