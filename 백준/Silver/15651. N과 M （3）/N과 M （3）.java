import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int M;
	static int[] su;
	static int[] answer;
	static StringBuffer sb = new StringBuffer();

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		su = new int[N];
		answer = new int[M];
		
		for(int i=0; i<N; i++) {
			su[i] = i+1;
		}
		perm(0);
		
		System.out.println(sb.toString());
	}
	
	static void perm(int depth) {
		if(depth == M) { //M개를 뽑음 

			for(int i=0; i<M; i++)
				sb.append(answer[i]+" ");
			sb.append("\n");
					
			return;
		}
		for(int i=0; i<N; i++) {
				answer[depth] = su[i];
				perm(depth+1);
			}
	}
}
