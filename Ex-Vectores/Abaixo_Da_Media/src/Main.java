import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tamanhoVetor;
        double mediaVetores;
        double soma = 0;

        System.out.print("Digite quantos elementos terá o vetor:");
        tamanhoVetor = scanner.nextInt();
        int[] vector = new int[tamanhoVetor];

        for (int i = 0; i < vector.length; i++){
            System.out.print("Digite um valor: ");
            vector[i] = scanner.nextInt();
        }

        for (int i = 0; i < vector.length; i++){
            soma = soma + vector[i];
        }

        mediaVetores = soma / vector.length;

        System.out.printf("Média dos valores: %f\n", mediaVetores);

        for (int i = 0; i < vector.length; i++ ){
            if (vector[i] < mediaVetores){
                System.out.println("Numeros abaixo da média: ");
                System.out.printf("%d\n", vector[i]);
            }
        }

    }
}