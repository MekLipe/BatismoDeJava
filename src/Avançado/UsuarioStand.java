package Avançado;

import java.util.Map;

public class UsuarioStand {

    private String nome;
    private int idade;
    private String stand;
    private char poder_destrutivo;

    public UsuarioStand(String nome, int idade, String stand, char poder_destrutivo) {
        this.nome = nome;
        this.idade = idade;
        this.stand = stand;
        this.poder_destrutivo = poder_destrutivo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getStand() {
        return stand;
    }

    public void setStand(String stand) {
        this.stand = stand;
    }

    public char getPoder_destrutivo() {
        return poder_destrutivo;
    }

    public void setPoder_destrutivo(char poder_destrutivo) {
        this.poder_destrutivo = poder_destrutivo;
    }

    @Override
    public String toString() {
        return String.format("Nome: %-19s | Idade: %-3d | Stand: %-16s | Poder Destrutivo: '%s' |",
                nome, idade, stand, poder_destrutivo);
    }

    public static final Map<Character, Integer> RANKING = Map.of(
            'S', 6,
            'A', 5,
            'B', 4,
            'C', 3,
            'D', 2,
            'E', 1
    );

}
