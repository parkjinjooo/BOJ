import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class MainQueue {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String line;
		int back = -1;

		Queue<Integer> q = new LinkedList<Integer>();

		int N = Integer.parseInt(br.readLine());

		while (N-- > 0) {
			line = br.readLine();

			switch (line.charAt(0)) {

			case 'p':
				if (line.charAt(1) == 'o') {
					sb.append(q.isEmpty()? -1 : q.poll()).append('\n');
					
				} else {
					back = Integer.parseInt(line.substring(5));
					q.offer(back);
				}
				break;
				

			case 's':
				sb.append(q.size()).append('\n');
				break;

			case 'e':
				sb.append(q.isEmpty()? 1 : 0).append('\n');
				break;

			case 'f':
				sb.append(q.isEmpty()? -1 : q.peek()).append('\n');
				break;

			case 'b':
				sb.append(q.isEmpty()? -1 : back).append('\n');
			break;

			}

		}
		System.out.println(sb);
		br.close();

	}
}
