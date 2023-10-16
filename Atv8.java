package trabalho1;
import java.util.HashMap;

public class Atv8 {

		
		
		public static void main(String args[]) {
			
			 HashMap<String, String> hashMap = new  HashMap<>();
			 
			 
			 hashMap.put("chave1", "String 1");
			 hashMap.put("chave1", "String 1");
			 
			 hashMap.put("chave2", "String 2");
			 hashMap.put("chave2", "String 2");
			 
			 hashMap.put("chave3", "String 3");
			 hashMap.put("chave3", "String 3");
			
				
			 for (String chave : hashMap.keySet()) {
				    System.out.println("Chave: " + chave + ", Valor: " + hashMap.get(chave));
				}
			 
				System.out.println("A colecao possui: " + hashMap.size() + " elementos");
				
				
			}
			
		
	}


	
