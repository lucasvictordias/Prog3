package trabalho1;

import java.util.HashSet;
import java.util.Set;

public class Atv18 {

	public static void main(String[] args) {
		
		Aluno1 aluno1 = new Aluno1("72159");
		Aluno1 aluno2 = new Aluno1("75691");
		Aluno1 aluno3 = new Aluno1("96154");
		Aluno1 aluno4 = new Aluno1("72159");
		Aluno1 aluno5 = new Aluno1("81526");
		Aluno1 aluno6 = new Aluno1("95147");
		
		Set<Aluno1> setAluno = new HashSet<>();
		
		setAluno.add(aluno1);
		setAluno.add(aluno2);
		setAluno.add(aluno3);
		setAluno.add(aluno4);
		setAluno.add(aluno5);
		setAluno.add(aluno6);
		
	
		for(Aluno1 num: setAluno) {
			System.out.println(num);
		}
		
		System.out.println("Nao, nao possui alunos com o mesmo codigo, pois o Set nao permite repeticoes");
	
	}

}
