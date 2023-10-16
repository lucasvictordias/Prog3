package trabalho1;

import java.util.HashSet;
import java.util.Set;

public class Atv11 {

	public static void main(String args[]) {
		
		float soma = 0;
		
		Set<Float> lista = new HashSet<>();
		
		lista.add(100f);
		lista.add(20f);
		lista.add(200f);
		lista.add(30f);
		lista.add(80f);
		lista.add(40f);
		lista.add(100f);
		lista.add(200f);
		
	for(Float i : lista) {
		soma += i;
	}
	
	System.out.println(soma);
	System.out.println("A media da soma dos valores eh: " + ( soma/ lista.size()) );
		
		
	}
}
