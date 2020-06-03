package br.com.musicnote.main;

import br.com.musicnote.model.Aula;
import br.com.musicnote.model.Curso;

import java.util.List;

public class TestaCurso {

    public static void main(String[] args) {

        //Cria um pacote de aulas
        Curso baixoColecoes = new Curso("Groove Bass", "Victor Wooten");

        //Lista de aulas para pegar dentro do pacote
        List<Aula> aulas = baixoColecoes.getAulas();
        System.out.println(aulas);

//        Não é mais possível adicionar desta forma por ter o imutável no método
//        baixoColecoes.getAulas().add(new Aula("Escalas maiores", 21));
//        System.out.println(aulas);

        //Maneira de adicionar utilizando o método
        baixoColecoes.adiciona(new Aula("Conhecendo as notas", 25));
        baixoColecoes.adiciona(new Aula("Escalas Pentatônicas", 31));
        baixoColecoes.adiciona(new Aula("Escalas Menores", 18));
        System.out.println(baixoColecoes.getAulas());
    }
}
