import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		int ABC = A*B*C;
		int[] cnt = new int[10];
		
		while(ABC > 0) {
			switch(ABC%10) {
			case 0: cnt[0]++; break;
			case 1: cnt[1]++; break;
			case 2: cnt[2]++; break;
			case 3: cnt[3]++; break;
			case 4: cnt[4]++; break;
			case 5: cnt[5]++; break;
			case 6: cnt[6]++; break;
			case 7: cnt[7]++; break;
			case 8: cnt[8]++; break;
			case 9: cnt[9]++; break;
			
			}
			ABC/=10;
		}
		for(int i=0; i<10; i++)
			System.out.println(cnt[i]);
		
	}

}
