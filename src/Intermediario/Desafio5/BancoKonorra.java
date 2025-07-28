package Intermediario.Desafio5;

public class BancoKonorra {
    public static void main(String[] args) {

        ContaCorrente Naruto = new ContaCorrente("Naruto",0, ContaBancaria.TipoConta.Corrente);
        ContaPoupança Sasuke = new ContaPoupança("Sasuke", 0, ContaBancaria.TipoConta.Poupança);

        Naruto.Depositar(1000);
        System.out.println("-----------------------------");
        Naruto.Transferir(500, Sasuke);
        System.out.println("-----------------------------");
        Sasuke.Depositar(100);
        System.out.println("-----------------------------");
        Naruto.ConsultarSaldo();
        Sasuke.ConsultarSaldo();
    }
}
