package com.henrique.gerenciador_tarefas.model;

import jakarta.persistence.Entity;

@Entity
public class Tarefa {
    private Long id;
    private String titulo;
    private boolean concluida;

    public Tarefa() {

    }

    public Tarefa(String titulo) {
        this.titulo = titulo;
        this.concluida = false;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }
}
