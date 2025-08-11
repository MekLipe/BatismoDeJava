package Intermediario.Desafio3refactored;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int opcao = 0;
        final int num_max = 3;
        ArrayList<Pirata> lista_pirata = new ArrayList<>();
        ArrayList<PirataD> lista_D = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (opcao != 5)
        {
            System.out.println("\n================ Menu Pirata ================");
            System.out.println("1. Cadastrar novo Pirata");
            System.out.println("2. Cadastrar novo D.");
            System.out.println("3. Listar  informações dos Piratas");
            System.out.println("4. Alterar habilidade especial de um D.");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao)
            {
                case 1:
                    if (lista_pirata.size() < num_max)
                    {
                            System.out.println("\nDigite o nome do pirata " + (lista_pirata.size() + 1) + ":");
                            String nome = scanner.nextLine();
                            System.out.println("Digite a habilidade do pirata " + (lista_pirata.size() + 1) + ":");
                            String habilidade = scanner.nextLine();
                            System.out.println("Digite a idade do pirata " + (lista_pirata.size() + 1) + ":");
                            int idade = scanner.nextInt();
                            System.out.println("Digite a recompensa do pirata " + (lista_pirata.size() + 1) + ":");
                            Long recompensa = scanner.nextLong();
                            Pirata pirata = new Pirata(nome, habilidade, idade, recompensa);
                            lista_pirata.add(pirata);
                        System.out.println("Pirata adicionado com sucesso");
                    }
                    else
                    {
                        System.out.println("Não é possível cadastrar um novo pirata, a lista está cheia.");
                    }
                    break;

                case 2:
                    if (lista_pirata.size() < num_max)
                {
                    System.out.println("\nDigite o nome do pirata D. " + (lista_D.size() + 1) + ":");
                    String nome = scanner.nextLine();
                    System.out.println("Digite a habilidade do pirata D. " + (lista_D.size() + 1) + ":");
                    String habilidade = scanner.nextLine();
                    System.out.println("Digite a idade do pirata D. " + (lista_D.size() + 1) + ":");
                    int idade = scanner.nextInt();
                    System.out.println("Digite a recompensa do pirata D. " + (lista_D.size() + 1) + ":");
                    Long recompensa = scanner.nextLong();
                    scanner.nextLine(); // essa linha serve para o enter no scanner anterior nao ser consumido no buffer
                    System.out.println("Digite a habilidade especial do pirata D. " + (lista_D.size() + 1) + ":");
                    String habilidade_especial = scanner.nextLine();
                    PirataD pirataD = new PirataD(nome, habilidade, idade, recompensa, habilidade_especial);
                    lista_D.add(pirataD);
                    System.out.println(pirataD.getNome() + " adicionado com sucesso!");
                }
                else
                {
                    System.out.println("Não é possível cadastrar um novo D., a lista está cheia.");
                }
                    break;

                case 3:
                    System.out.println("\n---------- Lista de Piratas ----------");
                    //primeiro é impresso os piratas normais

                    if (lista_pirata.isEmpty())
                    {
                        System.out.println("\nNenhum pirata encontrado.");
                    }
                    else
                    {
                        for (Pirata pirata : lista_pirata){
                            System.out.println("Pirata " + (lista_pirata.size() + 1) + ":");
                            pirata.mostrarInformacoes();
                        }
                    }

                    //Em seguida é impresso os D.
                    System.out.println("\n------------- Lista dos D. -------------");
                    if (lista_D.isEmpty())
                    {
                        System.out.println("\nNenhum D. encontrado.");
                    }
                    else
                    {
                        for (PirataD pirataD : lista_D)
                        {
                            pirataD.mostrarInformacoes();
                        }
                    }
                    break;

                case 4:
                    if (lista_D.isEmpty())
                    {
                        System.out.println("\nNenhum D. encontrado.");
                    }
                    else
                    {
                        System.out.println("\n======= Lista dos D. =======");
                        int i= 0;
                        for (PirataD pirataD : lista_D)
                        {
                            System.out.println((i+1) + " - " + pirataD.getNome());
                            i++;
                        }
                        System.out.println("===========================");
                        System.out.println("\nDigite o numero de um D para alterar a habilidade: ");
                        int escolha = scanner.nextInt();
                        scanner.nextLine();

                        if (escolha >= 1 && escolha <= lista_D.size()) {
                            PirataD pirataSelecionado = lista_D.get(escolha - 1);

                            System.out.println("Habilidade especial de " + pirataSelecionado.getNome() + ": " + pirataSelecionado.getHabilidade_especial());
                            System.out.print("Digite a nova habilidade: ");
                            pirataSelecionado.setHabilidade_especial(scanner.nextLine());
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
        lista_pirata.add(new Pirata("kaidou", "Uo-Uo no mi", 70, 4000000000L));
        scanner.close();
    }
}
