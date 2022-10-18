package br.edu.femass.model;

import java.util.ArrayList;
import java.util.List;

public class Autor {
    private String nome;
    private String sobrenome;
    private String nacionalidade;
    private List <Livro> livros;

    public Autor ( String nome, String sobrenome, String nacionalidade){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.nacionalidade = nacionalidade;
        this.livros = new ArrayList<Livro>();

    }
    public  Autor(){

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
    public void cadastrarLivro (Long codigo, String titulo){
        Livro livro = new Livro(codigo,titulo);
        this.livros.add(livro);
    }
    public void cadastrarLivro (){
        Livro livro = new Livro();
        this.livros.add(livro);
    }
}
