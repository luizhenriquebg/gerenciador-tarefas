package com.henrique.gerenciador_tarefas.repository;

import com.henrique.gerenciador_tarefas.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {

    List<Tarefa> findByConcluida(boolean concluida);
}
