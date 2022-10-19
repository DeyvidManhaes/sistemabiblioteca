package br.edu.femass.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Livro {

    private Long codigo = 1L;
    private String titulo;

    private
    private List <Exemplar> exemplares;

    public Livro(Long codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autores = new ArrayList<Autor>();
        this.exemplares = new ArrayList<Exemplar>();
    }
    public Livro (){

    }


    public Long getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public List<Exemplar> getExemplares() {
        return exemplares;
    }
    public void cadastarAutor(String nome, String sobrenome, String nacionalidade){
        Autor autor = new Autor(nome,sobrenome,nacionalidade);
        this.autores.add(autor);
    }
    public void cadastrarExemplar(Long codigo, LocalDate dataAquisicao, Livro livro){
        Exemplar exemplar = new Exemplar(codigo, dataAquisicao, livro);
        this.exemplares.add(exemplar);
    }
}
