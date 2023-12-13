import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Entre com os dados do cliente:");
        System.out.print("Nome: ");
        String nome = scanner.next();
        System.out.print("Email: ");
        String email = scanner.next();
        System.out.print("Data de nascimento (dd/MM/yyyy)");
        Date dataNascimento = sdf.parse(scanner.next());

        Cliente cliente = new Cliente(nome, email, dataNascimento);

        System.out.print("Entre com o status do/dos pedidos: ");
        StatusPedido status = StatusPedido.valueOf(scanner.next());

        Pedido pedido = new Pedido(new Date(), status, cliente);

        int qntItens;

        System.out.println("Quantos itens você deseja pedir?");
        qntItens = scanner.nextInt();

        for (int i = 0; i < qntItens; i++){
            System.out.println("Entre com os dados do pedido número " + (1 + i) + ":");
            System.out.print("Nome do produto: ");
            String nomeProduto = scanner.next();
            System.out.print("Preço do produto: ");
            double preco = scanner.nextDouble();
            System.out.print("Quantidade de produto: ");
            int quantidade = scanner.nextInt();

            Produto produto = new Produto(nomeProduto, preco);

            ItemPedido itemPedido = new ItemPedido(quantidade, preco, produto);

            pedido.adcionarItem(itemPedido);
        }

        System.out.println("------------------------------------------------------------");
        System.out.print("Resumo de pedidos: ");
        System.out.println(pedido);
        System.out.println("------------------------------------------------------------");
    }
}