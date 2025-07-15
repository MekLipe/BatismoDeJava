package Basico.Desafios;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args)
    {
        int opcao = 0;
        String[] pirata = new String[3];
        Scanner scanner = new Scanner(System.in);
        while (opcao != 3)
        {
            System.out.println("\n===== Menu Pirata =====");
            System.out.println("1. Cadastrar Pirata");
            System.out.println("2. Listar Piratas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao)
            {
                case 1:
                    for (int i = 0; i < 3; i++)
                    {
                        System.out.println("Insira o nome do pirata " + (i+1) + " :");
                        pirata[i] = scanner.nextLine();
                    }
                    break;
                case 2:
                    System.out.println("------- Lista dos Piratas ------");
                    for (int i = 0; i < 3; i++)
                    {
                        System.out.println("Pirata " + (i+1) + ": " + pirata[i]);
                    }
                    break;
                case 3:
                    System.out.println("Programa Encerrado");
                    break;
                default:
                    System.out.println("Opção incorreta");
                    break;
            }
        }

        scanner.close();
        //aqui acaba o programa
    }
}
