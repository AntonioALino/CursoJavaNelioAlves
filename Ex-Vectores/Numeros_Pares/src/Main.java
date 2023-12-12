import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int qntNumerosDigitados;
        int qntPares = 0;

        System.out.println("Quantos numeros deseja digitar?");
        qntNumerosDigitados = scanner.nextInt();
        int[] vector  = new int[qntNumerosDigitados];


        for (int i = 0; i < qntNumerosDigitados; i++){
            System.out.print("Digite um número: ");
            vector[i] = scanner.nextInt();
        }

        System.out.println("Os numeros pares são: ");


        for (int i = 0; i < vector.length; i++){
            if (vector[i] % 2 == 0){
                System.out.printf("%d \n", vector[i]);
                qntPares++;
            }
        }

        System.out.printf("A quantidade de pares é: %d", qntPares);

    }
}