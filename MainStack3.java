import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class MainStack3 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack stack = new Stack();

		int T = Integer.parseInt(br.readLine());

		while (T-- > 0) {
			String lines = br.readLine();
			int size = lines.length();
			char tmp[] = new char[size] ;
			
			for (int i = 0; i < size; i++) {
				tmp[i] = lines.charAt(i);
				if (tmp[i] == '(') {
					stack.push(tmp[i]);
				} else {
					if (stack.isEmpty()) {
						stack.push(tmp[i]);
						break;
					} else {
						stack.pop();
					}
				}
			}
			if (stack.isEmpty())
				sb.append("YES").append("\n");
			else
			sb.append("NO").append("\n");
			stack.clear();

		}
		br.close();
		System.out.println(sb);
	}
}
