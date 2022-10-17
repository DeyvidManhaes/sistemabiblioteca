package br.edu.femass.model;

public class Aluno extends Leitor {
    private String matricula;

    public Aluno(Long codigo, String nome, String endereco, String telefone,String matricula) {
        super(codigo, nome, endereco, telefone);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }
}
