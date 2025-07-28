package Intermediario.Generics;

import java.util.ArrayList;
import java.util.List;

public class BolsaPirata<T> {

    /*
    A classe BolsaPirata<T> não é uma lista diretamente, mas ela contém uma lista internamente (o campo private List<T> Bolsa),
    funcionando como uma "bolsa" personalizada que armazena itens do tipo T.
    Ou seja:
    bolsa não é a lista.
    bolsa é um objeto da classe BolsaPirata que possui uma lista chamada Bolsa.
    */

    private List<T> Bolsa;

    //Adicionar itens na bolsa
    public void AddItem(T item){
        Bolsa.add(item);
    }

    //Remove item da bolsa
    public void RemoverItem(T item){
        if (Bolsa.isEmpty()){
            System.out.println("Bolsa vazia, adicione algum item");
        }
        Bolsa.remove(item);
        System.out.println("O item " + item + " foi removido da bolsa");
    }

    //Construtor da lista
    public BolsaPirata() {
        this.Bolsa = new ArrayList<>();
    }

    //Busca e retorna o index do item na bolsa
    public int BuscarItem(T item){
        return Bolsa.indexOf(item);
    }
    //Mostra a lista dos itens na bolsa

    public void ListarItens(){
        for (T item : Bolsa){
            System.out.println("-" + item);
        }
        System.out.println(Bolsa);
    }

}
