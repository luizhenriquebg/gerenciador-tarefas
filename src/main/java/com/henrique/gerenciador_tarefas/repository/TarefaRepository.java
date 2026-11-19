package com.henrique.gerenciador_tarefas.repository;

import com.henrique.gerenciador_tarefas.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}
