package trabalho1;

import java.util.ArrayList;
import java.util.Collections;

public class Atv4 {

	public static void main(String args[]) {
		
		ArrayList<String> listaDeString = new ArrayList<>();
		
			listaDeString.add("String 1");
			listaDeString.add("String 1");
			
			
			listaDeString.add("String 2");
			listaDeString.add("String 2");
			
			listaDeString.add("String 3");
			listaDeString.add("String 3");
		
	
			int verificador = Collections.frequency(listaDeString, "String 2");
			
			System.out.println(verificador);
			
		}
		
		
		
	}
	
