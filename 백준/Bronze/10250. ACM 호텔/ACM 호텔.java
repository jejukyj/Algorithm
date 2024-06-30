import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int H = sc.nextInt(); //층 수
            int W = sc.nextInt(); //방 수
            int N = sc.nextInt(); //몇 번째 손님인지
            int Y, X;

            if(N%H == 0){
                Y = H;
                X = (N/H);
            }

            else{
                Y = N%H;
                X = (N/H)+1;
            }

            Y*=100;

            System.out.println(Y+X);
        }
    }
}
