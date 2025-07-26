package Intermediario;

public class MetodosFunção {
    // Método para somar dois números
    public int somar(int somaA, int somaB) {
        return somaA + somaB;
    }

    // Método para subtrair dois números
    public int subtrair(int subA, int subB) {
        return subA - subB;
    }

    // Método para multiplicar dois números
    public int multiplicar(int multA, int multB) {
        return multA * multB;
    }

    // Método para dividir dois números
    public double dividir(double divA, double divB) {
        if (divB != 0) {
            return divA / divB;
        } else {
            System.out.println("Não é possível dividir por zero.");
            return 0;
        }
    }

    public static void main(String[] args)
    {
        MetodosFunção calc = new MetodosFunção();

        // Chamando os métodos e passando parâmetros
        int soma = calc.somar(5, 3);
        int subtracao = calc.subtrair(10, 4);
        int multiplicacao = calc.multiplicar(7, 6);
        double divisao = calc.dividir(20, 4);

        // Exibindo os resultados
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
    }
}