package trabalho1;

import java.util.HashSet;
import java.util.Set;

public class Atv19 {

	public static void main(String[] args) {
		
		Aluno3 aluno1 = new Aluno3();
		Aluno3 aluno2 = new Aluno3();
		Aluno3 aluno3 = new Aluno3();
		Aluno3 aluno4 = new Aluno3();
		
		
		aluno1.nome = "Francisco";
		aluno1.rg = "3224";
		aluno1.dataDeNascimento = "27/08/1975";

		aluno2.nome = "Claudio";
		aluno2.rg = "1784";
		aluno2.dataDeNascimento = "07/05/2004";
		
		aluno3.nome = "Joaquim";
		aluno3.rg = "1784";
		aluno3.dataDeNascimento = "12/10/1984";
		
		aluno4.nome = "Lucas";
		aluno4.rg = "7448";
		aluno4.dataDeNascimento = "31/03/1999";
		
		
		Set<Aluno3> modoSet1 = new HashSet();
		
		modoSet1.add(aluno1);
		modoSet1.add(aluno2);
		modoSet1.add(aluno3);
		modoSet1.add(aluno4);
		
		
//		if (aluno2.equals(aluno3)) {
//		    System.out.println("Os objetos sÃ£o iguais.");
//		} else {
//		    System.out.println("Os objetos sÃ£o diferentes.");
//		}
		
		if (aluno2.temMesmoRG(aluno3)) {
		    System.out.println("Os alunos têm o mesmo RG.");
		} else {
		    System.out.println("Os alunos têm RGs diferentes.");
		}
		
	}

}
