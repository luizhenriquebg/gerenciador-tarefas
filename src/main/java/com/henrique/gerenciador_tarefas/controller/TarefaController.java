package com.henrique.gerenciador_tarefas.controller;

import com.henrique.gerenciador_tarefas.model.Tarefa;
import com.henrique.gerenciador_tarefas.service.TarefaService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    private final TarefaService service;

    public TarefaController(TarefaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Tarefa> listarTodas() {
        return service.listarTodas();
    }

    @PostMapping
    public Tarefa criar(@Valid @RequestBody Tarefa tarefa) {
        return service.criar(tarefa);
    }

    @GetMapping("/{id}")
    public Tarefa buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }

    @PatchMapping("/{id}/concluir")
    public Tarefa concluir(@PathVariable Long id) {
        return service.concluir(id);
    }

    @PutMapping("/{id}")
    public Tarefa atualizar(@PathVariable Long id,@Valid @RequestBody Tarefa tarefa) {
        return service.atualizar(id, tarefa.getTitulo());
    }
}
