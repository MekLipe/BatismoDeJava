package Intermediario.Generics;

import com.sun.source.tree.DoWhileLoopTree;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BolsaPirata<Object> bolsa = new BolsaPirata<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("---------CADASTRO---------");
            System.out.println("1 - Cadastrar um item");
            System.out.println("2 - Buscar item");
            System.out.println("3 - Listar items");
            System.out.println("4 - Remover item");
            System.out.println("5 - Sair");
            System.out.print("Escolha um Opçao: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Digite o nome do item: ");
                    String item = scanner.nextLine();
                    bolsa.AddItem(item);
                    System.out.println(item + " foi adicionado na bolsa");
                    break;
                case 2:
                    System.out.println("Digite o item que deseja buscar: ");
                    String item_busca = scanner.nextLine();
                    // é retornado o index do item que o usuário busca
                    System.out.println("O item está no slot: " + bolsa.BuscarItem(item_busca));
                    break;
                case 3:
                    bolsa.ListarItens();
                    break;
                case 4:
                    System.out.println("Digite o item que deseja remover: ");
                    item = scanner.nextLine();
                    bolsa.RemoverItem(item);
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (opcao !=5 );
        System.out.println("Saindo do programa, aguarde...");
        scanner.close();
    }
}
