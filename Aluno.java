package trabalho1;

import java.util.Objects;

public class Aluno {

	
	String nome;
	String rg;
	String dataDeNascimento;
	
	
	
	public Aluno(){
		
	}
	
	
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) {
	        return true; // Verifica se os objetos são idênticos
	    }
	    if (obj == null || getClass() != obj.getClass()) {
	        return false; // Verifica se o objeto não é nulo e é da mesma classe
	    }
	    Aluno outra = (Aluno) obj; // Faz o cast do objeto para Aluno
	    return Objects.equals(rg, outra.rg);
}
	 
	 
	 @Override
	 public String toString() {
	     return nome;
	 }
	 
	 @Override
	 public int hashCode() {
	     return Objects.hash(rg);
	 }


}
