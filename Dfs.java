import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Dfs {

	public static int N, M;
	public static int[][] graph;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		graph = new int[N][M];
		
		for (int i = 0; i < N; i++) {
			// 한줄을 통채로 읽어온다.
			String str = bf.readLine();
			for (int j = 0; j < M; j++) {
				// str에서 하나씩 끊어서 값의 수를 저장
				graph[i][j] = str.charAt(j)-'0';
				
			}
		}

		int result = 0;
		
		// 모든 노드를 돌면서 음료수 채우기 
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if(dfs(i,j)) {
					result += 1;
				}
				
			}

		}
		System.out.println(result);
	}

	public static boolean dfs(int x, int y) {

		// DFS로 특정 노드를 방문하고 연결된 노드도 방문
		// 단, 1인 경우에는 들리지 않는다. -> if문이 1일때만 재귀호출이 실행

		// 주어진 범위를 벗어나는 경우 즉시 종료
		// 상,하,좌,우 움직이면서 만역 해당 영역을 넘어가면 즉시 종료
		if (x <= -1 || x >= N || y <= -1 || y >= M) {
			return false;
		}

		// 현재 노드를 아직 방문하지 않았다면
		if (graph[x][y] == 0) {
			// 해당 노드 방문 처리
			graph[x][y] = 1;
			// 상,하,좌,우의 위치를 모두 재귀호출
			dfs(x - 1, y);
			dfs(x + 1, y);
			dfs(x, y - 1);
			dfs(x, y + 1);
			return true;
		}
		return false;
	}

}
