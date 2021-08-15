import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class MainDeque2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		Deque<Character> deque = new LinkedList<Character>();

		String input = br.readLine();
		int size = input.length();

		for (int i = 0; i < input.length(); i++) {

			char word = input.charAt(i);
			switch (word) {

			case '<':
				if (deque.isEmpty()) {
					deque.addLast(word);
					size--;
				} else {
					size--;
					while (!deque.isEmpty())
						sb.append(deque.pollLast());
					deque.addLast(word);
				}

				break;

			case '>':
				deque.addLast(word);
				size--;
				while (!deque.isEmpty()) {
					sb.append(deque.pollFirst());
				}
				break;

			default:
				if (word == ' ' && !deque.contains('<')) {
					size--;
					while (!deque.isEmpty()) {
						sb.append(deque.pollLast());
					}
					sb.append(' ');
				} else {
					deque.addLast(word);
					size--;
					if (size == 0) {
						while (!deque.isEmpty()) {
							sb.append(deque.pollLast());
						}
					}
				}

				break;

			}
		}
		br.close();
		System.out.println(sb);
	}
}