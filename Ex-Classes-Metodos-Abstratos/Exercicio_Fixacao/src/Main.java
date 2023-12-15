import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Contribuinte> lista = new ArrayList<>();

        int qntDeContribuintes;

        System.out.println("Entre com a quantidade de contribuintes: ");

        qntDeContribuintes = scanner.nextInt();

        for (int i = 0; i < qntDeContribuintes; i++){
            System.out.println("Contribuinte número " + i + ":");
            System.out.print("Pessoal ou empresarial? (P/E) ? ");
            char pe = scanner.next().charAt(0);
            System.out.print("nome: ");
            String nome = scanner.nextLine();
            System.out.print("Rendimento anual: ");
            double rendimentoAnual = scanner.nextDouble();

            if (pe == 'P'){
                System.out.print("Health expenditures: ");
                double gastosComSaude = scanner.nextDouble();
                lista.add(new Pessoal(nome, rendimentoAnual, gastosComSaude));
            } else {
                System.out.print("Number of employees: ");
                int numberOfEmployees = scanner.nextInt();
                lista.add(new Empresarial(nome, rendimentoAnual, numberOfEmployees));
            }
        }

        double soma = 0.0;
        System.out.println("Taxas pagas:");
        for (Contribuinte tp : lista) {
            double tax = tp.taxa();
            System.out.println(tp.getNome() + ": $ " + String.format("%.2f", tax));
            soma += tax;
        }

        System.out.println("Total de taxas: $ " + String.format("%.2f", soma));


    }
}