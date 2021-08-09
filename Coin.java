import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Coin {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		int[] coins = new int[N];
		for (int i = 0; i < N; i++) {
			coins[i] = Integer.parseInt(bf.readLine());
		}
		bf.close();
		
		int cnt = 0;
		for (int i = N-1 ; i >= 0; i--) {
			if (coins[i] <= K) {
				cnt += K / coins[i];
				K = K % coins[i];
			}

		}
		System.out.println(cnt);
	}
}
