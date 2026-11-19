package com.henrique.gerenciador_tarefas.service;

import com.henrique.gerenciador_tarefas.repository.TarefaRepository;
import org.springframework.stereotype.Service;

@Service
public class TarefaService {
    private final TarefaRepository repository;

    public TarefaService(TarefaRepository repository) {
        this.repository = repository;
    }
}
