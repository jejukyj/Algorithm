import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int N;
	static int M;
	static int V;
	static boolean[][] adjMatrix;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt(); //정점의 개수 
		M = sc.nextInt(); //간선의 개수 
		V = sc.nextInt(); //정점의 번호 
		adjMatrix = new boolean[N+1][N+1];
		
		for(int i=1; i<=M; i++) { //간선이 연결하는 두 정점의 번호 
			int from = sc.nextInt();
			int to = sc.nextInt();
			adjMatrix[from][to] = adjMatrix[to][from] = true;
		}
		
		dfs(V, new boolean[N+1]);
		System.out.println();
		bfs();
		
		
		sc.close();
	}
	
	private static void dfs(int current, boolean[] visited) {
		visited[current] = true;
		System.out.print(current+" ");
		
		for(int i=1; i<=N; ++i) {
			if(adjMatrix[current][i] && !visited[i]) {
				dfs(i, visited);
			}
		}
	}

	private static void bfs() {
		Queue<Integer> q = new ArrayDeque<>();
		boolean visited[] = new boolean[N+1];
		
		int current=V;
		q.offer(current);
		
		visited[current] = true;
		
		while(!q.isEmpty()) {
			current = q.poll();
			
			System.out.print(current+" ");
			
			for(int i=1; i<=N; i++) {
				if(!visited[i] && adjMatrix[current][i]) {
					q.offer(i);
					visited[i] = true;
				}
			}
		}
	}

	

}
