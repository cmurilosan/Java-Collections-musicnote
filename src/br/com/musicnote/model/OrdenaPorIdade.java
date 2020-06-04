package br.com.musicnote.model;

//TreeSet e Comparator
import java.util.Comparator;

public class OrdenaPorIdade implements Comparator<Funcionario> {

    @Override
    public int compare(Funcionario funcionario, Funcionario outroFuncionario) {
        return funcionario.getIdade() - outroFuncionario.getIdade();
    }

}
