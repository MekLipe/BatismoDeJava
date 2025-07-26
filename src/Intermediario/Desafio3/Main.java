package Intermediario.Desafio3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int opcao = 0;
        int num_max = 3;
        int piratas_normais_cadastrados = 0;
        int piratas_d_cadastrados = 0;
        Pirata[] pirata_normal = new Pirata[num_max];
        PirataD[] pirata_D = new PirataD[num_max];
        Scanner scanner = new Scanner(System.in);

        while (opcao != 5)
        {
            System.out.println("================ Menu Pirata ================");
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
                            System.out.println("Digite a recompensa do pirata " + (piratas_normais_cadastrados + 1) + ":");
                            pirata_normal[piratas_normais_cadastrados].recompensa = scanner.nextLong();
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
                        pirata_D[piratas_d_cadastrados] = new PirataD();
                        System.out.println("\nDigite o nome do pirata " + (piratas_d_cadastrados + 1) + ":");
                        pirata_D[piratas_d_cadastrados].nome = scanner.nextLine();
                        System.out.println("Digite a habilidade do pirata " + (piratas_d_cadastrados + 1) + ":");
                        pirata_D[piratas_d_cadastrados].habilidade = scanner.nextLine();
                        System.out.println("Digite a idade do pirata " + (piratas_d_cadastrados + 1) + ":");
                        pirata_D[piratas_d_cadastrados].idade = scanner.nextInt();
                        System.out.println("Digite a recompensa do pirata " + (piratas_d_cadastrados + 1) + ":");
                        pirata_D[piratas_d_cadastrados].recompensa = scanner.nextLong();
                        scanner.nextLine();
                        System.out.println("Digite a habilidade especial do pirata " + (piratas_d_cadastrados + 1) + ":");
                        pirata_D[piratas_d_cadastrados].habilidade_especial = scanner.nextLine();
                        piratas_d_cadastrados++;
                    }
                    else
                    {
                        System.out.println("Não é possível cadastrar um novo D, a lista está cheia.");
                    }
                    break;

                case 3:
                    System.out.println("\n---------- Lista de Piratas ----------");

                    //primeiro é impresso os piratas normais
                    if (piratas_normais_cadastrados == 0)
                    {
                        System.out.println("Nenhum pirata encontrado.");
                    }
                    else
                    {

                        for (int i = 0; i < pirata_normal.length; i++)
                        {
                            //este if serve para verificar se a posição do vetor esta vazia, se estiver, ele ira dizer que esta vazio, se não, ira mostrar as informações
                            if (pirata_normal[i] == null) {
                                System.out.println("Pirata " + (i+1) + ": null");
                                System.out.println("----------------------------------------");
                            }
                            else {
                                System.out.println("Pirata " + (i + 1) + ": ");
                                pirata_normal[i].mostrarInformacoes();
                            }
                        }
                    }

                    //Em seguida é impresso os D.
                    System.out.println("------------- Lista dos D. -------------");
                    if (piratas_d_cadastrados == 0)
                    {
                        System.out.println("Nenhum D. encontrado.");
                    }
                    else
                    {
                        for (int i = 0; i < pirata_D.length; i++)
                        {
                            //este if serve para verificar se a posição do vetor esta vazia, se estiver, ele ira dizer que esta vazio, se não, ira mostrar as informações
                            if (pirata_D[i] == null) {
                                System.out.println("Pirata D. " + (i+1) + ": null");
                                System.out.println("----------------------------------------");
                            }
                            else {
                                System.out.println("Pirata D. " + (i + 1) + ": ");
                                pirata_D[i].mostrarInformacoes();
                            }
                        }
                    }
                    break;

                case 4:
                    if (piratas_d_cadastrados == 0)
                    {
                        System.out.println("Nenhum D. encontrado.\n");
                    }
                    else
                    {
                        System.out.println("======= Lista dos D. =======");
                        for (int i = 0; i < pirata_D.length; i++)
                        {
                            if (pirata_D[i] == null) {
                                System.out.println("Pirata D. " + (i+1) + ": null");
                            }
                            else {
                                System.out.println("Pirata " + (i + 1) + ": " + pirata_D[i].nome);
                            }
                        }
                        System.out.println("Digite o numero de um D para alterar a habilidade: ");
                        int escolha = scanner.nextInt();
                        scanner.nextLine();

                        if (escolha >= 1 && escolha <= piratas_d_cadastrados) {
                            System.out.println("Habilidade especial de " + pirata_D[escolha - 1].nome + ": " + pirata_D[escolha - 1].habilidade_especial);
                            System.out.print("Insira a nova habilidade: ");
                            pirata_D[escolha - 1].habilidade_especial = scanner.nextLine();
                            System.out.println("Habilidade atualizada com sucesso!");
                        } else {
                            System.out.println("Número inválido.");
                        }
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
