package br.edu.femass.model;

import java.time.LocalDate;

public class Professor extends Leitor {
    private String disciplina;


    public Professor(Long codigo, String nome, String endereco, String telefone,
                     String disciplina) {
        super(codigo, nome, endereco, telefone);

        this.disciplina = disciplina;

    }
    public  Professor(){

    }

        public String getDisciplina() {
            return disciplina;
        }

        public void setDisciplina(String disciplina) {
            this.disciplina = disciplina;
        }



}
