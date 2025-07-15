package Basico.Condicoes;

import java.util.Scanner;

public class Scanners {
    public static void main(String[] args) {
        // sempre declare isso para o abrir o scanner e o sistema conseguir passar parametros para ele
        Scanner texto = new Scanner(System.in);

        System.out.println("Digite aqui o nome do pirata: ");
        /* o metodo next sempre irá dizer o tipo de dado que irá receber, e neste caso,
           será recebido o tipo string porque tem o "Line"*/

        String nome_pirata = texto.nextLine();

        System.out.println("Digite aqui a idade do pirata: ");
        int idade = texto.nextInt();

        System.out.println("Nome do pirata: " + nome_pirata + "\nIdade do pirata: " + idade);

        // Fechar o scanner para que o sistema nao aceite mais parâmetros
        texto.close();
    }
}
