import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class MainQueue1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int back = -1;

		Queue<Integer> q = new LinkedList<Integer>();

		int N = Integer.parseInt(br.readLine());

		while (N-- > 0) {
			st = new StringTokenizer(br.readLine());

			switch (st.nextToken()) {

			case "push":				
					back = Integer.parseInt(st.nextToken());
					q.offer(back);
				
				break;
				
			case "pop":
				if (q.isEmpty()) sb.append(-1).append('\n');
				else sb.append(q.poll()).append('\n');
				break;

			case "size":
				sb.append(q.size()).append('\n');
				break;

			case "empty":
				sb.append(q.isEmpty()? 1 : 0).append('\n');
				break;

			case "front":
				sb.append(q.isEmpty()? -1 : q.peek()).append('\n');
				break;

			case "back":
				sb.append(q.isEmpty()? -1 : back).append('\n');
			break;

			}

		}
		System.out.println(sb);
		br.close();

	}
}
