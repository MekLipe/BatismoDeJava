package Intermediario.Desafio4;

public class PirataBasico implements Pirata{
    String nome;
    long recompensa;
    String habilidade;

    public PirataBasico(String nome, long recompensa, String habilidade)
    {
        this.nome = nome;
        this.recompensa = recompensa;
        this.habilidade = habilidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Recompensa: " + recompensa);
        System.out.println("Habilidade: " + habilidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Meu nome é " + nome + " e uso minha habilidade: " + habilidade);
    }
}
