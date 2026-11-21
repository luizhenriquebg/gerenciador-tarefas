package com.henrique.gerenciador_tarefas.exception;

public class TarefaNaoEncontradaException extends RuntimeException{

    public TarefaNaoEncontradaException(Long id) {
        super("Tarefa não encontrada com o id " + id);
    }
}
