package trabalho1;

import java.util.Objects;

public class Aluno1 {

	//String nome;
	String rg;
	//String dataDeNascimento;
	
	
	
	public Aluno1(String rg){
		this.rg = rg;
	}
	
	
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) {
	        return true; // Verifica se os objetos são idênticos
	    }
	    if (obj == null || getClass() != obj.getClass()) {
	        return false; // Verifica se o objeto não é nulo e é da mesma classe
	    }
	    Aluno1 outra = (Aluno1) obj; // Faz o cast do objeto para Aluno1
	    return Objects.equals(rg, outra.rg);
}
	 
	 
	 @Override
	 public String toString() {
	     return rg;
	 }
	 
	 @Override
	 public int hashCode() {
	     return Objects.hash(rg);
	 }


}
