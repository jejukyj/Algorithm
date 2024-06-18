import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringTokenizer tokens = new StringTokenizer(str, " ");
		
		int s = Integer.parseInt(tokens.nextToken());  //임의로 만든 DNA 문자열 길이
		int p = Integer.parseInt(tokens.nextToken());  //부분문자열의 길이
		String dna = br.readLine(); //임의로 만든 DNA 문자열
		
		int result = 0;
		int aCnt=0, cCnt=0, gCnt=0, tCnt=0;
		
		String n = br.readLine(); //나의 배열 
		StringTokenizer tokens2 = new StringTokenizer(n, " ");
		
		int startIdx=0, endIdx=p;
		int num[] = new int[4]; //충족시켜야하는 개수 
		for(int i=0; i<4; i++) {
			num[i] = Integer.parseInt(tokens2.nextToken());
		}
		
		for(int i=0; i<p; i++) { //슬라이딩윈도우 처음 상태 
			if(dna.charAt(i) == 'A') aCnt++;
			else if(dna.charAt(i) == 'C') cCnt++;
			else if(dna.charAt(i) == 'G') gCnt++;
			else if(dna.charAt(i) == 'T') tCnt++;
		}
		
		if(aCnt >= num[0] && cCnt >= num[1] && gCnt >= num[2] && tCnt >= num[3])
			result++;
		
		//슬라이딩윈도우 이동 
		for(int i=p; i<s; i++) { // i는 슬라이딩 윈도우 가장 끝 부분
			int j = i-p; // j는 슬라이딩 윈도우 가장 앞부분
			if(dna.charAt(i) == 'A') aCnt++;
			else if(dna.charAt(i) == 'C') cCnt++;
			else if(dna.charAt(i) == 'G') gCnt++;
			else if(dna.charAt(i) == 'T') tCnt++;
			
			if(dna.charAt(j) == 'A') aCnt--;
			else if(dna.charAt(j) == 'C') cCnt--;
			else if(dna.charAt(j) == 'G') gCnt--;
			else if(dna.charAt(j) == 'T') tCnt--;
			
			if(aCnt >= num[0] && cCnt >= num[1] && gCnt >= num[2] && tCnt >= num[3])
				result++;
		}

		
		System.out.println(result);
		
		br.close();
	}

}
