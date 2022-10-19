package br.edu.femass.model;

import java.util.ArrayList;
import java.util.List;

public class Autor {
    private String nome;
    private String sobrenome;
    private String nacionalidade;


    public Autor ( String nome, String sobrenome, String nacionalidade){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.nacionalidade = nacionalidade;


    }
    public  Autor(){

    }
    @Override
    public String toString(){
        return this.nome + " "+ this.sobrenome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getNome() {

        return nome;
    }


    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSobrenome() {

        return sobrenome;
    }

    public void setNacionalidade(String nacionalidade) {

        this.nacionalidade = nacionalidade;
    }

    public String getNacionalidade() {

        return nacionalidade;
    }

}
