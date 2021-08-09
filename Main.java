import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int number = Integer.parseInt(bf.readLine());
		int[] time = new int[number];
		StringTokenizer st = new StringTokenizer(bf.readLine());

		for (int i = 0; i < number; i++) {
			time[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(time);

		int sum = 0, temp = 0;
		for (int i = 0; i < number; i++) {
			temp += time[i];
			sum += temp;

		}
		System.out.println(sum);
	}

}
