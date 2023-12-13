import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter com o nome do departamento:");
        String nomeDepartamento = scanner.next();
        System.out.println("Entre com os dados do funcionário: ");
        System.out.print("Nome: ");
        String nomeFuncionario = scanner.next();
        System.out.print("Senioridade: ");
        String senioridadeFuncionario = scanner.next();
        System.out.print("salario base: ");
        double salarioBase = scanner.nextDouble();

        Funcionario funcionario = new Funcionario(nomeFuncionario, Senioridade.valueOf(senioridadeFuncionario), salarioBase, new Departamento(nomeDepartamento));

        System.out.print("Quantos contratos esse funcionário tem?");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println("Entre com o contrato " + (i) + ":");
            System.out.print("Data (DD/MM/YYYY): ");
            Date dataDoContrato = sdf.parse(scanner.next());
            System.out.print("Valor por hora: ");
            double valorPorHora = scanner.nextDouble();
            System.out.print("Duração (horas)");
            int duracaoHoras = scanner.nextInt();
            ContratoPerHora contrato = new ContratoPerHora(dataDoContrato, valorPorHora, duracaoHoras);
            funcionario.adicionarContrato(contrato);
        }

        System.out.print("Entre com o mês e o ano para calcular a renda: ");
        String mesEAno = scanner.next();
        int mes = Integer.parseInt(mesEAno.substring(0, 2));
        int ano = Integer.parseInt(mesEAno.substring(3));

        System.out.print("Nome: " + funcionario.getNome());
        System.out.println("Departamento: " + funcionario.getDepartamento().getName());
        System.out.println("Renda: " + mesEAno + ":" + String.format("%.2f", funcionario.renda(mes, ano)));

    }
}