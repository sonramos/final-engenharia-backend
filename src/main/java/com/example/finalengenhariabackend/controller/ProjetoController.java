package com.example.finalengenhariabackend.controller;

import com.example.finalengenhariabackend.model.Projeto;
import com.example.finalengenhariabackend.service.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class ProjetoController {

    @Autowired
    private ProjetoService projetoService;

    @GetMapping("/projetos")
    public List<Projeto> getProjetos(){return projetoService.getProjetos();}

    @GetMapping("/projetos/{id}")
    public Projeto getProjetoById(@PathVariable("id") Long id){
        return this.projetoService.getProjetoPorId(id);
    }

    @PostMapping("/projetos")
    public Projeto inserirProjeto (@RequestBody Projeto projeto){
        return this.projetoService.inserirOuAtualizar(projeto);
    }

    @PutMapping("/projetos/{id}")
    public Projeto atualizarProjeto(@RequestBody Projeto projeto){
        return this.projetoService.inserirOuAtualizar(projeto);
    }

    @DeleteMapping("/projetos/{id}")
    public void apagarProjeto(@PathVariable("id") Long id){
        this.projetoService.apagarProjeto(id);
    }
}
