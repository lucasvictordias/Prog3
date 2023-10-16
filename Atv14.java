package trabalho1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Atv14 {

    public static void main(String[] args) {

        Set<Aluno> modoSet = new HashSet<>();
        Map<String, Aluno> modoMap = new HashMap<>();

        for (int i = 0; i < 20000; i++) { // Altere o limite para 5 objetos
            Aluno aluno = new Aluno();
            aluno.rg = "RG " + i;
            aluno.dataDeNascimento = "01/01/2000";
            aluno.nome = "Aluno " + i;

            modoSet.add(aluno);
            modoMap.put(aluno.rg, aluno);
        }

//        for (Aluno num : modoSet) {
//            System.out.println(num.nome + " " + num.rg + " " + num.dataDeNascimento);
//        }
//
//        System.out.println("*************");
//
//        for (Entry<String, Aluno> entry : modoMap.entrySet()) {
//            String chave = entry.getKey();
//            Aluno valorElemento = entry.getValue();
//            System.out.println("Chave: " + chave + ", Valor: " + valorElemento.nome);
//        }
    
        long tempInicioSet = System.currentTimeMillis();
        
        Aluno alunoParaPesquisar = new Aluno();
        alunoParaPesquisar.rg = "RG 1899";

        boolean encontradoSet = modoSet.contains(alunoParaPesquisar);
        long tempFimSet = System.currentTimeMillis();
        System.out.println("O elemento foi encontrado no modoSet? : " + encontradoSet);
        
        
        long tempoTotalSet = tempFimSet - tempInicioSet;
        
        
        long tempInicioMap = System.currentTimeMillis();
        
        String chaveProcurada = "RG 18999";
        Aluno buscaAluno = modoMap.get(chaveProcurada);
        
        long tempFimMap = System.currentTimeMillis();
        
        long tempoTotalMap = tempFimMap - tempInicioMap;
        
        if (buscaAluno != null) {
            System.out.println("Aluno encontrado: " + buscaAluno);
        } else {
            System.out.println("Aluno não encontrado.");
        }

        
        System.out.println("O tempo total de pesquisa do Set: " + tempoTotalSet);
        System.out.println("O tempo total de pesquisa do Map: " + tempoTotalMap);
        
        

    }
    
}
