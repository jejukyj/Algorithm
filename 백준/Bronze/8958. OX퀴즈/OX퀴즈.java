import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		char[] arr = new char[80];
		int n=0, sum=0, size=0;
		
		for(int i=0; i<T; i++) {
			String str = sc.next();
			
			size=0;
			for(int j=0; j<str.length(); j++) {
				arr[j] = str.charAt(j);
				size++;
			}
			
			n=0;
			sum=0;

			for(int j=0; j<size; j++) {
				if(arr[j] == 'O') {
					++n;
					sum+=n;
				}
				else {
					n=0;
				}
			}
			System.out.println(sum);
		}
		
		sc.close();
	}

}
