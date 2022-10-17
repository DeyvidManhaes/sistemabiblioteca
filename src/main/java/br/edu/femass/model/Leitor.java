package br.edu.femass.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Leitor {

    private Long codigo;
    private String nome;
    private String endereco;
    private String telefone;
    private Integer prazoMaximoDevolucao;
    private ArrayList<Emprestimo> emprestimos;

    public Leitor(Long codigo, String nome, String endereco, String telefone) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.emprestimos = new ArrayList<Emprestimo>();
    }
    public void ciarEmprestimo(){

    }

}
