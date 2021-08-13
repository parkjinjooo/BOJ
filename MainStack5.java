import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class MainStack5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();	
		
		StringTokenizer st;
		String cursor = br.readLine();
		

		LinkedList<Character> list = new LinkedList<Character>();
		for (int i = 0; i < cursor.length(); i++) {
			list.add(cursor.charAt(i));		
		}
		
		int size = list.size();
				
		int M = Integer.parseInt(br.readLine());
		
		while(M --> 0) {
			st = new StringTokenizer(br.readLine(), " ");
			
			switch(st.nextToken()) {
						
			case "L": 
				if(size !=0 ) size--;
				break;
				
			case "D": 
				if(size < list.size()) size++;
				break;
				
			case "B": 
				if(size != 0) {
					list.remove(size-1);
					size--;
				}
				break;
			case "P": 
				list.add(size, st.nextToken().charAt(0));
				size++;
				break;
			}	
			
		}
		
		for (int i = 0; i < list.size(); i++) {
			sb.append(list.get(i).toString());
		}
		br.close();
		System.out.println(sb);	
	}
}
