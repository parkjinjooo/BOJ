import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class MainStack5_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		String line = br.readLine();
		LinkedList<Character> list = new LinkedList<Character>();
		
		for (int i = 0; i < line.length(); i++) {
			list.add(line.charAt(i));
		}
		
		ListIterator<Character> it = list.listIterator();
		
		while(it.hasNext()) {
			it.next();
		}
		// ListIterator<Character> it = list.listIterator(list.size());
		
		int M = Integer.parseInt(br.readLine());
		
		while(M --> 0) {
			st = new StringTokenizer(br.readLine()," ");
			
			switch(st.nextToken()) {
			
				case "L": 
						if(it.hasPrevious()) it.previous();
						break;
					
				case "D": 
						if(it.hasNext()) it.next();
						break;
				
				case "B": 
						if(it.hasPrevious()) {
							it.previous(); 
							it.remove();
						}
						break;
						
				case "P": 
						it.add(st.nextToken().charAt(0));
						break;
			}
		}
		
		for(Character c : list)
			sb.append(c);
		br.close();
		System.out.println(sb);
	}
}
