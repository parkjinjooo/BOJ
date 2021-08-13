import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.ListIterator;


public class MainStack5_3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String line = br.readLine();
		String word;
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
			word = br.readLine();
			
			switch(word.charAt(0)) {
			
				case 'L': 
						if(it.hasPrevious()) it.previous();
						break;
					
				case 'D': 
						if(it.hasNext()) it.next();
						break;
				
				case 'B': 
						if(it.hasPrevious()) {
							it.previous(); 
							it.remove();
						}
						break;
						
				case 'P': 
						it.add(word.charAt(2));
						break;
			}
		}
		
		for(Character c : list)
			bw.write(c);
		bw.flush();
		bw.close();
		br.close();
	}
}
