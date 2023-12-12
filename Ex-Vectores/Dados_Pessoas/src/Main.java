import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int qntPessoas, qntHomens, qntMulheres;
        double menorAltura, maiorAltura;
        double alturaFemMedia;
        double alturaFemTotal;
        int posicao = 0;


        System.out.println("Quantas pessoas serão registradas?");
        qntPessoas = scanner.nextInt();

        Pessoas[] vector = new Pessoas[qntPessoas];

        for (int i = 0; i < vector.length; i++){
            System.out.print("Digite o nome da pessoa: ");
            String nome = scanner.next();
            System.out.print("Digite o gênero da pessoa: (F/M)");
            char genero = scanner.next().charAt(0);
            System.out.print("Digite a altura da pessoa: ");
            double altura = scanner.nextDouble();

            vector[i] = new Pessoas(nome, genero, altura);
        }

        menorAltura = vector[0].getAltura();
        maiorAltura = vector[0].getAltura();

        for (int i = 1; i < vector.length; i++){
            if (vector[i].getAltura() >  maiorAltura){
                maiorAltura = vector[i].getAltura();
            }
            if (vector[i].getAltura() < menorAltura){
                menorAltura = vector[i].getAltura();
            }
        }

        qntHomens = 0;
        qntMulheres = 0;
        alturaFemTotal = 0;

        for (int i = 0; i < vector.length; i++){
            if (vector[i].getGenero() == 'M'){
                qntHomens++;
            } else {
                qntMulheres++;
                alturaFemTotal = alturaFemTotal / vector[i].getAltura();
            } posicao = i;
        }

        alturaFemMedia = alturaFemTotal / qntMulheres;

        System.out.printf("Menor altura é igual a = %.2f\n", menorAltura);
        System.out.printf("Maior altura é igual a = %.2f\n", maiorAltura);

        for (int i = 0; i < 1; i++){
            if (vector[i].getGenero() == 'F'){
                System.out.printf("A mulher mais alta é a %s\n", vector[posicao].getNome());
            } else {
                System.out.println("A pessoa mais alta é um homem.");
            }
        }

        System.out.printf("A media das alturas das mulheres é de = %.2f\n", alturaFemMedia);
        System.out.printf("Numero de homens: %d", qntHomens);

    }


}