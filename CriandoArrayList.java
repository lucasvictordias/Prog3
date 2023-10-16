package trabalho1;

import java.util.ArrayList;

public class CriandoArrayList {

	public static void main(String args[]) {
		
		ArrayList<String> listaDeString = new ArrayList<>();
		
		for(int i = 1; i<=200; i++){
			listaDeString.add("String: " + i);
		}
		
	
		for(String num : listaDeString) {
			System.out.println(num);
		}
		
	}
	
}
