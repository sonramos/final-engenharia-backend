package com.example.finalengenhariabackend.repositories;

import com.example.finalengenhariabackend.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa,Long> {
}
