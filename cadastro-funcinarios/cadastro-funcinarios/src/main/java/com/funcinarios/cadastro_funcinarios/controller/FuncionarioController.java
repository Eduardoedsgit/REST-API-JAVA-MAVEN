package com.funcinarios.cadastro_funcinarios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.funcinarios.cadastro_funcinarios.dto.FuncionarioRequest;
import com.funcinarios.cadastro_funcinarios.dto.FuncionarioResponse;
import com.funcinarios.cadastro_funcinarios.dto.FuncionarioUpdateRequest;
import com.funcinarios.cadastro_funcinarios.service.FuncionarioService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioService service;

    @PostMapping("/cadastrar")
    public FuncionarioResponse cadastrar(@Valid @RequestBody FuncionarioRequest request) {
        return service.cadastrar(request);
    }

    @GetMapping("/buscar/{id}")
    public FuncionarioResponse buscar(@PathVariable Long id) {
        return service.buscar(id);
    }

    @PutMapping("/alterar")
    public FuncionarioResponse alterar(@Valid @RequestBody FuncionarioUpdateRequest request) {
        return service.alterar(request);
    }

    @DeleteMapping("/deletar/{id}")
    public String deletar(@PathVariable Long id) {
        return service.deletar(id);
    }
}
