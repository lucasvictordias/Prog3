package trabalho1;

import java.util.Objects;

public class ContaCorrente {

//	Implemente uma classe ContaCorrente com os atributos Agencia, 
//	Numero, Nome, CPF e Saldo. Sobrescreva os métodos equals() de forma 
//	que duas contas correntes sejam consideradas iguais apenas se possuírem o 
//	mesmo Numero, e sobrescreva o método hashCode().

	String agencia;
	String numero;
	String nome;
	String cpf;
	double saldo;
	
    public ContaCorrente(String agencia, String numero, String nome, String cpf, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldo;
    }
	
	
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) {
	        return true; // Verifica se os objetos são idênticos
	    }
	    if (obj == null || getClass() != obj.getClass()) {
	        return false; // Verifica se o objeto não é nulo e é da mesma classe
	    }
	    ContaCorrente outra = (ContaCorrente) obj; // Faz o cast do objeto para Aluno
	    return Objects.equals(numero, outra.numero);
}
	
	 
	 @Override
	 public String toString() {
	     return nome;
	 }
	 
	 @Override
	 public int hashCode() {
	     return Objects.hash(numero);
	 }



}

