package br.com.musicnote.model;

import java.util.*;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<>();
    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
//    O MAP é muito útil para fazer associações
//    private Set<Aluno> alunos = new HashSet<>();
//    HASHSET faz uma busca mais rápida dentro da array, porém não garante a ordem

    private Set<Aluno> alunos = new LinkedHashSet<>();
//  LINKEDHASHSET guarda a ordem em que os elementos foram adicionados

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
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

//    Adiciona o ALUNO dentro do SET e faz a relação entre MATRÍCULA  e ALUNO.
//    Cria-se como se fosse uma plamilha com duas colunas
    public void matricula(Aluno aluno) {

        this.alunos.add(aluno);
        this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
//        O método PUT insere dentro do MAP
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

//    Deixamos nossa busca mais simples
    public Aluno buscaMatriculado(int numero) {
        return this.matriculaParaAluno.get(numero);
        }

}
