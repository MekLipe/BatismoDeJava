package Intermediario.Desafio3refactored;

import java.util.List;

public class PirataD extends Pirata {

    private String habilidade_especial;

    public PirataD(String nome, String habilidade, int idade, long recompensa, String habilidade_especial) {
        super(nome, habilidade, idade, recompensa);
        this.habilidade_especial = habilidade_especial;
    }

    public void mostrarHabilidadeEspecial()
    {
        System.out.println("Habilidade especial é: " + habilidade_especial);
    }

    @Override
    public void mostrarInformacoes()
    {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Habilidade: " + getHabilidade());
        System.out.println("Recompensa: " + getRecompensa());
        System.out.println("Habilidade especial: " + habilidade_especial);
        System.out.println("----------------------------------------");
    }

    public String getHabilidade_especial() {
        return habilidade_especial;
    }

    public void setHabilidade_especial(String habilidade_especial) {
        this.habilidade_especial = habilidade_especial;
    }
}
