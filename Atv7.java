package trabalho1;

import java.util.HashSet;

public class Atv7 {

	
	
	public static void main(String args[]) {
		
		HashSet<String> listaDeString = new HashSet<>();
		
			listaDeString.add("String 1");
			listaDeString.add("String 1");
			
			listaDeString.add("String 2");
			listaDeString.add("String 2");
			
			listaDeString.add("String 3");		
			listaDeString.add("String 3");
			
			
			for (String num : listaDeString) {
			    System.out.println(num);
			}
			
			System.out.println("A colecao possui: " +listaDeString.size() + " elementos");
			
			
		}
		
	
}

