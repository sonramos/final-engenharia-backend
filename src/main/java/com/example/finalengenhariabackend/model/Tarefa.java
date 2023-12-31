package com.example.finalengenhariabackend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_tarefa")
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long tarefaId;
    private String titulo;
    private String descricao;
    private int projeto;

    public long getTarefaId() {
        return tarefaId;
    }

    public void setTarefaId(long tarefaId) {
        this.tarefaId = tarefaId;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getProjeto() {
        return projeto;
    }

    public void setProjeto(int projeto) {
        this.projeto = projeto;
    }
}
