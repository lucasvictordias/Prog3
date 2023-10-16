package trabalho1;

import java.util.ArrayList;
import java.util.Collections;

public class Atv3 {

	public static void main(String args[]) {
		
		ArrayList<String> listaDeString = new ArrayList<>();
		
			listaDeString.add("String 1");
			listaDeString.add("String 1");
			
			
			listaDeString.add("String 2");
			listaDeString.add("String 2");
			
			listaDeString.add("String 3");
			listaDeString.add("String 3");
		
	
		
		Collections.shuffle(listaDeString);
			
		for(String num : listaDeString) {
			System.out.println(num);
		}
		
		
		
	}
	
}
