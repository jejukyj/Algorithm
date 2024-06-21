import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int N;
	static int M;
	static int[] card;
	static int[] num = new int[3];;
	static int sum=0;
	static int max=0;
	static boolean[] visited;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt(); //카드의 개수 
		M = sc.nextInt(); //마지노선 
		card = new int[N];
		visited = new boolean[N];
		
		for(int i=0; i<N; i++) { //카드에 쓰여있는 수 
			card[i] = sc.nextInt();
		}
		
		perm(0);
		
		System.out.println(max);
		
		
	}

	private static void perm(int depth) {
		if(depth == 3) {
//			System.out.println(Arrays.toString(num));
			for(int i=0; i<3; i++) {
				sum+= num[i];
			}
			if(sum<=M && sum>max) //M을 넘지 않으면서 값이 최대일 것 
				max=sum;
			
			sum=0;

			return;
		}
		for(int i=0; i<N; i++) {
			if(!visited[i]) {
				num[depth] = card[i];
				visited[i] = true;
				perm(depth+1);
				visited[i] = false;
			}
		}
	}
	
	

}
