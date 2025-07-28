package Intermediario.Desafio5;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(String nome, double saldo, TipoConta tipo) {
        super(nome, saldo, tipo);
    }

    @Override
    public void Depositar(double valor) {
        if(valor<=0){
            System.out.println("Não é possivel depositar valores abaixo ou igual a zero");
        } else if (valor > 0) {
            saldo += valor;
            System.out.println(nome + " adicionou um saldo: " + valor);
            ConsultarSaldo();
        }
    }
}
