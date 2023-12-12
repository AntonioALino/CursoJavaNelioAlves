import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int qntPessoas;
        int maiorIdade;
        int posicao = 0;


        System.out.println("Quantas pessoas você deseja registrar?");
        qntPessoas = scanner.nextInt();

        Pessoa[] vector = new Pessoa [qntPessoas];


        for (int i = 0; i < vector.length; i++){
            System.out.print("Digite os dados da pessoa que deseja registrar: ");
            String nome = scanner.next();
            int idade = scanner.nextInt();
            vector[i]  = new Pessoa(nome, idade);
        }

        maiorIdade = vector[0].getIdade();

        for (int i = 0; i < vector.length; i++){
            if (vector[i].getIdade() > maiorIdade){
                maiorIdade = vector[i].getIdade();
                posicao = i;
            }
        }

        System.out.printf("Pessoa mais velha: %s\n", vector[posicao].getNome());

    }
}