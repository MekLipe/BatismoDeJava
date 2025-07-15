package Basico.TiposDeDados;

public class DadosPrimitivos
    /*Sao tipos de dados que, geralmente,
     nao recebem métodos de maneira padrão*/
{
    public static void main(String[] args) {
        /* usar shortcut psvm para fazer a main
        * Criar um Joestar*/

        int exemploInt = 2_147_483_647; // Valor máximo: 2.147.483.647
        long exemploLong = 9_223_372_036_854_775_807L; // Valor máximo: 9.223.372.036.854.775.807
        float exemploFloat = 3.402_823_5e38f; // Valor máximo aproximado: 3.402.823.5 × 10^38
        double exemploDouble = 1.797_693_134_862_315_7e308; // Valor máximo aproximado: 1.797.693.134.862.315.7 × 10^308

        int idade = 22;
        double altura = 1.95;
        char inicial = 'J';
        boolean vivoOuMorto = false;
        long saldoBancario = 3000000000L; // Valor máximo: 9.223.372.036.854.775.807 (É possível acessar esse valor com Long.MAX_VALUE)

        System.out.print(idade);
        System.out.println("\n" + saldoBancario);
        System.out.println("Ola Mundo"); //shortcut escrevendo sout aparece o print
    }
}
