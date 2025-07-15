package Basico.Condicoes;

public class IfElse {
    public static void main(String[] args) {
        /*Algoritmo: Passar o Personagem de rank de poder de acordo com o
        * número de vilões derrotados e recompensa
        *
        * se (condição)
        * {
        *   Faça isso
        * }
        */

       String nome = "Monkey D. Luffy";
       int idade = 19;
       long recompensa = 3000000000L;
       String rank = "";
       String origem = "East Blue";
       String bando = "Mugiwaras";
       String akuma_no_mi = "Hito Hito no Mi Nika";
       boolean descobriu_onepiece = false;

       if(recompensa >= 50000000)
       {
           rank = "Supernova";
       } else if (recompensa >= 100000000)
       {
           rank = "Shichibukai";
       } else if (recompensa >=2000000000)
       {
           rank = "Yonkou";
       } else if (recompensa >=5000000000L && descobriu_onepiece == true)
       {
           rank = "Rei dos Piratas";
       }

        System.out.printf("- Personagem : %s " +
                "\n- Recompensa: %s " +
                "\n- Idade: %d" +
                "\n- Origem: %s " +
                "\n- Bando: %s" +
                "\n- Akuma no Mi: %s" +
                "\n- Descobriu o one piece? %s",
                nome, recompensa, idade, origem,
                bando, akuma_no_mi, descobriu_onepiece ? "Sim" : "Não");

    }
}
