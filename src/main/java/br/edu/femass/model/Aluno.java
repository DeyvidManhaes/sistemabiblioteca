package br.edu.femass.model;

public class Aluno extends Leitor {
    private String matricula;

    public Aluno(String nome, String endereco, String telefone,String matricula) {
        super(nome, endereco, telefone);
        this.matricula = matricula;
        setPrazoMaximoDevolucao(15);
        proxId();
    }
    public  Aluno(){

    }
    @Override
    public String toString(){
        return this.getNome();
    }

    public String getMatricula() {
        return matricula;
    }
}
