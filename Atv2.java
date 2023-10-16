package trabalho1;

import java.util.ArrayList;

public class Atv2 {

	public static void main(String args[]) {
		
		ArrayList<String> listaDeString = new ArrayList<>();
		
			listaDeString.add("String 1");
			listaDeString.add("String 1");
			
			
			listaDeString.add("String 2");
			listaDeString.add("String 2");
			
			listaDeString.add("String 3");
			listaDeString.add("String 3");
		
	
		for(String num : listaDeString) {
			System.out.println(num);
		}
		
		System.out.println(listaDeString.size());
		
		System.out.println("A colecao possui 6 Elementos");
		//A coleção possui 6 Elementos
		
	}
}
