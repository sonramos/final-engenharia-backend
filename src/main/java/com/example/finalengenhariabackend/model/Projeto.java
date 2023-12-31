package com.example.finalengenhariabackend.model;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
@Table(name = "tb_projeto")
public class Projeto {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long projetoId;
    private String nome;
    private String descricao;
    private int tarefa;

    public long getProjetoId() {
        return projetoId;
    }

    public void setProjetoId(long projetoId) {
        this.projetoId = projetoId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getTarefa() {
        return tarefa;
    }

    public void setTarefa(int tarefa) {
        this.tarefa = tarefa;
    }
}
