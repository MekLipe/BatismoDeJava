package Intermediario;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        /*
        FamiliaD Luffy = new FamiliaD();
        Luffy.nome = "Monkey D. Luffy";
        Luffy.habilidade = "Hito Hito no mi Modelo Nika";
        Luffy.idade = 19;
        */

        int opcao = 0;
        int num_max = 3;
        int piratas_normais_cadastrados = 0;
        int piratas_d_cadastrados = 0;
        Pirata[] pirata_normal = new Pirata[num_max];
        PirataD[] pirata_D = new PirataD[num_max];
        Scanner scanner = new Scanner(System.in);

        while (opcao != 3)
        {
            System.out.println("\n===== Menu Pirata =====");
            System.out.println("1. Cadastrar novo Pirata");
            System.out.println("2. Cadastrar novo D.");
            System.out.println("3. Listar  informações dos Piratas");
            System.out.println("4. Alterar habilidade especial de um Pirata");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao)
            {
                case 1:
                    if (piratas_normais_cadastrados < 3)
                    {
                            pirata_normal[piratas_normais_cadastrados] = new Pirata();
                            System.out.println("\nDigite o nome do pirata " + (piratas_normais_cadastrados + 1) + ":");
                            pirata_normal[piratas_normais_cadastrados].nome = scanner.nextLine();
                            System.out.println("Digite a habilidade do pirata " + (piratas_normais_cadastrados + 1) + ":");
                            pirata_normal[piratas_normais_cadastrados].habilidade = scanner.nextLine();
                            System.out.println("Digite a idade do pirata " + (piratas_normais_cadastrados + 1) + ":");
                            pirata_normal[piratas_normais_cadastrados].idade = scanner.nextInt();

                            piratas_normais_cadastrados++;
                    }
                    else
                    {
                        System.out.println("Não é possível cadastrar um novo pirata, a lista está cheia.");
                    }
                    break;

                case 2:
                    if (piratas_d_cadastrados < 3)
                    {
                        pirata_normal[piratas_d_cadastrados] = new PirataD();
                        System.out.println("\nDigite o nome do pirata " + (piratas_normais_cadastrados + 1) + ":");
                        pirata_normal[piratas_d_cadastrados].nome = scanner.nextLine();
                        System.out.println("Digite a habilidade do pirata " + (piratas_normais_cadastrados + 1) + ":");
                        pirata_normal[piratas_d_cadastrados].habilidade = scanner.nextLine();
                        System.out.println("Digite a idade do pirata " + (piratas_normais_cadastrados + 1) + ":");
                        pirata_normal[piratas_d_cadastrados].idade = scanner.nextInt();
                        System.out.println("Digite a recompensa do pirata " + (piratas_normais_cadastrados + 1) + ":");
                        pirata_normal[piratas_d_cadastrados].recompensa = scanner.nextLong();
                        System.out.println("Digite a habilidade especial do pirata " + (piratas_normais_cadastrados + 1) + ":");
                        pirata_normal[piratas_d_cadastrados].recompensa = scanner.nextLong();
                        piratas_d_cadastrados++;
                    }
                    else
                    {
                        System.out.println("Não é possível cadastrar um novo D, a lista está cheia.");
                    }
                    break;

                case 3:
                    System.out.println("---------- Lista de Piratas ----------");

                    //primeiro é impresso os piratas normais
                    if (piratas_normais_cadastrados == 0)
                    {
                        System.out.println("Nenhum pirata encontrado.");
                    }
                    else
                    {
                        for (int i = 0; i < pirata_normal.length; i++)
                        {
                            System.out.println("Pirata " + (i+1) + ": ");
                            pirata_normal[i].mostrarInformacoes();
                        }
                    }

                    //Em seguida é impresso os D.
                    if (piratas_d_cadastrados == 0)
                    {
                        System.out.println("Nenhum D. encontrado.");
                    }
                    else
                    {
                        for (int i = 0; i < pirata_D.length; i++)
                        {
                            System.out.println("Pirata " + (i+1) + ": ");
                            pirata_D[i].mostrarInformacoes();
                        }
                    }
                    break;

                case 4:
                    if (piratas_d_cadastrados == 0)
                    {
                        System.out.println("Nenhum D. encontrado.");
                    }
                    else
                    {
                        System.out.println("Digite o numero de um D para alterar a habilidade:");
                        for (int i = 0; i < pirata_D.length; i++)
                        {
                            System.out.println("Pirata " + (i+1) + ": " + pirata_D[i].nome);
                        }
                        int escolha = scanner.nextInt();
                        
                    }
                    break;

                case 5:
                    System.out.println("Sistema encerrado!");
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        }
        scanner.close();
    }
}
