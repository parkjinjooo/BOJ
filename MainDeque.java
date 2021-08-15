import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class MainDeque {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		
		String input;
		int number;
		int N = Integer.parseInt(br.readLine());
		
		Deque<Integer> deque = new LinkedList<Integer>();
		
		
		while(N -->0) {
			input = br.readLine();
			switch(input.charAt(0)) {
			
			case 'p': 
				if(input.charAt(1) == 'o') { //pop
					if(input.charAt(4) == 'f') { //pop_front
						sb.append(deque.isEmpty()? -1 : deque.pollFirst()).append('\n');
					}else { //pop_back
						sb.append(deque.isEmpty()? -1 : deque.pollLast()).append('\n');
					}
				}else { //push
					if(input.charAt(5) == 'f') { //push_front
						 number = Integer.parseInt(input.substring(11));
						deque.offerFirst(number);
					}else { //push_back
						number = Integer.parseInt(input.substring(10));
						deque.offerLast(number);
					}
				}
				break;
				
			case 's': 
				sb.append(deque.size()).append('\n');
				break;
				
			case 'e': 
				sb.append(deque.isEmpty()? 1 : 0).append('\n');
				break;
				
			case 'f': 
				sb.append(deque.isEmpty()? -1 : deque.peekFirst()).append('\n');
				break;
			
			case 'b': 
				sb.append(deque.isEmpty()? -1 : deque.peekLast()).append('\n');
				break;
			
			}
		}
		br.close();
		System.out.println(sb);
	}
}
