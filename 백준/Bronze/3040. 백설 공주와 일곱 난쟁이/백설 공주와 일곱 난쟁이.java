import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int N = 9;
	static int M = 7;
	static int[] num = new int[9];
	static int[] ans = new int[7];
	static boolean[] visited = new boolean[9];
	static int sum=0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<9; i++) {
			num[i] = sc.nextInt();
		}
		
		combi(0,0);
		
	}

	private static void combi(int depth, int start) {
		if(depth==7) {
			for(int i=0; i<7; i++) {
				sum+=ans[i];
			}
			if(sum == 100) {
				for(int val : ans)
					System.out.println(val);
			}
			sum=0;
			return;
			
		}
		for(int i=start; i<9; i++) {
			ans[depth]=num[i];
			combi(depth+1, i+1);
		}
	}


}
