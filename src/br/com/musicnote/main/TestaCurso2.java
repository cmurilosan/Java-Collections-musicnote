package br.com.musicnote.main;

import br.com.musicnote.model.Aula;
import br.com.musicnote.model.Curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

    public static void main(String[] args) {

        //Cria um pacote de aulas
        Curso baixoColecoes = new Curso("Groove Bass", "Victor Wooten");

        //Maneira de adicionar utilizando o método
        baixoColecoes.adiciona(new Aula("Conhecendo as notas", 25));
        baixoColecoes.adiciona(new Aula("Escalas Pentatônicas", 31));
        baixoColecoes.adiciona(new Aula("Escalas Menores", 18));

        //Crio uma lista imutável (unmodifiableList), que não pode ser alterada
        List<Aula> aulasImutaveis = baixoColecoes.getAulas();
        System.out.println(aulasImutaveis);

        //Cria uma nova lista através da imutável
        List<Aula> aulas = new ArrayList<>(aulasImutaveis);

        Collections.sort(aulas);
        System.out.println(aulas);

        System.out.println(baixoColecoes.getTempoTotal());

        System.out.println(baixoColecoes);

    }
}
