package br.edu.femass.model;

import java.time.LocalDate;

public class Exemplar {
    private Long codigo;
    private LocalDate dataAquisicao;
    private Livro livro;

    public Exemplar(Long codigo, LocalDate dataAquisicao, Livro livro) {
        this.codigo = codigo;
        this.dataAquisicao = dataAquisicao;
        this.livro = livro;
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
