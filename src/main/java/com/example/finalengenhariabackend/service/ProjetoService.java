package com.example.finalengenhariabackend.service;

import com.example.finalengenhariabackend.model.Projeto;
import com.example.finalengenhariabackend.repositories.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProjetoService {

    @Autowired
    private ProjetoRepository projetoRepository;

    public List<Projeto> getProjetos(){
        return this.projetoRepository.findAll();
    }

    public Projeto getProjetoPorId(Long id){
        return this.projetoRepository.findById(id).orElse(null);
    }

    @Transactional
    public Projeto inserirOuAtualizar (Projeto projeto) {
        return this.projetoRepository.save(projeto);
    }

    @Transactional
    public void apagarProjeto (Long id) {
        this.projetoRepository.deleteById(id);
    }
}
