import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int valorVetor;

        System.out.println("Digite quantos valores terá cada vetor");
        valorVetor = scanner.nextInt();

        int[] vectorA = new int[valorVetor];
        int[] vectorB = new int[valorVetor];
        int[] vectorC = new int[valorVetor];

        System.out.println("Digite os valores que irão compor o vetor A:");

        for (int i = 0; i < valorVetor; i++){
            System.out.print("Digite um valor: ");
            vectorA[i] = scanner.nextInt();
        }

        System.out.println("Digite os valores que irão compor o vetor B:");

        for (int i = 0; i < valorVetor; i++){
            System.out.print("Digite um valor: ");
            vectorB[i] = scanner.nextInt();
        }

        for (int i =0; i < valorVetor; i++){
            vectorC[i] = vectorA[i] + vectorB[i];
        }

        System.out.println("A soma dos vetores A e B que formam o vetor C é igual a:");

        for (int i = 0; i < valorVetor; i++){
            System.out.printf("%d\n", vectorC[i]);
        }


    }
}