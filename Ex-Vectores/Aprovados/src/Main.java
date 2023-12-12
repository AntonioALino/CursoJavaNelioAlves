import java.util.Formattable;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int qntAlunos;
        double media;

        System.out.println("Digite a quantidade de alunos da sala");
        qntAlunos = scanner.nextInt();

        int[] vector  = new int [qntAlunos];
        String[] nome = new String[qntAlunos];
        Double[] nota1 = new Double[qntAlunos];
        Double[] nota2 = new Double[qntAlunos];

        for (int i = 0; i < vector.length; i++){
            System.out.println("Digite o nome do aluno");
            nome[i] = scanner.next();
            System.out.println("Digite a primeira nota do aluno");
            nota1[i] = scanner.nextDouble();
            System.out.println("Digite a segunda nota do aluno");
            nota2[i] = scanner.nextDouble();
        }

        for (int i = 0; i < vector.length; i++){
            media = nota1[i] + nota2[i];
            if (media >= 6){
                System.out.printf("%s\n", nome[i]);
            }

        }

    }
}