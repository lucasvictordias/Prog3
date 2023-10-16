package trabalho1;

public class Servico implements Comparable<Servico>{

	int codigo;
	String descricao; 
	Double precoHora; 
	Double qtdeHora;
	Double valor;
	


double calculaValorServico(Double precoHora, Double qtdeHora){
	
	
	 return (precoHora*qtdeHora);
	
}


public Servico(int codigo, String descricao, Double precoHora, Double qtdeHora) {
	this.codigo = codigo;
	this.descricao = descricao;
	this.precoHora = precoHora;
	this.qtdeHora = qtdeHora;
	this.valor = calculaValorServico(precoHora, qtdeHora);
	
}


@Override
public int compareTo(Servico o) {
	return this.descricao.compareTo(o.descricao);
}




}