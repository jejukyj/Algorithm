import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main{

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		
		for(int i=0; i<T; i++) {
			String stackStr = br.readLine();
			
			Stack<Character> stack = new Stack<>();
			
			for(int j=0; j<stackStr.length(); j++) {
				if(stackStr.charAt(j) == '(')
					stack.push(stackStr.charAt(j));
				else {
					if(stack.empty()) {
						stack.push(stackStr.charAt(j));
						break;
					}
					else {
						stack.pop();
					}
				}
			}
			

			if(stack.empty())
				System.out.println("YES");
			else
				System.out.println("NO");
			
	
		}
		br.close();
	}

}
