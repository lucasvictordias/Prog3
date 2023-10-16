package trabalho1;

import java.util.Objects;

public class Aluno3 {

	
	String nome;
	String rg;
	String dataDeNascimento;
	
	
	
	 @Override
	    public boolean equals(Object obj) {
	        if (this == obj) {
	            return true; // Verifica se os objetos sÃ£o idÃªnticos
	        }
	        if (obj == null || getClass() != obj.getClass()) {
	            return false; // Verifica se o objeto nÃ£o Ã© nulo e Ã© da mesma classe
	        }
	        Aluno3 outra = (Aluno3) obj; // Faz o cast do objeto para MinhaClasse
	        return rg == outra.rg && Objects.equals(rg, outra.rg); // Compara os atributos
	    }
	
	 
	    public boolean temMesmoRG(Aluno3 outroAluno) {
	        return this.rg.equals(outroAluno.rg);
	    }
	 
//	  @Override
//	    public int hashCode() {
//	        return Objects.hash(rg);
//	    }
//	  
	  
}
