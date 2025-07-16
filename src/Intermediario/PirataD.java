package Intermediario;

public class PirataD extends Pirata{

    String habilidade_especial;

    public void mostrarHabilidadeEspecial()
    {
        System.out.println("Habilidade especial é: " + habilidade_especial);
    }
    public void mostrarInformacoes()
    {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + habilidade);
        System.out.println("Recompensa: " + recompensa);
        mostrarHabilidadeEspecial();
        System.out.println("----------------------------------------");
    }
}
