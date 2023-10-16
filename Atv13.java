package trabalho1;

public class Atv13 {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();
		Aluno aluno4 = new Aluno();
		
		
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
		
		
		if (aluno2.equals(aluno3)) {
		    System.out.println("Os objetos são iguais.");
		} else {
		    System.out.println("Os objetos são diferentes.");
		}
		
	}

}
