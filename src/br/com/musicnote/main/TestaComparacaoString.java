package br.com.musicnote.main;

public class TestaComparacaoString {

    public static void main(String[] args) {

        //Teste decomparação onde o resultado será sempre valores positivos, negativos ou zero
        String s1 = "Man";
        String s2 = "Woman";
        int resultado = s1.compareTo(s2);

        System.out.println(resultado);
    }
}
