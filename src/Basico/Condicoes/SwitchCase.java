package Basico.Condicoes;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Opções: ");
        int opcao = scanner.nextInt();

        System.out.println("1 - Luffy");
        System.out.println("2 - Law");
        System.out.println("3 - Sabo");
        System.out.println("Escolha um personagem: ");
        switch (opcao)
        {
            case 1:
                System.out.println("Você escolheu o Pirata Luffy!");
                break;
            case 2:
                System.out.println("Você escolheu o Pirata Law!");
                break;
            case 3:
                System.out.println("Você escolheu o Pirata Sabo!");
            default:
                System.out.println("Voce digitou nenhuma opção correta.");
                break;
        }

       scanner.close();
    }
}
