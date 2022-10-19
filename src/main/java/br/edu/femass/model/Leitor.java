package br.edu.femass.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Leitor {

    private Long codigo = 1L;
    private String nome;
    private String endereco;
    private String telefone;
    private Integer prazoMaximoDevolucao;


    public Leitor(String nome, String endereco, String telefone) {

        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;

    }

    public Leitor() {

    }


    public void proximoId() throws Exception {
        Long m = 0L;

        List<Aluno> alunos = new DaoAluno().getAll();
        List<Professor> professores = new DaoProfessor().getAll();
        List<Leitor> leitores = new ArrayList<>();
        leitores.addAll(alunos);
        leitores.addAll(professores);

        for (Leitor leitor : leitores) {
            if (leitor.getCodigo() > m) {
                m = leitor.getCodigo();
                setCodigo(m + 1);
            }
        }
    }

    public Long getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public Integer getPrazoMaximoDevolucao() {
        return prazoMaximoDevolucao;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public void setPrazoMaximoDevolucao(Integer prazoMaximoDevolucao) {
        this.prazoMaximoDevolucao = prazoMaximoDevolucao;
    }

    public String toString() {
        return this.nome;
    }


}