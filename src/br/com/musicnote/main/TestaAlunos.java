package br.com.musicnote.main;

import java.util.*;

public class TestaAlunos {

    public static void main(String[] args) {

        Set<String> alunos = new HashSet<>();
//        Collections<String> alunos = new HashSet<>(); Podemos usar as duas maneiras

        alunos.add("Fulano");
        alunos.add("Cicrano");
        alunos.add("Beltrano");
        alunos.add("Deltrano");
        alunos.add("Galtrano");

        //Mesmo adicionando mais uma String igual o HashSet não permite a repetição na impressão
        for (String aluno :
                alunos) {
            System.out.println(aluno);
        }

        System.out.println(alunos.size());

        //adicionando uma Stringo idêntica
        alunos.add("Galtrano");
        System.out.println(alunos.size());
        //O Size não considera a repetição da String na contagem de elementos

        List<String> alunosEmLista = new ArrayList<>(alunos);
        //Agora podemos voltar a ordenar essa lista
        Collections.sort(alunosEmLista);
        System.out.println(alunosEmLista);
    }
}
