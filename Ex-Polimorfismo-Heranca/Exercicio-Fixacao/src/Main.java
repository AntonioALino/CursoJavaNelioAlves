import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Funcionarios> lista = new ArrayList<>();

        int valorDigitado;

        System.out.println("Quantos funcionários a empresa tem?");
        valorDigitado = scanner.nextInt();

        for (int i = 0; i < valorDigitado; i++){

            System.out.println("Funcionário #" + (i) + ":");
            System.out.println("Terceirizado? (S/N)");
            char ch = scanner.next().charAt(0);
            System.out.print("Nome: ");
            String nome = scanner.next();
            System.out.print("Horas: ");
            int horasTrabalhadas = scanner.nextInt();
            System.out.print("Valor por hora: ");
            double valorPorHora = scanner.nextDouble();

            if (ch == 'S'){
                System.out.print("Pagamento adicional: ");
                double pagamentoAdicional = scanner.nextDouble();
                lista.add(new Tercerizados(nome, horasTrabalhadas, valorPorHora, pagamentoAdicional));

            } else {
                lista.add(new Funcionarios(nome, horasTrabalhadas, valorPorHora));
            }

            System.out.println("Pagamentos: ");
            for (Funcionarios func: lista){
                System.out.print(func.getNome() + "- R$ " + String.format("%.2f \n", func.pagamento()));
            }


        }

    }
}