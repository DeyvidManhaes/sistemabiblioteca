package br.edu.femass.model;

import java.time.LocalDate;
import java.util.List;

public class Exemplar {
    private Long codigo = 1L;
    private LocalDate dataAquisicao;
    public boolean disponivel;
    public  String tituloExemplar;

    public Exemplar(Livro livro) throws Exception{

        this.proximoId();
        this.dataAquisicao = LocalDate.now();
        this.tituloExemplar = livro.toString();
        this.disponivel = true;

        livro.addListaExemplares(this);
    }

    public Exemplar(){

    }

    public String toString(){
    return this.gettituloExemplar() + " " + this.getCodigo()
            .toString();
    }

    public void proximoId() throw Exception{
    Long m = 0L;

    List<Exemplar> exemplares = new DaoExemplar().getAll();
    for(Exemplar exemplar : exemplares){
        if (exemplar.getCodigo()>m){
    m = exemplar.getCodigo();
    setCodigo(m + 1);
        }
      }
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
    public  String gettituloExemplar(){
        return tituloExemplar;
    }

    public void setDisponivel(boolean disponivel){
       this.disponivel = disponivel;
    }
    public boolean getDisponivel(){
       return disponivel;
    }



}
