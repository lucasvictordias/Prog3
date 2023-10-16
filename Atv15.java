package trabalho1;

import java.util.HashSet;
import java.util.Set;

public class Atv15 {

	public static void main(String args[]) {
		
		
		ContaCorrente conta1 = new ContaCorrente("001", "12345", "João", "123.456.789-00", 1000.0);
        ContaCorrente conta2 = new ContaCorrente("002", "54321", "Maria", "987.654.321-00", 1500.0);
        ContaCorrente conta3 = new ContaCorrente("006", "12345", "Marcelo", "123.496.789-00", 1200.0);
        ContaCorrente conta4 = new ContaCorrente("003", "67890", "Carlos", "111.222.333-00", 2000.0);
        ContaCorrente conta5 = new ContaCorrente("004", "24680", "Ana", "444.555.666-00", 2500.0);
        ContaCorrente conta6 = new ContaCorrente("005", "12346", "Leticia", "123.456.789-10", 2000.0);
        
		
		System.out.println("As contas são iguais? : " + conta1.equals(conta3));
	
		
	}
	
}
