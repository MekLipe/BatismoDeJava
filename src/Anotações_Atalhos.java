public @interface Anotações_Atalhos {
    /*
    * Atalhos:
    * Fazer um construtor: Alt + Insert
    * Formatar o código automaticamente: Alt + Shift + F
    * Procurar e mudar todas as instancias: Ctrl + H no pc e Ctrl + R no note'
    * Comentário em bloco: Alt + Shift + A , Ctrl + NumPad /
    *
    * Anotações:
    * toda ves que voce for sobrecarregar um construtor, basta referenciar oq ja foi referenciado com
    * this(nome, idade, cidade) em vez de fazer um this. para cada atributo dnv
    * */

    /*
    Comparator é um objeto que sabe comparar dois elementos e dizer qual vem antes.
    Internamente, ele funciona como uma função que recebe (objeto1, objeto2) e devolve:
        Um número negativo se objeto1 vem antes de objeto2.
        Zero se são iguais.
        Um número positivo se objeto1 vem depois de objeto2.
    Exemplo simples:
    Comparator<Ninja> compararPorNome = (n1, n2) -> n1.getNome().compareTo(n2.getNome());

     */
}
