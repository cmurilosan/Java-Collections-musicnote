package br.com.musicnote.main;

import br.com.musicnote.model.Aluno;
import br.com.musicnote.model.Aula;
import br.com.musicnote.model.Curso;

public class TestaCursoComAluno {

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

        System.out.println("Todos os alunos matriculados: ");
        baixoColecoes.getAlunos().forEach(aluno -> {
            System.out.println(aluno);
        });

        //Utilizando o método CONTAINS
        System.out.println("O aluno " + a1.getNome() + " está matriculado?");
        System.out.println(baixoColecoes.estaMatriculado(a1));

        //Criação de um mesmo ALUNO e MATRICULA
        Aluno silva = new Aluno("Fulano da silva", 1234);
        System.out.println("E esse Silva, está matriculado?");
        System.out.println(baixoColecoes.estaMatriculado(silva));

        //Utilizando o EQUALS
        System.out.println("O a1 é equals ao Fulano?");
        System.out.println(a1.equals(silva));

        //Comparando com HASHCODE
        System.out.println("Utilizando o HashCode");
        System.out.println(a1.hashCode() == silva.hashCode());

    }
}
