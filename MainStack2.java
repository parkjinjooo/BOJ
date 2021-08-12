import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class MainStack2 {
	public static void main(String[] args) throws IOException {

		Stack stack = new Stack();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());
		while (T-- > 0) {
			String str = br.readLine();
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) != ' ') {
					stack.push(str.charAt(i));

					if (i == str.length() - 1) {
						while (!stack.isEmpty())
							sb.append(stack.pop()).append('\n');
					}
				} else if (str.charAt(i) == ' ') {

					while (!stack.isEmpty())
						sb.append(stack.pop());

					sb.append(' ');
				}
			}
		}
		br.close();
		System.out.println(sb);

	}

}
