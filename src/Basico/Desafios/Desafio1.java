package Basico.Desafios;

public class Desafio1
{
    public static void main(String[] args)
    {
        String nome_personagem1 = "Roronoa Zoro";
        int nivel_forca_personagem1 = 7;
        String vilao1 = "Mihawk";
        int nivel_forca_vilao1 = 9;
        boolean tanka1 = false;

        String nome_personagem2 = "Monkey D. Garp";
        int nivel_forca_personagem2 = 10;
        String vilao2 = "Barba Negra";
        int nivel_forca_vilao2 = 8;
        boolean tanka2 = false;

        System.out.println("- Nome do personagem: " + nome_personagem1);
        System.out.println("- Nível de força do " + nome_personagem1 + ": " + nivel_forca_personagem1);
        System.out.println("- Nome do Vilão: " + vilao1);
        System.out.println("- Nível de força do vilão: "+ nivel_forca_vilao1);

        System.out.println("-----------------------------------------------------------------------");

        System.out.println("- Nome do personagem: " + nome_personagem2);
        System.out.println("- Nível de força do " + nome_personagem2 + ": " + nivel_forca_personagem2);
        System.out.println("- Nome do Vilão: " + vilao2);
        System.out.println("- Nível de força do vilão: "+ nivel_forca_vilao2);

        if (nivel_forca_personagem1 >= nivel_forca_vilao1)
        {
            tanka1 = true;
        }
        if (nivel_forca_personagem2 >= nivel_forca_vilao2)
        {
            tanka2 = true;
        }
        System.out.println("Persongaem 1 " + (tanka1? "Tanka fácil" : "É derrotado"));
        System.out.println("Persongaem 2 " + (tanka2? "Tanka fácil" : "É derrotado"));
    }
}
