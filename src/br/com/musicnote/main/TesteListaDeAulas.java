package br.com.musicnote.main;

import br.com.musicnote.model.Aula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TesteListaDeAulas {

    public static void main(String[] args) {

        Aula c1 = new Aula("Teclado", 20);
        Aula c2 = new Aula("Canto", 22);
        Aula c3 = new Aula("Trompete", 16);

        ArrayList<Aula> aulas = new ArrayList<>();

        aulas.add(c1);
        aulas.add(c2);
        aulas.add(c3);

        //Antes de ordenar
        System.out.println("Antes de ordenar" + aulas);

        Collections.sort(aulas);

        //Depois de ordenar pelo tempo utilizando o comparableTo implementado na classe
        System.out.println("Depois de ordenar" + aulas);

        //Outra maneira de ordenar pelo tempo (menor para o maior)
        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
        System.out.println(aulas);

        //Maneira mais enxuta que o exemplo anterior
        aulas.sort(Comparator.comparing(Aula::getTempo));
        System.out.println(aulas);
    }
}
