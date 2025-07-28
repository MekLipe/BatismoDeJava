package Intermediario.Desafio3refactored;

import java.util.List;

public class Pirata {

    private String nome;
    private String habilidade;
    private int idade;
    private long recompensa;

    public Pirata(String nome, String habilidade, int idade, long recompensa) {
        this.nome = nome;
        this.habilidade = habilidade;
        this.idade = idade;
        this.recompensa = recompensa;
    }

    public void mostrarInformacoes()
    {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + habilidade);
        System.out.println("Recompensa: " + recompensa);
        System.out.println("----------------------------------------");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public long getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(long recompensa) {
        this.recompensa = recompensa;
    }
}
