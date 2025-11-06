package Avançado;

public class Pessoa {

    private String Nacionalidade;
    private String nome;
    private Long CPF;
    private int idade;

    public Pessoa(String nome, Long CPF, int idade, String Nacionalidade) {
        this.nome = nome;
        this.CPF = CPF;
        this.idade = idade;
        this.Nacionalidade = Nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCPF() {
        return CPF;
    }

    public void setCPF(Long CPF) {
        this.CPF = CPF;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNacionalidade() {
        return Nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        Nacionalidade = nacionalidade;
    }
}

class main{
    public static void main(String[] args) {
        Pessoa jurandir = new Pessoa("jurandir", 78060657L, 20, "Brasileiro");

        //Modifica o nome do usuário
        jurandir.setNome("jurandir pinto");

        //printa o nome
        System.out.println(jurandir.getNome());

        jurandir.setCPF(654651654L);
        System.out.println(jurandir.getCPF());

    }
}
