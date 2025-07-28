package Intermediario.Desafio5;

public abstract class ContaBancaria implements Conta {

    enum TipoConta {Corrente, Poupança}

    ;
    String nome;
    double saldo;
    TipoConta tipo;

    public ContaBancaria(String nome, double saldo, TipoConta tipo) {
        this.nome = nome;
        this.saldo = saldo;
        this.tipo = tipo;
    }

    @Override
    public void ConsultarSaldo() {
        System.out.println(nome + " saldo atual é: " + saldo);
    }

    @Override
    public abstract void Depositar(double valor);

    public void Transferir(double valor, ContaBancaria destinatario) {
        if (valor <= 0) {
            System.out.println("Valor inválido para transferência.");
        } else if (valor > saldo) {
            System.out.println("Você não pode transferir mais do que R$" + saldo);
        } else if (valor <= saldo) {
            saldo -= valor;

            destinatario.saldo += valor;
            System.out.println(nome + " transferiu " + valor + "$ para " + destinatario.nome);
            System.out.println("Transferência realizada com sucesso!");
            destinatario.ConsultarSaldo();
        }
    }
}
