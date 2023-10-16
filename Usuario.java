package trabalho1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
        List<Servico> listaServicos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite o código do serviço (ou -1 para sair): ");
            int codigo = scanner.nextInt();
            if (codigo == -1) {
                break;
            }

            scanner.nextLine();
            System.out.print("Digite a descrição do serviço: ");
            String descricao = scanner.nextLine();

            System.out.print("Digite o preço por hora do serviço: ");
            double precoHora = scanner.nextDouble();

            System.out.print("Digite a quantidade de horas do serviço: ");
            double qtdeHora = scanner.nextDouble();

            Servico servico = new Servico(codigo, descricao, precoHora, qtdeHora);
            listaServicos.add(servico);
        }

        scanner.close();
        
        System.out.println("Lista na ordem que foi digitada:");
        for (Servico servico : listaServicos) {
            System.out.println(servico.codigo + " - " + servico.descricao);
        }

        Collections.sort(listaServicos, (s1, s2) -> s1.descricao.compareTo(s2.descricao));

        System.out.println("\nLista em ordem alfabética da descrição:");
        for (Servico servico : listaServicos) {
            System.out.println(servico.codigo + " - " + servico.descricao);
        }

        double totalHoras = listaServicos.stream()
                .filter(servico -> servico.qtdeHora >= 2.0)
                .mapToDouble(servico -> servico.qtdeHora)
                .sum();

        System.out.println("\nTotal de horas para serviços com quantidade de horas maior ou igual a 2: " + totalHoras);
    }
}
