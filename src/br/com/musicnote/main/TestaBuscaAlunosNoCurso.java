package br.com.musicnote.main;

import br.com.musicnote.model.Aluno;
import br.com.musicnote.model.Aula;
import br.com.musicnote.model.Curso;

public class TestaBuscaAlunosNoCurso {

    public static void main(String[] args) {

        Curso baixoColecoes = new Curso("Groove Bass", "Victor Wooten");

        //Maneira de adicionar utilizando o método
        baixoColecoes.adiciona(new Aula("Conhecendo as notas", 25));
        baixoColecoes.adiciona(new Aula("Escalas Pentatônicas", 31));
        baixoColecoes.adiciona(new Aula("Escalas Menores", 18));

        Aluno a1 = new Aluno("Fulano da silva", 1234);
        Aluno a2 = new Aluno("Cicrano", 5678);
        Aluno a3 = new Aluno("Beltrano", 9012);

        baixoColecoes.matricula(a1);
        baixoColecoes.matricula(a2);
        baixoColecoes.matricula(a3);

        System.out.println("Quem é o aluno com matricula 1234?");
        Aluno aluno = baixoColecoes.buscaMatriculado(1234);
        System.out.println(aluno);
    }
}

