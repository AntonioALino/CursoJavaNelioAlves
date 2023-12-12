import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int valorDigitado;

        System.out.println("Quantos valores você deseja digitar?");
        valorDigitado = scanner.nextInt();

        int[] vector = new int[valorDigitado];

        for (int i = 0;  i < valorDigitado; i++){
            System.out.print("Digite um valor: ");
            vector[i] = scanner.nextInt();
        }

        int maiorValor = vector[0];
        int posicaoMaior = 0;

        for (int i = 0; i < valorDigitado; i++){
            if (vector[i] > vector[0]){
                maiorValor = vector[i];
                posicaoMaior = i;
            }
        }

        System.out.printf("Maior valor será de %d\n", maiorValor);
        System.out.printf("A posição do maior valor é a %d", posicaoMaior);

    }
}