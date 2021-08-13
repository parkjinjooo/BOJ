import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class MainStack5_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		Stack<Character> left = new Stack<Character>();
		Stack<Character> right = new Stack<Character>();
		
		String line = bf.readLine();
		for (int i = 0; i < line.length(); i++) {
			left.push(line.charAt(i));
		}
		
		int M = Integer.parseInt(bf.readLine());
		
		while(M --> 0) {
			st = new StringTokenizer(bf.readLine()," ");
			switch(st.nextToken()) {
			
			case "L": 
				if(!left.isEmpty()) right.push(left.pop());
				break;
			
			case "D": 
				if(!right.isEmpty()) left.push(right.pop());
				break;
				
			case "B": 
				if(!left.isEmpty()) left.pop();
				break;
				
			case "P": 
				left.push(st.nextToken().charAt(0));			
				break;
			}
		}
		
		while(!left.isEmpty()) {
			right.push(left.pop());
		}
		
		while(!right.isEmpty()) {
			sb.append(right.pop());
		}
		bf.close();
		System.out.println(sb);
		
	}
}
