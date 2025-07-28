package Intermediario.Desafio5;

public class ContaPoupança extends ContaBancaria{

    public ContaPoupança(String nome, double saldo, TipoConta tipo) {
        super(nome, saldo, tipo);
    }

    @Override
    public void Depositar(double valor) {
        double taxa = (valor * 0.01);
        saldo += valor - (valor * 0.01);

        if(valor<=0){
            System.out.println("Não é possível depositar valores abaixo ou igual a zero");
        } else if (valor > 0) {
            saldo += valor;
            System.out.println(nome + " adicionou um saldo de: " + valor + "$ e foi cobrado uma taxa de " + taxa + "$");
            ConsultarSaldo();
        }
    }
}
