import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int valorVetor;
        double mediaValoresVetor;
        int soma = 0;
        int qntPares = 0;

        System.out.println("Quantos elementos vai ter no vetor?");
        valorVetor = scanner.nextInt();

        int[] vector = new int[valorVetor];

        for (int i = 0;  i < valorVetor; i ++){
            System.out.print("Digite um número: ");
            vector[i] = scanner.nextInt();
        }

        for (int i = 0; i < valorVetor; i++){
            if (vector[i] % 2 == 0){
                soma = soma + vector[i];
                qntPares++;

            }
        }

        if (qntPares == 0){
            System.out.print("Nenhum número par");
        } else {
            mediaValoresVetor = (double) soma / valorVetor;
            System.out.printf("%.1f\n", mediaValoresVetor);
        }






    }
}