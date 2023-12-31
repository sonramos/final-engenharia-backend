package com.example.finalengenhariabackend.controller;

import com.example.finalengenhariabackend.model.Tarefa;
import com.example.finalengenhariabackend.service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class TarefaController {

    @Autowired
    private TarefaService tarefaService;

    @GetMapping("/tarefas")
    public List<Tarefa> getTarefas(){return tarefaService.getTarefas();}

    @GetMapping("/tarefas/{id}")
    public Tarefa getTarefaById(@PathVariable("id") Long id){
        return this.tarefaService.getTarefaPorId(id);
    }

    @PostMapping("/tarefas")
    public Tarefa inserirTarefa (@RequestBody Tarefa tarefa){
        return this.tarefaService.inserirOuAtualizar(tarefa);
    }

    @PutMapping("/tarefas/{id}")
    public Tarefa atualizarTarefa(@RequestBody Tarefa tarefa){
        return this.tarefaService.inserirOuAtualizar(tarefa);
    }

    @DeleteMapping("/tarefas/{id}")
    public void apagarTarefa(@PathVariable("id") Long id){
        this.tarefaService.apagarTarefa(id);
    }
}
