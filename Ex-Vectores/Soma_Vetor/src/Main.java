import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int valor;

        System.out.println("Quantos valores você deseja digitar? ");
        valor = scanner.nextInt();

        int vector[]  = new int [valor];

        for (int i = 0; i < valor; i++){
            System.out.println("Digite um numero: ");
            vector[i] = scanner.nextInt();
        }

        System.out.println("Valores: ");

        for (int i = 0; i < valor; i++){
            System.out.println(vector[i]);
        }

        System.out.println("SOMA: ");

        int soma  = 0;

        for (int i = 0; i < valor; i++){
            soma =  soma +  vector[i];
        }

        System.out.printf("%d\n", soma);

        System.out.println("MEDIA: ");

        int media  = soma / valor;

        System.out.printf("%d\n", media);

    }
}