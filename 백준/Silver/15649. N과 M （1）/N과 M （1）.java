import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int M;
	static int[] su;
	static int[] answer;
	static boolean[] visited;

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		su = new int[N];
		answer = new int[M];
		visited = new boolean[N];
		
		for(int i=0; i<N; i++) {
			su[i] = i+1;
		}
		
		perm(0);
		
		
	}
	
	static void perm(int depth) {
		if(depth == M) { //M개를 뽑음 
			for(int val : answer) {
				System.out.print(val + " ");
			}
			System.out.println();
			return;
		}
		for(int i=0; i<N; i++) {
			if(!visited[i]) {
				answer[depth] = su[i];
				visited[i] = true;
				perm(depth+1);
				visited[i] = false;
			}
			
			
		}
	}

}
