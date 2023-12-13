/*
*
* Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de
N funcionários. Não deve haver repetição de id.
Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma
mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários,
conforme exemplos.
Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa
ser mudado livremente. Um salário só pode ser aumentado com base em uma operação de
aumento por porcentagem dada.
*
* */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n;

        List<Funcionarios> lista = new ArrayList<>();

        System.out.print("Escreva quantas pessoas que você deseja registrar: ");
        n = scanner.nextInt();

        for (int i = 0; i < n; i++){
            System.out.println("Funcionário número " + (i + 1) + ":");
            System.out.print("Id: ");
            int ID = scanner.nextInt();
            System.out.print("Nome: ");
            String nome = scanner.next();
            System.out.print("Salário: ");
            double salario = scanner.nextDouble();

            Funcionarios func = new Funcionarios(ID, nome, salario);

            lista.add(func);
        }

        System.out.println("-------------------------------------------------------");
        System.out.println(lista);
        System.out.println("-------------------------------------------------------");

        System.out.println("Deseja aumentar o salário de algum funcionário?");
        String resposta = scanner.next();

        if (resposta.toUpperCase().equals("SIM")) {
            System.out.print("Digite o ID do funcionário que deseje realizar o aumento: ");

            int IDDesejado = scanner.nextInt();
            int i = 0;

            while (IDDesejado == lista.get(i).getID()) {
                if (IDDesejado != lista.get(i).getID()) {
                    System.out.println("Não foi possível encontrar este ID");
                } else {
                    System.out.println("Entre com o porcentual de aumento");
                    double porcentual = scanner.nextDouble();

                    lista.get(i).aumentoSalario(porcentual);

                    System.out.println(lista);
                }
                break;
            }
        }
            else {
            System.out.println(lista);
        }

    }

}