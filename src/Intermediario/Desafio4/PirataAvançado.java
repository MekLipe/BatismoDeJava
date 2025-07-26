package Intermediario.Desafio4;

public class PirataAvançado extends PirataBasico implements Pirata{
    String especialidade;
    TipoHaki haki;

    public PirataAvançado(String nome, long recompensa, String habilidade, String especialidade, TipoHaki haki)
    {
        super(nome, recompensa, habilidade);
        this.especialidade = especialidade;
        this.haki = haki;
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Habilidade Especial: " + especialidade);
        System.out.println("Haki: " + haki.name());
    }

    @Override
    public void executarHabilidade() {
        super.executarHabilidade();
    }
}
