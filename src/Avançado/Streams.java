package Avançado;

import Basico.NivelIniciante.Array;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static Avançado.UsuarioStand.RANKING;

public class Streams {
    public static void main(String[] args) {

        List<UsuarioStand> joestars = new ArrayList<>();

        joestars.add(new UsuarioStand("Jhonathan Joestar",20, "Nenhum", 'E'));
        joestars.add(new UsuarioStand("Joseph Joestar",91, "Hermit Purple",'E'));
        joestars.add(new UsuarioStand("Jotaro Kujo",40,"Star Platinum", 'S'));
        joestars.add(new UsuarioStand("Josuke Higashikata",16,"Crazy Diamond", 'B'));
        joestars.add(new UsuarioStand("Giorno Giovanna",26,"Gold Experience",'C'));
        joestars.add(new UsuarioStand("Jolyne Cujoh",19,"Stone Free",'B'));
        joestars.add(new UsuarioStand("Johnny Joestar",29, "Tusk",'A'));


        System.out.println("----------------------------------------------------");
        joestars.stream()
                .sorted(Comparator.comparingInt(u -> RANKING.get(u.getPoder_destrutivo())))
                .sorted(Comparator.comparingInt((UsuarioStand u) -> RANKING.get(u.getPoder_destrutivo())).reversed())
                .forEach(System.out::println);


        /*
        joestars.stream()
                .sorted(Comparator.comparingInt(UsuarioStand::getPoder_destrutivo))
                .forEach(System.out::println);

        joestars.stream()
                .sorted((usuario1, usuario2)  -> String.CASE_INSENSITIVE_ORDER
                        .compare(usuario1.getStand(), usuario2.getStand()))
                .forEach(System.out::println);

         */
    }
}

