package trabalho1;

import java.util.ArrayList;
import java.util.Collections;

public class Atv6 {
	
	
	public static void main(String args[]) {
		
	
	ArrayList<Servico> todosOsServicos = new ArrayList<>();
	
	Servico servico1 = new Servico(111, "Lava e passa", 60.0, 3.0);
	Servico servico2 = new Servico(222, "Cozinhar em festa", 100.0,6.0);
	Servico servico3 = new Servico(333, "Passear com os pets", 30.0, 1.0);
	Servico servico4 = new Servico(444, "Cuidar das criancas", 40.0, 8.0);
	
	todosOsServicos.add(servico1);
	todosOsServicos.add(servico2);
	todosOsServicos.add(servico3);
	todosOsServicos.add(servico4);
	
	
//	System.out.println(servico1.codigo);
//	System.out.println(servico1.descricao);
//	System.out.println(servico1.precoHora);
//	System.out.println(servico1.qtdeHora);
//	System.out.println(servico1.valor);
	
	Collections.sort(todosOsServicos);
	
	for(Servico num: todosOsServicos) {
		System.out.println(num.codigo);
		System.out.println(num.descricao);
		System.out.println(num.precoHora);
		System.out.println(num.qtdeHora);
		System.out.println(num.valor);
		
	}
	
}
}