import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int result=0;
		
		int[] scale = new int[8];
		
		for(int i=0; i<8; i++) {
			scale[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<7; i++) {
			if(scale[i]<scale[i+1]) {
				if(i>0) {
					if(scale[i-1]>scale[i]) {
						result = 3;
						break;
					}
					else
						result = 1;
				}
			}
			else if(scale[i]>scale[i+1]) {
				if(i>0) {
					if(scale[i-1]<scale[i]) {
						result = 3;
						break;
					}
					else
						result = 2;
				}
			}
			
		}
		switch(result) {
		case 1:
			System.out.println("ascending");
			break;
		case 2:
			System.out.println("descending");
			break;
		case 3:
			System.out.println("mixed");
			break;
		}
		
	}

}
