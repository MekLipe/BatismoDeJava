package Intermediario.Desafio6;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Ninja> lista = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int op;

        lista.add(new Ninja("Naruto", 17, "Konoha"));
        lista.add(new Ninja("Sasuke", 17, "Konoha"));
        lista.add(new Ninja("Sakura", 17, "Konoha"));
        lista.add(new Ninja("Kakashi", 30, "Konoha"));
        lista.add(new Ninja("Gaara", 17, "Suna"));
        lista.add(new Ninja("Rock Lee", 17, "Konoha"));
        lista.add(new Ninja("Neji", 17, "Konoha"));

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Exibir lista completa");
            System.out.println("2. Adicionar ninja no início");
            System.out.println("3. Remover primeiro ninja");
            System.out.println("4. Acessar ninja por posição");
            System.out.println("5. Acessar ninja por nome");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            op = scanner.nextInt();
            scanner.nextLine(); // limpar o buffer

            switch (op) {
                case 1:
                    ExibirLista(lista);
                    break;
                case 2:
                    AdicionarNoInicio(lista, scanner);
                    break;
                case 3:
                    RemoverNoInicio(lista);
                    break;
                case 4:
                    AcessarPosicao(lista, scanner);
                    break;
                case 5:
                    AcessarPeloNome(lista, scanner);
                case 6:
                    OrdenarLista(lista, scanner);
                    break;
                case 0:
                    System.out.println("Programa encerrado!");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while(op != 0);
        scanner.close();
    }
    //Métodos

    public static void ExibirLista(LinkedList<Ninja> lista){
        if (lista.isEmpty())
        {
            System.out.println("Nenhum ninja foi inserido na lista.");
        } else {
            for (Ninja ninja : lista){
                ninja.MostrarInformacoes();
            }
        }
    }
    public static void AdicionarNoInicio(LinkedList<Ninja> lista, Scanner scanner){
        System.out.println("Digite o nome do novo ninja: ");
        String nome = scanner.nextLine();
        System.out.println("Digite a idade do novo ninja: ");
        int idade = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite a aldeia do novo ninja: ");
        String aldeia = scanner.nextLine();
        lista.addFirst(new Ninja(nome, idade, aldeia));
        System.out.println(nome + "foi inserido na lista!");
    }

    public static void RemoverNoInicio(LinkedList<Ninja> lista){
        if (lista.isEmpty()){
            System.out.println("Lista vazia, nenhum ninja para remover");
        }
        else {
            lista.removeFirst();
            System.out.println("O primeiro ninja da lista: " + lista.getFirst() + ", foi removido");
            System.out.println(lista);
        }
    }

    public static void AcessarPosicao(LinkedList<Ninja> lista, Scanner scanner){
        System.out.println("Escolha um número de 0 a " + (lista.size()-  1) + " para saber a respectiva posição do ninja");
        System.out.println("Digite aqui: ");
        int posicao = scanner.nextInt();
        if (posicao >= 0 && posicao < lista.size()){
            String ninja_posicao = lista.get(posicao).getNome();
            System.out.println("Ninja da posição " + posicao + ": " + ninja_posicao);
            System.out.println(lista.get(posicao));
        }
        else {
            System.out.println("Opção inválida");
        }
    }

    public static void AcessarPeloNome(LinkedList<Ninja> lista, Scanner scanner){
        if (lista.isEmpty())
        {
            System.out.println("Nenhum ninja foi inserido na lista.");
        } else {
            System.out.println("Digite o nome do ninja para buscar ");
            String nome = scanner.nextLine();
            boolean flag = false;
            for (Ninja ninja : lista) {
                if (nome.equalsIgnoreCase(ninja.getNome())) {
                    ninja.MostrarInformacoes();
                    flag = true;
                }
            }
            if (!flag){
                System.out.println("Ninja não encontrado");
            }
        }
    }

    public static void OrdenarLista(LinkedList<Ninja> lista, Scanner scanner){

    }
}
