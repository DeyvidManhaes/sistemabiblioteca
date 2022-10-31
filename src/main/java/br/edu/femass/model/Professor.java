package br.edu.femass.model;

import java.time.LocalDate;

public class Professor extends Leitor {
    private String disciplina;


    public Professor(String nome, String endereco, String telefone,
                     String disciplina) throws Exception{
        super(nome, endereco, telefone);

        this.disciplina = disciplina;
        setPrazoMaximoDevolucao(30);
        proximoId();

    }
    public  Professor(){

    }

        public String getDisciplina() {
            return disciplina;
        }



}
