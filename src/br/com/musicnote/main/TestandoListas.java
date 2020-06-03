package br.com.musicnote.main;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

    public static void main(String[] args) {

        //Criação das variáveis
        String aula1 = "Acordes";
        String aula2 = "Slap";
        String aula3 = "Groove";

        //Lista de String para guardar essas variáveis e adicionar
        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);

        //Remover algum curso
        aulas.remove(2);
        System.out.println(aulas);

        aulas.add(aula3);

        //Comando para percorrer a lista e imprimir cada curso
        for (String curso: aulas) {
            System.out.println("Aula: " + curso);
        }

        //O get traz a posição de determinado curso
        String primeiroCurso = aulas.get(0);
        System.out.println("A primeira aula é: " + primeiroCurso);

        //Método .size é equivalente ao .length para trazer o total de aulas
        for (int i = 0; i < aulas.size(); i++) {
            System.out.println("Aula: " + aulas.get(i));
        }

        //Método forEach com lambda para varrer a lista e trazer os aulas
        aulas.forEach(aula -> {
            System.out.println("Percorrendo: ");
            System.out.println("Aula: " + aula);
        });

        //.sort faz a ordem alfabética dos aulas.
        Collections.sort(aulas);
        System.out.println("Depois de ordenado: ");
        System.out.println(aulas);
    }
}
