package br.edu.femass.model;

import java.time.LocalDate;

public class Exemplar {
    private Long codigo = 1L;
    private LocalDate dataAquisicao;
    public boolean disponivel;
    public  String tituloExemplar;

    public Exemplar(Livro livro) throws Exception{
        Long codigo, LocalDate
    } dataAquisicao, Livro livro) {
        this.codigo = codigo;
        this.dataAquisicao = LocalDate.now();
        this.tituloExemplar = livro.toString();
        this.proximoId();
        this.disponivel = true;

        livro.addListaExemplares(this);
    }

    public Exemplar(){

    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public LocalDate getDataAquisicao() {
        return dataAquisicao;
    }

    public void setDataAquisicao(LocalDate dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
}
