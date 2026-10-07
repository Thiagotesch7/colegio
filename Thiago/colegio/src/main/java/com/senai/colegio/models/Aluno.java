package com.senai.colegio.models;

import jakarta.persistence.*;

@Entity
@Table(name = "aluno")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_aluno")
    private Integer aluno;

    @Column(name = "nome")
    private String nome;

    @ManyToOne
    @JoinColumn(name = "id_responsavel")
    private Responsavel responsavel;

    public Aluno() {
    }

    public Aluno(Integer aluno, String nome, Responsavel responsavel) {
        this.aluno = aluno;
        this.nome = nome;
        this.responsavel = responsavel;
    }

    public Integer getAluno() {
        return aluno;
    }

    public void setAluno(Integer aluno) {
        this.aluno = aluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Responsavel getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }
}