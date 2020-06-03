package br.com.musicnote.model;

public class Aula implements Comparable<Aula>{

    private String titulo;
    private int tempo;

    public Aula(String titulo, int tempo) {
        this.titulo = titulo;
        this.tempo = tempo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getTempo() {
        return tempo;
    }

    //Cria-se o toString para a classe, pois sem ele na impressão será mostrado a referencia do objeto e não os atributos
    @Override
    public String toString() {
        return "Aula: " + this.titulo + ", " + this.tempo + " minutos\n";
    }

    @Override
    public int compareTo(Aula outroAula) {
        return this.titulo.compareTo(outroAula.titulo);
    }
}
