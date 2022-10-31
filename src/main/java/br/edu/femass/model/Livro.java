package br.edu.femass.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Livro {

    private Long codigo = 1L;
    private String titulo;
    private  Integer ano;
    private List<Autor> listaAutores = new ArrayList<>();
    private  List<Exemplar> listaExemplares = new ArrayList<>();

    public Livro(String titulo, List<Autor> autores, Integer ano) throws Exception {

        this.titulo = titulo;
        listaAutores.addAll(autores);
        this.ano = ano;
        proximoId();
    }
    public Livro (){

    }
    public  String toString(){
        return this.titulo;
    }

    public void  proximoId() throws  Exception{
        Long m = 0L;

        List<Livro> livros = new DaoLivro().getAll();
        for (Livro livro : livros){
            if (livro.getCodigo()>m){
                m=livro.getCodigo();
                setCodigo(m+1);
            }
        }
    }
    public Long getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setCodigo(Long codigo){
        this.codigo = codigo;
    }

    public List<Autor> getListaAutores() {
        return listaAutores;
    }

    public List<Exemplar> getListaExemplares() {
        return listaExemplares;
    }
    public  void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setListaAutores(List<Autor> listaAutores) {
        this.listaAutores = listaAutores;
    }

    public void addListaExemplares(Exemplar exemplar) {
        this.listaExemplares.add(exemplar);
    }

    public void setListaExemplares(List<Exemplar> exemplares) {
        this.listaExemplares = exemplares;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
