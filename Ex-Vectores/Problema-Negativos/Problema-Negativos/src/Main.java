import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int valor;

        System.out.println("Quantos valores você desseja digitar? ");
        valor = scanner.nextInt();

        int vector[] = new int [valor];

        for(int i = 0; i < valor; i++){
            System.out.println("Digite um numero: ");
            vector[i] = scanner.nextInt();
        }

        System.out.println("Numeros negativos: ");

        for (int i = 0; i < valor; i++){
            if (vector[i] < 0){
                System.out.printf("%d\n", vector[i]);
            }
        }

    }
}