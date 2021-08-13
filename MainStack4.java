import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class MainStack4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		Stack<Integer> stack = new Stack<>();

		int N = Integer.parseInt(br.readLine());
		int start = 0;	// 정보를 게속 유지하고 싶을 때는 전역변수에 값을 담아 계속 유지 
		
		while (N -- > 0) { //8번 돈다. 
			
			int value = Integer.parseInt(br.readLine()); // 4
			if(value > start) { 
				for (int i = start +1 ; i <= value; i++) {
					//1,2,3,4
					stack.push(i);
					sb.append('+').append('\n');
				}
				start = value;
				
			}else if(stack.peek() != value) {
				System.out.println("NO");
				return;
			}
			
			stack.pop();
			sb.append('-').append('\n');
		}
		br.close();
		System.out.println(sb);
	}
}