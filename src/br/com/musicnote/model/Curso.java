package br.com.musicnote.model;

import java.util.*;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<Aula>();
    private Set<Aluno> alunos = new HashSet<>();
    //Lista somente da Classe Aula

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {

        return nome;
    }

    public String getInstrutor() {

        return instrutor;
    }

    //Lista imutável. Não consigo modificar essa lista
    public List<Aula> getAulas() {

        return Collections.unmodifiableList(aulas);
    }

    //Método para adicionar aulas
    public void adiciona(Aula aula) {

        this.aulas.add(aula);
    }

    public int getTempoTotal() {
        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
//        int tempoTotal = 0;
//        for (Aula aula : aulas) {
//            tempoTotal += aula.getTempo();
//        }
//        return tempoTotal;
    }

    @Override
    public String toString() {
        return "Curso: " +
                "\nNome = " + nome +
                "\nTempo Total = " + getTempoTotal() +
                "\nAulas = " + aulas;
    }

    public void matricula(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }
}
