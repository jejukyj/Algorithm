import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //색종이의 장수 
		int[][] r = new int[1001][1001]; //평면 
		int a=0, b=0, w=0, h=0; //(a, b), 너비, 높이 
		int size = 0;

		for(int i=1; i<=N; i++) { //색종이 장수만큼 반복 
			a = sc.nextInt();
			b = sc.nextInt();
			w = sc.nextInt();
			h = sc.nextInt();
			
			for(int j=a; j<a+w; j++) {
				for(int k=b; k<b+h; k++) {
					r[j][k] = i; //색종이 번호 넣기  
				}
			}
		}
		
		for(int i=1; i<=N; i++) {
			size=0;
			for(int j=0; j<r.length; j++) {
				for(int k=0; k<r.length; k++) {
					if(r[j][k] == i) { //해당 색종이 번호에 해당하는 면이라면,
						size++;
					}
				}
			}
			System.out.println(size);
			
		}
	}

}
