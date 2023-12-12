import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int valorDigitado;
        int menoresIdade = 0;
        double alturaTotal = 0;


        System.out.println("Quantas pessoas serão digitadas?");
        valorDigitado = scanner.nextInt();

        String[] nome = new String[valorDigitado];
        int[] idade = new int [valorDigitado];
        double[] altura = new double[valorDigitado];

        for (int i = 0; i < valorDigitado; i++){
            System.out.println("Digite os dados da pessoa: ");
            System.out.println("Insira seu nome: ");
            nome[i] = scanner.next();
            System.out.println("Insira sua idade: ");
            idade[i] = scanner.nextInt();
            System.out.println("Insira sua altura: ");
            altura[i] = scanner.nextDouble();
        }

        for (int i = 0; i < valorDigitado; i++){
            if (idade[i] < 16){
                menoresIdade++;
                System.out.printf("%s\n", nome[i]);
            }
            alturaTotal = alturaTotal + altura[i];
        }

         double alturaMedia = alturaTotal / valorDigitado;

         double qntMenores = ((double) menoresIdade / valorDigitado) * 100.0;

        System.out.printf("A altura média é de %f\n", alturaMedia);
        System.out.printf("\nExistem %.1f%% menores de idade", qntMenores);



    }
}