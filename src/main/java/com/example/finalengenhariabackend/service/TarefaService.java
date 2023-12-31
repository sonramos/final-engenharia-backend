package com.example.finalengenhariabackend.service;

import com.example.finalengenhariabackend.model.Tarefa;
import com.example.finalengenhariabackend.repositories.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TarefaService {

    @Autowired
    private TarefaRepository tarefaRepository;

    public List<Tarefa> getTarefas(){
        return this.tarefaRepository.findAll();
    }

    public Tarefa getTarefaPorId(Long id){
        return this.tarefaRepository.findById(id).orElse(null);
    }

    @Transactional
    public Tarefa inserirOuAtualizar (Tarefa tarefa) {
        return this.tarefaRepository.save(tarefa);
    }

    @Transactional
    public void apagarTarefa (Long id) {
        this.tarefaRepository.deleteById(id);
    }
}