package Intermediario.Desafio3refactored;

import java.util.ArrayList;
import java.util.List;

public class ListaPirata {

    private List<Pirata> ListaPirata;

    public ListaPirata(){
        this.ListaPirata = new ArrayList<>();
    }

    public void AdicionarPirata (Pirata pirata){
        ListaPirata.add(pirata);
    }

    void RemoverPirata (Pirata pirata){
        if (ListaPirata.isEmpty()){
            System.out.println("Nenhum pirata foi encontrado.");
        }
        ListaPirata.remove(pirata);
        System.out.println(pirata + " foi removido da Lista Pirata");
        System.out.println("--------------------------------------");
    }
}
