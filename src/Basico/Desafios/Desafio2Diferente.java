package Basico.Desafios;

import java.util.Scanner;

public class Desafio2Diferente {
    public static void main(String[] args)
    {
        int opcao = 0;
        int num_max = 5;
        int pirata_normal_cadastrado = 0;
        int pirata_d_cadastrado = 0;
        String[] piratas = new String[num_max];
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
                    if (pirata_d_cadastrado < 5)
                    {
                        System.out.println("\nDigite o nome do pirata " + (pirata_d_cadastrado +1) + ":");
                        piratas[pirata_d_cadastrado] = scanner.nextLine();
                        pirata_d_cadastrado++;
                    }
                    else
                    {
                        System.out.println("Não é possível cadastrar um novo pirata, a lista está cheia.");
                    }
                    break;

                case 2:
                    if (pirata_d_cadastrado == 0)
                    {
                        System.out.println("Nenhum pirata encontrado.");
                    }
                    else
                    {
                        System.out.println("---------- Lista de Piratas ----------");
                        for (int i = 0; i < piratas.length; i++)
                        {
                            System.out.println("Pirata " + (i+1) + ": " + piratas[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Sistema encerrado!");
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        }
        scanner.close();
    }
}
