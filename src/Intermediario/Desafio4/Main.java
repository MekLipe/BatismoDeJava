package Intermediario.Desafio4;

public class Main {
    public static void main(String[] args) {
        PirataBasico Franky = new PirataBasico("Franky", 10000000, "Franky Shogun");
        Franky.mostrarInformacoes();
        Franky.executarHabilidade();
        System.out.println("----------------------------");

        PirataAvançado Shanks = new PirataAvançado("Shanks", 4048900000L, "Kamusari", "Espadachim", TipoHaki.Todos);
        Shanks.mostrarInformacoes();
        Shanks.executarHabilidade();
    }

}
