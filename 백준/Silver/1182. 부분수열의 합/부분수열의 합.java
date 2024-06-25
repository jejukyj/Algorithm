import java.util.Scanner;

public class Main {
	static int N;
	static int S;
	static int[] nArr;
	static boolean[] visited;
	static int cnt=0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt(); //정수의 개수 
		S = sc.nextInt(); //합 
		
		nArr = new int[N];
		for(int i=0; i<N; i++) {
			nArr[i] = sc.nextInt();
		}
		visited = new boolean[N];
		
		subset(0);

		
		System.out.println(cnt);
		
		sc.close();
	}

	private static void subset(int depth) {
		int flag=0;

		if(depth == N) {
			int sum=0;
			for(int i=0; i<N; i++) {
				if(visited[i]) {
					flag=1;

					sum += nArr[i];
				}
			}
			if(flag == 1 && sum == S)
				cnt++;

			return;
		}
		visited[depth] = false;
		subset(depth+1);
		visited[depth] = true;
		subset(depth+1);
	}


}
